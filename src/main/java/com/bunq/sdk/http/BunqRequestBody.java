package com.bunq.sdk.http;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

import java.io.IOException;

public class BunqRequestBody extends RequestBody {
  private RequestBody requestBody;
  private MediaType contentType;
  private int byteCount;
  private int offset;
  private byte[] content;

  /**
   */
  public BunqRequestBody(MediaType contentType, int byteCount, int offset, byte[] content) {
    this.contentType = contentType;
    this.byteCount = byteCount;
    this.offset = offset;
    this.content = content;
    this.requestBody = create(contentType, content, offset, byteCount);
  }

  /**
   */
  public static BunqRequestBody create(final MediaType contentType, final byte[] content) {
    return new BunqRequestBody(contentType, content.length, 0, content);
  }

  /**
   */
  @Override
  public MediaType contentType() {
    return contentType;
  }

  /**
   */
  @Override
  public long contentLength() {
    return byteCount;
  }

  /**
   */
  @Override
  public void writeTo(BufferedSink sink) throws IOException {
    sink.write(content, offset, byteCount);
  }

  /**
   */
  public RequestBody getRequestBody() {
    return requestBody;
  }

  /**
   */
  public byte[] getContent() {
    return content;
  }
}
