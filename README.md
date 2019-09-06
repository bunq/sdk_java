# bunq Java SDK

## Introduction
Hi developers!

Welcome to the bunq Java SDK! 👨‍💻

We're very happy to introduce yet another unique product: complete banking SDKs! 
Now you can build even bigger and better apps and integrate them with your bank of the free! 🌈

Before you dive into this brand new SDK, please consider:
- Checking out our new developer’s page [https://bunq.com/en/developer](https://bunq.com/en/developer) 🙌  
- Grabbing your production API key from the bunq app or generate a Sandbox API key using [Tinker](https://www.bunq.com/developer) 🗝
- Visiting [together.bunq.com](https://together.bunq.com) where you can share your creations,
questions and experience 🎤

Give us your feedback, create pull requests, build your very own bunq apps and most importantly:
have fun! 💪

This SDK is in **beta**. We cannot guarantee constant availability or stability. 
Thanks to your feedback we will make improvements on it.

## Installation
To install the package, please follow the instructions corresponding to your build tool under "How to" on the package page on JitPack: https://jitpack.io/#bunq/sdk_java

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

**Please note:** <u>initialising your application is a heavy task and it is recommended to do it only once per device.</u>

After saving the context, you can restore it at any time:

```
ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);
BunqContext.loadApiContext(apiContext);
```

**Tip:** both saving and restoring the context can be done without any arguments. In this case the context will be saved to/restored from the `bunq.conf` file in the same folder with your executable.

#### Example
See [`tinker/load_api_context`](https://github.com/bunq/tinker_java/blob/b03cbc2b84f35de9721a4083843c4015665d67f8/src/main/java/com/bunq/tinker/libs/BunqLib.java#L96-L101)

##### PSD2

It is possible to create an ApiContext as PSD2 Service Provider. Although this might seem a complex task, we wrote some helper implementations to get you started.
You need to create a certificate and private key to get you started. Our sandbox environment currently accepts all certificates, if these criteria are met:
- Up to 64 characters
- PISP and/or AISP used in the end.
 
Make sure you have your unique eIDAS certificate number and certificates ready when you want to perform these tasks on our production environment. 

Creating a PSD2 context is very easy:
```java
ApiContext apiContext = ApiContext.createForPsd2(
    ENVIRONMENT_TYPE,
    SecurityUtils.getCertificateFromFile(PATH_TO_CERTIFICATE),
    SecurityUtils.getPrivateKeyFromFile(PATH_TO_PRIVATE_KEY),
    new Certificate[]{
            SecurityUtils.getCertificateFromFile(PATH_TO_CERTIFICATE_CHAIN)
    },
    DESCRIPTION
)
```

This context can be saved the same way as a normal ApiContext. After creating this context, create an OAuth client to get your users to grant you access.
For a more detailed example, check the [tinker_java](https://github.com/bunq/tinker_java/) repository.


#### Safety considerations
The file storing the context details (i.e. `bunq.conf`) is a key to your account. Anyone having
access to it is able to perform any Public API actions with your account. Therefore, we recommend
choosing a truly safe place to store it.

### Making API calls
There is a class for each endpoint. Each class has functions for each supported action. These actions can be `create`, `get`, `update`, `delete` and `list`.

When making calls, The `userId` and `monetaryAccountId`  needed to make calls will be determined by the SDK it. When no `monetaryAccountId` has been passed, the SDK will use the first active monetary account it can find. This is normally the monetary account used for billing. 

Before you make a call, make sure that you have loaded `ApiContext` in to the `BunqContext`.

#### Creating objects
With the `create` method you can create new models. This method normally returns the `id` of the created model. 


```
Payment.create(
	new Amount(amount, CURRENCY_EURO),
	new Pointer(POINTER_TYPE_EMAIL, recipient),
	description
);
```

##### Example
See [`tinker/make_payment`](https://github.com/bunq/tinker_java/blob/cc41ff072d01e61b44bb53169edb80bde9620dc5/src/main/java/com/bunq/tinker/MakePayment.java#L46)

##### NotificationFilters / Callbacks
**Note!** Due to an in internal change in the way we handle `NotificationFilters` (Callbacks), you should not use the default classes included in this SDK. 
Please make sure you make use of the associated `Internal`-classes. For example when you need `NotificationFilterUrlUser`, make use of `NotificationFilterUrlUserInternal`.
You can use every method of these classes, except for the `create()` method. **Always use `createWithListResponse()` instead.**

##### Example
```java
NotificationFilterPushUserInternal.createWithListResponse(...)
NotificationFilterUrlUserInternal.createWithListResponse(...)
NotificationFilterUrlMonetaryAccountInternal.createWithListResponse(...)
```

#### Reading objects

Reading objects can be done via the `get` or `list` method.

These type of calls always returns the model or binary data.

```
Payment.list(
 	monetaryAccountBank.getId(),
    pagination.getUrlParamsCountOnly()
)
```

##### Example
See [`tinker/get_all_payment`](https://github.com/bunq/tinker_java/blob/b03cbc2b84f35de9721a4083843c4015665d67f8/src/main/java/com/bunq/tinker/libs/BunqLib.java#L161-L164)

#### Updating objects
Updating objects through the API goes the same way as creating objects, except that also the object to update identifier (ID or UUID) is needed. 

The `update` method will also normally return the `Id` of the updated model. 

```
 MonetaryAccountBank.update(Integer.parseInt(accountId), name);
```

##### Example
See [`tinker/update_monetary_account`](https://github.com/bunq/tinker_java/blob/b03cbc2b84f35de9721a4083843c4015665d67f8/src/main/java/com/bunq/tinker/UpdateAccount.java#L36)

#### Deleting objects

Deleting object can be done via the `delete` method.  This method also requires the object identifier which could be an `Id` or `uuid`.

This method normally returns an empty response.  

```
CustomerStatementExport.delete(customerStatementId);
```

## Running Examples

To have an idea on how the SDK works you can play around with the java tinker located at: https://github.com/bunq/tinker_java

## Running tests
Information regarding the test cases can be found in the [README.md](./src/test/README.md)
located in [test](/src/test).

## Exceptions
The SDK can throw multiple exceptions. For an overview of these exceptions please
take a look at [EXCEPTIONS.md](./src/main/java/com/bunq/sdk/exception/EXCEPTIONS.md)
