package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Tests:
 * AttachmentPublic
 * AttachmentPublicContent
 */
public class AttachmentPublicTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static byte[] getAttachmentPublicContentBytes(String uuid) {
    return AttachmentPublicContent.list(uuid).getValue();
  }

  private static byte[] getRequestBytes() {
    try {
      return FileUtils.readFileToByteArray(new File(BunqSdkTestBase.ATTACHMENT_PATH_IN));
    } catch (IOException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  private static String uploadFileAndGetUuid() {
    HashMap<String, String> customHeaders = new HashMap<>();
    customHeaders.put(ApiClient.HEADER_CONTENT_TYPE, CONTENT_TYPE);
    customHeaders.put(ApiClient.HEADER_ATTACHMENT_DESCRIPTION, ATTACHMENT_DESCRIPTION);

    byte[] RequestBytes = getRequestBytes();

    return AttachmentPublic.create(customHeaders, RequestBytes).getValue();
  }

  /**
   * Tests if the file we upload is the file we are getting back with the received uuid
   */
  @Test
  public void fileUploadAndRetrievalTest() {
    String uuidBefore = uploadFileAndGetUuid();
    AttachmentPublic uuidFromAttachmentPublic = AttachmentPublic.get(uuidBefore)
        .getValue();

    byte[] requestBytes = getRequestBytes();
    byte[] responseBytes = getAttachmentPublicContentBytes(uuidBefore);

    assertArrayEquals(requestBytes, responseBytes);
    assertEquals(uuidBefore, uuidFromAttachmentPublic.getUuid());
  }

}
