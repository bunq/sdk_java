package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.model.generated.object.AmountObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Tests:
 * RequestInquiry
 */
public class RequestInquiryTest extends BunqSdkTestBase {

    private static final String ACCEPTED_STATUS = "ACCEPTED";
    private static final String PENDING_STATUS = "PENDING";
    private static final String AMOUNT_EUR = "0.01";
    private static final String CURRENCY = "EUR";
    private static final String FIELD_STATUS = "status";
    private static final String REQUEST_DESCRIPTION = "Java Test Payment";
    private static final int INDEX_FIRST = 0;

    /**
     * Tests sending a request from monetary account 1 to monetary account 2 and accepting this
     * request
     */
    @Test
    public void createRequestInquiryTest() {
        BunqResponse<Integer> request = RequestInquiryApiObject.create(
                new AmountObject(AMOUNT_EUR, CURRENCY),
                BunqContext.getUserContext().getPrimaryMonetaryAccountBank().getAlias().get(INDEX_FIRST),
                REQUEST_DESCRIPTION,
                false,
                secondMonetaryAccountBank.getId()
        );
        System.out.println("Request ID : " + request.getValue());

        assertEquals(ACCEPTED_STATUS, acceptRequest());
    }

    private static String acceptRequest() {
        Map<String, String> allParameter = new HashMap<>();
        allParameter.put(FIELD_STATUS, PENDING_STATUS);
        List<RequestResponseApiObject> responses = RequestResponseApiObject.list(BunqContext.getUserContext().getPrimaryMonetaryAccountBank().getId(), allParameter).getValue();

        RequestResponseApiObject acceptRequest = RequestResponseApiObject.update(
                responses.get(INDEX_FIRST).getId(),
                BunqContext.getUserContext().getPrimaryMonetaryAccountBank().getId(),
                null,
                ACCEPTED_STATUS
        ).getValue();

        return acceptRequest.getStatus();
    }
}
