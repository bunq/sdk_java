package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqHeader;
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
   * The very first index in an array.
   */
  private static final int INDEX_FIRST = 0;

  private static byte[] getFileContentBytes(String path) {
    try {
      return FileUtils.readFileToByteArray(new File(path));
    } catch (IOException exception) {
      throw new BunqException(exception.getMessage());
    }
  }

  /**
   * Tests the creation of an avatar by uploading a picture via AttachmentPublic and setting it as
   * avatar via the uuid
   */
  @Test
  public void createAvatarTest() {
    byte[] fileContentsSend = getFileContentBytes(ATTACHMENT_PATH_IN);
    String attachmentPublicUuid = uploadAvatar(fileContentsSend);

    String avatarUuid = Avatar.create(attachmentPublicUuid).getValue();

    String attachmentPublicUuidFromAvatar = Avatar.get(avatarUuid).getValue()
        .getImage().get(INDEX_FIRST).getAttachmentPublicUuid();

    byte[] fileContentsReceived = AttachmentPublicContent.list(attachmentPublicUuidFromAvatar).getValue();

    assertArrayEquals(fileContentsSend, fileContentsReceived);
  }

  private String uploadAvatar(byte[] file_contents) {
    HashMap<String, String> customHeaders = new HashMap<>();
    BunqHeader.attachmentDescription.addTo(customHeaders,ATTACHMENT_PATH_IN);
    BunqHeader.contentType.addTo(customHeaders,CONTENT_TYPE);
    return AttachmentPublic.create(customHeaders, file_contents).getValue();
  }
}
