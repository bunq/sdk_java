package com.bunq.sdk.security;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.exception.UncaughtExceptionError;
import com.bunq.sdk.http.BunqBasicHeader;
import com.bunq.sdk.http.BunqHeader;
import com.bunq.sdk.http.BunqRequestBuilder;
import com.bunq.sdk.http.HttpMethod;
import okhttp3.Headers;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Static lib containing methods for handling encryption.
 */
public final class SecurityUtils {

  /**
   * Error constants.
   */
  private static final String ERROR_COULD_NOT_INITIALIZE_KEY_PAIR_GENERATOR =
      "Could not initialize KeyPairGenerator.";
  private static final String ERROR_PRIVATE_KEY_FORMAT_INVALID =
      "Could not create a private key from \"%s\".";
  private static final String ERROR_PUBLIC_KEY_FORMAT_INVALID =
      "Could not create a public key from \"%s\".";
  private static final String ERROR_COULD_NOT_INITIALIZE_SIGNATURE =
      "Could not initialize Signature.";
  private static final String ERROR_KEY_PAIR_INVALID = "KeyPair seems to be invalid.";
  private static final String ERROR_COULD_NOT_SIGN_DATA = "Could not sign data.";
  private static final String ERROR_COULD_NOT_VERIFY_DATA = "Could not verify signed data.";
  private static final String ERROR_CAN_NOT_GET_ENTITY_BODY_BYTES =
      "Can't get body bytes of the entity.";
  private static final String ERROR_RESPONSE_VERIFICATION_FAILED = "Response verification failed";

  /**
   * Constants to generate encryption keys.
   */
  private static final String KEY_PAIR_GENERATOR_ALGORITHM = "RSA";
  private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";
  private static final int KEY_PAIR_GENERATOR_KEY_SIZE = 2048;

  /**
   * The MAC algorithm to use for calculating and verifying the HMAC.
   */
  private static final String ALGORITHM_MAC = "HmacSHA1";

  /**
   * The {@link javax.crypto.Cipher} algorithm(s) to use to encrypt/decrypt the
   * {@link javax.crypto.SecretKey} used to encrypt/decrypt the request/response body
   * communicated through the key header.
   */
  private static final String KEY_CIPHER_ALGORITHM = "RSA/ECB/PKCS1Padding";

  /**
   * The {@link javax.crypto.Cipher} algorithm(s) to use to encrypt/decrypt the request/response
   * body.
   */
  private static final String ALGORITHM_BODY_CIPHER = "AES/CBC/PKCS5PADDING";

  /**
   * The size of the encryption initialization vector (IV) to use (in bytes).
   */
  private static final int INITIALIZATION_VECTOR_SIZE_BYTES = 128 / 8;

  /**
   * The key generation algorithm to use for generating the body {@link javax.crypto.Cipher}
   * {@link javax.crypto.SecretKey}.
   */
  private static final String ALGORITHM_KEY_GENERATION = "AES";

  /**
   * The size of the encryption {@link javax.crypto.SecretKey} to use (in bits) for generating
   * the body {@link javax.crypto.Cipher} {@link javax.crypto.SecretKey}.
   */
  private static final int KEY_SIZE = 256;

  /**
   * Newline and empty string specific to the purpose of this class.
   */
  private static final String NEWLINE = "\n";
  private static final String STRING_EMPTY = "";

  /**
   * Constants to format encryption keys.
   */
  private static final String PUBLIC_KEY_START = "-----BEGIN PUBLIC KEY-----\n";
  private static final String PUBLIC_KEY_END = "\n-----END PUBLIC KEY-----\n";
  private static final String PUBLIC_KEY_FORMAT = PUBLIC_KEY_START + "%s" + PUBLIC_KEY_END;
  private static final String PRIVATE_KEY_START = "-----BEGIN PRIVATE KEY-----\n";
  private static final String PRIVATE_KEY_END = "\n-----END PRIVATE KEY-----\n";
  private static final String PRIVATE_KEY_FORMAT = PRIVATE_KEY_START + "%s" + PRIVATE_KEY_END;

  /**
   * Length of an empty array.
   */
  private static final int ARRAY_LENGTH_EMPTY = 0;

  /**
   * Delimiter constants for building the data to sign.
   */
  private static final String DELIMITER_METHOD_PATH = " ";

  /**
   * The index of the first item in an array.
   */
  private static final int INDEX_FIRST = 0;

  /**
   */
  private SecurityUtils() {
  }

