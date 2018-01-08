package com.bunq.sdk.json;

import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Custom (de)serialization of MonetaryAccountReference required to provide compatibility between
 * the two types used to refer to Monetary Accounts: Pointers in requests and Monetary Account
 * Labels in responses.
 */
public class MonetaryAccountReferenceTypeAdapter extends TypeAdapter<MonetaryAccountReference> {

  @Override
  public void write(JsonWriter out, MonetaryAccountReference value) throws IOException {
    if (value == null || value.isAllFieldNull()) {
      out.nullValue();
    } else if (value.getLabelMonetaryAccount() != null) {
      LabelMonetaryAccount labelMonetaryAccount = value.getLabelMonetaryAccount();

      BunqGsonBuilder.buildDefault().create().toJson(labelMonetaryAccount, LabelMonetaryAccount.class, out);
    } else {
      Pointer pointer = value.getPointer();

      BunqGsonBuilder.buildDefault().create().toJson(pointer, Pointer.class, out);
    }
  }

  @Override
  public MonetaryAccountReference read(JsonReader in) throws IOException {
    LabelMonetaryAccount labelMonetaryAccount =
        BunqGsonBuilder.buildDefault().create().getAdapter(LabelMonetaryAccount.class).read(in);

    return new MonetaryAccountReference(labelMonetaryAccount);
  }

}
