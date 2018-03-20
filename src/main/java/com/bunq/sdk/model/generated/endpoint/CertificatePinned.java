package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Certificate;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This endpoint allow you to pin the certificate chains to your account. These certificate
 * chains are used for SSL validation whenever a callback is initiated to one of your https
 * callback urls.
 */
public class CertificatePinned extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/certificate-pinned";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/certificate-pinned/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/certificate-pinned";
  protected static final String ENDPOINT_URL_READ = "user/%s/certificate-pinned/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_CERTIFICATE_CHAIN = "certificate_chain";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CertificatePinned";

  /**
   * The certificate chain in .PEM format. Certificates are glued with newline characters.
   */
  @Expose
  @SerializedName("certificate_chain")
  private String certificateChain;

  /**
   * The id generated for the pinned certificate chain.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * Pin the certificate chain.
   * @param certificateChain The certificate chain in .PEM format.
   */
  public static BunqResponse<Integer> create(List<Certificate> certificateChain, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_CERTIFICATE_CHAIN, certificateChain);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(List<Certificate> certificateChain) {
    return create(certificateChain, null);
  }

  /**
   * Remove the pinned certificate chain with the specific ID.
   */
  public static BunqResponse<CertificatePinned> delete(Integer certificatePinnedId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), certificatePinnedId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<CertificatePinned> delete(Integer certificatePinnedId) {
    return delete(certificatePinnedId, null);
  }

  /**
   * List all the pinned certificate chain for the given user.
   */
  public static BunqResponse<List<CertificatePinned>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(CertificatePinned.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CertificatePinned>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<CertificatePinned>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * Get the pinned certificate chain with the specified ID.
   */
  public static BunqResponse<CertificatePinned> get(Integer certificatePinnedId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), certificatePinnedId), params, customHeaders);

    return fromJson(CertificatePinned.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CertificatePinned> get() {
    return get(null, null, null);
  }

  public static BunqResponse<CertificatePinned> get(Integer certificatePinnedId) {
    return get(certificatePinnedId, null, null);
  }

  public static BunqResponse<CertificatePinned> get(Integer certificatePinnedId, Map<String, String> params) {
    return get(certificatePinnedId, params, null);
  }

  /**
   * The certificate chain in .PEM format. Certificates are glued with newline characters.
   */
  public String getCertificateChain() {
    return this.certificateChain;
  }

  public void setCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
  }

  /**
   * The id generated for the pinned certificate chain.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.certificateChain != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CertificatePinned fromJsonReader(JsonReader reader) {
    return fromJsonReader(CertificatePinned.class, reader);
  }

}
