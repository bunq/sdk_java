package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Certificate;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * This endpoint allow you to pin the certificate chains to your account. These certificate
 * chains are used for SSL validation whenever a callback is initiated to one of your https
 * callback urls.
 */
public class CertificatePinned extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CERTIFICATE_CHAIN = "certificate_chain";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/certificate-pinned";
  private static final String ENDPOINT_URL_DELETE = "user/%s/certificate-pinned/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/certificate-pinned";
  private static final String ENDPOINT_URL_READ = "user/%s/certificate-pinned/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CertificatePinned";

  /**
   * The certificate chain in .PEM format.
   */
  @Expose
  @SerializedName("certificate_chain")
  private List<Certificate> certificateChain;

  /**
   * The id generated for the pinned certificate chain.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   * Pin the certificate chain.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId,
      Integer certificatePinnedId) {
    return delete(apiContext, userId, certificatePinnedId, new HashMap<>());
  }

  /**
   * Remove the pinned certificate chain with the specific ID.
   */
  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId,
      Integer certificatePinnedId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .delete(String.format(ENDPOINT_URL_DELETE, userId, certificatePinnedId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<List<CertificatePinned>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   * List all the pinned certificate chain for the given user.
   */
  public static BunqResponse<List<CertificatePinned>> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(CertificatePinned.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<CertificatePinned> get(ApiContext apiContext, Integer userId,
      Integer certificatePinnedId) {
    return get(apiContext, userId, certificatePinnedId, new HashMap<>());
  }

  /**
   * Get the pinned certificate chain with the specified ID.
   */
  public static BunqResponse<CertificatePinned> get(ApiContext apiContext, Integer userId,
      Integer certificatePinnedId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, certificatePinnedId), customHeaders);

    return fromJson(CertificatePinned.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The certificate chain in .PEM format.
   */
  public List<Certificate> getCertificateChain() {
    return this.certificateChain;
  }

  public void setCertificateChain(List<Certificate> certificateChain) {
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

}
