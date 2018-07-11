package com.bunq.sdk.http;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BunqHeaderTest {
    @Test
    public void parse() {
        // parse works case-insensitive
        assertEquals(BunqHeader.CLIENT_RESPONSE_ID, BunqHeader.parse("X-Bunq-Client-Response-Id"));
        assertEquals(BunqHeader.CLIENT_RESPONSE_ID, BunqHeader.parse("x-bunq-client-response-id"));
    }

    @Test
    public void isBunq() {
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
        BunqHeader h = BunqHeader.CLIENT_RESPONSE_ID;

        assertEquals("test-id",
                h.getOrDefault(Collections.singletonMap("x-bunq-client-response-id", "test-id")));
        assertEquals("Could not determine response id.",
                h.getOrDefault(Collections.singletonMap("x-bunq-some-other-header", "test-id")));
        assertEquals("Could not determine response id.",
                h.getOrDefault(Collections.<String, String>emptyMap()));
    }

    @Test
    public void addToMap() {
        Map<String, String> headers = new HashMap<>();

        //sut
        BunqHeader.LANGUAGE.addTo(headers, null);
        BunqHeader.GEOLOCATION.addTo(headers, null);
        BunqHeader.USER_AGENT.addTo(headers, "test-agent");

        // verify
        assertEquals("en_US", headers.get("X-Bunq-Language"));
        assertEquals("0 0 0 0 000", headers.get("X-Bunq-Geolocation"));
        assertEquals("test-agent", headers.get("User-Agent"));
    }
}
