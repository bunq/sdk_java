package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.assertNotNull;

public class MonetaryAccountJointTest extends BunqSdkTestBase {

    private static final String PATH_TO_JSON_RESPONSE =
            "src/test/Resource/ResponseJsons/MonetaryAccountJoint.json";

    @BeforeClass
    public static void setUpBeforeClass() {
    }

    @Test
    public void parseMonetaryAccountJoint() throws FileNotFoundException {
        JsonReader jsonReader = new JsonReader(new FileReader(PATH_TO_JSON_RESPONSE));
        MonetaryAccountJointApiObject monetaryAccountJoint = BunqModel.fromJsonReader(MonetaryAccountJointApiObject.class, jsonReader);

        assertNotNull(monetaryAccountJoint);
    }
}
