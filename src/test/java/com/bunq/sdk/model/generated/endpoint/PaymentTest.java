package com.bunq.sdk.model.generated.endpoint;


import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.Pagination;
import com.bunq.sdk.model.generated.object.AmountObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests:
 * Payment
 */
public class PaymentTest extends BunqSdkTestBase {

    /**
     * Payment field value constants.
     */
    private static final String AMOUNT_EUR = "0.01";
    private static final String PAYMENT_DESCRIPTION = "Java test Payment";
    private static final int PAGE_SIZE = 100;
    private static final int MAXIMUM_AMOUNT_OF_PAYMENT = 10;

    /**
     * Number constants.
     */
    private static final int INDEX_FIRST = 0;

    /**
     * String constants.
     */
    private static final String STRING_NULL = "null";

    /**
     * Tests making a payment to another sandbox user
     * This test has no assertion as of its testing to see if the code runs without errors
     */
    @Test
    public void makePaymentToOtherUser() {
        AmountObject amount = new AmountObject(AMOUNT_EUR, CURRENCY_EUR);
        requestSpendingMoneyIfNeeded();
        BunqResponse<Integer> response = PaymentApiObject.create(
                amount,
                secondMonetaryAccountBank.getAlias().get(INDEX_FIRST),
                PAYMENT_DESCRIPTION
        );

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getValue());
    }

    /**
     * Tests making a payment to another monetary account of the same user
     * This test has no assertion as of its testing to see if the code runs without errors
     */
    @Test
    public void makePaymentToOtherAccount() {
        AmountObject amount = new AmountObject(AMOUNT_EUR, CURRENCY_EUR);
        requestSpendingMoneyIfNeeded();
        BunqResponse<Integer> response = PaymentApiObject.create(amount, getPointerBravo(), PAYMENT_DESCRIPTION);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getValue());
    }

    @Test
    public void counterPartyAliasNotNullTest() {
        Pagination pagination = new Pagination();
        pagination.setCount(PAGE_SIZE);

        List<PaymentApiObject> allPayment = PaymentApiObject.list(
                null,
                pagination.getUrlParamsCountOnly()
        ).getValue();

        for (PaymentApiObject payment : allPayment) {
            Assert.assertNotNull(payment.getCounterpartyAlias());
            Assert.assertFalse(payment.getCounterpartyAlias().isAllFieldNull());
            Assert.assertNotEquals(STRING_NULL, payment.getCounterpartyAlias().toString());
        }
    }

    @Test
    public void paymentBatchTest() {
        BunqResponse<Integer> response = PaymentBatchApiObject.create(createPaymentForBatch());

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getValue());
    }

    private List<PaymentApiObject> createPaymentForBatch() {
        List<PaymentApiObject> allPayment = new ArrayList<>();

        while (allPayment.size() < MAXIMUM_AMOUNT_OF_PAYMENT) {
            allPayment.add(new PaymentApiObject(new AmountObject(AMOUNT_EUR, CURRENCY_EUR), getPointerBravo(), PAYMENT_DESCRIPTION));
        }

        return allPayment;
    }
}
