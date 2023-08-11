package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import okio.C13130e;

public final class RealResponseBody extends ResponseBody {
    private final Headers headers;
    private final C13130e source;

    public RealResponseBody(Headers headers2, C13130e eVar) {
        this.headers = headers2;
        this.source = eVar;
    }

    public long contentLength() {
        return OkHeaders.contentLength(this.headers);
    }

    public MediaType contentType() {
        String str = this.headers.get("Content-Type");
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public C13130e source() {
        return this.source;
    }
}
