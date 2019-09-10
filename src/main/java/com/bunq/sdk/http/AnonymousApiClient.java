package com.bunq.sdk.http;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.UncaughtExceptionError;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnonymousApiClient extends ApiClient {
    /**
     * Private variables.
     */
    private OkHttpClient httpClient;

    /**
     * @param apiContext API context to make the calls in.
     */
    public AnonymousApiClient(ApiContext apiContext) {
        super(apiContext);
        this.httpClient = new OkHttpClient();
    }

    /**
     * Execute a POST request.
     *
     * @return The raw response of the POST request.
     */
    public BunqResponseRaw post(
            String uri,
            byte[] requestBodyBytes,
            Map<String, String> customHeaders
    ) {
        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        BunqRequestBody bunqRequestBody = BunqRequestBody.create(
                ContentType.JSON.getMediaType(),
                requestBodyBytes
        );

        if (customHeaders.containsKey(BunqHeader.CONTENT_TYPE.getHeaderName())) {
            bunqRequestBody = BunqRequestBody.create(
                    MediaType.parse(customHeaders.get(BunqHeader.CONTENT_TYPE.getHeaderName())),
                    requestBodyBytes
            );
        }

        try {
            BunqRequestBuilder requestBuilder = new BunqRequestBuilder()
                    .url(uri)
                    .post(bunqRequestBody);
            Response response = httpClient.newCall(requestBuilder.build()).execute();

            return new BunqResponseRaw(response.body().bytes(), getHeadersMap(response));
        } catch (IOException exception) {
            throw new UncaughtExceptionError(exception);
        }
    }

}
