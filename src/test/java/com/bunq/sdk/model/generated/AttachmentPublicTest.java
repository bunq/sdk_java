package com.bunq.sdk.model.generated;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.TestConfig;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 * Tests:
 * AttachmentPublic
 * AttachmentPublicContent
 */
public class AttachmentPublicTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final String contentType = TestConfig.getContentType();
  private static final String attachmentDescription = TestConfig.getAttachmentDescription();
  private static final String pathAttachmentIn = TestConfig.getPathAttachmentIn();

  private static final ApiContext apiContext = getApiContext();

  private static byte[] getAttachmentPublicContentBytes(String uuid, ApiContext apiContext) {
    return AttachmentPublicContent.list(apiContext, uuid).getValue();
  }

  private static byte[] getRequestBytes(String path) {
    try {
      return FileUtils.readFileToByteArray(new File(path));
    } catch (IOException exception) {
      return null;
    }
  }

  private static String uploadFileAndGetUuid() {
    HashMap<String, String> customHeaders = new HashMap<>();
    customHeaders.put(ApiClient.HEADER_CONTENT_TYPE, contentType);
    customHeaders.put(ApiClient.HEADER_ATTACHMENT_DESCRIPTION, attachmentDescription);

    byte[] RequestBytes = getRequestBytes(pathAttachmentIn);

    return AttachmentPublic.create(apiContext, RequestBytes, customHeaders).getValue();
  }

  /**
   * Tests if the file we upload is the file we are getting back with the received uuid
   */
  @Test
  public void fileUploadAndRetrievalTest() throws Exception {
    String uuidBefore = uploadFileAndGetUuid();
    AttachmentPublic uuidFromAttachmentPublic = AttachmentPublic.get(apiContext, uuidBefore)
        .getValue();

    byte[] requestBytes = getRequestBytes(pathAttachmentIn);
    byte[] responseBytes = getAttachmentPublicContentBytes(uuidBefore, apiContext);

    assertArrayEquals(requestBytes, responseBytes);
    assertEquals(uuidBefore, uuidFromAttachmentPublic.getUuid());
  }

}
