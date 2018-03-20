package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.model.generated.endpoint.User;

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
    BunqContext.loadApiContext(ApiContext.restore(API_CONTEXT_FILE_PATH));
    List<User> users = User.list().getValue();
    BunqContext.getApiContext().save();

    for (User oneUser : users) {
      System.out.println(oneUser.getReferencedObject());
    }

    // or
    if (BunqContext.getUserContext().isOnlyUserCompanySet()) {
      System.out.println(BunqContext.getUserContext().getUserCompany());
    } else if (BunqContext.getUserContext().isOnlyUserPersonSet()) {
      System.out.println(BunqContext.getUserContext().getUserPerson());
    } else {
      System.out.println("could not determine user");
    }
  }

}
