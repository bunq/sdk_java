package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.CustomerStatementExport;

import java.text.SimpleDateFormat;
import java.util.Date;

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
  private static final String FORMAT_DATE_STATEMENT = "yyyy-MM-dd";
  private static final String STATEMENT_FORMAT = "PDF";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    BunqContext.loadApiContext(ApiContext.restore());

    SimpleDateFormat formatDate = new SimpleDateFormat(FORMAT_DATE_STATEMENT);
    Date dateStart = new Date();
    Date dateEnd = new Date();
    dateStart.setTime(dateStart.getTime() - MILLISECONDS_IN_WEEK);

    int customerStatementId = CustomerStatementExport.create(
        STATEMENT_FORMAT,
        formatDate.format(dateStart),
        formatDate.format(dateEnd)
    ).getValue();

    CustomerStatementExport.delete(customerStatementId);

    BunqContext.getApiContext().save();
  }

}
