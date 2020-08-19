package com.bunq.sdk.http;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.endpoint.PaymentBatch;
import com.bunq.sdk.model.generated.object.Amount;
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
        List<Payment> allPayment = new ArrayList<>();

        for (int i = NUMBER_ZERO; i < missingPaymentCount; ++i) {
            allPayment.add(createPayment());
        }

        PaymentBatch.create(allPayment);
    }

    private static int GetPaymentsMissingCount() {
        return PAYMENT_REQUIRED_COUNT_MINIMUM - GetPaymentsRequired().size();
    }

    private static List<Payment> GetPaymentsRequired() {
        Pagination pagination = new Pagination();
        pagination.setCount(PAYMENT_REQUIRED_COUNT_MINIMUM);

        return ListPayments(pagination.getUrlParamsCountOnly()).getValue();
    }

    private static BunqResponse<List<Payment>> ListPayments(Map<String, String> urlParams) {
        return Payment.list(null, urlParams);
    }

    private static Payment createPayment() {
        return new Payment(
                new Amount(PAYMENT_AMOUNT_EUR, PAYMENT_CURRENCY),
                getPointerBravo(),
                PAYMENT_DESCRIPTION
        );
    }

    @Test
    public void apiScenarioPaymentListingWithPaginationTest() {
        EnsureEnoughPayments();
        ArrayList paymentsExpected = new ArrayList<>(GetPaymentsRequired());
        Pagination paginationCountOnly = new Pagination();
        paginationCountOnly.setCount(PAYMENT_LISTING_PAGE_SIZE);

        BunqResponse<List<Payment>> responseLatest = ListPayments(paginationCountOnly.getUrlParamsCountOnly());
        Pagination paginationLatest = responseLatest.getPagination();
        BunqResponse<List<Payment>> responsePrevious = ListPayments(paginationLatest.getUrlParamsPreviousPage());
        Pagination paginationPrevious = responsePrevious.getPagination();
        BunqResponse<List<Payment>> responsePreviousNext = ListPayments(paginationPrevious.getUrlParamsNextPage());

        ArrayList<Payment> allPaymentActual = new ArrayList<>();
        allPaymentActual.addAll(responsePreviousNext.getValue());
        allPaymentActual.addAll(responsePrevious.getValue());
        String allPaymentExpectedSerialized = gson.toJson(paymentsExpected);
        String allPaymentActualSerialized = gson.toJson(allPaymentActual);

        Assert.assertEquals(allPaymentExpectedSerialized, allPaymentActualSerialized);
    }
}
