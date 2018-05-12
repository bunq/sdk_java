package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.object.Amount;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.HashMap;

/**
 * Tests:
 * TabUsageSingle
 * TabItemShop
 */
public class TabUsageSingleTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final String TAB_FIELD_DESCRIPTION = "Pay the tab for Java test please.";
  private static final String STATUS_OPEN = "OPEN";
  private static final String AMOUNT_EUR = "10.00";
  private static final String CURRENCY = "EUR";
  private static final String TAB_ITEM_FIELD_DESCRIPTION = "Super expensive java tea";
  private static final String STATUS_WAITING = "WAITING_FOR_PAYMENT";

  @BeforeClass
  public static void setUpBeforeClass() {
    BunqSdkTestBase.setUpBeforeClass();
    Assume.assumeTrue(BunqContext.getUserContext().isOnlyUserCompanySet());
  }

  /**
   * Tests the creation of a Tab, adds a tab item to it and updates this tab
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void createAndUpdateTabTest() {
    String tabUuid = createTab();
    addItemToTab(tabUuid);

    TabUsageSingle.update(getCashRegister().getId(), tabUuid, null, STATUS_WAITING);
    TabUsageSingle.delete(getCashRegister().getId(), tabUuid);
  }

  private static String createTab() {
    return TabUsageSingle.create(
        getCashRegister().getId(),
        TAB_FIELD_DESCRIPTION, STATUS_OPEN, new Amount(AMOUNT_EUR, CURRENCY)).getValue();
  }

  private static void addItemToTab(String tabUuid) {
    TabItemShop.create(
        getCashRegister().getId(),
        tabUuid,
        TAB_ITEM_FIELD_DESCRIPTION,
        null,
        null,
        null,
        null,
        null,
        new Amount(AMOUNT_EUR, CURRENCY)
    );
  }

}
