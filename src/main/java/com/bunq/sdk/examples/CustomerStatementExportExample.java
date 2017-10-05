package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.endpoint.CustomerStatementExport;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
import com.bunq.sdk.model.generated.endpoint.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Initiate a payment and get its info.
 */
public class CustomerStatementExportExample {

  /**
   * Constant to translate weeks to milliseconds.
   */
  private static final long MILLISECONDS_IN_WEEK = 604800000;

  /**
   * Constant to translate weeks to milliseconds.
   */
  private static final int INDEX_FIRST = 0;
  private static final String FORMAT_DATE_STATEMENT = "yyyy-MM-dd";
  private static final String STATEMENT_FORMAT = "PDF";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore();

    HashMap<String, Object> customerStatementMap = new HashMap<>();

    customerStatementMap.put(CustomerStatementExport.FIELD_STATEMENT_FORMAT, STATEMENT_FORMAT);

    SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE_STATEMENT);
    Date dateStart = new Date();
    customerStatementMap.put(CustomerStatementExport.FIELD_DATE_START,
        formatDate.format(dateStart));
    dateStart.setTime(dateStart.getTime() - MILLISECONDS_IN_WEEK);
    Date dateEnd = new Date();

    customerStatementMap.put(CustomerStatementExport.FIELD_DATE_END, formatDate.format(dateEnd));
    int userId = User.list(apiContext).getValue().get(INDEX_FIRST).getUserCompany().getId();
    int monetaryAccountId = MonetaryAccountBank.list(apiContext, userId).getValue().get(INDEX_FIRST)
        .getId();
    int customerStatementId = CustomerStatementExport.create(apiContext, customerStatementMap,
        userId, monetaryAccountId).getValue();

    CustomerStatementExport.delete(apiContext, userId, monetaryAccountId, customerStatementId);

    apiContext.save();
  }

}
