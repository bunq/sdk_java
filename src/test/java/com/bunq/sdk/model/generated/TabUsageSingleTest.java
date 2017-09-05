package com.bunq.sdk.model.generated;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import java.util.HashMap;
import org.junit.Test;

/**
 * Tests:
 * TabUsageSingle
 * TabItemShop
 */
public class TabUsageSingleTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final int userId = TestConfig.getUserId();
  private static final int monetaryAccountId = TestConfig.getMonetaryAccountId();
  private static final int cashRegisterId = TestConfig.getCashRegisterId();

  private static final ApiContext apiContext = getApiContext();

  private static final String TAB_FIELD_DESCRIPTION = "Pay the tab for Java test please.";
  private static final String STATUS_OPEN = "OPEN";
  private static final String AMOUNT_IN_EUR = "10.00";
  private static final String CURRENCY = "EUR";
  private static final String TAB_ITEM_FIELD_DESCRIPTION = "Super expensive java tea";
  private static final String STATUS_WAITING = "WAITING_FOR_PAYMENT";

  private static String createTab() {
    HashMap<String, Object> createMap = new HashMap<>();
    createMap.put(TabUsageSingle.FIELD_DESCRIPTION, TAB_FIELD_DESCRIPTION);
    createMap.put(TabUsageSingle.FIELD_STATUS, STATUS_OPEN);
    createMap.put(TabUsageSingle.FIELD_AMOUNT_TOTAL, new Amount(AMOUNT_IN_EUR, CURRENCY));

    return TabUsageSingle.create(apiContext, createMap, userId, monetaryAccountId,
        cashRegisterId).getValue();
  }

  private static void addItemToTab(String tabUuid) {
    HashMap<String, Object> tabItemMap = new HashMap<>();
    tabItemMap.put(TabItemShop.FIELD_AMOUNT, new Amount(AMOUNT_IN_EUR, CURRENCY));
    tabItemMap.put(TabItemShop.FIELD_DESCRIPTION, TAB_ITEM_FIELD_DESCRIPTION);

    TabItemShop.create(apiContext, tabItemMap, userId, monetaryAccountId, cashRegisterId, tabUuid);
  }

  /**
   * Tests the creation of a Tab, adds a tab item to it and updates this tab
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void createAndUpdateTabTest() throws Exception {
    String tabUuid = createTab();
    addItemToTab(tabUuid);

    HashMap<String, Object> updateMap = new HashMap<>();
    updateMap.put(TabUsageSingle.FIELD_STATUS, STATUS_WAITING);
    TabUsageSingle.update(apiContext, updateMap, userId, monetaryAccountId, cashRegisterId,
        tabUuid);

    TabUsageSingle.delete(apiContext, userId, monetaryAccountId, cashRegisterId, tabUuid);
  }

}
