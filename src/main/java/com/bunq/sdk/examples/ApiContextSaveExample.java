package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.google.gson.Gson;

/**
 * Create an API context and save it to a file.
 */
public class ApiContextSaveExample {

  private static final String API_KEY = "### YOUR API KEY ###"; // Set your API key here
  private static final String DEVICE_DESCRIPTION = "Device description.";
  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  protected static Gson gson = BunqGsonBuilder.buildDefault().create();

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.create(ApiEnvironmentType.SANDBOX, API_KEY,
        DEVICE_DESCRIPTION);
    apiContext.save(API_CONTEXT_FILE_PATH);
  }

}
