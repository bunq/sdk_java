package com.bunq.sdk.model.generated;

import static org.junit.Assert.assertArrayEquals;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 * Tests:
 *  AttachmentPublic
 *  AttachmentPublicContent Avatar
 */
public class AvatarTest {

  /**
   * Config fields
   */
  private static final String FIELD_ATTACHMENT_DESCRIPTION = "ATTACHMENT_DESCRIPTION";
  private static final String FIELD_CONTENT_TYPE = "CONTENT_TYPE";
  private static final String FIELD_PATH_ATTACHMENT_IN = "PATH_ATTACHMENT_IN";

  /**
   * Config values
   */
  private static final int INDEX_FIRST = 0;
  private static Properties config = TestConfig.prop();
  private static String attachmentDescription = config.getProperty(FIELD_ATTACHMENT_DESCRIPTION);
  private static String contentType = config.getProperty(FIELD_CONTENT_TYPE);
  private static String pathAttachmentIn = config.getProperty(FIELD_PATH_ATTACHMENT_IN);

  private static ApiContext apiContext = ApiContextHandler.getApiContext();

  private static byte[] getFileContentBytes(String path) {
    try {

      return FileUtils.readFileToByteArray(new File(path));

    } catch (IOException exception) {
      System.out.print(exception);

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

    String avatarUuid = Avatar.create(apiContext, requestMap);

    String attachmentPublicUuidFromAvatar = Avatar.get(apiContext, avatarUuid).getImage().get(
        INDEX_FIRST)
        .getAttachmentPublicUuid();

    byte[] fileContentsReceived = AttachmentPublicContent.list(apiContext,
        attachmentPublicUuidFromAvatar);

    assertArrayEquals(fileContentsSend, fileContentsReceived);
  }

  private String uploadAvatar(byte[] file_contents) {
    HashMap<String, String> customHeaders = new HashMap<>();
    customHeaders.put(ApiClient.HEADER_ATTACHMENT_DESCRIPTION, attachmentDescription);
    customHeaders.put(ApiClient.HEADER_CONTENT_TYPE, contentType);

    return AttachmentPublic.create(apiContext, file_contents, customHeaders);
  }

}
