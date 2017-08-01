package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.Amount;
import java.util.HashMap;
import java.util.Properties;
import org.junit.Test;

/**
 * Tests:
 *  TabUsageSingle
 *  TabItemShop
 */
public class TabUsageSingleTest {

  /**
   * Config Fields
   */
  private static final String FIELD_USER_ID = "USER_ID";
  private static final String FIELD_MONETARY_ACCOUNT_ID = "MA_ID";
  private static final String FIELD_CASH_REGISTER_ID = "CR_ID";

  /**
   * Config values
   */
  private static final String TAB_FIELD_DESCRIPTION = "Pay the tab for Java test please.";
  private static final String STATUS_OPEN = "OPEN";
  private static final String AMOUNT_IN_EUR = "10.00";
  private static final String CURRENCY = "EUR";
  private static final String TAB_ITEM_FIELD_DESCRIPTION = "Super expensive java tea";
  private static final String STATUS_WAITING = "WAITING_FOR_PAYMENT";
  private static Properties config = TestConfig.prop();
  private static Integer userId = Integer.parseInt(config.getProperty(FIELD_USER_ID));
  private static Integer monetaryAccountId = Integer
      .parseInt(config.getProperty(FIELD_MONETARY_ACCOUNT_ID));
  private static Integer cashRegisterId = Integer.parseInt(config.getProperty(
      FIELD_CASH_REGISTER_ID));

  private static ApiContext apiContext = ApiContextHandler.getApiContext();

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

  private static String createTab() {
    HashMap<String, Object> createMap = new HashMap<>();
    createMap.put(TabUsageSingle.FIELD_DESCRIPTION, TAB_FIELD_DESCRIPTION);
    createMap.put(TabUsageSingle.FIELD_STATUS, STATUS_OPEN);
    createMap.put(TabUsageSingle.FIELD_AMOUNT_TOTAL, new Amount(AMOUNT_IN_EUR, CURRENCY));

    return TabUsageSingle.create(apiContext, createMap, userId, monetaryAccountId,
        cashRegisterId);
  }

  private static void addItemToTab(String tabUuid) {
    HashMap<String, Object> tabItemMap = new HashMap<>();
    tabItemMap.put(TabItemShop.FIELD_AMOUNT, new Amount(AMOUNT_IN_EUR, CURRENCY));
    tabItemMap.put(TabItemShop.FIELD_DESCRIPTION, TAB_ITEM_FIELD_DESCRIPTION);

    TabItemShop.create(apiContext, tabItemMap, userId, monetaryAccountId, cashRegisterId, tabUuid);
  }

}
