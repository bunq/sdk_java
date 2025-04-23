package com.bunq.sdk.model.core;

import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.PointerObject;

/**
 * Adapter required to provide compatibility between the two types used to refer to Monetary
 * Accounts: Pointers in requests and Monetary Account Labels in responses.
 */
public class MonetaryAccountReference extends BunqModel {

    private PointerObject pointer;
    private LabelMonetaryAccountObject labelMonetaryAccount;

    public MonetaryAccountReference(PointerObject pointer) {
        this.pointer = pointer;
    }

    public MonetaryAccountReference(LabelMonetaryAccountObject labelMonetaryAccount) {
        this.labelMonetaryAccount = labelMonetaryAccount;
    }

    public PointerObject getPointer() {
        return pointer;
    }

    public LabelMonetaryAccountObject getLabelMonetaryAccount() {
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