  /**
   * Generates a X509/PKCS8 Key Pair.
   *
   * @throws BunqException When could not initialize KeyPairGenerator.
   */
  public static KeyPair generateKeyPair() throws BunqException {
    try {
      KeyPairGenerator generator = KeyPairGenerator.getInstance(KEY_PAIR_GENERATOR_ALGORITHM);
      generator.initialize(KEY_PAIR_GENERATOR_KEY_SIZE);

      return generator.generateKeyPair();
    } catch (NoSuchAlgorithmException exception) {
      throw new BunqException(ERROR_COULD_NOT_INITIALIZE_KEY_PAIR_GENERATOR, exception);
    }
  }

  public static String getPrivateKeyFormattedString(KeyPair keyPair) {
    return getPrivateKeyFormattedString(keyPair.getPrivate());
  }

  /**
   * @return The private key string formatted according to PKCS8 standard.
   */
  private static String getPrivateKeyFormattedString(PrivateKey privateKey) {
    byte[] encodedPrivateKey = privateKey.getEncoded();
    String privateKeyString = DatatypeConverter.printBase64Binary(encodedPrivateKey);

    return String.format(PRIVATE_KEY_FORMAT, privateKeyString);
  }

  /**
   * @param publicKeyString X509 Public Key string
   * @param privateKeyString PKCS8 Private Key string
   */
  public static KeyPair createKeyPairFromFormattedStrings(String publicKeyString,
      String privateKeyString) {
    return new KeyPair(
        createPublicKeyFromFormattedString(publicKeyString),
        createPrivateKeyFromFormattedString(privateKeyString)
    );
  }

  /**
   * @param publicKeyString X509 Public Key string
   */
  public static PublicKey createPublicKeyFromFormattedString(String publicKeyString) {
    try {
      X509EncodedKeySpec spec =
          new X509EncodedKeySpec(getAllPublicKeyByteFromFormattedString(publicKeyString));
      KeyFactory keyFactory = KeyFactory.getInstance(KEY_PAIR_GENERATOR_ALGORITHM);

      return keyFactory.generatePublic(spec);
    } catch (NoSuchAlgorithmException | InvalidKeySpecException exception) {
      throw new BunqException(String.format(ERROR_PUBLIC_KEY_FORMAT_INVALID, publicKeyString),
          exception);
    }
  }

  /**
   * @param publicKeyString X509 Public Key string
   */
  private static byte[] getAllPublicKeyByteFromFormattedString(String publicKeyString) {
    publicKeyString = publicKeyString.replace(PUBLIC_KEY_START, STRING_EMPTY);
    publicKeyString = publicKeyString.replace(PUBLIC_KEY_END, STRING_EMPTY);
    publicKeyString = publicKeyString.replace(NEWLINE, STRING_EMPTY);

    return DatatypeConverter.parseBase64Binary(publicKeyString);
  }

  /**
   * @param privateKeyString PKCS8 Private Key string
   */
  private static PrivateKey createPrivateKeyFromFormattedString(String privateKeyString) {
    try {
      PKCS8EncodedKeySpec spec =
          new PKCS8EncodedKeySpec(getAllPrivateKeyByteFromFormattedString(privateKeyString));
      KeyFactory keyFactory = KeyFactory.getInstance(KEY_PAIR_GENERATOR_ALGORITHM);

      return keyFactory.generatePrivate(spec);
    } catch (NoSuchAlgorithmException | InvalidKeySpecException exception) {
      throw new BunqException(String.format(ERROR_PRIVATE_KEY_FORMAT_INVALID, privateKeyString),
          exception);
    }
  }

  /**
   * @param privateKeyString PKCS8 Private Key string
   */
  private static byte[] getAllPrivateKeyByteFromFormattedString(String privateKeyString) {
    privateKeyString = privateKeyString.replace(PRIVATE_KEY_START, STRING_EMPTY);
    privateKeyString = privateKeyString.replace(PRIVATE_KEY_END, STRING_EMPTY);
    privateKeyString = privateKeyString.replace(NEWLINE, STRING_EMPTY);

    return DatatypeConverter.parseBase64Binary(privateKeyString);
  }

  public static String getPublicKeyFormattedString(KeyPair keyPair) {
    return getPublicKeyFormattedString(keyPair.getPublic());
  }

  /**
   * Creates a Public Key as a string formatted according to X509 standard.
   */
  public static String getPublicKeyFormattedString(PublicKey publicKey) {
    byte[] encodedPublicKey = publicKey.getEncoded();
    String publicKeyString = DatatypeConverter.printBase64Binary(encodedPublicKey);

    return String.format(PUBLIC_KEY_FORMAT, publicKeyString);
  }

  /**
   * Encrypt the request, add the encrypted headers to the given header map. This method modifies
   * the header map!
   */
  public static byte[] encrypt(ApiContext apiContext, byte[] requestBytes,
      Map<String, String> customHeaders) {
    SecretKey key = generateEncryptionKey();
    byte[] initializationVector = generateInitializationVector();
    addHeaderClientEncryptionKey(apiContext, key, customHeaders);
    addHeaderClientEncryptionIv(initializationVector, customHeaders);
    requestBytes = encryptRequestBytes(requestBytes, key, initializationVector);
    addHeaderClientEncryptionHmac(requestBytes, key, initializationVector, customHeaders);

    return requestBytes;
  }

