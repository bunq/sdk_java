package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
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
 * Get a PDF export of an invoice.
 */
public class InvoiceExportPdf extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/invoice/%s/invoice-export/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/invoice/%s/invoice-export";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/invoice/%s/invoice-export/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/invoice/%s/invoice-export/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "InvoiceExportPdf";

  /**
   * The id of the invoice export model.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the invoice export's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the invoice export's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the invoice export.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   */
  public static BunqResponse<InvoiceExportPdf> get(Integer invoiceId, Integer invoiceExportPdfId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), invoiceId, invoiceExportPdfId), params, customHeaders);

    return fromJson(InvoiceExportPdf.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<InvoiceExportPdf> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<InvoiceExportPdf> get(Integer invoiceId) {
    return get(invoiceId, null, null, null);
  }

  public static BunqResponse<InvoiceExportPdf> get(Integer invoiceId, Integer invoiceExportPdfId) {
    return get(invoiceId, invoiceExportPdfId, null, null);
  }

  public static BunqResponse<InvoiceExportPdf> get(Integer invoiceId, Integer invoiceExportPdfId, Map<String, String> params) {
    return get(invoiceId, invoiceExportPdfId, params, null);
  }

  /**
   */
  public static BunqResponse<Integer> create(Integer invoiceId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), invoiceId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(Integer invoiceId) {
    return create(invoiceId, null);
  }

  /**
   */
  public static BunqResponse<Integer> update(Integer invoiceId, Integer invoiceExportPdfId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), invoiceId, invoiceExportPdfId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer invoiceId) {
    return update(invoiceId, null, null);
  }

  public static BunqResponse<Integer> update(Integer invoiceId, Integer invoiceExportPdfId) {
    return update(invoiceId, invoiceExportPdfId, null);
  }

  /**
   */
  public static BunqResponse<InvoiceExportPdf> delete(Integer invoiceId, Integer invoiceExportPdfId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), invoiceId, invoiceExportPdfId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<InvoiceExportPdf> delete(Integer invoiceId) {
    return delete(invoiceId, null, null);
  }

  public static BunqResponse<InvoiceExportPdf> delete(Integer invoiceId, Integer invoiceExportPdfId) {
    return delete(invoiceId, invoiceExportPdfId, null);
  }

  /**
   * The id of the invoice export model.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the invoice export's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the invoice export's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the invoice export.
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

    return true;
  }

  /**
   */
  public static InvoiceExportPdf fromJsonReader(JsonReader reader) {
    return fromJsonReader(InvoiceExportPdf.class, reader);
  }

}
