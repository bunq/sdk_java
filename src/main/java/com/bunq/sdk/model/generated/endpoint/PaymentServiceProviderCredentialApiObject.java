package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.PermittedDeviceObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Register a Payment Service Provider and provide credentials
 */
public class PaymentServiceProviderCredentialApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "payment-service-provider-credential/%s";
  protected static final String ENDPOINT_URL_CREATE = "payment-service-provider-credential";

  /**
   * Field constants.
   */
  public static final String FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE = "client_payment_service_provider_certificate";
  public static final String FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE_CHAIN = "client_payment_service_provider_certificate_chain";
  public static final String FIELD_CLIENT_PUBLIC_KEY_SIGNATURE = "client_public_key_signature";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CredentialPasswordIp";

  /**
   * The id of the credential.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the credential object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the credential object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the credential.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * When the status is PENDING_FIRST_USE: when the credential expires.
   */
  @Expose
  @SerializedName("expiry_time")
  private String expiryTime;

  /**
   * When the status is PENDING_FIRST_USE: the value of the token.
   */
  @Expose
  @SerializedName("token_value")
  private String tokenValue;

  /**
   * When the status is ACTIVE: the details of the device that may use the credential.
   */
  @Expose
  @SerializedName("permitted_device")
  private PermittedDeviceObject permittedDevice;

  /**
   * Payment Services Directive 2 compatible QSEAL certificate
   */
  @Expose
  @SerializedName("client_payment_service_provider_certificate_field_for_request")
  private String clientPaymentServiceProviderCertificateFieldForRequest;

  /**
   * Intermediate and root certificate belonging to the provided certificate.
   */
  @Expose
  @SerializedName("client_payment_service_provider_certificate_chain_field_for_request")
  private String clientPaymentServiceProviderCertificateChainFieldForRequest;

  /**
   * The Base64 encoded signature of the public key provided during installation and with the
   * installation token appended as a nonce. Signed with the private key belonging to the QSEAL
   * certificate.
   */
  @Expose
  @SerializedName("client_public_key_signature_field_for_request")
  private String clientPublicKeySignatureFieldForRequest;

  public PaymentServiceProviderCredentialApiObject() {
  this(null, null, null);
  }

  public PaymentServiceProviderCredentialApiObject(String clientPaymentServiceProviderCertificate) {
  this(clientPaymentServiceProviderCertificate, null, null);
  }

  public PaymentServiceProviderCredentialApiObject(String clientPaymentServiceProviderCertificate, String clientPaymentServiceProviderCertificateChain) {
  this(clientPaymentServiceProviderCertificate, clientPaymentServiceProviderCertificateChain, null);
  }

  public PaymentServiceProviderCredentialApiObject(String clientPaymentServiceProviderCertificate, String clientPaymentServiceProviderCertificateChain, String clientPublicKeySignature) {
    this.clientPaymentServiceProviderCertificateFieldForRequest = clientPaymentServiceProviderCertificate;
    this.clientPaymentServiceProviderCertificateChainFieldForRequest = clientPaymentServiceProviderCertificateChain;
    this.clientPublicKeySignatureFieldForRequest = clientPublicKeySignature;
  }  /**
   */
  public static BunqResponse<PaymentServiceProviderCredentialApiObject> get(Integer paymentServiceProviderCredentialId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, paymentServiceProviderCredentialId), params, customHeaders);

    return fromJson(PaymentServiceProviderCredentialApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentServiceProviderCredentialApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<PaymentServiceProviderCredentialApiObject> get(Integer paymentServiceProviderCredentialId) {
    return get(paymentServiceProviderCredentialId, null, null);
  }

  public static BunqResponse<PaymentServiceProviderCredentialApiObject> get(Integer paymentServiceProviderCredentialId, Map<String, String> params) {
    return get(paymentServiceProviderCredentialId, params, null);
  }

  /**
   * @param clientPaymentServiceProviderCertificate Payment Services Directive 2 compatible QSEAL
   * certificate
   * @param clientPaymentServiceProviderCertificateChain Intermediate and root certificate
   * belonging to the provided certificate.
   * @param clientPublicKeySignature The Base64 encoded signature of the public key provided
   * during installation and with the installation token appended as a nonce. Signed with the
   * private key belonging to the QSEAL certificate.
   */
  public static BunqResponse<Integer> create(String clientPaymentServiceProviderCertificate, String clientPaymentServiceProviderCertificateChain, String clientPublicKeySignature, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE, clientPaymentServiceProviderCertificate);
requestMap.put(FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE_CHAIN, clientPaymentServiceProviderCertificateChain);
requestMap.put(FIELD_CLIENT_PUBLIC_KEY_SIGNATURE, clientPublicKeySignature);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(String clientPaymentServiceProviderCertificate) {
    return create(clientPaymentServiceProviderCertificate, null, null, null);
  }

  public static BunqResponse<Integer> create(String clientPaymentServiceProviderCertificate, String clientPaymentServiceProviderCertificateChain) {
    return create(clientPaymentServiceProviderCertificate, clientPaymentServiceProviderCertificateChain, null, null);
  }

  public static BunqResponse<Integer> create(String clientPaymentServiceProviderCertificate, String clientPaymentServiceProviderCertificateChain, String clientPublicKeySignature) {
    return create(clientPaymentServiceProviderCertificate, clientPaymentServiceProviderCertificateChain, clientPublicKeySignature, null);
  }

  /**
   * The id of the credential.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the credential object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the credential object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the credential.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * When the status is PENDING_FIRST_USE: when the credential expires.
   */
  public String getExpiryTime() {
    return this.expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * When the status is PENDING_FIRST_USE: the value of the token.
   */
  public String getTokenValue() {
    return this.tokenValue;
  }

  public void setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
  }

  /**
   * When the status is ACTIVE: the details of the device that may use the credential.
   */
  public PermittedDeviceObject getPermittedDevice() {
    return this.permittedDevice;
  }

  public void setPermittedDevice(PermittedDeviceObject permittedDevice) {
    this.permittedDevice = permittedDevice;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.expiryTime != null) {
      return false;
    }

    if (this.tokenValue != null) {
      return false;
    }

    if (this.permittedDevice != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentServiceProviderCredentialApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentServiceProviderCredentialApiObject.class, reader);
  }

}
