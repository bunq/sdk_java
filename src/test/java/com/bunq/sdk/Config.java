package com.bunq.sdk;

import com.bunq.sdk.model.generated.object.Pointer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Returns the properties used for testing
 */
public class Config {

  /**
   * Path to the file with properties.
   */
  private static final String FILENAME_PROPERTIES = "src/test/config.properties";

  /**
   * Delimiter between the IP addresses in the PERMITTED_IPS field.
   */
  private static final String DELIMITER_IPS = ", ";

  /**
   * Field constants.
   */
  private static final String FIELD_API_CONFIG_PATH = "API_CONFIG_PATH";
  private static final String FIELD_API_KEY = "API_KEY";
  private static final String FIELD_PERMITTED_IPS = "PERMITTED_IPS";
  private static final String FIELD_USER_ID = "USER_ID";
  private static final String FIELD_CONTENT_TYPE = "CONTENT_TYPE";
  private static final String FIELD_ATTACHMENT_DESCRIPTION = "ATTACHMENT_DESCRIPTION";
  private static final String FIELD_PATH_ATTACHMENT_IN = "PATH_ATTACHMENT_IN";
  private static final String FIELD_MONETARY_ACCOUNT_ID = "MONETARY_ACCOUNT_ID";
  private static final String FIELD_MONETARY_ACCOUNT_ID2 = "MONETARY_ACCOUNT_ID2";
  private static final String FIELD_COUNTER_PARTY_ALIAS = "COUNTER_PARTY_ALIAS";
  private static final String FIELD_COUNTER_PARTY_TYPE = "COUNTER_PARTY_TYPE";
  private static final String FIELD_CASH_REGISTER_ID = "CASH_REGISTER_ID";
  private static final String FIELD_SAME_USER_OTHER_ACCOUNT_ALIAS = "SAME_USER_OTHER_ACCOUNT_ALIAS";
  private static final String FIELD_SAME_USER_OTHER_ACCOUNT_TYPE = "SAME_USER_OTHER_ACCOUNT_TYPE";

  private static Properties properties = getProperties();

  private static Properties getProperties() {
    try {
      Properties prop = new Properties();
      prop.load(new FileInputStream(FILENAME_PROPERTIES));

      return prop;
    } catch (IOException exception) {
      System.out.print(exception.getMessage());

      return null;
    }
  }

  public static String getApiConfigPath() {
    return properties.getProperty(FIELD_API_CONFIG_PATH);
  }

  public static String getApiKey() {
    return properties.getProperty(FIELD_API_KEY);
  }

  public static String[] getPermittedIps() {
    return properties.getProperty(FIELD_PERMITTED_IPS).split(DELIMITER_IPS);
  }

  public static Integer getUserId() {
    return Integer.parseInt(properties.getProperty(FIELD_USER_ID));
  }

  public static String getContentType() {
    return properties.getProperty(FIELD_CONTENT_TYPE);
  }

  public static String getAttachmentDescription() {
    return properties.getProperty(FIELD_ATTACHMENT_DESCRIPTION);
  }

  public static String getPathAttachmentIn() {
    return properties.getProperty(FIELD_PATH_ATTACHMENT_IN);
  }

  public static Integer getMonetaryAccountId() {
    return Integer.parseInt(properties.getProperty(FIELD_MONETARY_ACCOUNT_ID));
  }

  public static Integer getMonetaryAccountId2() {
    return Integer.parseInt(properties.getProperty(FIELD_MONETARY_ACCOUNT_ID2));
  }

  public static Pointer getCounterPartyAliasOther() {
    String type = properties.getProperty(FIELD_COUNTER_PARTY_TYPE);
    String value = properties.getProperty(FIELD_COUNTER_PARTY_ALIAS);

    return new Pointer(type, value);
  }

  public static Integer getCashRegisterId() {
    return Integer.parseInt(properties.getProperty(FIELD_CASH_REGISTER_ID));
  }

  public static Pointer getCounterPartyAliasSelf() {
    String type = properties.getProperty(FIELD_SAME_USER_OTHER_ACCOUNT_TYPE);
    String value = properties.getProperty(FIELD_SAME_USER_OTHER_ACCOUNT_ALIAS);

    return new Pointer(type, value);
  }

}
