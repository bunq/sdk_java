## Exceptions

When you make a request via the SDK, there is a chance of request failing
due to various reasons. When such a failure happens, an exception
corresponding to the error occurred is raised.


----
#### Possible Exceptions

* `BadRequestException` If the request returns with status code `400`
* `UnauthorizedException` If the request returns with status code `401`
* `ForbiddenException` If the request returns with status code `403`
* `NotFoundException` If the request returns with status code `404`
* `MethodNotAllowedException` If the request returns with status code `405`
* `TooManyRequestsException` If the request returns with status code `429`
* `PleaseContactBunqException` If the request returns with status code `500`.
If you get this exception, please contact us preferably via the support chat in the bunq app.
* `UnknownApiErrorException` If none of the above mentioned exceptions are raised,
this exception will be raised instead.

For more information regarding these errors, please take a look on the documentation
page here: https://doc.bunq.com/api/1/page/errors

---
#### Base exception
All the exceptions have the same base exception which looks like this:
```java
public class ApiException extends RuntimeException {
  
  /**
   */
  private int responseCode;
  private String message;

  /**
   * @param message The error message of the failed request.
   * @param responseCode The response code of the failed request.
   */
  public ApiException(String message, int responseCode) {}

  public int getResponseCode() {
    return responseCode;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
```
This means that each exception will have the response code and the error message 
related to the specific exception that has been raised.

---
#### Exception handling
Because we raise different exceptions for each error, you can catch an error
if you expect it to be raised.

```java
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.exception.BadRequestException;

class BadRequest {
  private final String API_KEY = "Some invalid key";
  private final String DESCRIPTION = "This will throw BadRequestException.";
  
  public void main(){
    try{
      new ApiContext(ApiEnvironmentType.SANDBOX, this.API_KEY, this.DESCRIPTION);
    }catch (BadRequestException error){
      System.out.println(error.getMessage());
      System.out.println(error.getResponseCode());
    }
  }
  
}
```

This will ensure that you are ready for anything that might go wrong!
