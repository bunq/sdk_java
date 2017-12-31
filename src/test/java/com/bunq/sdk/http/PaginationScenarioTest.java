package com.bunq.sdk.http;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.model.generated.endpoint.Payment;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tests:
 * Pagination
 */
public class PaginationScenarioTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final Integer userId = Config.getUserId();
  private static final Integer monetaryAccountId = Config.getMonetaryAccountId();
  private static final Pointer counterPartyAliasOther = Config.getCounterPartyAliasOther();

  private static final ApiContext apiContext = getApiContext();

  /**
   * Constants for scenario testing.
   */
  private final static int PAYMENT_LISTING_PAGE_SIZE = 2;
  private final static int PAYMENT_REQUIRED_COUNT_MINIMUM = PAYMENT_LISTING_PAGE_SIZE * 2;
  private final static int NUMBER_ZERO = 0;

  /**
   * Constants for payment creation.
   */
  private final static String PAYMENT_AMOUNT_EUR = "0.01";
  private final static String PAYMENT_CURRENCY = "EUR";
  private final static String PAYMENT_DESCRIPTION = "Java test Payment";

  /**
   * Gson builder for serialization.
   */
  private static Gson gson = BunqGsonBuilder.buildDefault().create();

  @Test
  public void apiScenarioPaymentListingWithPaginationTest() {
    EnsureEnoughPayments();
    ArrayList paymentsExpected = new ArrayList<>(GetPaymentsRequired());
    Pagination paginationCountOnly = new Pagination();
    paginationCountOnly.setCount(PAYMENT_LISTING_PAGE_SIZE);

    BunqResponse<List<Payment>> responseLatest =
        ListPayments(paginationCountOnly.getUrlParamsCountOnly());
    Pagination paginationLatest = responseLatest.getPagination();
    BunqResponse<List<Payment>> responsePrevious =
        ListPayments(paginationLatest.getUrlParamsPreviousPage());
    Pagination paginationPrevious = responsePrevious.getPagination();
    BunqResponse<List<Payment>> responsePreviousNext =
        ListPayments(paginationPrevious.getUrlParamsNextPage());

    ArrayList<Payment> paymentsActual = new ArrayList<>();
    paymentsActual.addAll(responsePreviousNext.getValue());
    paymentsActual.addAll(responsePrevious.getValue());
    String paymentsExpectedSerialized = gson.toJson(paymentsExpected);
    String paymentsActualSerialized = gson.toJson(paymentsActual);

    Assert.assertEquals(paymentsExpectedSerialized, paymentsActualSerialized);
  }

  private static void EnsureEnoughPayments() {
    for (int i = NUMBER_ZERO; i < GetPaymentsMissingCount(); ++i) {
      CreatePayment();
    }
  }

  private static int GetPaymentsMissingCount() {
    return PAYMENT_REQUIRED_COUNT_MINIMUM - GetPaymentsRequired().size();
  }

  private static List<Payment> GetPaymentsRequired() {
    Pagination pagination = new Pagination();
    pagination.setCount(PAYMENT_REQUIRED_COUNT_MINIMUM);

    return ListPayments(pagination.getUrlParamsCountOnly()).getValue();
  }

  private static BunqResponse<List<Payment>> ListPayments(Map<String, String> urlParams) {
    return Payment.list(apiContext, userId, monetaryAccountId, urlParams);
  }

  private static void CreatePayment() {
    Map<String, Object> requestMap = new HashMap<>();
    requestMap.put(Payment.FIELD_AMOUNT, new Amount(PAYMENT_AMOUNT_EUR, PAYMENT_CURRENCY));
    requestMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);
    requestMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, counterPartyAliasOther);

    Payment.create(apiContext, requestMap, userId, monetaryAccountId);
  }
}
