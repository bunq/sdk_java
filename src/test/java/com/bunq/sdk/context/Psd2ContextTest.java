package com.bunq.sdk.context;

import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.model.generated.endpoint.OauthClient;
import com.bunq.sdk.model.generated.object.Certificate;
import com.bunq.sdk.security.SecurityUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@FixMethodOrder
@Ignore
public class Psd2ContextTest {

    private static final String FILE_TEST_CONFIGURATION = "src/test/Resource/bunq-psd2-test.conf";
    private static final String FILE_TEST_OAUTH = "src/test/Resource/bunq-oauth-test.conf";

    private static final String FILE_TEST_CERTIFICATE = "src/test/Resource/certificate.pem";
    private static final String FILE_TEST_CERTIFICATE_CHAIN = "src/test/Resource/certificate.pem";
    private static final String FILE_TEST_PRIVATE_KEY = "src/test/Resource/key.pem";

    private static final String TEST_DEVICE_DESCRIPTION = "PSD2TestDevice";

    @Before
    public void setupApiContext() {
        File configurationFile = new File(FILE_TEST_CONFIGURATION);

        if (!configurationFile.exists()) {
            try {
                BunqContext.loadApiContext(createApiContext());
            } catch (Exception ignored) {
            }

            return;
        }

        ApiContext apiContext = ApiContext.restore(FILE_TEST_CONFIGURATION);
        BunqContext.loadApiContext(apiContext);
    }

    @Test
    public void testCreatePsd2Context() {
        File configurationFile = new File(FILE_TEST_CONFIGURATION);

        if (configurationFile.exists()) {
            return;
        }

        try {
            ApiContext apiContext = createApiContext();
            BunqContext.loadApiContext(apiContext);

            Assert.assertTrue(configurationFile.exists());

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testCreateOauthClient() {
        File oauthFile = new File(FILE_TEST_OAUTH);

        if (oauthFile.exists()) {
            return;
        }

        try {
            Integer clientId = OauthClient.create().getValue();
            OauthClient oauthClient = OauthClient.get(clientId).getValue();

            Assert.assertNotNull(oauthClient);

            String serializedClient = BunqGsonBuilder.buildDefault().create().toJson(oauthClient);
            FileWriter fileWriter = new FileWriter(FILE_TEST_OAUTH);

            fileWriter.write(serializedClient);
            fileWriter.close();

            Assert.assertTrue(oauthFile.exists());

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    private ApiContext createApiContext() throws IOException {
        ApiContext apiContext = ApiContext.createForPsd2(
                ApiEnvironmentType.SANDBOX,
                SecurityUtils.getCertificateFromFile(FILE_TEST_CERTIFICATE),
                SecurityUtils.getPrivateKeyFromFile(FILE_TEST_PRIVATE_KEY),
                new Certificate[]{
                        SecurityUtils.getCertificateFromFile(FILE_TEST_CERTIFICATE_CHAIN)
                },
                TEST_DEVICE_DESCRIPTION,
                new ArrayList<String>()
        );
        apiContext.save(FILE_TEST_CONFIGURATION);

        return apiContext;
    }
}
