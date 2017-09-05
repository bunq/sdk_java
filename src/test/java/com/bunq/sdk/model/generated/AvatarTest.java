package com.bunq.sdk.model.generated;

import static org.junit.Assert.assertArrayEquals;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
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
 * AttachmentPublicContent Avatar
 */
public class AvatarTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final String attachmentDescription = Config.getAttachmentDescription();
  private static final String contentType = Config.getContentType();
  private static final String pathAttachmentIn = Config.getPathAttachmentIn();

  /**
   * The very first index in an array.
   */
  private static final int INDEX_FIRST = 0;

  private static ApiContext apiContext = getApiContext();

  private static byte[] getFileContentBytes(String path) {
    try {

      return FileUtils.readFileToByteArray(new File(path));

    } catch (IOException exception) {
      System.out.print(exception.getMessage());

      return null;

    }
  }

  /**
   * Tests the creation of an avatar by uploading a picture via AttachmentPublic and setting it as
   * avatar via the uuid
   */
  @Test
  public void createAvatarTest() throws Exception {
    byte[] fileContentsSend = getFileContentBytes(pathAttachmentIn);
    String attachmentPublicUuid = uploadAvatar(fileContentsSend);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(Avatar.FIELD_ATTACHMENT_PUBLIC_UUID, attachmentPublicUuid);

    String avatarUuid = Avatar.create(apiContext, requestMap).getValue();

    String attachmentPublicUuidFromAvatar = Avatar.get(apiContext, avatarUuid).getValue()
        .getImage().get(INDEX_FIRST).getAttachmentPublicUuid();

    byte[] fileContentsReceived = AttachmentPublicContent.list(apiContext,
        attachmentPublicUuidFromAvatar).getValue();

    assertArrayEquals(fileContentsSend, fileContentsReceived);
  }

  private String uploadAvatar(byte[] file_contents) {
    HashMap<String, String> customHeaders = new HashMap<>();
    customHeaders.put(ApiClient.HEADER_ATTACHMENT_DESCRIPTION, attachmentDescription);
    customHeaders.put(ApiClient.HEADER_CONTENT_TYPE, contentType);

    return AttachmentPublic.create(apiContext, file_contents, customHeaders).getValue();
  }

}
