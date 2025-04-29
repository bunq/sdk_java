package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.PaymentServiceProviderCredentialApiObject;
import com.bunq.sdk.model.generated.endpoint.UserCredentialPasswordIpApiObject;

import java.util.HashMap;
import java.util.Map;

public class PaymentServiceProviderCredentialInternal extends PaymentServiceProviderCredentialApiObject {
    /**
     * Object types.
     */
    protected static final String OBJECT_TYPE_GET = "CredentialPasswordIp";

    /**
     * Field constants.
     */
    protected static final String FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE = "client_payment_service_provider_certificate";
    protected static final String FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE_CHAIN = "client_payment_service_provider_certificate_chain";
    protected static final String FIELD_CLIENT_PUBLIC_KEY_SIGNATURE = "client_public_key_signature";

    /**
     * Create PSD2 Service Provider credential.
     */
    public static BunqResponse<UserCredentialPasswordIpApiObject> createWithApiContext(
            String clientPaymentServiceProviderCertificate,
            String clientPaymentServiceProviderCertificateChain,
            String clientPublicKeySignature,
            ApiContext apiContext
    ) {
        return createWithApiContext(clientPaymentServiceProviderCertificate, clientPaymentServiceProviderCertificateChain, clientPublicKeySignature, apiContext, new HashMap<String, String>());
    }

    /**
     * Create PSD2 Service Provider credential.
     */
    public static BunqResponse<UserCredentialPasswordIpApiObject> createWithApiContext(
            String clientPaymentServiceProviderCertificate,
            String clientPaymentServiceProviderCertificateChain,
            String clientPublicKeySignature,
            ApiContext apiContext,
            Map<String, String> allCustomHeader
    ) {
        HashMap<String, Object> requestBody = new HashMap<>();
        requestBody.put(FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE, clientPaymentServiceProviderCertificate);
        requestBody.put(FIELD_CLIENT_PAYMENT_SERVICE_PROVIDER_CERTIFICATE_CHAIN, clientPaymentServiceProviderCertificateChain);
        requestBody.put(FIELD_CLIENT_PUBLIC_KEY_SIGNATURE, clientPublicKeySignature);

        ApiClient apiClient = new ApiClient(apiContext);
        BunqResponseRaw responseRaw = apiClient.post(
                ENDPOINT_URL_CREATE,
                determineAllRequestByte(requestBody),
                allCustomHeader
        );

        return fromJson(UserCredentialPasswordIpApiObject.class, responseRaw, OBJECT_TYPE_GET);
    }
}
