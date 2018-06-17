package com.bunq.sdk.http;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class BunqHeaderTest {
    @Test
    public void parse() {
        // parse works case-insensitive
        assertEquals(BunqHeader.clientResponseId,BunqHeader.parse("X-Bunq-Client-Response-Id").get());
        assertEquals(BunqHeader.clientResponseId,BunqHeader.parse("x-bunq-client-response-id").get());
    }

    @Test
    public void isBunq() {
        List<BunqHeader> nonBunqHeaders = Arrays.asList(BunqHeader.cacheControl,BunqHeader.contentType,BunqHeader.userAgent);

        assertEquals(nonBunqHeaders, Stream.of(BunqHeader.values()).filter(h->!h.isBunq()).collect(Collectors.toList()));
    }

    @Test
    public void getOrDefault() {
        BunqHeader h = BunqHeader.clientResponseId;

        assertEquals("test-id",h.getOrDefault(Collections.singletonMap("x-bunq-client-response-id","test-id")));
        assertEquals("Could not determine response id.",h.getOrDefault(Collections.singletonMap("x-bunq-some-other-header","test-id")));
        assertEquals("Could not determine response id.",h.getOrDefault(Collections.emptyMap()));
    }

    @Test
    public void addToMap() {
        Map<String,String> headers = new HashMap<>();

        //sut
        BunqHeader.language.addTo(headers,null);
        BunqHeader.geolocation.addTo(headers,null);
        BunqHeader.userAgent.addTo(headers,"test-agent");

        // verify
        assertEquals("en_US",headers.get("X-Bunq-Language"));
        assertEquals("0 0 0 0 000",headers.get("X-Bunq-Geolocation"));
        assertEquals("test-agent",headers.get("User-Agent"));
    }
}