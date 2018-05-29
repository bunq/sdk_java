package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.model.core.DeviceServerInternal;
import com.bunq.sdk.model.core.Installation;
import com.bunq.sdk.model.core.SessionServer;
import com.bunq.sdk.model.generated.endpoint.DeviceServer;
import com.bunq.sdk.model.generated.endpoint.Session;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/**
 * The context to make the API calls in. Consists of:
 * > Environment type (SANDBOX or PRODUCTION)
 * > Bunq API Key for the corresponding environment
 * > Installation context
 * > Session context
 */
public class ApiContext implements java.io.Serializable {

  /**
   * Error constants.
   */
  private static final String ERROR_COULD_NOT_SAVE_API_CONTEXT =
      "Could not save the API context.";
  private static final String ERROR_COULD_NOT_RESTORE_API_CONTEXT =
      "Could not restore the API context.";

  /**
   * Default path to store the serialized API context.
   */
  private static final String PATH_API_CONTEXT_DEFAULT = "bunq.conf";

  /**
   * Dummy ID to pass to Session endpoint.
   */
  private static final int SESSION_ID_DUMMY = 0;

  /**
   * Minimum time to session expiry not requiring session reset.
   */
  private static final int TIME_TO_SESSION_EXPIRY_MINIMUM_SECONDS = 30;

  /**
   * Constant for converting milliseconds to seconds.
   */
  private static final int MILLISECONDS_IN_SECOND = 1000;

  /**
   * Encoding of the serialized API context.
   */
  private static final String ENCODING_BUNQ_CONF = "UTF-8";

  protected static Gson gson = BunqGsonBuilder.buildDefault().create();

  @Expose
  @SerializedName("environment_type")
  private final ApiEnvironmentType environmentType;

  @Expose
  @SerializedName("api_key")
  private final String apiKey;

  @Expose
  @SerializedName("installation_context")
  private InstallationContext installationContext;

  @Expose
  @SerializedName("session_context")
  private SessionContext sessionContext;

  @Expose
  @SerializedName("proxy")
  private String proxy;

  /**
   * Create an empty API context.
   */
  private ApiContext(ApiEnvironmentType environmentType, String apiKey) {
    this.environmentType = environmentType;
    this.apiKey = apiKey;
  }

  /**
   * Create and initialize an API Context with current IP as permitted and no proxy.
   */
  public static ApiContext create(ApiEnvironmentType environmentType, String apiKey,
      String deviceDescription) {
    return create(environmentType, apiKey, deviceDescription, new ArrayList<>());
  }

  /**
   * Create and initialize an API Context with given permitted ips and no proxy.
   */
  public static ApiContext create(ApiEnvironmentType environmentType, String apiKey,
      String deviceDescription, List<String> permittedIps) {
    return create(environmentType, apiKey, deviceDescription, permittedIps, null);
  }

  /**
   * Create and initialize an API Context with current IP as permitted and a proxy.
   */
  public static ApiContext create(ApiEnvironmentType environmentType, String apiKey,
      String deviceDescription, String proxy) {
    return create(environmentType, apiKey, deviceDescription, new ArrayList<>(), proxy);
  }

  /**
   * Create and initialize an API Context.
   */
  public static ApiContext create(ApiEnvironmentType environmentType, String apiKey,
      String deviceDescription, List<String> permittedIps, String proxy) {
    ApiContext apiContext = new ApiContext(environmentType, apiKey);
    apiContext.proxy = proxy;
    apiContext.initialize(deviceDescription, permittedIps);

    return apiContext;
  }

  /**
   * Restores a context from a default location.
   */
  public static ApiContext restore() {
    return restore(PATH_API_CONTEXT_DEFAULT);
  }

  /**
   * Restores a context from a given file.
   */
  public static ApiContext restore(String fileName) {
    try {
      File file = new File(fileName);
      String json = FileUtils.readFileToString(file, ENCODING_BUNQ_CONF);

      return fromJson(json);
    } catch (IOException exception) {
      throw new BunqException(ERROR_COULD_NOT_RESTORE_API_CONTEXT, exception);
    }
  }

