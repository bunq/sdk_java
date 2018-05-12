package com.bunq.sdk;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.model.generated.endpoint.CashRegister;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
import com.bunq.sdk.model.generated.endpoint.RequestInquiry;
import com.bunq.sdk.model.generated.endpoint.SandboxUser;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.UUID;

/**
 * Base class for the Bunq SDK tests.
 */
public class BunqSdkTestBase {

  /**
   * Error constants.
   */
  private static final String ERROR_COULD_NOT_GENERATE_NEW_API_KEY = "Encountered error while retrieving new sandbox ApiKey.\nError message %s";

  private static final String DEVICE_DESCRIPTION = "Java test device";
  private static final int HTTP_STATUS_OK = 200;
  private static final String FIELD_RESPONSE = "Response";
  private static final String FIELD_API_KEY = "ApiKey";
  private static final int INDEX_FIRST = 0;

  protected static final String TEST_CONFIG_PATH = "bunq-test.conf";
  protected static final String CONTENT_TYPE = "image/png";
  protected static final String ATTACHMENT_DESCRIPTION = "TEST PNG JAVA";
  protected static final String ATTACHMENT_PATH_IN = "assets/bunq_App_Icon_Round@4x.png";
  protected static final String SCHEME_HTTPS = "https://";
  protected static final String URL_PATH_SEPARATOR = "/";
  protected static final String URL_PATH_SANDBOX_USER = "/sandbox-user";
  protected static final String CURRENCY_EUR = "EUR";
  protected static final String ACCOUNT_DESCRIPTION = "test account java";
  protected static final String SPENDING_MONEY_AMOUNT = "500";
  protected static final String POINTER_TYPE_EMAIL = "EMAIL";
  protected static final String SUGAR_DADDY_EMAIL = "sugardaddy@bunq.com";
  protected static final String SUGAR_DADDY_REQUESTS_DESCRIPTION = "sdk java test, thanks daddy <3";
  protected static final String EMAIL_BRAVO = "bravo@bunq.com";
  protected static final String CASH_REGISTER_DESCRIPTION = "java cash register test";


  /**
   * Individual properties.
   */
  protected static MonetaryAccountBank secondMonetaryAccountBank;
  protected static CashRegister cashRegister;

  @BeforeClass
  public static void setUpBeforeClass() {
    BunqContext.loadApiContext(getApiContext());
    setSecondMonetaryAccountBank();
    requestSpendingMoney();

    try {
      Thread.sleep(500);
    } catch (InterruptedException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  /**
   * Based on the result of isSessionActive will create a new ApiContext or restore an old conf
   * file
   */
  protected static ApiContext getApiContext() {
    if (doesTestConfFileExist()) {
      ApiContext apiContext = ApiContext.restore(TEST_CONFIG_PATH);
      apiContext.ensureSessionActive();
      apiContext.save(TEST_CONFIG_PATH);

      return apiContext;
    } else {
      SandboxUser sandboxUser = generateNewSandboxUser();
      ApiContext apiContext = ApiContext.create(
          ApiEnvironmentType.SANDBOX,
          sandboxUser.getApiKey(),
          DEVICE_DESCRIPTION
      );
      apiContext.save(TEST_CONFIG_PATH);

      return apiContext;
    }
  }

  private static boolean doesTestConfFileExist() {
    File confFile = new File(TEST_CONFIG_PATH);

    return confFile.exists() && !confFile.isDirectory();
  }

  private static SandboxUser generateNewSandboxUser() {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
        .url(
            SCHEME_HTTPS +
            ApiEnvironmentType.SANDBOX.getBaseUri() +
                URL_PATH_SEPARATOR +
            ApiEnvironmentType.SANDBOX.getApiVersion() +
            URL_PATH_SANDBOX_USER
        )
        .post(RequestBody.create(null, new byte[INDEX_FIRST]))
        .addHeader(ApiClient.HEADER_REQUEST_ID, UUID.randomUUID().toString())
        .addHeader(ApiClient.HEADER_CACHE_CONTROL, ApiClient.CACHE_CONTROL_NONE)
        .addHeader(ApiClient.HEADER_GEOLOCATION, ApiClient.GEOLOCATION_ZERO)
        .addHeader(ApiClient.HEADER_LANGUAGE, ApiClient.LANGUAGE_EN_US)
        .addHeader(ApiClient.HEADER_REGION, ApiClient.REGION_NL_NL)
        .build();

    try {
      Response response = client.newCall(request).execute();
      if (response.code() == HTTP_STATUS_OK) {
        String responseString = response.body().string();
        JsonObject jsonObject = new Gson().fromJson(responseString, JsonObject.class);
        JsonObject apiKEy =jsonObject.getAsJsonArray(FIELD_RESPONSE)
            .get(INDEX_FIRST)
            .getAsJsonObject()
            .get(FIELD_API_KEY)
            .getAsJsonObject();

        return SandboxUser.fromJsonReader(new JsonReader(new StringReader(apiKEy.toString())));
      } else {
        throw new BunqException(String.format(ERROR_COULD_NOT_GENERATE_NEW_API_KEY, response.body().string()));
      }
    } catch (IOException e) {
      throw new BunqException(e.getMessage());
    }
  }

  private static void setSecondMonetaryAccountBank() {
    BunqResponse<Integer> response = MonetaryAccountBank.create(CURRENCY_EUR, ACCOUNT_DESCRIPTION);

    secondMonetaryAccountBank = MonetaryAccountBank.get(response.getValue()).getValue();
  }

  private static void requestSpendingMoney() {
    if (shouldMoneyBeRequested(BunqContext.getUserContext().getPrimaryMonetaryAccountBank())) {
      RequestInquiry.create(
          new Amount(SPENDING_MONEY_AMOUNT, CURRENCY_EUR),
          new Pointer(POINTER_TYPE_EMAIL, SUGAR_DADDY_EMAIL),
          SUGAR_DADDY_REQUESTS_DESCRIPTION,
          false
      );
    }

    if (shouldMoneyBeRequested(secondMonetaryAccountBank)) {
      RequestInquiry.create(
          new Amount(SPENDING_MONEY_AMOUNT, CURRENCY_EUR),
          new Pointer(POINTER_TYPE_EMAIL, SUGAR_DADDY_EMAIL),
          SUGAR_DADDY_REQUESTS_DESCRIPTION,
          false,
          secondMonetaryAccountBank.getId()
      );
    }
  }

  protected static Pointer getPointerBravo() {
    return new Pointer(POINTER_TYPE_EMAIL, EMAIL_BRAVO);
  }

  protected static CashRegister getCashRegister() {
    if (cashRegister == null) {
      BunqResponse<Integer> response = CashRegister.create(CASH_REGISTER_DESCRIPTION);
      cashRegister = CashRegister.get(response.getValue()).getValue();
    }

    return cashRegister;
  }

  private static boolean shouldMoneyBeRequested(MonetaryAccountBank monetaryAccountBank) {
    return Float.parseFloat(monetaryAccountBank.getBalance().getValue()) < 10;
  }
}
