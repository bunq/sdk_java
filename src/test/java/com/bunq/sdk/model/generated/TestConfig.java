package com.bunq.sdk.model.generated;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Returns the properties used for testing
 */
public class TestConfig {

  private static final String FILENAME_PROPERTIES = "src/test/config.properties";

  public static Properties prop() {
    try {
      Properties prop = new Properties();
      prop.load(new FileInputStream(FILENAME_PROPERTIES));

      return prop;
    } catch (IOException exception) {
      System.out.print(exception.getMessage());

      return null;
    }
  }

}
