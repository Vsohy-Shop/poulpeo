package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import okio.C13175w0;

public interface HttpStream {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    C13175w0 createRequestBody(Request request, long j);

    void finishRequest();

    ResponseBody openResponseBody(Response response);

    Response.Builder readResponseHeaders();

    void setHttpEngine(HttpEngine httpEngine);

    void writeRequestBody(RetryableSink retryableSink);

    void writeRequestHeaders(Request request);
}
