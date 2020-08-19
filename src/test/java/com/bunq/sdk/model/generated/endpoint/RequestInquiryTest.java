package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.model.generated.object.Amount;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests:
 * RequestInquiry
 */
public class RequestInquiryTest extends BunqSdkTestBase {

    private static final String ACCEPTED_STATUS = "ACCEPTED";
    private static final String AMOUNT_EUR = "0.01";
    private static final String CURRENCY = "EUR";
    private static final String REQUEST_DESCRIPTION = "Java Test Payment";
    private static final int INDEX_FIRST = 0;

    private static String acceptRequest() {
        List<RequestResponse> responses = RequestResponse.list(secondMonetaryAccountBank.getId()).getValue();

        RequestResponse acceptRequest = RequestResponse.update(
                responses.get(INDEX_FIRST).getId(),
                secondMonetaryAccountBank.getId(),
                null,
                ACCEPTED_STATUS
        ).getValue();

        return acceptRequest.getStatus();
    }

    /**
     * Tests sending a request from monetary account 1 to monetary account 2 and accepting this
     * request
     */
    @Test
    public void createRequestInquiryTest() {
        RequestInquiry.create(
                new Amount(AMOUNT_EUR, CURRENCY),
                secondMonetaryAccountBank.getAlias().get(INDEX_FIRST),
                REQUEST_DESCRIPTION,
                false
        );

        assertEquals(ACCEPTED_STATUS, acceptRequest());
    }
}
