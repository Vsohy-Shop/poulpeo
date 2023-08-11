package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.p405io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13148l;
import okio.C13150m;
import okio.C13175w0;
import okio.C13179y0;

/* compiled from: Cache.kt */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: Cache.kt */
    private static final class CacheResponseBody extends ResponseBody {
        private final C13130e bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot2, String str, String str2) {
            C12775o.m28639i(snapshot2, "snapshot");
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C13145j0.m29739d(new C13150m(snapshot2.getSource(1), this) {
                final /* synthetic */ C13179y0 $source;
                final /* synthetic */ CacheResponseBody this$0;

                {
                    this.$source = r1;
                    this.this$0 = r2;
                }

                public void close() {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1;
            }
            return Util.toLongOrDefault(str, -1);
        }

        public MediaType contentType() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return MediaType.Companion.parse(str);
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        public C13130e source() {
            return this.bodySource;
        }
    }

    /* compiled from: Cache.kt */
    private final class RealCacheRequest implements CacheRequest {
        private final C13175w0 body;
        private final C13175w0 cacheOut;
        private boolean done;
        /* access modifiers changed from: private */
        public final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor2) {
            C12775o.m28639i(cache, "this$0");
            C12775o.m28639i(editor2, "editor");
            this.this$0 = cache;
            this.editor = editor2;
            C13175w0 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new C13148l(newSink) {
                public void close() {
                    Cache cache = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (!realCacheRequest.getDone()) {
                            realCacheRequest.setDone(true);
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.editor.commit();
                        }
                    }
                }
            };
        }

        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (!getDone()) {
                    setDone(true);
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    Util.closeQuietly((Closeable) this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public C13175w0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        C12775o.m28639i(file, "directory");
        C12775o.m28639i(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m38752deprecated_directory() {
        return this.cache.getDirectory();
    }

    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        C12775o.m28639i(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody body = response.body();
                if (body != null) {
                    Util.closeQuietly((Closeable) body);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly((Closeable) snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        C12775o.m28639i(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C12775o.m28634d(method, ShareTarget.METHOD_GET)) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public final void remove$okhttp(Request request) {
        C12775o.m28639i(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        C12775o.m28639i(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editor;
        C12775o.m28639i(response, "cached");
        C12775o.m28639i(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                editor = ((CacheResponseBody) body).getSnapshot().edit();
                if (editor != null) {
                    try {
                        entry.writeTo(editor);
                        editor.commit();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
                editor = null;
                abortQuietly(editor);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    public final Iterator<String> urls() {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* compiled from: Cache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (C13754v.m31530r("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C13754v.m31531s(C12770k0.f20423a));
                    }
                    for (String N0 : C13755w.m31593s0(value, new char[]{','}, false, 0, 6, (Object) null)) {
                        treeSet.add(C13755w.m31561N0(N0).toString());
                    }
                }
                i = i2;
            }
            if (treeSet == null) {
                return C12731y0.m28551e();
            }
            return treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            C12775o.m28639i(response, "<this>");
            return varyFields(response.headers()).contains(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        public final String key(HttpUrl httpUrl) {
            C12775o.m28639i(httpUrl, "url");
            return C13133f.f20903e.mo52622d(httpUrl.toString()).mo52617u().mo52609l();
        }

        public final int readInt$okhttp(C13130e eVar) {
            boolean z;
            C12775o.m28639i(eVar, APIParams.SOURCE);
            try {
                long z2 = eVar.mo52568z();
                String U = eVar.mo52507U();
                if (z2 >= 0 && z2 <= 2147483647L) {
                    if (U.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return (int) z2;
                    }
                }
                throw new IOException("expected an int but was \"" + z2 + U + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            C12775o.m28639i(response, "<this>");
            Response networkResponse = response.networkResponse();
            C12775o.m28636f(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            C12775o.m28639i(response, "cachedResponse");
            C12775o.m28639i(headers, "cachedRequest");
            C12775o.m28639i(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!C12775o.m28634d(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
                i = i2;
            }
            return builder.build();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        C12775o.m28639i(file, "directory");
    }

    /* compiled from: Cache.kt */
    private static final class Entry {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* compiled from: Cache.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Platform.Companion companion = Platform.Companion;
            SENT_MILLIS = C12775o.m28647q(companion.get().getPrefix(), "-Sent-Millis");
            RECEIVED_MILLIS = C12775o.m28647q(companion.get().getPrefix(), "-Received-Millis");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
            p392mf.C12941b.m29245a(r10, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Entry(okio.C13179y0 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "rawSource"
                kotlin.jvm.internal.C12775o.m28639i(r10, r0)
                r9.<init>()
                okio.e r0 = okio.C13145j0.m29739d(r10)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.HttpUrl r2 = r2.parse(r1)     // Catch:{ all -> 0x0118 }
                if (r2 == 0) goto L_0x0100
                r9.url = r2     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                r9.requestMethod = r1     // Catch:{ all -> 0x0118 }
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch:{ all -> 0x0118 }
                r1.<init>()     // Catch:{ all -> 0x0118 }
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch:{ all -> 0x0118 }
                int r2 = r2.readInt$okhttp(r0)     // Catch:{ all -> 0x0118 }
                r3 = 0
                r4 = r3
            L_0x002d:
                if (r4 >= r2) goto L_0x0039
                int r4 = r4 + 1
                java.lang.String r5 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                r1.addLenient$okhttp(r5)     // Catch:{ all -> 0x0118 }
                goto L_0x002d
            L_0x0039:
                okhttp3.Headers r1 = r1.build()     // Catch:{ all -> 0x0118 }
                r9.varyHeaders = r1     // Catch:{ all -> 0x0118 }
                okhttp3.internal.http.StatusLine$Companion r1 = okhttp3.internal.http.StatusLine.Companion     // Catch:{ all -> 0x0118 }
                java.lang.String r2 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                okhttp3.internal.http.StatusLine r1 = r1.parse(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Protocol r2 = r1.protocol     // Catch:{ all -> 0x0118 }
                r9.protocol = r2     // Catch:{ all -> 0x0118 }
                int r2 = r1.code     // Catch:{ all -> 0x0118 }
                r9.code = r2     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r1.message     // Catch:{ all -> 0x0118 }
                r9.message = r1     // Catch:{ all -> 0x0118 }
                okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch:{ all -> 0x0118 }
                r1.<init>()     // Catch:{ all -> 0x0118 }
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch:{ all -> 0x0118 }
                int r2 = r2.readInt$okhttp(r0)     // Catch:{ all -> 0x0118 }
                r4 = r3
            L_0x0061:
                if (r4 >= r2) goto L_0x006d
                int r4 = r4 + 1
                java.lang.String r5 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                r1.addLenient$okhttp(r5)     // Catch:{ all -> 0x0118 }
                goto L_0x0061
            L_0x006d:
                java.lang.String r2 = SENT_MILLIS     // Catch:{ all -> 0x0118 }
                java.lang.String r4 = r1.get(r2)     // Catch:{ all -> 0x0118 }
                java.lang.String r5 = RECEIVED_MILLIS     // Catch:{ all -> 0x0118 }
                java.lang.String r6 = r1.get(r5)     // Catch:{ all -> 0x0118 }
                r1.removeAll(r2)     // Catch:{ all -> 0x0118 }
                r1.removeAll(r5)     // Catch:{ all -> 0x0118 }
                r7 = 0
                if (r4 != 0) goto L_0x0085
                r4 = r7
                goto L_0x0089
            L_0x0085:
                long r4 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0118 }
            L_0x0089:
                r9.sentRequestMillis = r4     // Catch:{ all -> 0x0118 }
                if (r6 != 0) goto L_0x008e
                goto L_0x0092
            L_0x008e:
                long r7 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x0118 }
            L_0x0092:
                r9.receivedResponseMillis = r7     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r1.build()     // Catch:{ all -> 0x0118 }
                r9.responseHeaders = r1     // Catch:{ all -> 0x0118 }
                boolean r1 = r9.isHttps()     // Catch:{ all -> 0x0118 }
                r2 = 0
                if (r1 == 0) goto L_0x00f8
                java.lang.String r1 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                int r4 = r1.length()     // Catch:{ all -> 0x0118 }
                if (r4 <= 0) goto L_0x00ac
                r3 = 1
            L_0x00ac:
                if (r3 != 0) goto L_0x00dc
                java.lang.String r1 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                okhttp3.CipherSuite$Companion r3 = okhttp3.CipherSuite.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.CipherSuite r1 = r3.forJavaName(r1)     // Catch:{ all -> 0x0118 }
                java.util.List r3 = r9.readCertificateList(r0)     // Catch:{ all -> 0x0118 }
                java.util.List r4 = r9.readCertificateList(r0)     // Catch:{ all -> 0x0118 }
                boolean r5 = r0.mo52552t()     // Catch:{ all -> 0x0118 }
                if (r5 != 0) goto L_0x00d1
                okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r0.mo52507U()     // Catch:{ all -> 0x0118 }
                okhttp3.TlsVersion r0 = r5.forJavaName(r0)     // Catch:{ all -> 0x0118 }
                goto L_0x00d3
            L_0x00d1:
                okhttp3.TlsVersion r0 = okhttp3.TlsVersion.SSL_3_0     // Catch:{ all -> 0x0118 }
            L_0x00d3:
                okhttp3.Handshake$Companion r5 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r5.get(r0, r1, r3, r4)     // Catch:{ all -> 0x0118 }
                r9.handshake = r0     // Catch:{ all -> 0x0118 }
                goto L_0x00fa
            L_0x00dc:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0118 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
                r2.<init>()     // Catch:{ all -> 0x0118 }
                java.lang.String r3 = "expected \"\" but was \""
                r2.append(r3)     // Catch:{ all -> 0x0118 }
                r2.append(r1)     // Catch:{ all -> 0x0118 }
                r1 = 34
                r2.append(r1)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0118 }
                r0.<init>(r1)     // Catch:{ all -> 0x0118 }
                throw r0     // Catch:{ all -> 0x0118 }
            L_0x00f8:
                r9.handshake = r2     // Catch:{ all -> 0x0118 }
            L_0x00fa:
                ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0118 }
                p392mf.C12941b.m29245a(r10, r2)
                return
            L_0x0100:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0118 }
                java.lang.String r2 = "Cache corruption for "
                java.lang.String r1 = kotlin.jvm.internal.C12775o.m28647q(r2, r1)     // Catch:{ all -> 0x0118 }
                r0.<init>(r1)     // Catch:{ all -> 0x0118 }
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0118 }
                okhttp3.internal.platform.Platform r1 = r1.get()     // Catch:{ all -> 0x0118 }
                java.lang.String r2 = "cache corruption"
                r3 = 5
                r1.log(r2, r3, r0)     // Catch:{ all -> 0x0118 }
                throw r0     // Catch:{ all -> 0x0118 }
            L_0x0118:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x011a }
            L_0x011a:
                r1 = move-exception
                p392mf.C12941b.m29245a(r10, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.<init>(okio.y0):void");
        }

        private final boolean isHttps() {
            return C12775o.m28634d(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(C13130e eVar) {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(eVar);
            if (readInt$okhttp == -1) {
                return C12726w.m28524k();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                int i = 0;
                while (i < readInt$okhttp) {
                    i++;
                    String U = eVar.mo52507U();
                    C13121c cVar = new C13121c();
                    C13133f a = C13133f.f20903e.mo52619a(U);
                    C12775o.m28636f(a);
                    cVar.mo52517b0(a);
                    arrayList.add(instance.generateCertificate(cVar.mo52540r0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(C13127d dVar, List<? extends Certificate> list) {
            try {
                dVar.mo52535o0((long) list.size()).writeByte(10);
                for (Certificate encoded : list) {
                    byte[] encoded2 = encoded.getEncoded();
                    C13133f.C13134a aVar = C13133f.f20903e;
                    C12775o.m28638h(encoded2, "bytes");
                    dVar.mo52486F(C13133f.C13134a.m29686g(aVar, encoded2, 0, 0, 3, (Object) null).mo52597a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            C12775o.m28639i(request, "request");
            C12775o.m28639i(response, "response");
            if (!C12775o.m28634d(this.url, request.url()) || !C12775o.m28634d(this.requestMethod, request.method()) || !Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return false;
            }
            return true;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            C12775o.m28639i(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x011a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x011b, code lost:
            p392mf.C12941b.m29245a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x011e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r8) {
            /*
                r7 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.C12775o.m28639i(r8, r0)
                r0 = 0
                okio.w0 r8 = r8.newSink(r0)
                okio.d r8 = okio.C13145j0.m29738c(r8)
                okhttp3.HttpUrl r1 = r7.url     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0118 }
                okio.d r1 = r8.mo52486F(r1)     // Catch:{ all -> 0x0118 }
                r2 = 10
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r7.requestMethod     // Catch:{ all -> 0x0118 }
                okio.d r1 = r8.mo52486F(r1)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
                long r3 = (long) r1     // Catch:{ all -> 0x0118 }
                okio.d r1 = r8.mo52535o0(r3)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
                r3 = r0
            L_0x003b:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x005e
                int r5 = r3 + 1
                okhttp3.Headers r6 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r6 = r6.name(r3)     // Catch:{ all -> 0x0118 }
                okio.d r6 = r8.mo52486F(r6)     // Catch:{ all -> 0x0118 }
                okio.d r4 = r6.mo52486F(r4)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r6 = r7.varyHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r3 = r6.value(r3)     // Catch:{ all -> 0x0118 }
                okio.d r3 = r4.mo52486F(r3)     // Catch:{ all -> 0x0118 }
                r3.writeByte(r2)     // Catch:{ all -> 0x0118 }
                r3 = r5
                goto L_0x003b
            L_0x005e:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine     // Catch:{ all -> 0x0118 }
                okhttp3.Protocol r3 = r7.protocol     // Catch:{ all -> 0x0118 }
                int r5 = r7.code     // Catch:{ all -> 0x0118 }
                java.lang.String r6 = r7.message     // Catch:{ all -> 0x0118 }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0118 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0118 }
                okio.d r1 = r8.mo52486F(r1)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x0118 }
                okio.d r1 = r8.mo52535o0(r5)     // Catch:{ all -> 0x0118 }
                r1.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r1 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                int r1 = r1.size()     // Catch:{ all -> 0x0118 }
            L_0x008a:
                if (r0 >= r1) goto L_0x00ab
                int r3 = r0 + 1
                okhttp3.Headers r5 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r5 = r5.name(r0)     // Catch:{ all -> 0x0118 }
                okio.d r5 = r8.mo52486F(r5)     // Catch:{ all -> 0x0118 }
                okio.d r5 = r5.mo52486F(r4)     // Catch:{ all -> 0x0118 }
                okhttp3.Headers r6 = r7.responseHeaders     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r6.value(r0)     // Catch:{ all -> 0x0118 }
                okio.d r0 = r5.mo52486F(r0)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                r0 = r3
                goto L_0x008a
            L_0x00ab:
                java.lang.String r0 = SENT_MILLIS     // Catch:{ all -> 0x0118 }
                okio.d r0 = r8.mo52486F(r0)     // Catch:{ all -> 0x0118 }
                okio.d r0 = r0.mo52486F(r4)     // Catch:{ all -> 0x0118 }
                long r5 = r7.sentRequestMillis     // Catch:{ all -> 0x0118 }
                okio.d r0 = r0.mo52535o0(r5)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = RECEIVED_MILLIS     // Catch:{ all -> 0x0118 }
                okio.d r0 = r8.mo52486F(r0)     // Catch:{ all -> 0x0118 }
                okio.d r0 = r0.mo52486F(r4)     // Catch:{ all -> 0x0118 }
                long r3 = r7.receivedResponseMillis     // Catch:{ all -> 0x0118 }
                okio.d r0 = r0.mo52535o0(r3)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                boolean r0 = r7.isHttps()     // Catch:{ all -> 0x0118 }
                if (r0 == 0) goto L_0x0111
                r8.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                kotlin.jvm.internal.C12775o.m28636f(r0)     // Catch:{ all -> 0x0118 }
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0118 }
                okio.d r0 = r8.mo52486F(r0)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                java.util.List r0 = r0.peerCertificates()     // Catch:{ all -> 0x0118 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                java.util.List r0 = r0.localCertificates()     // Catch:{ all -> 0x0118 }
                r7.writeCertList(r8, r0)     // Catch:{ all -> 0x0118 }
                okhttp3.Handshake r0 = r7.handshake     // Catch:{ all -> 0x0118 }
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch:{ all -> 0x0118 }
                java.lang.String r0 = r0.javaName()     // Catch:{ all -> 0x0118 }
                okio.d r0 = r8.mo52486F(r0)     // Catch:{ all -> 0x0118 }
                r0.writeByte(r2)     // Catch:{ all -> 0x0118 }
            L_0x0111:
                ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0118 }
                r0 = 0
                p392mf.C12941b.m29245a(r8, r0)
                return
            L_0x0118:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x011a }
            L_0x011a:
                r1 = move-exception
                p392mf.C12941b.m29245a(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.Entry.writeTo(okhttp3.internal.cache.DiskLruCache$Editor):void");
        }

        public Entry(Response response) {
            C12775o.m28639i(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
