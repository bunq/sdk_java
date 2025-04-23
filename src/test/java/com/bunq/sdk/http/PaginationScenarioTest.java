package com.bunq.sdk.http;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.model.generated.endpoint.PaymentApiObject;
import com.bunq.sdk.model.generated.endpoint.PaymentBatchApiObject;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Tests:
 * Pagination
 */
public class PaginationScenarioTest extends BunqSdkTestBase {

    /**
     * Constants for scenario testing.
     */
    private final static int PAYMENT_LISTING_PAGE_SIZE = 2;
    private final static int PAYMENT_REQUIRED_COUNT_MINIMUM = PAYMENT_LISTING_PAGE_SIZE * 2;
    private final static int NUMBER_ZERO = 0;

    /**
     * Constants for payment creation.
     */
    private final static String PAYMENT_AMOUNT_EUR = "0.01";
    private final static String PAYMENT_CURRENCY = "EUR";
    private final static String PAYMENT_DESCRIPTION = "Java test Payment";

    /**
     * Gson builder for serialization.
     */
    private static final Gson gson = BunqGsonBuilder.buildDefault().create();

    private static void EnsureEnoughPayments() {
        int missingPaymentCount = GetPaymentsMissingCount();
        List<PaymentApiObject> allPayment = new ArrayList<>();

        for (int i = NUMBER_ZERO; i < missingPaymentCount; ++i) {
            allPayment.add(createPayment());
        }

        PaymentBatchApiObject.create(allPayment);
    }

    private static int GetPaymentsMissingCount() {
        return PAYMENT_REQUIRED_COUNT_MINIMUM - GetPaymentsRequired().size();
    }

    private static List<PaymentApiObject> GetPaymentsRequired() {
        Pagination pagination = new Pagination();
        pagination.setCount(PAYMENT_REQUIRED_COUNT_MINIMUM);

        return ListPayments(pagination.getUrlParamsCountOnly()).getValue();
    }

    private static BunqResponse<List<PaymentApiObject>> ListPayments(Map<String, String> urlParams) {
        return PaymentApiObject.list(null, urlParams);
    }

    private static PaymentApiObject createPayment() {
        return new PaymentApiObject(
                new AmountObject(PAYMENT_AMOUNT_EUR, PAYMENT_CURRENCY),
                getPointerBravo(),
                PAYMENT_DESCRIPTION
        );
    }
}
