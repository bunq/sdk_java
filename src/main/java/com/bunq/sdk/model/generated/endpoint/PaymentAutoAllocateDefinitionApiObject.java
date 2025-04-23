package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
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
 * List all the definitions in a payment auto allocate.
 */
public class PaymentAutoAllocateDefinitionApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-auto-allocate/%s/definition";

  /**
   * Field constants.
   */
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_FRACTION = "fraction";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentAutoAllocateDefinition";

  /**
   * The id of the PaymentAutoAllocateDefinition.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the PaymentAutoAllocateDefinition was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the PaymentAutoAllocateDefinition was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The alias of the party we are allocating the money to.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private PointerObject counterpartyAlias;

  /**
   * The description for the payment.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The amount to allocate.
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The percentage of the triggering payment's amount to allocate.
   */
  @Expose
  @SerializedName("fraction")
  private BigDecimal fraction;

  /**
   * The type of definition.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The alias of the party we are allocating the money to.
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private PointerObject counterpartyAliasFieldForRequest;

  /**
   * The description for the payment.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The amount to allocate.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The percentage of the triggering payment's amount to allocate.
   */
  @Expose
  @SerializedName("fraction_field_for_request")
  private BigDecimal fractionFieldForRequest;

  public PaymentAutoAllocateDefinitionApiObject() {
  this(null, null, null, null, null);
  }

  public PaymentAutoAllocateDefinitionApiObject(String type) {
  this(type, null, null, null, null);
  }

  public PaymentAutoAllocateDefinitionApiObject(String type, PointerObject counterpartyAlias) {
  this(type, counterpartyAlias, null, null, null);
  }

  public PaymentAutoAllocateDefinitionApiObject(String type, PointerObject counterpartyAlias, String description) {
  this(type, counterpartyAlias, description, null, null);
  }

  public PaymentAutoAllocateDefinitionApiObject(String type, PointerObject counterpartyAlias, String description, AmountObject amount) {
  this(type, counterpartyAlias, description, amount, null);
  }

  public PaymentAutoAllocateDefinitionApiObject(String type, PointerObject counterpartyAlias, String description, AmountObject amount, BigDecimal fraction) {
    this.typeFieldForRequest = type;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.descriptionFieldForRequest = description;
    this.amountFieldForRequest = amount;
    this.fractionFieldForRequest = fraction;
  }  /**
   */
  public static BunqResponse<List<PaymentAutoAllocateDefinitionApiObject>> list(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentAutoAllocateId), params, customHeaders);

    return fromJsonList(PaymentAutoAllocateDefinitionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentAutoAllocateDefinitionApiObject>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocateDefinitionApiObject>> list(Integer paymentAutoAllocateId) {
    return list(paymentAutoAllocateId, null, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocateDefinitionApiObject>> list(Integer paymentAutoAllocateId, Integer monetaryAccountId) {
    return list(paymentAutoAllocateId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocateDefinitionApiObject>> list(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> params) {
    return list(paymentAutoAllocateId, monetaryAccountId, params, null);
  }

  /**
   * The id of the PaymentAutoAllocateDefinition.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the PaymentAutoAllocateDefinition was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the PaymentAutoAllocateDefinition was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The alias of the party we are allocating the money to.
   */
  public PointerObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(PointerObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description for the payment.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The amount to allocate.
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The percentage of the triggering payment's amount to allocate.
   */
  public BigDecimal getFraction() {
    return this.fraction;
  }

  public void setFraction(BigDecimal fraction) {
    this.fraction = fraction;
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

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.fraction != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentAutoAllocateDefinitionApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentAutoAllocateDefinitionApiObject.class, reader);
  }

}
