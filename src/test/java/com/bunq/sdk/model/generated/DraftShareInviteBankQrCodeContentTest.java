package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.DraftShareInviteBankEntry;
import com.bunq.sdk.model.generated.object.ShareDetail;
import com.bunq.sdk.model.generated.object.ShareDetailPayment;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests:
 *  DraftShareInviteBankEntry
 *  DraftShareInviteBankQrCodeContent
 */
public class DraftShareInviteBankQrCodeContentTest {

  /**
   * Config fields
   */
  private static final String FIELD_USER_ID = "USER_ID";

  /**
   * Config values
   */
  private static final Integer ADD_HOURS = 1;
  private static final String CANCELLED_STATUS = "CANCELLED";
  private static final String TMP_QRCODE_JPG = "tmp/qrcode.jpg";
  private static Properties config = TestConfig.prop();
  private static Integer userId = Integer.parseInt(config.getProperty(FIELD_USER_ID));

  /**
   * The id of the created DraftShareInvite
   */
  private static Integer draftId;

  private static ApiContext apiContext = ApiContextHandler.getApiContext();

  @BeforeClass
  public static void setUp() throws Exception {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.HOUR, ADD_HOURS);

    ShareDetailPayment shareDetailPayment = new ShareDetailPayment(true, true, true, true);
    ShareDetail shareDetail = new ShareDetail();
    shareDetail.setPayment(shareDetailPayment);
    DraftShareInviteBankEntry draftShareInviteBankEntry = new DraftShareInviteBankEntry(
        shareDetail);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(DraftShareInviteBank.FIELD_EXPIRATION, date.getTime());
    requestMap.put(DraftShareInviteBank.FIELD_DRAFT_SHARE_SETTINGS, draftShareInviteBankEntry);

    draftId = DraftShareInviteBank.create(apiContext, requestMap, userId);
  }

  @AfterClass
  public static void tearDown() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(DraftShareInviteBank.FIELD_STATUS, CANCELLED_STATUS);

    DraftShareInviteBank.update(apiContext, requestMap, userId, draftId);
  }

  /**
   * Tests the creation of a connect and retrieves the QR code bound to this connect
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void testDraftShareInviteBankQrCodeContentList() throws Exception {
    byte[] content = DraftShareInviteBankQrCodeContent.list(apiContext, userId, draftId);
    FileUtils.writeByteArrayToFile(new File(TMP_QRCODE_JPG), content);
  }

}
