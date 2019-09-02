package com.bunq.sdk.model.core;

import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.http.AnonymousApiClient;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.OauthClient;
import com.bunq.sdk.util.HttpUtil;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class OauthAccessToken extends BunqModel {
    /**
     * Field constants.
     */
    protected static final String FIELD_GRANT_TYPE = "grant_type";
    protected static final String FIELD_CODE = "code";
    protected static final String FIELD_REDIRECT_URI = "redirect_uri";
    protected static final String FIELD_CLIENT_ID = "client_id";
    protected static final String FIELD_CLIENT_SECRET = "client_secret";

    /**
     * Token constants.
     */
    protected static final String TOKEN_URI_BASE = "https://oauth.api.bunq.com/v1/token?";

    @Expose(serialize = false)
    @SerializedName("access_token")
    protected String token;

    @Expose(serialize = false)
    @SerializedName("token_type")
    protected String type;

    @Expose(serialize = false)
    @SerializedName("state")
    protected String state;

    /**
     * OauthAccessToken constructor.
     */
    protected OauthAccessToken(String token, String type, String state) {
        this(token, type);
        this.state = state;
    }

    /**
     */
    protected OauthAccessToken(String token, String type) {
        this.token = token;
        this.type = type;
    }

    /**
     */
    public String getToken()
    {
        return this.token;
    }

    /**
     */
    public static OauthAccessToken create(
        String grantType,
        String authCode,
        String redirectUri,
        OauthClient client
    ) {
        ApiClient apiClient = new AnonymousApiClient(BunqContext.getApiContext());
        BunqResponseRaw responseRaw = apiClient.post(
                createTokenUri(grantType, authCode, redirectUri, client),
                new byte[0],
                new HashMap<String, String>()
        );

        return fromJson(OauthAccessToken.class, responseRaw).getValue();
    }

    /**
     */
    protected static String createTokenUri(
        final String grantType,
        final String authCode,
        final String redirectUri,
        final OauthClient client
    ) {
        Map<String, String> allTokenParameter = new HashMap<String, String>() {
            {
                put(FIELD_GRANT_TYPE, grantType);
                put(FIELD_CODE, authCode);
                put(FIELD_REDIRECT_URI, redirectUri);
                put(FIELD_CLIENT_ID, client.getClientId());
                put(FIELD_CLIENT_SECRET, client.getSecret());
            }
        };

        return TOKEN_URI_BASE + HttpUtil.createQueryString(allTokenParameter);
    }

    @Override
    public boolean isAllFieldNull() {

        if (token != null) {
            return false;
        } else if (type != null) {
            return false;
        } else if (state != null) {
            return false;
        }

        return true;
    }

    protected static <T> BunqResponse<T> fromJson(Class<T> classOfObject, BunqResponseRaw responseRaw) {
        JsonObject responseItemObject = deserializeResponseObject(responseRaw);
        T responseValue = gson.fromJson(responseItemObject, classOfObject);

        return new BunqResponse<>(responseValue, responseRaw.getHeaders());
    }
}
