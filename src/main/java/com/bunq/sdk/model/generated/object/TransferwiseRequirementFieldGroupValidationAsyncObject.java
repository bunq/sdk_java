package com.bunq.sdk.model.generated.object;

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
 */
public class TransferwiseRequirementFieldGroupValidationAsyncObject extends BunqModel {

  /**
   * The url to be used to validate user input.
   */
  @Expose
  @SerializedName("url")
  private String url;

  /**
   * The parameters to send when validating user input.
   */
  @Expose
  @SerializedName("params")
  private TransferwiseRequirementFieldGroupValidationAsyncParamsObject params;

  /**
   * The url to be used to validate user input.
   */
  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The parameters to send when validating user input.
   */
  public TransferwiseRequirementFieldGroupValidationAsyncParamsObject getParams() {
    return this.params;
  }

  public void setParams(TransferwiseRequirementFieldGroupValidationAsyncParamsObject params) {
    this.params = params;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.url != null) {
      return false;
    }

    if (this.params != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseRequirementFieldGroupValidationAsyncObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseRequirementFieldGroupValidationAsyncObject.class, reader);
  }

}
