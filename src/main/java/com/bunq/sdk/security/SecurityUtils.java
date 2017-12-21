package com.bunq.sdk.security;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.exception.UncaughtExceptionError;
import com.bunq.sdk.http.ApiClient;
import okio.BufferedSink;
import okio.Okio;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
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
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
   * Encryption-specific headers.
   */
  private static final String HEADER_CLIENT_ENCRYPTION_HMAC = "X-Bunq-Client-Encryption-Hmac";
  private static final String HEADER_CLIENT_ENCRYPTION_IV = "X-Bunq-Client-Encryption-Iv";
  private static final String HEADER_CLIENT_ENCRYPTION_KEY = "X-Bunq-Client-Encryption-Key";
  private static final String HEADER_SERVER_SIGNATURE = "X-Bunq-Server-Signature";

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
  private static final String HEADER_NAME_PREFIX_X_BUNQ = "X-Bunq-";
  private static final String DELIMITER_METHOD_PATH = " ";
  private static final String DELIMITER_HEADER_NAME_AND_VALUE = ": ";

  /**
   * Regex constants.
   */
  private static final String REGEX_FOR_LOWERCASE_HEADERS = "(-[a-z])";

  /**
   * The index of the first item in an array.
   */
  private static final int INDEX_FIRST = 0;

  /**
   * Substring constants.
   */
  private static final int SUBSTRING_BEGIN_INDEX = 0;
  private static final int SUBSTRING_END_INDEX = 1;

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
    byte[] base64 = Base64.encodeBase64(encodedPrivateKey);

    return String.format(PRIVATE_KEY_FORMAT, new String(base64));
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

    return Base64.decodeBase64(publicKeyString);
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

    return Base64.decodeBase64(privateKeyString);
  }

  public static String getPublicKeyFormattedString(KeyPair keyPair) {
    return getPublicKeyFormattedString(keyPair.getPublic());
  }

  /**
   * Creates a Public Key as a string formatted according to X509 standard.
   */
  public static String getPublicKeyFormattedString(PublicKey publicKey) {
    byte[] encodedPublicKey = publicKey.getEncoded();
    byte[] base64 = Base64.encodeBase64(encodedPublicKey);

    return String.format(PUBLIC_KEY_FORMAT, new String(base64));
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

  private static void addHeaderClientEncryptionKey(ApiContext apiContext, SecretKey key,
      Map<String, String> customHeaders) {
    try {
      Cipher cipher = Cipher.getInstance(KEY_CIPHER_ALGORITHM);
      cipher.init(Cipher.ENCRYPT_MODE, apiContext.getInstallationContext().getPublicKeyServer());
      byte[] keyEncrypted = cipher.doFinal(key.getEncoded());
      String keyEncryptedEncoded = Base64.encodeBase64String(keyEncrypted);
      customHeaders.put(HEADER_CLIENT_ENCRYPTION_KEY, keyEncryptedEncoded);
    } catch (GeneralSecurityException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  private static void addHeaderClientEncryptionIv(byte[] initializationVector, Map<String,
      String> customHeaders) {
    String initializationVectorEncoded = Base64.encodeBase64String(initializationVector);

    customHeaders.put(HEADER_CLIENT_ENCRYPTION_IV, initializationVectorEncoded);
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
      String hmacEncoded = Base64.encodeBase64String(hmac);
      customHeaders.put(HEADER_CLIENT_ENCRYPTION_HMAC, hmacEncoded);
    } catch (GeneralSecurityException | IOException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  public static String generateSignature(HttpUriRequest httpEntity, KeyPair keyPairClient) {
    byte[] requestBytes = getRequestBytes(httpEntity);

    return SecurityUtils.signBase64(requestBytes, keyPairClient);
  }

  private static byte[] getRequestBytes(HttpUriRequest httpEntity) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    try {
      outputStream.write(getRequestHeadBytes(httpEntity));
      outputStream.write(getEntityBodyBytes(httpEntity));
    } catch (IOException exception) {
      throw new UncaughtExceptionError(exception);
    }

    return outputStream.toByteArray();
  }

  private static byte[] getRequestHeadBytes(HttpUriRequest httpEntity) {
    String requestHeadString = generateMethodAndEndpointString(httpEntity) + NEWLINE +
        generateRequestHeadersSortedString(httpEntity) + NEWLINE + NEWLINE;

    return requestHeadString.getBytes();
  }

  private static String generateMethodAndEndpointString(HttpUriRequest httpEntity) {
    String uriString = httpEntity.getURI().toString();
    String method = httpEntity.getMethod();
    String path = httpEntity.getURI().getPath();
    String pathWithParameters = uriString.substring(uriString.indexOf(path));

    return method + DELIMITER_METHOD_PATH + pathWithParameters;
  }

  private static byte[] getEntityBodyBytes(HttpUriRequest httpEntity) throws IOException {
    if (httpEntity instanceof HttpGet || httpEntity instanceof HttpDelete) {
      return new byte[ARRAY_LENGTH_EMPTY];
    } else if (httpEntity instanceof HttpPost || httpEntity instanceof HttpPut) {
      return EntityUtils.toByteArray(((HttpEntityEnclosingRequest) httpEntity).getEntity());
    } else {
      throw new IllegalStateException(ERROR_CAN_NOT_GET_ENTITY_BODY_BYTES);
    }
  }

  private static String generateRequestHeadersSortedString(HttpUriRequest httpEntity) {
    return Arrays.stream(httpEntity.getAllHeaders())
        .filter(
            header ->
                header.getName().startsWith(HEADER_NAME_PREFIX_X_BUNQ) ||
                    header.getName().equals(ApiClient.HEADER_CACHE_CONTROL) ||
                    header.getName().equals(ApiClient.HEADER_USER_AGENT)
        )
        .map(header -> header.getName() + DELIMITER_HEADER_NAME_AND_VALUE + header.getValue())
        .sorted()
        .collect(Collectors.joining(NEWLINE));
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

    return new String(Base64.encodeBase64(dataBytesSigned));
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

  public static void validateResponseSignature(int responseCode, byte[] responseBodyBytes,
      HttpResponse httpEntity, PublicKey keyPublicServer) {
    byte[] responseBytes = getResponseBytes(responseCode, responseBodyBytes,
        httpEntity.getAllHeaders());
    Signature signature = getSignatureInstance();
    Header headerServerSignature = httpEntity.getFirstHeader(HEADER_SERVER_SIGNATURE);
    byte[] serverSignatureBase64Bytes = headerServerSignature.getValue().getBytes();
    byte[] serverSignatureDecoded = Base64.decodeBase64(serverSignatureBase64Bytes);
    verifyDataSigned(signature, keyPublicServer, responseBytes, serverSignatureDecoded);
  }

  private static byte[] getResponseBytes(int responseCode, byte[] responseBodyBytes,
      Header[] responseHeaders) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    for (int i = INDEX_FIRST; i < responseHeaders.length; i++) {
      if (responseHeaders[i].getName().equals(HEADER_SERVER_SIGNATURE)) {
        continue;
      }

      responseHeaders[i] = new BasicHeader(
          getHeaderNameCorrectlyCased(responseHeaders[i].getName()),
          responseHeaders[i].getValue()
      );
    }

    try {
      outputStream.write(getResponseHeadBytes(responseCode, responseHeaders));
      outputStream.write(responseBodyBytes);
    } catch (IOException exception) {
      throw new UncaughtExceptionError(exception);
    }

    return outputStream.toByteArray();
  }

  private static String getHeaderNameCorrectlyCased(String headerName) {
    headerName = headerName.toLowerCase();
    headerName = headerName.substring(SUBSTRING_BEGIN_INDEX, SUBSTRING_END_INDEX).toUpperCase()
        + headerName.substring(SUBSTRING_END_INDEX);
    Pattern pattern = Pattern.compile(REGEX_FOR_LOWERCASE_HEADERS);
    Matcher matcher = pattern.matcher(headerName);

    while (matcher.find()) {
     String result = matcher.group();
     headerName = headerName.replace(result, result.toUpperCase());
    }

    return headerName;
  }

  private static byte[] getResponseHeadBytes(int responseCode, Header[] responseHeaders) {
    String requestHeadString = responseCode + NEWLINE +
        generateResponseHeadersSortedString(responseHeaders) + NEWLINE + NEWLINE;

    return requestHeadString.getBytes();
  }

  private static String generateResponseHeadersSortedString(Header[] responseHeaders) {
    return Arrays.stream(responseHeaders)
        .filter(
            header ->
                header.getName().startsWith(HEADER_NAME_PREFIX_X_BUNQ) &&
                    !header.getName().equals(HEADER_SERVER_SIGNATURE)
        )
        .map(header -> header.getName() + DELIMITER_HEADER_NAME_AND_VALUE + header.getValue())
        .sorted()
        .collect(Collectors.joining(NEWLINE));
  }

}
