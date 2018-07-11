package com.bunq.sdk.http;

import com.bunq.sdk.exception.BunqException;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BunqRequestBuilder extends Request.Builder {

  /**
   * Error constants.
   */
  private static final String ERROR_BODY_IS_OF_UNEXPECTED_INSTANCE = "Body is of unexpected instance.";

  private HttpUrl url;
  private HttpMethod method;
  private BunqRequestBody body;
  private List<BunqBasicHeader> allHeader;

  /**
   */
  public BunqRequestBuilder() {
    this.allHeader = new ArrayList<>();
  }

  /**
   */
  @Override
  public BunqRequestBuilder url(HttpUrl url) {
    this.url = url;

    return (BunqRequestBuilder) super.url(url);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder method(String method, RequestBody body) {
    RequestBody bodyToPassToSuper;

    if (body instanceof BunqRequestBody) {
      bodyToPassToSuper = ((BunqRequestBody) body).getRequestBody();
    } else if (body == null) {
      bodyToPassToSuper = null;
    } else {
      throw new BunqException(ERROR_BODY_IS_OF_UNEXPECTED_INSTANCE);
    }

    this.method = HttpMethod.createFromMethodString(method.toUpperCase());
    this.body = (BunqRequestBody) body;

    return (BunqRequestBuilder) super.method(method, bodyToPassToSuper);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder url(String url) {
    return (BunqRequestBuilder) super.url(url);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder url(URL url) {
    return (BunqRequestBuilder) super.url(url);
  }

  private void addToAllHeader(String name, String value) {
    BunqHeader header = BunqHeader.parseHeaderOrNull(name);

    if (header != null) {
      this.allHeader.add(new BunqBasicHeader(header, value));
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder header(String name, String value) {
    addToAllHeader(name, value);

    return (BunqRequestBuilder) super.header(name, value);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder addHeader(String name, String value) {
    addToAllHeader(name, value);

    return (BunqRequestBuilder) super.addHeader(name, value);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder removeHeader(String name) {
    List<BunqBasicHeader> allHeaderToRemove = new ArrayList<>();

    for (BunqBasicHeader basicHeader : this.allHeader) {
      if (basicHeader.getName().equals(name)) {
        allHeaderToRemove.add(basicHeader);
      }
    }

    this.allHeader.removeAll(allHeaderToRemove);

    return (BunqRequestBuilder) super.removeHeader(name);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder cacheControl(CacheControl cacheControl) {
    return (BunqRequestBuilder) super.cacheControl(cacheControl);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder get() {
    return (BunqRequestBuilder) super.get();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder head() {
    return (BunqRequestBuilder) super.head();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder post(RequestBody body) {
    return (BunqRequestBuilder) super.post(body);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder delete(RequestBody body) {
    return (BunqRequestBuilder) super.delete(body);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder delete() {
    return delete(BunqRequestBody.create(null, Util.EMPTY_BYTE_ARRAY));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder put(RequestBody body) {
    return (BunqRequestBuilder) super.put(body);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder patch(RequestBody body) {
    return (BunqRequestBuilder) super.patch(body);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public BunqRequestBuilder tag(Object tag) {
    return (BunqRequestBuilder) super.tag(tag);
  }

  /**
   */
  public HttpUrl getUrl() {
    return url;
  }

  /**
   */
  public HttpMethod getMethod() {
    return method;
  }

  /**
   */
  public BunqRequestBody getBody() {
    return body;
  }

  /**
   */
  public List<BunqBasicHeader> getAllHeader() {
    return this.allHeader;
  }
}
