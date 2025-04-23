package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.BunqSdkTestBase;
import com.bunq.sdk.exception.BunqException;
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

    private static byte[] getFileContentBytes() {
        try {
            return FileUtils.readFileToByteArray(new File(BunqSdkTestBase.ATTACHMENT_PATH_IN));
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
        byte[] fileContentsSend = getFileContentBytes();
        String attachmentPublicUuid = uploadAvatar(fileContentsSend);

        String avatarUuid = AvatarApiObject.create(attachmentPublicUuid).getValue();

        String attachmentPublicUuidFromAvatar = AvatarApiObject.get(avatarUuid).getValue()
                .getImage().get(INDEX_FIRST).getAttachmentPublicUuid();

        byte[] fileContentsReceived = AttachmentPublicContentApiObject.list(attachmentPublicUuidFromAvatar).getValue();

        assertArrayEquals(fileContentsSend, fileContentsReceived);
    }

    private String uploadAvatar(byte[] file_contents) {
        HashMap<String, String> allCustomHeader = new HashMap<>();

        BunqHeader.ATTACHMENT_DESCRIPTION.addTo(allCustomHeader, ATTACHMENT_PATH_IN);
        BunqHeader.CONTENT_TYPE.addTo(allCustomHeader, CONTENT_TYPE);

        return AttachmentPublicApiObject.create(allCustomHeader, file_contents).getValue();
    }
}
