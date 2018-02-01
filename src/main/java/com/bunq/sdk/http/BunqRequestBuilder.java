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

  private HttpUrl url;
  private HttpMethod method;
  private BunqRequestBody body;
  private List<BunqBasicHeader> allHeader;

  public BunqRequestBuilder() {
    this.allHeader = new ArrayList<>();
  }

  @Override
  public BunqRequestBuilder url(HttpUrl url) {
    this.url = url;

    return (BunqRequestBuilder) super.url(url);
  }

  @Override
  public BunqRequestBuilder method(String method, RequestBody body) {
    RequestBody bodyToPassTpSuper;

    if (body instanceof BunqRequestBody) {
      bodyToPassTpSuper = ((BunqRequestBody) body).getRequestBody();
    } else if (body == null) {
      bodyToPassTpSuper = null;
    } else {
      throw new BunqException("");
    }

    this.method = HttpMethod.createFromMethodString(method.toUpperCase());
    this.body = (BunqRequestBody) body;

    return (BunqRequestBuilder) super.method(method, bodyToPassTpSuper);
  }

  @Override
  public BunqRequestBuilder url(String url) {
    return (BunqRequestBuilder) super.url(url);
  }

  @Override
  public BunqRequestBuilder url(URL url) {
    return (BunqRequestBuilder) super.url(url);
  }

  @Override
  public BunqRequestBuilder header(String name, String value) {
    this.allHeader.add(new BunqBasicHeader(name, value));

    return (BunqRequestBuilder) super.header(name, value);
  }

  @Override
  public BunqRequestBuilder addHeader(String name, String value) {
    this.allHeader.add(new BunqBasicHeader(name, value));

    return (BunqRequestBuilder) super.addHeader(name, value);
  }

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

  @Override
  public BunqRequestBuilder cacheControl(CacheControl cacheControl) {
    return (BunqRequestBuilder) super.cacheControl(cacheControl);
  }

  @Override
  public BunqRequestBuilder get() {
    return (BunqRequestBuilder) super.get();
  }

  @Override
  public BunqRequestBuilder head() {
    return (BunqRequestBuilder) super.head();
  }

  @Override
  public BunqRequestBuilder post(RequestBody body) {
    return (BunqRequestBuilder) super.post(body);
  }

  @Override
  public BunqRequestBuilder delete(RequestBody body) {
    return (BunqRequestBuilder) super.delete(body);
  }

  @Override
  public BunqRequestBuilder delete() {
    return delete(BunqRequestBody.create(null, Util.EMPTY_BYTE_ARRAY));
  }

  @Override
  public BunqRequestBuilder put(RequestBody body) {
    return (BunqRequestBuilder) super.put(body);
  }

  @Override
  public BunqRequestBuilder patch(RequestBody body) {
    return (BunqRequestBuilder) super.patch(body);
  }

  @Override
  public BunqRequestBuilder tag(Object tag) {
    return (BunqRequestBuilder) super.tag(tag);
  }

  public HttpUrl getUrl() {
    return url;
  }

  public HttpMethod getMethod() {
    return method;
  }

  public BunqRequestBody getBody() {
    return body;
  }

  public List<BunqBasicHeader> getAllHeaderAsList() {
    return this.allHeader;
  }

  public BunqBasicHeader[] getAllHeaderAsArray() {
    return this.allHeader.toArray(new BunqBasicHeader[this.allHeader.size()]);
  }
}
