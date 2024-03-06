package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.AttachmentPublic;
import com.bunq.sdk.model.generated.object.Geolocation;
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
 * Public endpoint for getting the place info.
 */
public class ActivityMapPlacePublic extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "activity-map-place-public/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ActivityMapPlace";

  /**
   * The name of the place.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The public uuid of the place.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The geolocation of this place.
   */
  @Expose
  @SerializedName("geolocation")
  private Geolocation geolocation;

  /**
   * The address of this place.
   */
  @Expose
  @SerializedName("address")
  private Address address;

  /**
   * The phone number of this place.
   */
  @Expose
  @SerializedName("phone_number")
  private String phoneNumber;

  /**
   * The URL to this place's merchant website.
   */
  @Expose
  @SerializedName("url_merchant")
  private String urlMerchant;

  /**
   * The URL to the place's Google maps location.
   */
  @Expose
  @SerializedName("url_google_maps")
  private String urlGoogleMaps;

  /**
   * The attachments for the place's photos.
   */
  @Expose
  @SerializedName("all_attachment_photo")
  private List<AttachmentPublic> allAttachmentPhoto;

  /**
   * The google types of the place.
   */
  @Expose
  @SerializedName("all_type")
  private List<String> allType;

  /**
   * The opening periods of the place.
   */
  @Expose
  @SerializedName("all_opening_period")
  private List<String> allOpeningPeriod;

  /**
   * The total number of recommendations.
   */
  @Expose
  @SerializedName("number_of_recommendation_total")
  private Integer numberOfRecommendationTotal;

  /**
   */
  public static BunqResponse<ActivityMapPlacePublic> get(String activityMapPlacePublicUuid, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, activityMapPlacePublicUuid), params, customHeaders);

    return fromJson(ActivityMapPlacePublic.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ActivityMapPlacePublic> get() {
    return get(null, null, null);
  }

  public static BunqResponse<ActivityMapPlacePublic> get(String activityMapPlacePublicUuid) {
    return get(activityMapPlacePublicUuid, null, null);
  }

  public static BunqResponse<ActivityMapPlacePublic> get(String activityMapPlacePublicUuid, Map<String, String> params) {
    return get(activityMapPlacePublicUuid, params, null);
  }

  /**
   * The name of the place.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The public uuid of the place.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The geolocation of this place.
   */
  public Geolocation getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  /**
   * The address of this place.
   */
  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * The phone number of this place.
   */
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The URL to this place's merchant website.
   */
  public String getUrlMerchant() {
    return this.urlMerchant;
  }

  public void setUrlMerchant(String urlMerchant) {
    this.urlMerchant = urlMerchant;
  }

  /**
   * The URL to the place's Google maps location.
   */
  public String getUrlGoogleMaps() {
    return this.urlGoogleMaps;
  }

  public void setUrlGoogleMaps(String urlGoogleMaps) {
    this.urlGoogleMaps = urlGoogleMaps;
  }

  /**
   * The attachments for the place's photos.
   */
  public List<AttachmentPublic> getAllAttachmentPhoto() {
    return this.allAttachmentPhoto;
  }

  public void setAllAttachmentPhoto(List<AttachmentPublic> allAttachmentPhoto) {
    this.allAttachmentPhoto = allAttachmentPhoto;
  }

  /**
   * The google types of the place.
   */
  public List<String> getAllType() {
    return this.allType;
  }

  public void setAllType(List<String> allType) {
    this.allType = allType;
  }

  /**
   * The opening periods of the place.
   */
  public List<String> getAllOpeningPeriod() {
    return this.allOpeningPeriod;
  }

  public void setAllOpeningPeriod(List<String> allOpeningPeriod) {
    this.allOpeningPeriod = allOpeningPeriod;
  }

  /**
   * The total number of recommendations.
   */
  public Integer getNumberOfRecommendationTotal() {
    return this.numberOfRecommendationTotal;
  }

  public void setNumberOfRecommendationTotal(Integer numberOfRecommendationTotal) {
    this.numberOfRecommendationTotal = numberOfRecommendationTotal;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.name != null) {
      return false;
    }

    if (this.publicUuid != null) {
      return false;
    }

    if (this.geolocation != null) {
      return false;
    }

    if (this.address != null) {
      return false;
    }

    if (this.phoneNumber != null) {
      return false;
    }

    if (this.urlMerchant != null) {
      return false;
    }

    if (this.urlGoogleMaps != null) {
      return false;
    }

    if (this.allAttachmentPhoto != null) {
      return false;
    }

    if (this.allType != null) {
      return false;
    }

    if (this.allOpeningPeriod != null) {
      return false;
    }

    if (this.numberOfRecommendationTotal != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ActivityMapPlacePublic fromJsonReader(JsonReader reader) {
    return fromJsonReader(ActivityMapPlacePublic.class, reader);
  }

}
