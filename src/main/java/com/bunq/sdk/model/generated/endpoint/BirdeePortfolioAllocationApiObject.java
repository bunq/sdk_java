package com.bunq.sdk.model.generated.endpoint;

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

/**
 * Endpoint for viewing the allocations of the model portfolios Birdee offers.
 */
public class BirdeePortfolioAllocationApiObject extends BunqModel {

  /**
   * Currency of the instrument.
   */
  @Expose
  @SerializedName("instrument_currency")
  private String instrumentCurrency;

  /**
   * Asset Class of the instrument.
   */
  @Expose
  @SerializedName("instrument_asset_class")
  private String instrumentAssetClass;

  /**
   * Name of the asset class.
   */
  @Expose
  @SerializedName("instrument_asset_class_name")
  private String instrumentAssetClassName;

  /**
   * ISIN code of the instrument.
   */
  @Expose
  @SerializedName("instrument_isin")
  private String instrumentIsin;

  /**
   * Name of the instrument.
   */
  @Expose
  @SerializedName("instrument_name")
  private String instrumentName;

  /**
   * Name of the geographical region covered by the instrument
   */
  @Expose
  @SerializedName("instrument_region_name")
  private String instrumentRegionName;

  /**
   * Key Information Document of the instrument.
   */
  @Expose
  @SerializedName("instrument_key_information_document_uri")
  private String instrumentKeyInformationDocumentUri;

  /**
   * Weight of the financial instrument in the model portfolio.
   */
  @Expose
  @SerializedName("weight")
  private String weight;

  /**
   * Quantity of the financial instrument in the portfolio.
   */
  @Expose
  @SerializedName("quantity")
  private String quantity;

  /**
   * Unit price of the financial instrument.
   */
  @Expose
  @SerializedName("price")
  private String price;

  /**
   * Monetary amount of the financial instrument in the portfolio.
   */
  @Expose
  @SerializedName("amount")
  private String amount;

  /**
   * Currency of the instrument.
   */
  public String getInstrumentCurrency() {
    return this.instrumentCurrency;
  }

  public void setInstrumentCurrency(String instrumentCurrency) {
    this.instrumentCurrency = instrumentCurrency;
  }

  /**
   * Asset Class of the instrument.
   */
  public String getInstrumentAssetClass() {
    return this.instrumentAssetClass;
  }

  public void setInstrumentAssetClass(String instrumentAssetClass) {
    this.instrumentAssetClass = instrumentAssetClass;
  }

  /**
   * Name of the asset class.
   */
  public String getInstrumentAssetClassName() {
    return this.instrumentAssetClassName;
  }

  public void setInstrumentAssetClassName(String instrumentAssetClassName) {
    this.instrumentAssetClassName = instrumentAssetClassName;
  }

  /**
   * ISIN code of the instrument.
   */
  public String getInstrumentIsin() {
    return this.instrumentIsin;
  }

  public void setInstrumentIsin(String instrumentIsin) {
    this.instrumentIsin = instrumentIsin;
  }

  /**
   * Name of the instrument.
   */
  public String getInstrumentName() {
    return this.instrumentName;
  }

  public void setInstrumentName(String instrumentName) {
    this.instrumentName = instrumentName;
  }

  /**
   * Name of the geographical region covered by the instrument
   */
  public String getInstrumentRegionName() {
    return this.instrumentRegionName;
  }

  public void setInstrumentRegionName(String instrumentRegionName) {
    this.instrumentRegionName = instrumentRegionName;
  }

  /**
   * Key Information Document of the instrument.
   */
  public String getInstrumentKeyInformationDocumentUri() {
    return this.instrumentKeyInformationDocumentUri;
  }

  public void setInstrumentKeyInformationDocumentUri(String instrumentKeyInformationDocumentUri) {
    this.instrumentKeyInformationDocumentUri = instrumentKeyInformationDocumentUri;
  }

  /**
   * Weight of the financial instrument in the model portfolio.
   */
  public String getWeight() {
    return this.weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  /**
   * Quantity of the financial instrument in the portfolio.
   */
  public String getQuantity() {
    return this.quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  /**
   * Unit price of the financial instrument.
   */
  public String getPrice() {
    return this.price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Monetary amount of the financial instrument in the portfolio.
   */
  public String getAmount() {
    return this.amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.instrumentCurrency != null) {
      return false;
    }

    if (this.instrumentAssetClass != null) {
      return false;
    }

    if (this.instrumentAssetClassName != null) {
      return false;
    }

    if (this.instrumentIsin != null) {
      return false;
    }

    if (this.instrumentName != null) {
      return false;
    }

    if (this.instrumentRegionName != null) {
      return false;
    }

    if (this.instrumentKeyInformationDocumentUri != null) {
      return false;
    }

    if (this.weight != null) {
      return false;
    }

    if (this.quantity != null) {
      return false;
    }

    if (this.price != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BirdeePortfolioAllocationApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BirdeePortfolioAllocationApiObject.class, reader);
  }

}
