package com.squareup.okhttp;

import androidx.core.app.NotificationCompat;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RetryableSink;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.io.IOException;
import java.net.ProtocolException;
import okio.C13175w0;

public class Call {
    volatile boolean canceled;
    /* access modifiers changed from: private */
    public final OkHttpClient client;
    HttpEngine engine;
    private boolean executed;
    Request originalRequest;

    class ApplicationInterceptorChain implements Interceptor.Chain {
        private final boolean forWebSocket;
        private final int index;
        private final Request request;

        ApplicationInterceptorChain(int i, Request request2, boolean z) {
            this.index = i;
            this.request = request2;
            this.forWebSocket = z;
        }

        public Connection connection() {
            return null;
        }

        public Response proceed(Request request2) {
            if (this.index >= Call.this.client.interceptors().size()) {
                return Call.this.getResponse(request2, this.forWebSocket);
            }
            ApplicationInterceptorChain applicationInterceptorChain = new ApplicationInterceptorChain(this.index + 1, request2, this.forWebSocket);
            Interceptor interceptor = Call.this.client.interceptors().get(this.index);
            Response intercept = interceptor.intercept(applicationInterceptorChain);
            if (intercept != null) {
                return intercept;
            }
            throw new NullPointerException("application interceptor " + interceptor + " returned null");
        }

        public Request request() {
            return this.request;
        }
    }

    final class AsyncCall extends NamedRunnable {
        private final boolean forWebSocket;
        private final Callback responseCallback;

