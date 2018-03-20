package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;

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

    String avatarUuid = Avatar.create(attachmentPublicUuid).getValue();

    String attachmentPublicUuidFromAvatar = Avatar.get(avatarUuid).getValue()
        .getImage().get(INDEX_FIRST).getAttachmentPublicUuid();

    byte[] fileContentsReceived = AttachmentPublicContent.list(attachmentPublicUuidFromAvatar).getValue();

    assertArrayEquals(fileContentsSend, fileContentsReceived);
  }

  private String uploadAvatar(byte[] file_contents) {
    HashMap<String, String> customHeaders = new HashMap<>();
    customHeaders.put(ApiClient.HEADER_ATTACHMENT_DESCRIPTION, attachmentDescription);
    customHeaders.put(ApiClient.HEADER_CONTENT_TYPE, contentType);

    return AttachmentPublic.create(customHeaders, file_contents).getValue();
  }

}
