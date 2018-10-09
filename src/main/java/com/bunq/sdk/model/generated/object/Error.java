package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class Error extends BunqModel {

  /**
   * The error description (in English).
   */
  @Expose
  @SerializedName("error_description")
  private String errorDescription;

  /**
   * The error description (in the user language).
   */
  @Expose
  @SerializedName("error_description_translated")
  private String errorDescriptionTranslated;

  /**
   * The error description (in English).
   */
  public String getErrorDescription() {
    return this.errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  /**
   * The error description (in the user language).
   */
  public String getErrorDescriptionTranslated() {
    return this.errorDescriptionTranslated;
  }

  public void setErrorDescriptionTranslated(String errorDescriptionTranslated) {
    this.errorDescriptionTranslated = errorDescriptionTranslated;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.errorDescription != null) {
      return false;
    }

    if (this.errorDescriptionTranslated != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Error fromJsonReader(JsonReader reader) {
    return fromJsonReader(Error.class, reader);
  }

}
