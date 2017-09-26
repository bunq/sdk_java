package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.Config;
import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.model.generated.object.DraftShareInviteBankEntry;
import com.bunq.sdk.model.generated.object.ShareDetail;
import com.bunq.sdk.model.generated.object.ShareDetailPayment;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests:
 * DraftShareInviteBankEntry
 * DraftShareInviteBankQrCodeContent
 */
public class DraftShareInviteBankQrCodeContentTest extends BunqSdkTestBase {

  /**
   * Config values.
   */
  private static final int userId = Config.getUserId();

  private static final ApiContext apiContext = getApiContext();

  private static final int HOURS_TO_EXPIRY = 1;
  private static final String DRAFT_SHARE_INVITE_BANK_STATUS_CANCELLED = "CANCELLED";
  private static final String FILENAME_QR_CODE = "tmp/qrcode.jpg";

  /**
   * The id of the created DraftShareInvite
   */
  private static Integer draftId;

  @BeforeClass
  public static void setUp() throws Exception {
    Calendar expiryDate = Calendar.getInstance();
    expiryDate.add(Calendar.HOUR, HOURS_TO_EXPIRY);

    ShareDetailPayment shareDetailPayment = new ShareDetailPayment(true, true, true, true);
    ShareDetail shareDetail = new ShareDetail();
    shareDetail.setPayment(shareDetailPayment);
    DraftShareInviteBankEntry draftShareInviteBankEntry = new DraftShareInviteBankEntry(
        shareDetail);

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(DraftShareInviteBank.FIELD_EXPIRATION, expiryDate.getTime());
    requestMap.put(DraftShareInviteBank.FIELD_DRAFT_SHARE_SETTINGS, draftShareInviteBankEntry);

    draftId = DraftShareInviteBank.create(apiContext, requestMap, userId).getValue();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(DraftShareInviteBank.FIELD_STATUS, DRAFT_SHARE_INVITE_BANK_STATUS_CANCELLED);

    DraftShareInviteBank.update(apiContext, requestMap, userId, draftId);
  }

  /**
   * Tests the creation of a connect and retrieves the QR code bound to this connect
   *
   * This test has no assertion as of its testing to see if the code runs without errors
   */
  @Test
  public void testDraftShareInviteBankQrCodeContentList() throws Exception {
    byte[] content = DraftShareInviteBankQrCodeContent.list(apiContext, userId, draftId).getValue();
    FileUtils.writeByteArrayToFile(new File(FILENAME_QR_CODE), content);
  }

}
