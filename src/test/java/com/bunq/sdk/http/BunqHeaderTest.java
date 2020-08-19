package com.bunq.sdk.http;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BunqHeaderTest {

    /**
     * Expected error messages constants.
     */
    private static final String ERROR_STRING_COULD_NOT_DETERMINE_RESPONSE_ID =
            "Could not determine response id.";

    /**
     * Header name constants.
     */
    private static final String HEADER_X_BUNQ_CLIENT_RESPONSE_ID = "X-Bunq-Client-Response-Id";
    private static final String HEADER_LOWER_X_BUNQ_CLIENT_RESPONSE_ID = "x-bunq-client-response-id";
    private static final String HEADER_X_BUNQ_SOME_OTHER_HEADER = "x-bunq-some-other-header";

    /**
     * Header value constants.
     */
    private static final String HEADER_VALUE_USER_AGENT = "test-agent";
    private static final String HEADER_VALUE_LANGUAGE = "en_US";
    private static final String HEADER_VALUE_GEOLOCATION = "0 0 0 0 000";
    private static final String RESPONSE_ID = "test-id";

    @Test
    public void testParseHeaderCaseInsensitive() {
        assertEquals(
                BunqHeader.CLIENT_RESPONSE_ID,
                BunqHeader.parseHeaderOrNull(HEADER_X_BUNQ_CLIENT_RESPONSE_ID)
        );
        assertEquals(
                BunqHeader.CLIENT_RESPONSE_ID,
                BunqHeader.parseHeaderOrNull(HEADER_LOWER_X_BUNQ_CLIENT_RESPONSE_ID)
        );
    }

    @Test
    public void testIsBunq() {
        assertFalse(BunqHeader.CACHE_CONTROL.isBunq());
        assertFalse(BunqHeader.CONTENT_TYPE.isBunq());
        assertFalse(BunqHeader.USER_AGENT.isBunq());

        assertTrue(BunqHeader.ATTACHMENT_DESCRIPTION.isBunq());
        assertTrue(BunqHeader.CLIENT_AUTHENTICATION.isBunq());
        assertTrue(BunqHeader.CLIENT_ENCRYPTION_HMAC.isBunq());
        assertTrue(BunqHeader.CLIENT_ENCRYPTION_IV.isBunq());
        assertTrue(BunqHeader.CLIENT_ENCRYPTION_IV.isBunq());
        assertTrue(BunqHeader.CLIENT_ENCRYPTION_KEY.isBunq());
        assertTrue(BunqHeader.CLIENT_REQUEST_ID.isBunq());
        assertTrue(BunqHeader.CLIENT_SIGNATURE.isBunq());
        assertTrue(BunqHeader.CLIENT_RESPONSE_ID.isBunq());
        assertTrue(BunqHeader.GEOLOCATION.isBunq());
        assertTrue(BunqHeader.REGION.isBunq());
        assertTrue(BunqHeader.SERVER_SIGNATURE.isBunq());
        assertTrue(BunqHeader.CLIENT_ENCRYPTION_KEY.isBunq());
        assertTrue(BunqHeader.CLIENT_REQUEST_ID.isBunq());
    }

    @Test
    public void getOrDefault() {
        BunqHeader header = BunqHeader.CLIENT_RESPONSE_ID;

        assertEquals(
                RESPONSE_ID,
                header.getHeaderValueOrDefault(
                        Collections.singletonMap(HEADER_LOWER_X_BUNQ_CLIENT_RESPONSE_ID, RESPONSE_ID)
                )
        );
        assertEquals(
                ERROR_STRING_COULD_NOT_DETERMINE_RESPONSE_ID,
                header.getHeaderValueOrDefault(
                        Collections.singletonMap(HEADER_X_BUNQ_SOME_OTHER_HEADER, RESPONSE_ID)
                )
        );
        assertEquals(
                ERROR_STRING_COULD_NOT_DETERMINE_RESPONSE_ID,
                header.getHeaderValueOrDefault(Collections.<String, String>emptyMap())
        );
    }

    @Test
    public void addToMap() {
        Map<String, String> headers = new HashMap<>();

        BunqHeader.LANGUAGE.addTo(headers, null);
        BunqHeader.GEOLOCATION.addTo(headers, null);
        BunqHeader.USER_AGENT.addTo(headers, HEADER_VALUE_USER_AGENT);

        assertEquals(HEADER_VALUE_LANGUAGE, headers.get(BunqHeader.LANGUAGE.getHeaderName()));
        assertEquals(HEADER_VALUE_GEOLOCATION, headers.get(BunqHeader.GEOLOCATION.getHeaderName()));
        assertEquals(HEADER_VALUE_USER_AGENT, headers.get(BunqHeader.USER_AGENT.getHeaderName()));
    }
}
