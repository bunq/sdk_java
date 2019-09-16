package com.bunq.sdk.json;

import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultInquiry;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.google.gson.*;

import java.lang.reflect.Type;

public class BunqMeTabResultInquiryDeserializer implements JsonDeserializer<BunqMeTabResultInquiry> {
    /**
     * Field constants.
     */
    private static final String FIELD_PAYMENT = "payment";

    /**
     * Object type constants.
     */
    private static final String OBJECT_TYPE_PAYMENT = "Payment";

    @Override
    public BunqMeTabResultInquiry deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        BunqMeTabResultInquiry tabResultInquiry = new Gson().fromJson(json, BunqMeTabResultInquiry.class);

        JsonObject jsonObject = (JsonObject) json;
        JsonObject paymentObject = jsonObject.getAsJsonObject(FIELD_PAYMENT);
        JsonObject wrappedPaymentObject = paymentObject.getAsJsonObject(OBJECT_TYPE_PAYMENT);

        Payment wrappedPayment = new Gson().fromJson(wrappedPaymentObject, Payment.class);
        tabResultInquiry.setPayment(wrappedPayment);

        return tabResultInquiry;
    }
}
