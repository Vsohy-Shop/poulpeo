package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.FramedStream;
import com.squareup.okhttp.internal.framed.Header;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.C13133f;
import okio.C13145j0;
import okio.C13150m;
import okio.C13175w0;
import okio.C13179y0;

public final class Http2xStream implements HttpStream {
    private static final C13133f CONNECTION;
    private static final C13133f ENCODING;
    private static final C13133f HOST;
    private static final List<C13133f> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<C13133f> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private static final C13133f KEEP_ALIVE;
    private static final C13133f PROXY_CONNECTION;
    private static final List<C13133f> SPDY_3_SKIPPED_REQUEST_HEADERS;
    private static final List<C13133f> SPDY_3_SKIPPED_RESPONSE_HEADERS;

    /* renamed from: TE */
    private static final C13133f f18177TE;
    private static final C13133f TRANSFER_ENCODING;
    private static final C13133f UPGRADE;
    private final FramedConnection framedConnection;
    private HttpEngine httpEngine;
    private FramedStream stream;
    /* access modifiers changed from: private */
    public final StreamAllocation streamAllocation;

    class StreamFinishingSource extends C13150m {
        public StreamFinishingSource(C13179y0 y0Var) {
            super(y0Var);
        }

        public void close() {
            Http2xStream.this.streamAllocation.streamFinished(Http2xStream.this);
            super.close();
        }
    }

    static {
        C13133f e = C13133f.m29652e("connection");
        CONNECTION = e;
        C13133f e2 = C13133f.m29652e("host");
        HOST = e2;
        C13133f e3 = C13133f.m29652e("keep-alive");
        KEEP_ALIVE = e3;
        C13133f e4 = C13133f.m29652e("proxy-connection");
        PROXY_CONNECTION = e4;
        C13133f e5 = C13133f.m29652e("transfer-encoding");
        TRANSFER_ENCODING = e5;
        C13133f e6 = C13133f.m29652e("te");
        f18177TE = e6;
        C13133f e7 = C13133f.m29652e("encoding");
        ENCODING = e7;
        C13133f e8 = C13133f.m29652e("upgrade");
        UPGRADE = e8;
        C13133f fVar = Header.TARGET_METHOD;
        C13133f fVar2 = Header.TARGET_PATH;
        C13133f fVar3 = Header.TARGET_SCHEME;
        C13133f fVar4 = Header.TARGET_AUTHORITY;
        C13133f fVar5 = Header.TARGET_HOST;
        C13133f fVar6 = Header.VERSION;
        SPDY_3_SKIPPED_REQUEST_HEADERS = Util.immutableList((T[]) new C13133f[]{e, e2, e3, e4, e5, fVar, fVar2, fVar3, fVar4, fVar5, fVar6});
        SPDY_3_SKIPPED_RESPONSE_HEADERS = Util.immutableList((T[]) new C13133f[]{e, e2, e3, e4, e5});
        HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList((T[]) new C13133f[]{e, e2, e3, e4, e6, e5, e7, e8, fVar, fVar2, fVar3, fVar4, fVar5, fVar6});
        HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList((T[]) new C13133f[]{e, e2, e3, e4, e6, e5, e7, e8});
    }

    public Http2xStream(StreamAllocation streamAllocation2, FramedConnection framedConnection2) {
        this.streamAllocation = streamAllocation2;
        this.framedConnection = framedConnection2;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_AUTHORITY, Util.hostHeader(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            C13133f e = C13133f.m29652e(headers.name(i).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(e)) {
                arrayList.add(new Header(e, headers.value(i)));
            }
        }
        return arrayList;
    }

    private static String joinOnNull(String str, String str2) {
        return str + 0 + str2;
    }

    public static Response.Builder readHttp2HeadersList(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        for (int i = 0; i < size; i++) {
            C13133f fVar = list.get(i).name;
            String N = list.get(i).value.mo52595N();
            if (fVar.equals(Header.RESPONSE_STATUS)) {
                str = N;
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(fVar)) {
                builder.add(fVar.mo52595N(), N);
            }
        }
        if (str != null) {
            StatusLine parse = StatusLine.parse("HTTP/1.1 " + str);
            return new Response.Builder().protocol(Protocol.HTTP_2).code(parse.code).message(parse.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static Response.Builder readSpdy3HeadersList(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            C13133f fVar = list.get(i).name;
            String N = list.get(i).value.mo52595N();
            int i2 = 0;
            while (i2 < N.length()) {
                int indexOf = N.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = N.length();
                }
                String substring = N.substring(i2, indexOf);
                if (fVar.equals(Header.RESPONSE_STATUS)) {
                    str = substring;
                } else if (fVar.equals(Header.VERSION)) {
                    str2 = substring;
                } else if (!SPDY_3_SKIPPED_RESPONSE_HEADERS.contains(fVar)) {
                    builder.add(fVar.mo52595N(), substring);
                }
                i2 = indexOf + 1;
            }
        }
        if (str != null) {
            StatusLine parse = StatusLine.parse(str2 + " " + str);
            return new Response.Builder().protocol(Protocol.SPDY_3).code(parse.code).message(parse.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<Header> spdy3HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 5);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        arrayList.add(new Header(Header.VERSION, "HTTP/1.1"));
        arrayList.add(new Header(Header.TARGET_HOST, Util.hostHeader(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            C13133f e = C13133f.m29652e(headers.name(i).toLowerCase(Locale.US));
            if (!SPDY_3_SKIPPED_REQUEST_HEADERS.contains(e)) {
                String value = headers.value(i);
                if (linkedHashSet.add(e)) {
                    arrayList.add(new Header(e, value));
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (((Header) arrayList.get(i2)).name.equals(e)) {
                            arrayList.set(i2, new Header(e, joinOnNull(((Header) arrayList.get(i2)).value.mo52595N(), value)));
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public void cancel() {
        FramedStream framedStream = this.stream;
        if (framedStream != null) {
            framedStream.closeLater(ErrorCode.CANCEL);
        }
    }

    public C13175w0 createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    public void finishRequest() {
        this.stream.getSink().close();
    }

    public ResponseBody openResponseBody(Response response) {
        return new RealResponseBody(response.headers(), C13145j0.m29739d(new StreamFinishingSource(this.stream.getSource())));
    }

    public Response.Builder readResponseHeaders() {
        if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
            return readHttp2HeadersList(this.stream.getResponseHeaders());
        }
        return readSpdy3HeadersList(this.stream.getResponseHeaders());
    }

    public void setHttpEngine(HttpEngine httpEngine2) {
        this.httpEngine = httpEngine2;
    }

    public void writeRequestBody(RetryableSink retryableSink) {
        retryableSink.writeToSocket(this.stream.getSink());
    }

    public void writeRequestHeaders(Request request) {
        List<Header> list;
        if (this.stream == null) {
            this.httpEngine.writingRequestHeaders();
            boolean permitsRequestBody = this.httpEngine.permitsRequestBody(request);
            if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
                list = http2HeadersList(request);
            } else {
                list = spdy3HeadersList(request);
            }
            FramedStream newStream = this.framedConnection.newStream(list, permitsRequestBody, true);
            this.stream = newStream;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            newStream.readTimeout().timeout((long) this.httpEngine.client.getReadTimeout(), timeUnit);
            this.stream.writeTimeout().timeout((long) this.httpEngine.client.getWriteTimeout(), timeUnit);
        }
    }
}