  /**
   * Restores a context from a given JSON string.
   */
  public static ApiContext fromJson(String json) {
    return gson.fromJson(json, ApiContext.class);
  }

  private void initialize(String deviceDescription, List<String> permittedIps) {
    /* The calls below are order-sensitive: to initialize a Device Registration, we need an
     * Installation, and to initialize a Session we need a Device Registration. */
    initializeInstallation();
    initializeDeviceRegistration(deviceDescription, permittedIps);
    initializeSession();
  }

  /**
   * Create a new installation and store its data in an InstallationContext.
   */
  private void initializeInstallation() {
    KeyPair keyPairClient = SecurityUtils.generateKeyPair();
    Installation installation = Installation.create(
        this,
        SecurityUtils.getPublicKeyFormattedString(keyPairClient.getPublic())
    ).getValue();
    installationContext = new InstallationContext(installation, keyPairClient);
  }

  private void initializeDeviceRegistration(String deviceDescription, List<String> permittedIps) {
    DeviceServerInternal.create(this, deviceDescription, this.apiKey, permittedIps);
  }

  /**
   * Create a new session and its data in a SessionContext.
   */
  private void initializeSession() {
    sessionContext = new SessionContext(SessionServer.create(this).getValue());
  }

  /**
   * Closes the current session and opens a new one.
   */
  public void resetSession() {
    dropSessionContext();
    initializeSession();
  }

  private void dropSessionContext() {
    sessionContext = null;
  }

  /**
   * Closes the current session.
   */
  public void closeSession() {
    deleteSession();
    dropSessionContext();
  }

  private void deleteSession() {
    Session.delete(SESSION_ID_DUMMY);
  }

  /**
   * Check if current time is too close to the saved session expiry time and reset session if
   * needed.
   */
  public boolean ensureSessionActive() {
   if (!isSessionActive()) {
     resetSession();

     return true;
   }

   return false;
  }

  public boolean isSessionActive() {
    return sessionContext != null &&
      getTimeToSessionExpiryInSeconds() < TIME_TO_SESSION_EXPIRY_MINIMUM_SECONDS;
  }

  private long getTimeToSessionExpiryInSeconds() {
    long timeToSessionExpiryMilliseconds = sessionContext.getExpiryTime().getTime() -
        new Date().getTime();

    return timeToSessionExpiryMilliseconds / MILLISECONDS_IN_SECOND;
  }

  /**
   * Save a JSON representation of the API Context to the default location.
   */
  public void save() {
    save(PATH_API_CONTEXT_DEFAULT);
  }

  /**
   * Save a JSON representation of the API Context to a given file.
   */
  public void save(String fileName) {
    try {
      File file = new File(fileName);
      FileUtils.writeStringToFile(file, toJson(), ENCODING_BUNQ_CONF);
    } catch (IOException exception) {
      throw new BunqException(ERROR_COULD_NOT_SAVE_API_CONTEXT, exception);
    }
  }

  /**
   * Serializes the context to JSON.
   */
  public String toJson() {
    return gson.toJson(this);
  }

  /**
   * @return The base URI of the current environment.
   */
  public String getBaseUri() {
    return environmentType.getBaseUri();
  }

  public String getApiVersion() {
    return environmentType.getApiVersion();
  }

  /**
   * @return The session token, installation token if the session isn't created yet, or null if no
   * installation is created either.
   */
  public String getSessionToken() {
    if (sessionContext != null) {
      return sessionContext.getToken();
    } else if (installationContext != null) {
      return installationContext.getToken();
    } else {
      return null;
    }
  }

  public ApiEnvironmentType getEnvironmentType() {
    return environmentType;
  }

  public String getApiKey() {
    return apiKey;
  }

  public InstallationContext getInstallationContext() {
    return installationContext;
  }

  public SessionContext getSessionContext() {
    return sessionContext;
  }

  public String getProxy() {
    return proxy;
  }

}
