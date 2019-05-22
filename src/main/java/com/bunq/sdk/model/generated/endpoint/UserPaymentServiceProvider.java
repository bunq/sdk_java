package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Used to view UserPaymentServiceProvider for session creation.
 */
public class UserPaymentServiceProvider extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user-payment-service-provider/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "UserPaymentServiceProvider";

  /**
   * The id of the user.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the user object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the user object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The distinguished name from the certificate used to identify this user.
   */
  @Expose
  @SerializedName("certificate_distinguished_name")
  private String certificateDistinguishedName;

  /**
   * The aliases of the user.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The user's avatar.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The user status. The user status. Can be: ACTIVE, BLOCKED or DENIED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The user sub-status. Can be: NONE
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The providers's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The display name for the provider.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The public nick name for the provider.
   */
  @Expose
  @SerializedName("public_nick_name")
  private String publicNickName;

  /**
   * The provider's language. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, separated by an underscore.
   */
  @Expose
  @SerializedName("language")
  private String language;

  /**
   * The provider's region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, separated by an underscore.
   */
  @Expose
  @SerializedName("region")
  private String region;

  /**
   * The setting for the session timeout of the user in seconds.
   */
  @Expose
  @SerializedName("session_timeout")
  private Integer sessionTimeout;

  /**
   */
  public static BunqResponse<UserPaymentServiceProvider> get(Integer userPaymentServiceProviderId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userPaymentServiceProviderId), params, customHeaders);

    return fromJson(UserPaymentServiceProvider.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<UserPaymentServiceProvider> get() {
    return get(null, null, null);
  }

  public static BunqResponse<UserPaymentServiceProvider> get(Integer userPaymentServiceProviderId) {
    return get(userPaymentServiceProviderId, null, null);
  }

  public static BunqResponse<UserPaymentServiceProvider> get(Integer userPaymentServiceProviderId, Map<String, String> params) {
    return get(userPaymentServiceProviderId, params, null);
  }

  /**
   */
  public static UserPaymentServiceProvider fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserPaymentServiceProvider.class, reader);
  }

  /**
   * The id of the user.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the user object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the user object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The distinguished name from the certificate used to identify this user.
   */
  public String getCertificateDistinguishedName() {
    return this.certificateDistinguishedName;
  }

  public void setCertificateDistinguishedName(String certificateDistinguishedName) {
    this.certificateDistinguishedName = certificateDistinguishedName;
  }

  /**
   * The aliases of the user.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The user's avatar.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The user status. The user status. Can be: ACTIVE, BLOCKED or DENIED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The user sub-status. Can be: NONE
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The providers's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The display name for the provider.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The public nick name for the provider.
   */
  public String getPublicNickName() {
    return this.publicNickName;
  }

  public void setPublicNickName(String publicNickName) {
    this.publicNickName = publicNickName;
  }

  /**
   * The provider's language. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, separated by an underscore.
   */
  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The provider's region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
   * country code, separated by an underscore.
   */
  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * The setting for the session timeout of the user in seconds.
   */
  public Integer getSessionTimeout() {
    return this.sessionTimeout;
  }

  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
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

    if (this.certificateDistinguishedName != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.publicUuid != null) {
      return false;
    }

    if (this.displayName != null) {
      return false;
    }

    if (this.publicNickName != null) {
      return false;
    }

    if (this.language != null) {
      return false;
    }

    if (this.region != null) {
      return false;
    }

    if (this.sessionTimeout != null) {
      return false;
    }

    return true;
  }

}
