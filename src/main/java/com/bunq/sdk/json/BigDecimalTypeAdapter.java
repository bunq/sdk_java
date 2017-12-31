package com.bunq.sdk.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Custom (de)serialization of BigDecimal for GSON, required because the API requires floats to be
 * represented as JSON strings.
 */
public class BigDecimalTypeAdapter extends TypeAdapter<BigDecimal> {

  private static final String FORMAT_DECIMAL = "0.0#";

  @Override
  public void write(JsonWriter output, BigDecimal value) throws IOException {
    DecimalFormat decimalFormat = new DecimalFormat(FORMAT_DECIMAL);

    if (value == null) {
      output.nullValue();
    } else {
      output.value(decimalFormat.format(value));
    }
  }

  @Override
  public BigDecimal read(JsonReader input) throws IOException {
    if (input.peek() == JsonToken.NUMBER) {
      return new BigDecimal(input.nextString());
    } else {
      input.nextNull();

      return null;
    }
  }

}
