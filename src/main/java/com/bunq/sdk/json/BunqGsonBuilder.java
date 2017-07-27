package com.bunq.sdk.json;

import com.bunq.sdk.context.InstallationContext;
import com.bunq.sdk.model.Installation;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.bunq.sdk.model.SessionServer;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.google.gson.GsonBuilder;
import java.math.BigDecimal;

/**
 * A GsonBuilder set up according to the needs of the SDK.
 */
public class BunqGsonBuilder {

  private static final String FORMAT_DATE = "yyyy-MM-dd HH:mm:ss.SSSSSS";

  /**
   * @return Creates a GsonBuilder set up according to the needs of the SDK.
   */
  public static GsonBuilder buildDefault() {
    return new GsonBuilder()
        .disableHtmlEscaping()
        .setDateFormat(FORMAT_DATE)
        .setPrettyPrinting()
        .registerTypeAdapter(Installation.class, new InstallationAdapter())
        .registerTypeAdapter(SessionServer.class, new SessionServerAdapter())
        .registerTypeAdapter(BigDecimal.class, new BigDecimalTypeAdapter())
        .registerTypeAdapter(Geolocation.class, new GeolocationTypeAdapter())
        .registerTypeAdapter(
            MonetaryAccountReference.class,
            new MonetaryAccountReferenceTypeAdapter()
        )
        .registerTypeAdapter(InstallationContext.class, new InstallationContextAdapter());
  }

}
