package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Once your CashRegister has been activated you can create a QR code for it. The visibility of
 * a tab can be modified to be linked to this QR code. If a user of the bunq app scans this QR
 * code, the linked tab will be shown on his device.
 */
public class CashRegisterQrCode extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/qr-code";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s/qr-code/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/qr-code/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/qr-code";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TokenQrCashRegister";

  /**
   * The id of the created QR code. Use this id to get the RAW content of the QR code with:
   * ../qr-code/{id}/content
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the QR code's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the TokenQrCashRegister's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of this QR code. If the status is "ACTIVE" the QR code can be scanned to see the
   * linked CashRegister and tab. If the status is "INACTIVE" the QR code does not link to a
   * anything.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The CashRegister that is linked to the token.
   */
  @Expose
  @SerializedName("cash_register")
  private CashRegister cashRegister;

  /**
   * Holds the Tab object. Can be TabUsageSingle, TabUsageMultiple or null
   */
  @Expose
  @SerializedName("tab_object")
  private Tab tabObject;

  /**
   * The status of the QR code. ACTIVE or INACTIVE. Only one QR code can be ACTIVE for a
   * CashRegister at any time. Setting a QR code to ACTIVE will deactivate any other CashRegister
   * QR codes.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public CashRegisterQrCode() {
    this(null);
  }

  public CashRegisterQrCode(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   * Create a new QR code for this CashRegister. You can only have one ACTIVE CashRegister QR code
   * at the time.
   *
   * @param status The status of the QR code. ACTIVE or INACTIVE. Only one QR code can be ACTIVE
   *               for a CashRegister at any time. Setting a QR code to ACTIVE will deactivate any other
   *               CashRegister QR codes.
   */
  public static BunqResponse<Integer> create(Integer cashRegisterId, String status, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cashRegisterId) {
    return create(cashRegisterId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cashRegisterId, String status) {
    return create(cashRegisterId, status, null, null);
  }

  public static BunqResponse<Integer> create(Integer cashRegisterId, String status, Integer monetaryAccountId) {
    return create(cashRegisterId, status, monetaryAccountId, null);
  }

  /**
   * Modify a QR code in a given CashRegister. You can only have one ACTIVE CashRegister QR code
   * at the time.
   *
   * @param status The status of the QR code. ACTIVE or INACTIVE. Only one QR code can be ACTIVE
   *               for a CashRegister at any time. Setting a QR code to ACTIVE will deactivate any other
   *               CashRegister QR codes.
   */
  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer cashRegisterQrCodeId, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, cashRegisterQrCodeId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId) {
    return update(cashRegisterId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer cashRegisterQrCodeId) {
    return update(cashRegisterId, cashRegisterQrCodeId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer cashRegisterQrCodeId, Integer monetaryAccountId) {
    return update(cashRegisterId, cashRegisterQrCodeId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer cashRegisterId, Integer cashRegisterQrCodeId, Integer monetaryAccountId, String status) {
    return update(cashRegisterId, cashRegisterQrCodeId, monetaryAccountId, status, null);
  }

  /**
   * Get the information of a specific QR code. To get the RAW content of the QR code use
   * ../qr-code/{id}/content
   */
  public static BunqResponse<CashRegisterQrCode> get(Integer cashRegisterId, Integer cashRegisterQrCodeId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, cashRegisterQrCodeId), params, customHeaders);

    return fromJson(CashRegisterQrCode.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CashRegisterQrCode> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<CashRegisterQrCode> get(Integer cashRegisterId) {
    return get(cashRegisterId, null, null, null, null);
  }

  public static BunqResponse<CashRegisterQrCode> get(Integer cashRegisterId, Integer cashRegisterQrCodeId) {
    return get(cashRegisterId, cashRegisterQrCodeId, null, null, null);
  }

  public static BunqResponse<CashRegisterQrCode> get(Integer cashRegisterId, Integer cashRegisterQrCodeId, Integer monetaryAccountId) {
    return get(cashRegisterId, cashRegisterQrCodeId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CashRegisterQrCode> get(Integer cashRegisterId, Integer cashRegisterQrCodeId, Integer monetaryAccountId, Map<String, String> params) {
    return get(cashRegisterId, cashRegisterQrCodeId, monetaryAccountId, params, null);
  }

  /**
   * Get a collection of QR code information from a given CashRegister
   */
  public static BunqResponse<List<CashRegisterQrCode>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), params, customHeaders);

    return fromJsonList(CashRegisterQrCode.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CashRegisterQrCode>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<CashRegisterQrCode>> list(Integer cashRegisterId) {
    return list(cashRegisterId, null, null, null);
  }

  public static BunqResponse<List<CashRegisterQrCode>> list(Integer cashRegisterId, Integer monetaryAccountId) {
    return list(cashRegisterId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<CashRegisterQrCode>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params) {
    return list(cashRegisterId, monetaryAccountId, params, null);
  }

  /**
   * The id of the created QR code. Use this id to get the RAW content of the QR code with:
   * ../qr-code/{id}/content
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the QR code's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the TokenQrCashRegister's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of this QR code. If the status is "ACTIVE" the QR code can be scanned to see the
   * linked CashRegister and tab. If the status is "INACTIVE" the QR code does not link to a
   * anything.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The CashRegister that is linked to the token.
   */
  public CashRegister getCashRegister() {
    return this.cashRegister;
  }

  public void setCashRegister(CashRegister cashRegister) {
    this.cashRegister = cashRegister;
  }

  /**
   * Holds the Tab object. Can be TabUsageSingle, TabUsageMultiple or null
   */
  public Tab getTabObject() {
    return this.tabObject;
  }

  public void setTabObject(Tab tabObject) {
    this.tabObject = tabObject;
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

    if (this.cashRegister != null) {
      return false;
    }

    if (this.tabObject != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CashRegisterQrCode fromJsonReader(JsonReader reader) {
    return fromJsonReader(CashRegisterQrCode.class, reader);
  }

}
