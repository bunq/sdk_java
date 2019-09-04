package com.bunq.sdk.model.core;

import com.bunq.sdk.model.generated.endpoint.OauthClient;
import com.bunq.sdk.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

public class OauthAuthorizationUri extends BunqModel {
    /**
     * The auth base uri
     */
    protected static final String AUTH_URI_BASE = "https://oauth.bunq.com/auth?";

    /**
     * Field constants
     */
    protected static final String FIELD_RESPONSE_TYPE = "response_type";
    protected static final String FIELD_REDIRECT_URI = "redirect_uri";
    protected static final String FIELD_STATE = "state";
    protected static final String FIELD_CLIENT_ID = "client_id";

    protected String authorizationUri;

    /**
     */
    protected OauthAuthorizationUri(String authorizationUri)
    {
        this.authorizationUri = authorizationUri;
    }

    /**
     */
    public String getAuthorizationUri()
    {
        return this.authorizationUri;
    }

    /**
     */
    public static OauthAuthorizationUri create(
            final OauthResponseType responseType,
            final String redirectUri,
            final OauthClient client
    ) {
        Map<String, String> allRequestParameter = new HashMap<String, String>()
        {
            {
                put(FIELD_REDIRECT_URI, redirectUri);
                put(FIELD_RESPONSE_TYPE, responseType.toString());
                put(FIELD_CLIENT_ID, client.getClientId());
            }
        };

        return new OauthAuthorizationUri(
                AUTH_URI_BASE + HttpUtil.createQueryString(allRequestParameter)
        );
    }

    /**
     */
    public static OauthAuthorizationUri create(
            OauthResponseType responseType,
            String redirectUri,
            OauthClient client,
            final String state
    ) {
        OauthAuthorizationUri baseUri = create(responseType, redirectUri, client);

        Map<String, String> allAdditionalParameter = new HashMap<String, String>()
        {
            {
                put(FIELD_STATE, state);
            }
        };

        return new OauthAuthorizationUri(
                baseUri.authorizationUri + HttpUtil.createQueryString(allAdditionalParameter)
        );
    }

    @Override
    public boolean isAllFieldNull() {
        if (authorizationUri != null) {
            return false;
        }

        return true;
    }
}