        /* access modifiers changed from: package-private */
        public void cancel() {
            Call.this.cancel();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[SYNTHETIC, Splitter:B:14:0x003d] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005c A[Catch:{ all -> 0x0036 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void execute() {
            /*
                r5 = this;
                r0 = 0
                com.squareup.okhttp.Call r1 = com.squareup.okhttp.Call.this     // Catch:{ IOException -> 0x0038 }
                boolean r2 = r5.forWebSocket     // Catch:{ IOException -> 0x0038 }
                com.squareup.okhttp.Response r1 = r1.getResponseWithInterceptorChain(r2)     // Catch:{ IOException -> 0x0038 }
                com.squareup.okhttp.Call r2 = com.squareup.okhttp.Call.this     // Catch:{ IOException -> 0x0038 }
                boolean r0 = r2.canceled     // Catch:{ IOException -> 0x0038 }
                r2 = 1
                if (r0 == 0) goto L_0x0021
                com.squareup.okhttp.Callback r0 = r5.responseCallback     // Catch:{ IOException -> 0x0034 }
                com.squareup.okhttp.Call r1 = com.squareup.okhttp.Call.this     // Catch:{ IOException -> 0x0034 }
                com.squareup.okhttp.Request r1 = r1.originalRequest     // Catch:{ IOException -> 0x0034 }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0034 }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x0034 }
                r0.onFailure(r1, r3)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0026
            L_0x0021:
                com.squareup.okhttp.Callback r0 = r5.responseCallback     // Catch:{ IOException -> 0x0034 }
                r0.onResponse(r1)     // Catch:{ IOException -> 0x0034 }
            L_0x0026:
                com.squareup.okhttp.Call r0 = com.squareup.okhttp.Call.this
                com.squareup.okhttp.OkHttpClient r0 = r0.client
                com.squareup.okhttp.Dispatcher r0 = r0.getDispatcher()
                r0.finished((com.squareup.okhttp.Call.AsyncCall) r5)
                goto L_0x006f
            L_0x0034:
                r0 = move-exception
                goto L_0x003b
            L_0x0036:
                r0 = move-exception
                goto L_0x0070
            L_0x0038:
                r1 = move-exception
                r2 = r0
                r0 = r1
            L_0x003b:
                if (r2 == 0) goto L_0x005c
                java.util.logging.Logger r1 = com.squareup.okhttp.internal.Internal.logger     // Catch:{ all -> 0x0036 }
                java.util.logging.Level r2 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0036 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
                r3.<init>()     // Catch:{ all -> 0x0036 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0036 }
                com.squareup.okhttp.Call r4 = com.squareup.okhttp.Call.this     // Catch:{ all -> 0x0036 }
                java.lang.String r4 = r4.toLoggableString()     // Catch:{ all -> 0x0036 }
                r3.append(r4)     // Catch:{ all -> 0x0036 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0036 }
                r1.log(r2, r3, r0)     // Catch:{ all -> 0x0036 }
                goto L_0x0026
            L_0x005c:
                com.squareup.okhttp.Call r1 = com.squareup.okhttp.Call.this     // Catch:{ all -> 0x0036 }
                com.squareup.okhttp.internal.http.HttpEngine r2 = r1.engine     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0065
                com.squareup.okhttp.Request r1 = r1.originalRequest     // Catch:{ all -> 0x0036 }
                goto L_0x0069
            L_0x0065:
                com.squareup.okhttp.Request r1 = r2.getRequest()     // Catch:{ all -> 0x0036 }
            L_0x0069:
                com.squareup.okhttp.Callback r2 = r5.responseCallback     // Catch:{ all -> 0x0036 }
                r2.onFailure(r1, r0)     // Catch:{ all -> 0x0036 }
                goto L_0x0026
            L_0x006f:
                return
            L_0x0070:
                com.squareup.okhttp.Call r1 = com.squareup.okhttp.Call.this
                com.squareup.okhttp.OkHttpClient r1 = r1.client
                com.squareup.okhttp.Dispatcher r1 = r1.getDispatcher()
                r1.finished((com.squareup.okhttp.Call.AsyncCall) r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Call.AsyncCall.execute():void");
        }

        /* access modifiers changed from: package-private */
        public Call get() {
            return Call.this;
        }

        /* access modifiers changed from: package-private */
        public String host() {
            return Call.this.originalRequest.httpUrl().host();
        }

        /* access modifiers changed from: package-private */
        public Request request() {
            return Call.this.originalRequest;
        }

        /* access modifiers changed from: package-private */
        public Object tag() {
            return Call.this.originalRequest.tag();
        }

        private AsyncCall(Callback callback, boolean z) {
            super("OkHttp %s", Call.this.originalRequest.urlString());
            this.responseCallback = callback;
            this.forWebSocket = z;
        }
    }

    protected Call(OkHttpClient okHttpClient, Request request) {
        this.client = okHttpClient.copyWithDefaults();
        this.originalRequest = request;
    }

    /* access modifiers changed from: private */
    public Response getResponseWithInterceptorChain(boolean z) {
        return new ApplicationInterceptorChain(0, this.originalRequest, z).proceed(this.originalRequest);
    }

    /* access modifiers changed from: private */
    public String toLoggableString() {
        String str;
        if (this.canceled) {
            str = "canceled call";
        } else {
            str = NotificationCompat.CATEGORY_CALL;
        }
        HttpUrl resolve = this.originalRequest.httpUrl().resolve("/...");
        return str + " to " + resolve;
    }

    public void cancel() {
        this.canceled = true;
        HttpEngine httpEngine = this.engine;
        if (httpEngine != null) {
            httpEngine.cancel();
        }
    }

    public void enqueue(Callback callback) {
        enqueue(callback, false);
    }

    public Response execute() {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.client.getDispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain(false);
            if (responseWithInterceptorChain != null) {
                return responseWithInterceptorChain;
            }
            throw new IOException("Canceled");
        } finally {
            this.client.getDispatcher().finished(this);
        }
    }

    /* access modifiers changed from: package-private */
    public Response getResponse(Request request, boolean z) {
        boolean z2;
        Throwable th;
        StreamAllocation streamAllocation;
        RequestBody body = request.body();
        if (body != null) {
            Request.Builder newBuilder = request.newBuilder();
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
            request = newBuilder.build();
        }
        this.engine = new HttpEngine(this.client, request, false, false, z, (StreamAllocation) null, (RetryableSink) null, (Response) null);
        int i = 0;
        while (!this.canceled) {
            z2 = true;
            try {
                this.engine.sendRequest();
                this.engine.readResponse();
                Response response = this.engine.getResponse();
                Request followUpRequest = this.engine.followUpRequest();
                if (followUpRequest == null) {
                    if (!z) {
                        this.engine.releaseStreamAllocation();
                    }
                    return response;
                }
                StreamAllocation close = this.engine.close();
                i++;
                if (i <= 20) {
                    if (!this.engine.sameConnection(followUpRequest.httpUrl())) {
                        close.release();
                        streamAllocation = null;
                    } else {
                        streamAllocation = close;
                    }
                    this.engine = new HttpEngine(this.client, followUpRequest, false, false, z, streamAllocation, (RetryableSink) null, response);
                } else {
                    close.release();
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
            } catch (RequestException e) {
                throw e.getCause();
            } catch (RouteException e2) {
                HttpEngine recover = this.engine.recover(e2);
                if (recover != null) {
                    this.engine = recover;
                } else {
                    throw e2.getLastConnectException();
                }
            } catch (IOException e3) {
                HttpEngine recover2 = this.engine.recover(e3, (C13175w0) null);
                if (recover2 != null) {
                    this.engine = recover2;
                } else {
                    throw e3;
                }
            } catch (Throwable th2) {
                z2 = false;
                th = th2;
            }
        }
        this.engine.releaseStreamAllocation();
        throw new IOException("Canceled");
        if (z2) {
            this.engine.close().release();
        }
        throw th;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* access modifiers changed from: package-private */
    public Object tag() {
        return this.originalRequest.tag();
    }

    /* access modifiers changed from: package-private */
    public void enqueue(Callback callback, boolean z) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.client.getDispatcher().enqueue(new AsyncCall(callback, z));
    }
}
