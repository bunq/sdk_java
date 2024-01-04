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
public class RegistryEntryReference extends BunqModel {

  /**
   * The object type that will be linked to the RegistryEntry.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The ID of the object that will be used for the RegistryEntry.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  public RegistryEntryReference() {
  this(null, null);
  }

  public RegistryEntryReference(String type) {
  this(type, null);
  }

  public RegistryEntryReference(String type, Integer id) {
    this.typeFieldForRequest = type;
    this.idFieldForRequest = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static RegistryEntryReference fromJsonReader(JsonReader reader) {
    return fromJsonReader(RegistryEntryReference.class, reader);
  }

}
