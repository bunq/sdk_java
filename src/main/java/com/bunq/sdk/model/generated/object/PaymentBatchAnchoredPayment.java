package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 *
 */
public class PaymentBatchAnchoredPayment extends BunqModel {

    /**
     *
     */
    @Expose
    @SerializedName("Payment")
    private List<Payment> payment;

    /**
     *
     */
    public static PaymentBatchAnchoredPayment fromJsonReader(JsonReader reader) {
        return fromJsonReader(PaymentBatchAnchoredPayment.class, reader);
    }

    /**
     *
     */
    public List<Payment> getPayment() {
        return this.payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.payment != null) {
            return false;
        }

        return true;
    }

}
