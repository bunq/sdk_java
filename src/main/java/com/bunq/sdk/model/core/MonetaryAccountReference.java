package com.bunq.sdk.model.core;

import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.Pointer;

/**
 * Adapter required to provide compatibility between the two types used to refer to Monetary
 * Accounts: Pointers in requests and Monetary Account Labels in responses.
 */
public class MonetaryAccountReference extends BunqModel {

  private Pointer pointer;
  private LabelMonetaryAccount labelMonetaryAccount;

  public MonetaryAccountReference(Pointer pointer) {
    this.pointer = pointer;
  }

  public MonetaryAccountReference(LabelMonetaryAccount labelMonetaryAccount) {
    this.labelMonetaryAccount = labelMonetaryAccount;
  }

  public Pointer getPointer() {
    return pointer;
  }

  public LabelMonetaryAccount getLabelMonetaryAccount() {
    return labelMonetaryAccount;
  }

  @Override
  public boolean isAllFieldNull() {
    if (this.pointer == null) {
      return false;
    }

    if (this.labelMonetaryAccount == null) {
      return false;
    }

    return true;
  }
}
