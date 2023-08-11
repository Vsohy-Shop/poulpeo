package okhttp3.internal.http;

import okhttp3.Interceptor;

/* compiled from: CallServerInterceptor.kt */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        boolean z;
        if (i == 100) {
            return true;
        }
        if (102 > i || i >= 200) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r3.isDuplex() == false) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9 A[SYNTHETIC, Splitter:B:40:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0 A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0164 A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167 A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0171 A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.C12775o.m28639i(r14, r2)
            okhttp3.internal.http.RealInterceptorChain r14 = (okhttp3.internal.http.RealInterceptorChain) r14
            okhttp3.internal.connection.Exchange r2 = r14.getExchange$okhttp()
            kotlin.jvm.internal.C12775o.m28636f(r2)
            okhttp3.Request r14 = r14.getRequest$okhttp()
            okhttp3.RequestBody r3 = r14.body()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 1
            r8 = 0
            r2.writeRequestHeaders(r14)     // Catch:{ IOException -> 0x009a }
            java.lang.String r9 = r14.method()     // Catch:{ IOException -> 0x009a }
            boolean r9 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r9)     // Catch:{ IOException -> 0x009a }
            if (r9 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0086
            java.lang.String r9 = "100-continue"
            java.lang.String r10 = "Expect"
            java.lang.String r10 = r14.header(r10)     // Catch:{ IOException -> 0x009a }
            boolean r9 = p454wf.C13754v.m31530r(r9, r10, r7)     // Catch:{ IOException -> 0x009a }
            if (r9 == 0) goto L_0x004d
            r2.flushRequest()     // Catch:{ IOException -> 0x009a }
            okhttp3.Response$Builder r9 = r2.readResponseHeaders(r7)     // Catch:{ IOException -> 0x009a }
            r2.responseHeadersStart()     // Catch:{ IOException -> 0x004a }
            r10 = r6
            goto L_0x004f
        L_0x004a:
            r3 = move-exception
            r10 = r7
            goto L_0x009d
        L_0x004d:
            r10 = r7
            r9 = r8
        L_0x004f:
            if (r9 != 0) goto L_0x0075
            boolean r11 = r3.isDuplex()     // Catch:{ IOException -> 0x0098 }
            if (r11 == 0) goto L_0x0066
            r2.flushRequest()     // Catch:{ IOException -> 0x0098 }
            okio.w0 r11 = r2.createRequestBody(r14, r7)     // Catch:{ IOException -> 0x0098 }
            okio.d r11 = okio.C13145j0.m29738c(r11)     // Catch:{ IOException -> 0x0098 }
            r3.writeTo(r11)     // Catch:{ IOException -> 0x0098 }
            goto L_0x008b
        L_0x0066:
            okio.w0 r11 = r2.createRequestBody(r14, r6)     // Catch:{ IOException -> 0x0098 }
            okio.d r11 = okio.C13145j0.m29738c(r11)     // Catch:{ IOException -> 0x0098 }
            r3.writeTo(r11)     // Catch:{ IOException -> 0x0098 }
            r11.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x008b
        L_0x0075:
            r2.noRequestBody()     // Catch:{ IOException -> 0x0098 }
            okhttp3.internal.connection.RealConnection r11 = r2.getConnection$okhttp()     // Catch:{ IOException -> 0x0098 }
            boolean r11 = r11.isMultiplexed$okhttp()     // Catch:{ IOException -> 0x0098 }
            if (r11 != 0) goto L_0x008b
            r2.noNewExchangesOnConnection()     // Catch:{ IOException -> 0x0098 }
            goto L_0x008b
        L_0x0086:
            r2.noRequestBody()     // Catch:{ IOException -> 0x009a }
            r10 = r7
            r9 = r8
        L_0x008b:
            if (r3 == 0) goto L_0x0093
            boolean r3 = r3.isDuplex()     // Catch:{ IOException -> 0x0098 }
            if (r3 != 0) goto L_0x0096
        L_0x0093:
            r2.finishRequest()     // Catch:{ IOException -> 0x0098 }
        L_0x0096:
            r3 = r8
            goto L_0x00a7
        L_0x0098:
            r3 = move-exception
            goto L_0x009d
        L_0x009a:
            r3 = move-exception
            r10 = r7
            r9 = r8
        L_0x009d:
            boolean r11 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r11 != 0) goto L_0x01a9
            boolean r11 = r2.getHasFailure$okhttp()
            if (r11 == 0) goto L_0x01a8
        L_0x00a7:
            if (r9 != 0) goto L_0x00b6
            okhttp3.Response$Builder r9 = r2.readResponseHeaders(r6)     // Catch:{ IOException -> 0x01a0 }
            kotlin.jvm.internal.C12775o.m28636f(r9)     // Catch:{ IOException -> 0x01a0 }
            if (r10 == 0) goto L_0x00b6
            r2.responseHeadersStart()     // Catch:{ IOException -> 0x01a0 }
            r10 = r6
        L_0x00b6:
            okhttp3.Response$Builder r9 = r9.request(r14)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.internal.connection.RealConnection r11 = r2.getConnection$okhttp()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Handshake r11 = r11.handshake()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r9 = r9.handshake(r11)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r9 = r9.sentRequestAtMillis(r4)     // Catch:{ IOException -> 0x01a0 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r9 = r9.receivedResponseAtMillis(r11)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response r9 = r9.build()     // Catch:{ IOException -> 0x01a0 }
            int r11 = r9.code()     // Catch:{ IOException -> 0x01a0 }
            boolean r12 = r13.shouldIgnoreAndWaitForRealResponse(r11)     // Catch:{ IOException -> 0x01a0 }
            if (r12 == 0) goto L_0x0110
            okhttp3.Response$Builder r6 = r2.readResponseHeaders(r6)     // Catch:{ IOException -> 0x01a0 }
            kotlin.jvm.internal.C12775o.m28636f(r6)     // Catch:{ IOException -> 0x01a0 }
            if (r10 == 0) goto L_0x00ec
            r2.responseHeadersStart()     // Catch:{ IOException -> 0x01a0 }
        L_0x00ec:
            okhttp3.Response$Builder r14 = r6.request(r14)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.internal.connection.RealConnection r6 = r2.getConnection$okhttp()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Handshake r6 = r6.handshake()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r14 = r14.handshake(r6)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r14 = r14.sentRequestAtMillis(r4)     // Catch:{ IOException -> 0x01a0 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r14 = r14.receivedResponseAtMillis(r4)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response r9 = r14.build()     // Catch:{ IOException -> 0x01a0 }
            int r11 = r9.code()     // Catch:{ IOException -> 0x01a0 }
        L_0x0110:
            r2.responseHeadersEnd(r9)     // Catch:{ IOException -> 0x01a0 }
            boolean r14 = r13.forWebSocket     // Catch:{ IOException -> 0x01a0 }
            if (r14 == 0) goto L_0x012a
            r14 = 101(0x65, float:1.42E-43)
            if (r11 != r14) goto L_0x012a
            okhttp3.Response$Builder r14 = r9.newBuilder()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.ResponseBody r4 = okhttp3.internal.Util.EMPTY_RESPONSE     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r14 = r14.body(r4)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response r14 = r14.build()     // Catch:{ IOException -> 0x01a0 }
            goto L_0x013a
        L_0x012a:
            okhttp3.Response$Builder r14 = r9.newBuilder()     // Catch:{ IOException -> 0x01a0 }
            okhttp3.ResponseBody r4 = r2.openResponseBody(r9)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response$Builder r14 = r14.body(r4)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.Response r14 = r14.build()     // Catch:{ IOException -> 0x01a0 }
        L_0x013a:
            okhttp3.Request r4 = r14.request()     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r4 = r4.header(r0)     // Catch:{ IOException -> 0x01a0 }
            boolean r4 = p454wf.C13754v.m31530r(r1, r4, r7)     // Catch:{ IOException -> 0x01a0 }
            if (r4 != 0) goto L_0x0153
            r4 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r14, r0, r8, r4, r8)     // Catch:{ IOException -> 0x01a0 }
            boolean r0 = p454wf.C13754v.m31530r(r1, r0, r7)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x0156
        L_0x0153:
            r2.noNewExchangesOnConnection()     // Catch:{ IOException -> 0x01a0 }
        L_0x0156:
            r0 = 204(0xcc, float:2.86E-43)
            if (r11 == r0) goto L_0x015e
            r0 = 205(0xcd, float:2.87E-43)
            if (r11 != r0) goto L_0x019f
        L_0x015e:
            okhttp3.ResponseBody r0 = r14.body()     // Catch:{ IOException -> 0x01a0 }
            if (r0 != 0) goto L_0x0167
            r0 = -1
            goto L_0x016b
        L_0x0167:
            long r0 = r0.contentLength()     // Catch:{ IOException -> 0x01a0 }
        L_0x016b:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x01a0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a0 }
            r1.<init>()     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r2 = "HTTP "
            r1.append(r2)     // Catch:{ IOException -> 0x01a0 }
            r1.append(r11)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch:{ IOException -> 0x01a0 }
            okhttp3.ResponseBody r14 = r14.body()     // Catch:{ IOException -> 0x01a0 }
            if (r14 != 0) goto L_0x018c
            goto L_0x0194
        L_0x018c:
            long r4 = r14.contentLength()     // Catch:{ IOException -> 0x01a0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x01a0 }
        L_0x0194:
            r1.append(r8)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r14 = r1.toString()     // Catch:{ IOException -> 0x01a0 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x01a0 }
            throw r0     // Catch:{ IOException -> 0x01a0 }
        L_0x019f:
            return r14
        L_0x01a0:
            r14 = move-exception
            if (r3 == 0) goto L_0x01a7
            p336ef.C11894b.m25683a(r3, r14)
            throw r3
        L_0x01a7:
            throw r14
        L_0x01a8:
            throw r3
        L_0x01a9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
