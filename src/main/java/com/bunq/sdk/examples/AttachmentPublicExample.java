package com.bunq.sdk.examples;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqResponse;
import com.bunq.sdk.model.generated.AttachmentPublic;
import com.bunq.sdk.model.generated.AttachmentPublicContent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;

/**
 * Create attachment from an image, get the attachment content and save to another image.
 */
public class AttachmentPublicExample {

  private static final String API_CONTEXT_FILE_PATH = "bunq.conf";
  private static final String CONTENT_TYPE_IMAGE_JPEG = "image/jpeg";
  private static final String DESCRIPTION_TEST_JPG_ATTACHMENT = "A test JPG attachment.";
  private static final String PATH_ATTACHMENT_IN = "assets/attachment.jpg";
  private static final String PATH_ATTACHMENT_OUT = "tmp/attachment_out.jpg";

  /**
   * @param args Command line arguments.
   */
  public static void main(String[] args) throws IOException {
    ApiContext apiContext = ApiContext.restore(API_CONTEXT_FILE_PATH);

    HashMap<String, String> customHeaders = new HashMap<>();
    customHeaders.put(ApiClient.HEADER_CONTENT_TYPE, CONTENT_TYPE_IMAGE_JPEG);
    customHeaders.put(ApiClient.HEADER_ATTACHMENT_DESCRIPTION, DESCRIPTION_TEST_JPG_ATTACHMENT);

    try {
      byte[] requestBytes = FileUtils.readFileToByteArray(new File(PATH_ATTACHMENT_IN));
      String uuid = AttachmentPublic.create(apiContext, requestBytes, customHeaders).getValue();
      BunqResponse<byte[]> response = AttachmentPublicContent.list(apiContext, uuid);
      FileUtils.writeByteArrayToFile(new File(PATH_ATTACHMENT_OUT), response.getValue());
      apiContext.save();
    } catch (IOException exception) {
      System.out.print(exception.getMessage());
    }
  }

}
