package com.bunq.sdk.security;

import javax.crypto.Mac;
import java.io.ByteArrayOutputStream;

public class MacOutputStream extends ByteArrayOutputStream {

    private final Mac mac;

    MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    public void write(int oneByte) {
        super.write(oneByte);
        this.mac.update((byte) oneByte);
    }

    public void write(byte[] bytes, int offset, int length) {
        super.write(bytes, offset, length);
        this.mac.update(bytes, offset, length);
    }
}