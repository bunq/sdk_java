package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class TabTextWaitingScreen extends BunqModel {

  /**
   * Language of tab text
   */
  @Expose
  @SerializedName("language")
  private String language;

  /**
   * Tab text
   */
  @Expose
  @SerializedName("description")
  private String description;

  public TabTextWaitingScreen(String language, String description) {
    this.language = language;
    this.description = description;
  }

  /**
   * Language of tab text
   */
  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Tab text
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
