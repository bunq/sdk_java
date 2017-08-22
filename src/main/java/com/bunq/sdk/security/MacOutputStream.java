package com.bunq.sdk.security;

import java.io.ByteArrayOutputStream;
import javax.crypto.Mac;

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