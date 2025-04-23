package com.bunq.sdk.json;

import com.bunq.sdk.model.generated.endpoint.BunqMeTabResultInquiryApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentApiObject;
import com.google.gson.*;

import java.lang.reflect.Type;

public class BunqMeTabResultInquiryDeserializer implements JsonDeserializer<BunqMeTabResultInquiryApiObject> {
    /**
     * Field constants.
     */
    private static final String FIELD_PAYMENT = "payment";

    /**
     * Object type constants.
     */
    private static final String OBJECT_TYPE_PAYMENT = "Payment";

    @Override
    public BunqMeTabResultInquiryApiObject deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        BunqMeTabResultInquiryApiObject tabResultInquiry = new Gson().fromJson(json, BunqMeTabResultInquiryApiObject.class);

        JsonObject jsonObject = (JsonObject) json;
        JsonObject paymentObject = jsonObject.getAsJsonObject(FIELD_PAYMENT);
        JsonObject wrappedPaymentObject = paymentObject.getAsJsonObject(OBJECT_TYPE_PAYMENT);

        PaymentApiObject wrappedPayment = new Gson().fromJson(wrappedPaymentObject, PaymentApiObject.class);
        tabResultInquiry.setPayment(wrappedPayment);

        return tabResultInquiry;
    }
}
