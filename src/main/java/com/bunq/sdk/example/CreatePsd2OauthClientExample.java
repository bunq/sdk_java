package com.bunq.sdk.example;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.OauthAccessToken;
import com.bunq.sdk.model.core.OauthAuthorizationUri;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccount;
import com.bunq.sdk.model.generated.endpoint.OauthCallbackUrl;
import com.bunq.sdk.model.generated.endpoint.OauthClient;
import com.bunq.sdk.model.generated.object.Certificate;
import com.bunq.sdk.security.SecurityUtils;
import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class CreatePsd2OauthClientExample {

    protected static final String FILE_PSD2_CERTIFICATE = "data/certificate.cert";
    protected static final String FILE_PSD2_CERTIFICATE_CHAIN = "data/chain.cert";
    protected static final String FILE_PSD2_PRIVATE_KEY = "data/private.pem";
    protected static final String FILE_PSD2_CONFIGURATION = "data/psd2.conf";
    protected static final String FILE_OAUTH_CONFIGURATION = "data/oauth.conf";

    protected static final ApiEnvironmentType API_ENVIRONMENT_TYPE = ApiEnvironmentType.LOCAL;

    protected static final String API_DEVICE_DESCRIPTION = "##### YOUR DEVICE DESCRIPTION #####";
    protected static final String API_REDIRECT_URI = "https://localhost/oauth/redirect";

    public static void main(String[] args) {

        try {

            ApiContext apiContext;

            try {
                apiContext = ApiContext.restore(FILE_PSD2_CONFIGURATION);
            } catch (BunqException exception) {
                apiContext = ApiContext.createForPsd2(
                        API_ENVIRONMENT_TYPE,
                        SecurityUtils.getCertificateFromFile(FILE_PSD2_CERTIFICATE),
                        getPrivateKeyFromFile(),
                        new Certificate[]{
                                SecurityUtils.getCertificateFromFile(FILE_PSD2_CERTIFICATE_CHAIN)
                        },
                        API_DEVICE_DESCRIPTION,
                        new ArrayList<String>()
                );
            }

            BunqContext.loadApiContext(apiContext);

            // Create oauth client
            Integer oauthClientId = OauthClient.create().getValue();

            // Create callback url
            OauthCallbackUrl.create(oauthClientId, API_REDIRECT_URI);
            OauthClient oauthClient = OauthClient.get(oauthClientId).getValue();

            // Create the authorization url
            OauthAuthorizationUri authorizationUri = OauthAuthorizationUri.create(
                    "code",
                    API_REDIRECT_URI,
                    oauthClient
            );

            System.out.println("Redirect your user to " + authorizationUri.getAuthorizationUri() + " to obtain an Authorization code.");
            System.out.println("Wait for the user to be redirected, copy the code from the URL, paste it here and press enter.");

            System.out.println("Token: ");

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String token = inputReader.readLine();

            // Get the token
            OauthAccessToken accessToken = OauthAccessToken.create(
                    "authorization_code",
                    token,
                    API_REDIRECT_URI,
                    oauthClient
            );

            // Setup the new context
            apiContext = ApiContext.create(
                    ApiEnvironmentType.LOCAL,
                    accessToken.getToken(),
                    API_DEVICE_DESCRIPTION
            );
            BunqContext.loadApiContext(apiContext);

            // You can now perform actions for the authenticated user. For example list his/her monitary accounts.
            List<MonetaryAccount> allMonetaryAccount = MonetaryAccount.list().getValue();
            for (MonetaryAccount monetaryAccount : allMonetaryAccount)
            {
                System.out.println(
                        String.format("Account found with balance of %s %s.", monetaryAccount.getMonetaryAccountBank().getBalance().getValue(), monetaryAccount.getMonetaryAccountBank().getBalance().getCurrency())
                );
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    private static PrivateKey getPrivateKeyFromFile() throws IOException
    {
        String privateKeyString = FileUtils.readFileToString(new File(FILE_PSD2_PRIVATE_KEY));
        return SecurityUtils.createPrivateKeyFromFormattedString(privateKeyString);
    }

}
