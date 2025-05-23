package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
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
 * Used to create Transferwise payments.
 */
public class TransferwiseTransferApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/transferwise-quote/%s/transferwise-transfer";
  protected static final String ENDPOINT_URL_READ = "user/%s/transferwise-quote/%s/transferwise-transfer/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/transferwise-quote/%s/transferwise-transfer";

  /**
   * Field constants.
   */
  public static final String FIELD_MONETARY_ACCOUNT_ID = "monetary_account_id";
  public static final String FIELD_RECIPIENT_ID = "recipient_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TransferwisePayment";

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The status.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The subStatus.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The status as Transferwise reports it.
   */
  @Expose
  @SerializedName("status_transferwise")
  private String statusTransferwise;

  /**
   * A status to indicatie if Transferwise has an issue with this payment and requires more
   * information.
   */
  @Expose
  @SerializedName("status_transferwise_issue")
  private String statusTransferwiseIssue;

  /**
   * The source amount.
   */
  @Expose
  @SerializedName("amount_source")
  private AmountObject amountSource;

  /**
   * The target amount.
   */
  @Expose
  @SerializedName("amount_target")
  private AmountObject amountTarget;

  /**
   * The rate of the payment.
   */
  @Expose
  @SerializedName("rate")
  private String rate;

  /**
   * The reference of the payment.
   */
  @Expose
  @SerializedName("reference")
  private String reference;

  /**
   * The Pay-In reference of the payment.
   */
  @Expose
  @SerializedName("pay_in_reference")
  private String payInReference;

  /**
   * The estimated delivery time.
   */
  @Expose
  @SerializedName("time_delivery_estimate")
  private String timeDeliveryEstimate;

  /**
   * The quote details used to created the payment.
   */
  @Expose
  @SerializedName("quote")
  private TransferwiseQuoteApiObject quote;

  /**
   * The id of the monetary account the payment should be made from.
   */
  @Expose
  @SerializedName("monetary_account_id_field_for_request")
  private String monetaryAccountIdFieldForRequest;

  /**
   * The id of the target account.
   */
  @Expose
  @SerializedName("recipient_id_field_for_request")
  private String recipientIdFieldForRequest;

  public TransferwiseTransferApiObject() {
  this(null, null);
  }

  public TransferwiseTransferApiObject(String monetaryAccountId) {
  this(monetaryAccountId, null);
  }

  public TransferwiseTransferApiObject(String monetaryAccountId, String recipientId) {
    this.monetaryAccountIdFieldForRequest = monetaryAccountId;
    this.recipientIdFieldForRequest = recipientId;
  }  /**
   * @param monetaryAccountId The id of the monetary account the payment should be made from.
   * @param recipientId The id of the target account.
   */
  public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String monetaryAccountId, String recipientId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_MONETARY_ACCOUNT_ID, monetaryAccountId);
requestMap.put(FIELD_RECIPIENT_ID, recipientId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), transferwiseQuoteId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer transferwiseQuoteId) {
    return create(transferwiseQuoteId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String monetaryAccountId) {
    return create(transferwiseQuoteId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String monetaryAccountId, String recipientId) {
    return create(transferwiseQuoteId, monetaryAccountId, recipientId, null);
  }

  /**
   */
  public static BunqResponse<TransferwiseTransferApiObject> get(Integer transferwiseQuoteId, Integer transferwiseTransferId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), transferwiseQuoteId, transferwiseTransferId), params, customHeaders);

    return fromJson(TransferwiseTransferApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<TransferwiseTransferApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<TransferwiseTransferApiObject> get(Integer transferwiseQuoteId) {
    return get(transferwiseQuoteId, null, null, null);
  }

  public static BunqResponse<TransferwiseTransferApiObject> get(Integer transferwiseQuoteId, Integer transferwiseTransferId) {
    return get(transferwiseQuoteId, transferwiseTransferId, null, null);
  }

  public static BunqResponse<TransferwiseTransferApiObject> get(Integer transferwiseQuoteId, Integer transferwiseTransferId, Map<String, String> params) {
    return get(transferwiseQuoteId, transferwiseTransferId, params, null);
  }

  /**
   */
  public static BunqResponse<List<TransferwiseTransferApiObject>> list(Integer transferwiseQuoteId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), transferwiseQuoteId), params, customHeaders);

    return fromJsonList(TransferwiseTransferApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<TransferwiseTransferApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<TransferwiseTransferApiObject>> list(Integer transferwiseQuoteId) {
    return list(transferwiseQuoteId, null, null);
  }

  public static BunqResponse<List<TransferwiseTransferApiObject>> list(Integer transferwiseQuoteId, Map<String, String> params) {
    return list(transferwiseQuoteId, params, null);
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The status.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The subStatus.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The status as Transferwise reports it.
   */
  public String getStatusTransferwise() {
    return this.statusTransferwise;
  }

  public void setStatusTransferwise(String statusTransferwise) {
    this.statusTransferwise = statusTransferwise;
  }

  /**
   * A status to indicatie if Transferwise has an issue with this payment and requires more
   * information.
   */
  public String getStatusTransferwiseIssue() {
    return this.statusTransferwiseIssue;
  }

  public void setStatusTransferwiseIssue(String statusTransferwiseIssue) {
    this.statusTransferwiseIssue = statusTransferwiseIssue;
  }

  /**
   * The source amount.
   */
  public AmountObject getAmountSource() {
    return this.amountSource;
  }

  public void setAmountSource(AmountObject amountSource) {
    this.amountSource = amountSource;
  }

  /**
   * The target amount.
   */
  public AmountObject getAmountTarget() {
    return this.amountTarget;
  }

  public void setAmountTarget(AmountObject amountTarget) {
    this.amountTarget = amountTarget;
  }

  /**
   * The rate of the payment.
   */
  public String getRate() {
    return this.rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * The reference of the payment.
   */
  public String getReference() {
    return this.reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The Pay-In reference of the payment.
   */
  public String getPayInReference() {
    return this.payInReference;
  }

  public void setPayInReference(String payInReference) {
    this.payInReference = payInReference;
  }

  /**
   * The estimated delivery time.
   */
  public String getTimeDeliveryEstimate() {
    return this.timeDeliveryEstimate;
  }

  public void setTimeDeliveryEstimate(String timeDeliveryEstimate) {
    this.timeDeliveryEstimate = timeDeliveryEstimate;
  }

  /**
   * The quote details used to created the payment.
   */
  public TransferwiseQuoteApiObject getQuote() {
    return this.quote;
  }

  public void setQuote(TransferwiseQuoteApiObject quote) {
    this.quote = quote;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.statusTransferwise != null) {
      return false;
    }

    if (this.statusTransferwiseIssue != null) {
      return false;
    }

    if (this.amountSource != null) {
      return false;
    }

    if (this.amountTarget != null) {
      return false;
    }

    if (this.rate != null) {
      return false;
    }

    if (this.reference != null) {
      return false;
    }

    if (this.payInReference != null) {
      return false;
    }

    if (this.timeDeliveryEstimate != null) {
      return false;
    }

    if (this.quote != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseTransferApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseTransferApiObject.class, reader);
  }

}
