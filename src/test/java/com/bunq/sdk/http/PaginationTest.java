package com.bunq.sdk.http;

import com.bunq.sdk.exception.BunqException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

/**
 * Tests:
 * Pagination
 */
public class PaginationTest {

  /**
   * Values of pagination properties for testing.
   */
  private static final int PAGINATION_OLDER_ID_CUSTOM = 1;
  private static final int PAGINATION_NEWER_ID_CUSTOM = 2;
  private static final int PAGINATION_FUTURE_ID_CUSTOM = 3;
  private static final int PAGINATION_COUNT_CUSTOM = 5;

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private static Pagination createPaginationWithAllPropertiesSet() {
    Pagination pagination = new Pagination();
    pagination.setOlderId(PAGINATION_OLDER_ID_CUSTOM);
    pagination.setNewerId(PAGINATION_NEWER_ID_CUSTOM);
    pagination.setFutureId(PAGINATION_FUTURE_ID_CUSTOM);
    pagination.setCount(PAGINATION_COUNT_CUSTOM);

    return pagination;
  }

  @Test
  public void getUrlParamsCountOnlyTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    Map<String, String> urlParamsCountOnlyExpected = new HashMap<>();
    urlParamsCountOnlyExpected.put(Pagination.PARAM_COUNT,
        Integer.toString(PAGINATION_COUNT_CUSTOM));

    Assert.assertEquals(urlParamsCountOnlyExpected, pagination.getUrlParamsCountOnly());
  }

  @Test
  public void getUrlParamsPreviousPageTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    Map<String, String> urlParamsPreviousPageExpected = new HashMap<>();
    urlParamsPreviousPageExpected.put(Pagination.PARAM_COUNT,
        Integer.toString(PAGINATION_COUNT_CUSTOM));
    urlParamsPreviousPageExpected.put(Pagination.PARAM_OLDER_ID,
        Integer.toString(PAGINATION_OLDER_ID_CUSTOM));

    Assert.assertTrue(pagination.hasPreviousPage());
    Assert.assertEquals(urlParamsPreviousPageExpected, pagination.getUrlParamsPreviousPage());
  }

  @Test
  public void getUrlParamsPreviousPageNoCountTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    pagination.setCount(null);
    Map<String, String> urlParamsPreviousPageExpected = new HashMap<>();
    urlParamsPreviousPageExpected.put(Pagination.PARAM_OLDER_ID,
        Integer.toString(PAGINATION_OLDER_ID_CUSTOM));

    Assert.assertTrue(pagination.hasPreviousPage());
    Assert.assertEquals(urlParamsPreviousPageExpected, pagination.getUrlParamsPreviousPage());
  }

  @Test
  public void getUrlParamsNextPageNewerTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    Map<String, String> urlParamsNextPageExpected = new HashMap<>();
    urlParamsNextPageExpected.put(Pagination.PARAM_COUNT,
        Integer.toString(PAGINATION_COUNT_CUSTOM));
    urlParamsNextPageExpected.put(Pagination.PARAM_NEWER_ID,
        Integer.toString(PAGINATION_NEWER_ID_CUSTOM));

    Assert.assertTrue(pagination.hasNextPageAssured());
    Assert.assertEquals(urlParamsNextPageExpected, pagination.getUrlParamsNextPage());
  }

  @Test
  public void getUrlParamsNextPageNewerNoCountTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    pagination.setCount(null);
    Map<String, String> urlParamsNextPageExpected = new HashMap<>();
    urlParamsNextPageExpected.put(Pagination.PARAM_NEWER_ID,
        Integer.toString(PAGINATION_NEWER_ID_CUSTOM));

    Assert.assertTrue(pagination.hasNextPageAssured());
    Assert.assertEquals(urlParamsNextPageExpected, pagination.getUrlParamsNextPage());
  }

  @Test
  public void getUrlParamsNextPageFutureTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    pagination.setNewerId(null);
    Map<String, String> urlParamsNextPageExpected = new HashMap<>();
    urlParamsNextPageExpected.put(Pagination.PARAM_COUNT,
        Integer.toString(PAGINATION_COUNT_CUSTOM));
    urlParamsNextPageExpected.put(Pagination.PARAM_NEWER_ID,
        Integer.toString(PAGINATION_FUTURE_ID_CUSTOM));

    Assert.assertFalse(pagination.hasNextPageAssured());
    Assert.assertEquals(urlParamsNextPageExpected, pagination.getUrlParamsNextPage());
  }

  @Test
  public void getUrlParamsNextPageFutureNoCountTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    pagination.setNewerId(null);
    pagination.setCount(null);
    Map<String, String> urlParamsNextPageExpected = new HashMap<>();
    urlParamsNextPageExpected.put(Pagination.PARAM_NEWER_ID,
        Integer.toString(PAGINATION_FUTURE_ID_CUSTOM));

    Assert.assertFalse(pagination.hasNextPageAssured());
    Assert.assertEquals(urlParamsNextPageExpected, pagination.getUrlParamsNextPage());
  }

  @Test
  public void getUrlParamsPreviousPageFromPaginationWithNoPreviousPageTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    pagination.setOlderId(null);

    Assert.assertFalse(pagination.hasPreviousPage());
    exception.expect(BunqException.class);
    pagination.getUrlParamsPreviousPage();
  }

  @Test
  public void getUrlParamsNextPageFromPaginationWithNoNextPageTest() {
    Pagination pagination = createPaginationWithAllPropertiesSet();
    pagination.setNewerId(null);
    pagination.setFutureId(null);

    exception.expect(BunqException.class);
    pagination.getUrlParamsNextPage();
  }
}
