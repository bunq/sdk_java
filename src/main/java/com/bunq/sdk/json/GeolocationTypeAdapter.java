package com.bunq.sdk.json;

import com.bunq.sdk.model.generated.object.GeolocationObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/**
 * Custom (de)serialization of Geolocation for GSON, required because Geolocation uses BiDecimal's,
 * but their precision at the moment of serialization should be higher than that of a normal
 * BigDecimal from bunq SDK.
 */
public class GeolocationTypeAdapter implements JsonSerializer<GeolocationObject> {

    private static final String FIELD_LATITUDE = "latitude";
    private static final String FIELD_LONGITUDE = "longitude";
    private static final String FIELD_ALTITUDE = "altitude";
    private static final String FIELD_RADIUS = "radius";

    @Override
    public JsonElement serialize(GeolocationObject geolocation, Type typeOfSrc,
                                 JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(FIELD_LATITUDE, getBigDecimalStringOrNull(geolocation.getLatitude()));
        jsonObject.addProperty(FIELD_LONGITUDE, getBigDecimalStringOrNull(geolocation.getLongitude()));
        jsonObject.addProperty(FIELD_ALTITUDE, getBigDecimalStringOrNull(geolocation.getAltitude()));
        jsonObject.addProperty(FIELD_RADIUS, getBigDecimalStringOrNull(geolocation.getRadius()));

        return jsonObject;
    }

    private String getBigDecimalStringOrNull(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        } else {
            return bigDecimal.toPlainString();
        }
    }
}
