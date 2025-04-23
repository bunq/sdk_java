package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.generated.endpoint.OauthClientApiObject;
import com.bunq.sdk.util.HttpUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OauthAuthorizationUri extends BunqModel {
    /**
     * URI map.
     */
    protected static final Map<ApiEnvironmentType, String> AUTH_URI_ENVIRONMENT_MAP = new HashMap<ApiEnvironmentType, String>() {
        {
            put(ApiEnvironmentType.SANDBOX, AUTH_URI_FORMAT_SANDBOX);
            put(ApiEnvironmentType.PRODUCTION, AUTH_URI_FORMAT_PRODUCTION);
        }
    };

    /**
     * Auth constants.
     */
    protected static final String AUTH_URI_FORMAT_SANDBOX = "https://oauth.sandbox.bunq.com/auth?%s";
    protected static final String AUTH_URI_FORMAT_PRODUCTION = "https://oauth.bunq.com/auth?%s";

    /**
     * Field constants
     */
    protected static final String FIELD_RESPONSE_TYPE = "response_type";
    protected static final String FIELD_REDIRECT_URI = "redirect_uri";
    protected static final String FIELD_STATE = "state";
    protected static final String FIELD_CLIENT_ID = "client_id";

    /**
     * Error constants.
     */
    protected static final String ERROR_ENVIRONMENT_TYPE_NOT_SUPPORTED = "You are trying to use an unsupported environment type.";

    /**
     * Private variables.
     */
    private final String authorizationUri;

    /**
     *
     */
    protected OauthAuthorizationUri(String authorizationUri) {
        this.authorizationUri = authorizationUri;
    }

    /**
     *
     */
    public String getAuthorizationUri() {
        return this.authorizationUri;
    }

    /**
     *
     */
    public static OauthAuthorizationUri create(
            final OauthResponseType responseType,
            final String redirectUri,
            final OauthClientApiObject client
    ) {
        Map<String, String> allRequestParameter = new LinkedHashMap<String, String>();
        allRequestParameter.put(FIELD_REDIRECT_URI, redirectUri);
        allRequestParameter.put(FIELD_RESPONSE_TYPE, responseType.toString());

        if (client.getClientId() != null) {
            allRequestParameter.put(FIELD_CLIENT_ID, client.getClientId());
        }

        return new OauthAuthorizationUri(
                String.format(determineAuthUriFormat(), HttpUtil.createQueryString(allRequestParameter))
        );
    }

    /**
     *
     */
    public static OauthAuthorizationUri create(
            OauthResponseType responseType,
            String redirectUri,
            OauthClientApiObject client,
            final String state
    ) {
        OauthAuthorizationUri baseUri = create(responseType, redirectUri, client);

        Map<String, String> allAdditionalParameter = new HashMap<String, String>() {
            {
                put(FIELD_STATE, state);
            }
        };

        return new OauthAuthorizationUri(
                baseUri.authorizationUri + HttpUtil.getQueryDelimiter() + HttpUtil.createQueryString(allAdditionalParameter)
        );
    }

    @Override
    public boolean isAllFieldNull() {
        return authorizationUri == null;
    }

    /**
     *
     */
    private static String determineAuthUriFormat() {
        ApiEnvironmentType environmentType = BunqContext.getApiContext().getEnvironmentType();

        if (AUTH_URI_ENVIRONMENT_MAP.containsKey(environmentType)) {
            return AUTH_URI_ENVIRONMENT_MAP.get(environmentType);
        }

        throw new BunqException(ERROR_ENVIRONMENT_TYPE_NOT_SUPPORTED);
    }
}
