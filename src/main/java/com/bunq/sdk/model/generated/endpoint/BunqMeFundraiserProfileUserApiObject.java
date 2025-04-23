package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AttachmentPublicObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.PointerObject;
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
 * bunq.me public profile of the user.
 */
public class BunqMeFundraiserProfileUserApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/bunqme-fundraiser-profile/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/bunqme-fundraiser-profile";

  /**
   * Field constants.
   */
  public static final String FIELD_MONETARY_ACCOUNT_ID = "monetary_account_id";
  public static final String FIELD_COLOR = "color";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT_PUBLIC_UUID = "attachment_public_uuid";
  public static final String FIELD_POINTER = "pointer";
  public static final String FIELD_REDIRECT_URL = "redirect_url";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "BunqMeFundraiserProfile";

  /**
   * Id of the monetary account on which you want to receive bunq.me payments.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * Id of the user owning the profile.
   */
  @Expose
  @SerializedName("owner_user_id")
  private Integer ownerUserId;

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The currency of the MonetaryAccount that created the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachment used for the background of the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("attachment")
  private AttachmentPublicObject attachment;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer")
  private PointerObject pointer;

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * ID of the monetary account on which you want to receive bunq.me fundraiser payments.
   */
  @Expose
  @SerializedName("monetary_account_id_field_for_request")
  private Integer monetaryAccountIdFieldForRequest;

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  @Expose
  @SerializedName("color_field_for_request")
  private String colorFieldForRequest;

  /**
   * The description of the bunq.me fundraiser profile. Maximum 9000 characters. Field is required
   * but can be an empty string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The public UUID of the public attachment from which an avatar image must be created.
   */
  @Expose
  @SerializedName("attachment_public_uuid_field_for_request")
  private String attachmentPublicUuidFieldForRequest;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer_field_for_request")
  private PointerObject pointerFieldForRequest;

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  @Expose
  @SerializedName("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  /**
   * The status of the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public BunqMeFundraiserProfileUserApiObject() {
  this(null, null, null, null, null, null, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId) {
  this(monetaryAccountId, null, null, null, null, null, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId, String description) {
  this(monetaryAccountId, description, null, null, null, null, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId, String description, PointerObject pointer) {
  this(monetaryAccountId, description, pointer, null, null, null, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId, String description, PointerObject pointer, String color) {
  this(monetaryAccountId, description, pointer, color, null, null, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId, String description, PointerObject pointer, String color, String attachmentPublicUuid) {
  this(monetaryAccountId, description, pointer, color, attachmentPublicUuid, null, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId, String description, PointerObject pointer, String color, String attachmentPublicUuid, String redirectUrl) {
  this(monetaryAccountId, description, pointer, color, attachmentPublicUuid, redirectUrl, null);
  }

  public BunqMeFundraiserProfileUserApiObject(Integer monetaryAccountId, String description, PointerObject pointer, String color, String attachmentPublicUuid, String redirectUrl, String status) {
    this.monetaryAccountIdFieldForRequest = monetaryAccountId;
    this.colorFieldForRequest = color;
    this.descriptionFieldForRequest = description;
    this.attachmentPublicUuidFieldForRequest = attachmentPublicUuid;
    this.pointerFieldForRequest = pointer;
    this.redirectUrlFieldForRequest = redirectUrl;
    this.statusFieldForRequest = status;
  }  /**
   */
  public static BunqResponse<BunqMeFundraiserProfileUserApiObject> get(Integer bunqMeFundraiserProfileUserId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), bunqMeFundraiserProfileUserId), params, customHeaders);

    return fromJson(BunqMeFundraiserProfileUserApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<BunqMeFundraiserProfileUserApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<BunqMeFundraiserProfileUserApiObject> get(Integer bunqMeFundraiserProfileUserId) {
    return get(bunqMeFundraiserProfileUserId, null, null);
  }

  public static BunqResponse<BunqMeFundraiserProfileUserApiObject> get(Integer bunqMeFundraiserProfileUserId, Map<String, String> params) {
    return get(bunqMeFundraiserProfileUserId, params, null);
  }

  /**
   */
  public static BunqResponse<List<BunqMeFundraiserProfileUserApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(BunqMeFundraiserProfileUserApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<BunqMeFundraiserProfileUserApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<BunqMeFundraiserProfileUserApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * Id of the monetary account on which you want to receive bunq.me payments.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * Id of the user owning the profile.
   */
  public Integer getOwnerUserId() {
    return this.ownerUserId;
  }

  public void setOwnerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The currency of the MonetaryAccount that created the bunq.me fundraiser profile.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the bunq.me fundraiser profile.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The attachment used for the background of the bunq.me fundraiser profile.
   */
  public AttachmentPublicObject getAttachment() {
    return this.attachment;
  }

  public void setAttachment(AttachmentPublicObject attachment) {
    this.attachment = attachment;
  }

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  public PointerObject getPointer() {
    return this.pointer;
  }

  public void setPointer(PointerObject pointer) {
    this.pointer = pointer;
  }

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.ownerUserId != null) {
      return false;
    }

    if (this.color != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.pointer != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeFundraiserProfileUserApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeFundraiserProfileUserApiObject.class, reader);
  }

}
