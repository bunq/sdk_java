# bunq Java SDK

## Introduction
Hi developers!

Welcome to the bunq Java SDK! 👨‍💻

We're very happy to introduce yet another unique product: complete banking SDKs! 
Now you can build even bigger and better apps and integrate them with your bank of the free! 🌈

Before you dive into this brand new SDK, please consider:
- Checking out our new developer’s page [https://bunq.com/en/developer](https://bunq.com/en/developer) 🙌  
- Grabbing your production API key from the bunq app or asking our support for a Sandbox API key 🗝
- Visiting [together.bunq.com](https://together.bunq.com) where you can share your creations,
questions and experience 🎤

Give us your feedback, create pull requests, build your very own bunq apps and most importantly:
have fun! 💪

This SDK is in **beta**. We cannot guarantee constant availability or stability. 
Thanks to your feedback we will make improvements on it.

## Installation
TBA

## Usage

### Creating an API context
In order to start making calls with the bunq API, you must first register your API key and device,
and create a session. In the SDKs, we group these actions and call it "creating an API context". The
context can be created by using the following code snippet:

```
ApiContext apiContext = ApiContext.create(ENVIRONMENT_TYPE, API_KEY,
  DEVICE_DESCRIPTION);
apiContext.save(API_CONTEXT_FILE_PATH);
```

**Please note:** initializing your application is a heavy task and it is recommended to do it only once per device.  

After saving the context, you can restore it at any time:

```
ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);
```

**Tip:** both saving and restoring the context can be done without any arguments. In this case the context will be saved
to/restored from the `bunq.conf` file in the same folder with your executable.

#### Example
See [`ApiContextSaveExample.java`](./src/main/java/com/bunq/sdk/example/ApiContextSaveExample.java)

The API context can then be saved with:

#### Safety considerations
The file storing the context details (i.e. `bunq.conf`) is a key to your account. Anyone having
access to it is able to perform any Public API actions with your account. Therefore, we recommend
choosing a truly safe place to store it.

### Making API calls
There is a class for each endpoint. Each class has functions for each supported action. These
actions can be `create`, `get`, `update`, `delete` and `list`.

Sometimes API calls have dependencies, for instance `MonetaryAccount`. Making changes to a monetary
account always also needs a reference to a `User`. These dependencies are required as arguments when
performing API calls. Take a look at [doc.bunq.com](https://doc.bunq.com) for the full
documentation.

#### Creating objects
Creating objects through the API requires an `ApiContext`, a `requestMap` and identifiers of all
dependencies (such as User ID required for accessing a Monetary Account). Optionally, custom headers
can be passed to requests.


```
Map<String, Object> paymentMap = new HashMap<>();
Amount paymentAmount = new Amount(PAYMENT_AMOUNT, PAYMENT_CURRENCY);
paymentMap.put(Payment.FIELD_AMOUNT, paymentAmount);
Pointer pointerCounterparty = new Pointer(COUNTERPARTY_POINTER_TYPE, COUNTERPARTY_EMAIL);
paymentMap.put(Payment.FIELD_COUNTERPARTY_ALIAS, pointerCounterparty);
paymentMap.put(Payment.FIELD_DESCRIPTION, PAYMENT_DESCRIPTION);

Integer paymentId = Payment.create(
    apiContext,
    generateExamplePaymentMap(),
    USER_ITEM_ID,
    MONETARY_ACCOUNT_ITEM_ID
);
```

##### Example
See [`PaymentExample.java`](./src/main/java/com/bunq/sdk/example/PaymentExample.java)

#### Reading objects
Reading objects through the API requires an `ApiContext`, identifiers of all dependencies (such as
User ID required for accessing a Monetary Account), and the identifier of the object to read (ID or
UUID) Optionally, custom headers can be passed to requests.

This type of calls always returns a model.

```
MonetaryAccount monetaryAccount = MonetaryAccount.get(
    apiContext,
    USER_ITEM_ID,
    MONETARY_ACCOUNT_ITEM_ID
);
```

##### Example
See [`MonetaryAccountExample.java`](./src/main/java/com/bunq/sdk/example/MonetaryAccountExample.java)

#### Updating objects
Updating objects through the API goes the same way as creating objects, except that also the object to update identifier 
(ID or UUID) is needed.

```
Map<String, Object> requestMapUpdate = new HashMap<>();
requestMapUpdate.put(RequestInquiry.FIELD_STATUS, STATUS_REVOKED);

RequestInquiry.update(
    apiContext,
    requestMapUpdate,
    USER_ITEM_ID,
    MONETARY_ACCOUNT_ITEM_ID,
    REQUEST_ID
);
```

##### Example
See [`RequestExample.java`](./src/main/java/com/bunq/sdk/example/RequestExample.java)

#### Deleting objects
Deleting objects through the API requires an `ApiContext`, identifiers of all dependencies (such as User ID required for
accessing a Monetary Account), and the identifier of the object to delete (ID or UUID) Optionally, custom headers can be
passed to requests.

```
CustomerStatementExport.delete(apiContext, userId, monetaryAccountId, customerStatementId);
```

##### Example
See [`CustomerStatementExportExample.java`](./src/main/java/com/bunq/sdk/example/CustomerStatementExportExample.java)

#### Listing objects
Listing objects through the API requires an `ApiContext` and identifiers of all dependencies (such as User ID required
for accessing a Monetary Account). Optionally, custom headers can be passed to requests.

```
List<User> users = User.list(apiContext);
```

##### Example
See [`UserListExample.java`](./src/main/java/com/bunq/sdk/example/UserListExample.java)

## Running Examples
In order to make the experience of getting into bunq Java SDK smoother, we
have bundled it with example use cases (located under `./src/main/java/com/bunq/sdk/example/`).

To run an example, please do the following:
1. In your IDE, open the example you are interested in and adjust the constants,
such as `API_KEY` or `USER_ID`, to hold your data.
2. Since Java IDE's are typically advanced just run the example of your choice in your IDE.

In order for examples to run, you would need a valid context file (`bunq.conf`)
to be present in the bunq SDK project root directory. The file can either copied
from somewhere else (e.g. tests) or created by executing the `ApiContextSaveExample.java` in your
IDE.

Please do not forget to set the `API_KEY` constant in `ApiContextSaveExample.java` to your actual
API key before running the example!

## Running tests
Information regarding the test cases can be found in the [README.md](./src/test/README.md)
located in [test](/src/test) 
