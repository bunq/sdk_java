package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.User;
import java.util.List;

/**
 * Get info of a user, then list all the users visible with the current API token.
 */
public class UserListExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);
    List<User> users = User.list(apiContext);
    apiContext.save();

    for (User oneUser : users) {
      System.out.println(oneUser.getUserCompany());
    }
  }

}