  private static SecretKey generateEncryptionKey() {
    try {
      KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM_KEY_GENERATION);
      keyGen.init(KEY_SIZE);

      return keyGen.generateKey();
    } catch (GeneralSecurityException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  private static byte[] generateInitializationVector() {
    byte[] initializationVector = new byte[INITIALIZATION_VECTOR_SIZE_BYTES];
    new SecureRandom().nextBytes(initializationVector);

    return initializationVector;
  }

  private static void addHeaderClientEncryptionKey(
      ApiContext apiContext,
      SecretKey key,
      Map<String, String> customHeaders
  ) {
    try {
      Cipher cipher = Cipher.getInstance(KEY_CIPHER_ALGORITHM);
      cipher.init(Cipher.ENCRYPT_MODE, apiContext.getInstallationContext().getPublicKeyServer());
      byte[] keyEncrypted = cipher.doFinal(key.getEncoded());

      String keyEncryptedEncoded = DatatypeConverter.printBase64Binary(keyEncrypted);
      BunqHeader.clientEncryptionKey.addTo(customHeaders, keyEncryptedEncoded);
    } catch (GeneralSecurityException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  private static void addHeaderClientEncryptionIv(byte[] initializationVector, Map<String,
      String> customHeaders) {
    String initializationVectorEncoded = DatatypeConverter.printBase64Binary(initializationVector);
    BunqHeader.clientEncryptionIV.addTo(customHeaders, initializationVectorEncoded);
  }

  private static byte[] encryptRequestBytes(byte[] requestBytes, SecretKey key,
      byte[] initializationVector) {
    if (requestBytes.length == 0) {
      return requestBytes;
    }

    try {
      Cipher cipher = Cipher.getInstance(ALGORITHM_BODY_CIPHER);
      cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(initializationVector));

      return cipher.doFinal(requestBytes);
    } catch (GeneralSecurityException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  private static void addHeaderClientEncryptionHmac(byte[] requestBytes,
      SecretKey key, byte[] initializationVector, Map<String, String> customHeaders) {
    try {
      Mac mac = Mac.getInstance(ALGORITHM_MAC);
      mac.init(key);
      mac.update(initializationVector);
      MacOutputStream outputStream = new MacOutputStream(mac);
      BufferedSink bufferedSink = Okio.buffer(Okio.sink(outputStream));
      bufferedSink.write(requestBytes);
      bufferedSink.emit();
      bufferedSink.flush();
      bufferedSink.close();
      byte[] hmac = mac.doFinal();

      String hmacEncoded = DatatypeConverter.printBase64Binary(hmac);
      BunqHeader.clientEncryptionHMAC.addTo(customHeaders, hmacEncoded);
    } catch (GeneralSecurityException | IOException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  public static String generateSignature(BunqRequestBuilder requestBuilder, KeyPair keyPairClient) {
    byte[] requestBytes = getRequestBytes(requestBuilder);

    return SecurityUtils.signBase64(requestBytes, keyPairClient);
  }

  private static byte[] getRequestBytes(BunqRequestBuilder requestBuilder) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    try {
      outputStream.write(getRequestHeadBytes(requestBuilder));
      outputStream.write(getEntityBodyBytes(requestBuilder));
    } catch (IOException exception) {
      throw new UncaughtExceptionError(exception);
    }

    return outputStream.toByteArray();
  }

  private static byte[] getRequestHeadBytes(BunqRequestBuilder requestBuilder) {
    String requestHeadString = generateMethodAndEndpointString(requestBuilder) + NEWLINE +
        generateRequestHeadersSortedString(requestBuilder) + NEWLINE + NEWLINE;

    return requestHeadString.getBytes();
  }

  private static String generateMethodAndEndpointString(BunqRequestBuilder requestBuilder) {
    String uriString = requestBuilder.getUrl().toString();
    String method = requestBuilder.getMethod().getMethodSrring();
    String path = requestBuilder.getUrl().encodedPath();
    String pathWithParameters = uriString.substring(uriString.indexOf(path));

    return method + DELIMITER_METHOD_PATH + pathWithParameters;
  }

  private static byte[] getEntityBodyBytes(BunqRequestBuilder requestBuilder) throws IOException {
    HttpMethod method = requestBuilder.getMethod();

    if (method.equals(HttpMethod.GET) || method.equals(HttpMethod.DELETE)) {
      return new byte[ARRAY_LENGTH_EMPTY];
    } else if (method.equals(HttpMethod.POST) || method.equals(HttpMethod.PUT)) {
      return requestBuilder.getBody().getContent();
    } else {
      throw new IllegalStateException(ERROR_CAN_NOT_GET_ENTITY_BODY_BYTES);
    }
  }

  private static String generateRequestHeadersSortedString(BunqRequestBuilder bunqRequestBuilder) {
    return BunqBasicHeader.collectForSigning(
            bunqRequestBuilder.getAllHeader(),
            null,
            Arrays.asList(BunqHeader.cacheControl, BunqHeader.userAgent)
    );
  }

  /**
   * Sings data, encodes it as base64 and returns the result.
   *
   * @return The Base64 representation of the signature.
   * @throws BunqException When could not initialize signature.
   * @throws BunqException When key pair is invalid.
   * @throws BunqException When could not sign data.
   * @throws BunqException When could not verify data.
   */
  private static String signBase64(byte[] bytesToSign, KeyPair keyPair) throws BunqException {
    Signature signature = getSignatureInstance();
    initializeSignature(signature, keyPair);
    byte[] dataBytesSigned = signDataWithSignature(signature, bytesToSign);
    verifyDataSigned(signature, keyPair.getPublic(), bytesToSign, dataBytesSigned);

    return DatatypeConverter.printBase64Binary(dataBytesSigned);
  }

  private static Signature getSignatureInstance() throws BunqException {
    try {
      return Signature.getInstance(SIGNATURE_ALGORITHM);
    } catch (NoSuchAlgorithmException exception) {
      throw new BunqException(ERROR_COULD_NOT_INITIALIZE_SIGNATURE, exception);
    }
  }

  private static void initializeSignature(Signature signature,
      KeyPair keyPair) throws BunqException {
    try {
      signature.initSign(keyPair.getPrivate());
    } catch (InvalidKeyException exception) {
      throw new BunqException(ERROR_KEY_PAIR_INVALID, exception);
    }
  }

  private static byte[] signDataWithSignature(Signature signature,
      byte[] dataBytes) throws BunqException {
    try {
      signature.update(dataBytes);

      return signature.sign();
    } catch (SignatureException exception) {
      throw new BunqException(ERROR_COULD_NOT_SIGN_DATA, exception);
    }
  }

  private static void verifyDataSigned(Signature signature, PublicKey publicKey, byte[] dataBytes,
      byte[] dataBytesSigned) throws BunqException {
    try {
      signature.initVerify(publicKey);
      signature.update(dataBytes);

      if (!signature.verify(dataBytesSigned)) {
        throw new BunqException(ERROR_RESPONSE_VERIFICATION_FAILED);
      }
    } catch (GeneralSecurityException exception) {
      throw new BunqException(ERROR_COULD_NOT_VERIFY_DATA, exception);
    }
  }

  public static void validateResponseSignature(
      int responseCode,
      byte[] responseBodyBytes,
      Response response,
      PublicKey keyPublicServer
  ) {
    byte[] responseBytes = getResponseBytes(
        responseCode,
        responseBodyBytes,
        response.headers()
    );
    Signature signature = getSignatureInstance();
    BunqBasicHeader serverSignature = BunqBasicHeader.get(BunqHeader.serverSignature, response);

    byte[] serverSignatureDecoded = DatatypeConverter.parseBase64Binary(
        serverSignature.getValue()
    );
    verifyDataSigned(signature, keyPublicServer, responseBytes, serverSignatureDecoded);
  }

  private static byte[] getResponseBytes(
      int responseCode,
      byte[] responseBodyBytes,
      Headers allHeader
  ) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    List<BunqBasicHeader> allResponseHeader = new ArrayList<>();

    for (int i = INDEX_FIRST; i < allHeader.names().size(); i++) {
      BunqHeader header = BunqHeader.parse(allHeader.name(i));

      if (header != null && !BunqHeader.serverSignature.equals(header)) {
        allResponseHeader.add(new BunqBasicHeader(header, allHeader.get(allHeader.name(i))));
      }
    }

    try {
      outputStream.write(getResponseHeadBytes(responseCode, allResponseHeader));
      outputStream.write(responseBodyBytes);
    } catch (IOException exception) {
      throw new UncaughtExceptionError(exception);
    }

    return outputStream.toByteArray();
  }

  private static byte[] getResponseHeadBytes(int code, List<BunqBasicHeader> headers) {
    String requestHeadString = code + NEWLINE +
        generateResponseHeadersSortedString(headers) + NEWLINE + NEWLINE;

    return requestHeadString.getBytes();
  }

  private static String generateResponseHeadersSortedString(List<BunqBasicHeader> headers) {
    return BunqBasicHeader.collectForSigning(
            headers,
            BunqHeader.serverSignature,
        Collections.<BunqHeader>emptyList()
    );
  }

}
