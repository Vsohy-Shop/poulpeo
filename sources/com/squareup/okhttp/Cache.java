package com.squareup.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.StatusLine;
import com.squareup.okhttp.internal.p325io.FileSystem;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13148l;
import okio.C13150m;
import okio.C13175w0;
import okio.C13179y0;

public final class Cache {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    /* access modifiers changed from: private */
    public final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    private final class CacheRequestImpl implements CacheRequest {
        private C13175w0 body;
        private C13175w0 cacheOut;
        /* access modifiers changed from: private */
        public boolean done;
        private final DiskLruCache.Editor editor;

        public CacheRequestImpl(final DiskLruCache.Editor editor2) {
            this.editor = editor2;
            C13175w0 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new C13148l(newSink, Cache.this) {
                public void close() {
                    synchronized (Cache.this) {
                        if (!CacheRequestImpl.this.done) {
                            boolean unused = CacheRequestImpl.this.done = true;
                            Cache.access$808(Cache.this);
                            super.close();
                            editor2.commit();
                        }
                    }
                }
            };
        }

        public void abort() {
            synchronized (Cache.this) {
                if (!this.done) {
                    this.done = true;
                    Cache.access$908(Cache.this);
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
    }

    private static class CacheResponseBody extends ResponseBody {
        private final C13130e bodySource;
        private final String contentLength;
        private final String contentType;
        /* access modifiers changed from: private */
        public final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(final DiskLruCache.Snapshot snapshot2, String str, String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C13145j0.m29739d(new C13150m(snapshot2.getSource(1)) {
                public void close() {
                    snapshot2.close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            try {
                String str = this.contentLength;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        public C13130e source() {
            return this.bodySource;
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    static /* synthetic */ int access$808(Cache cache2) {
        int i = cache2.writeSuccessCount;
        cache2.writeSuccessCount = i + 1;
        return i;
    }

    static /* synthetic */ int access$908(Cache cache2) {
        int i = cache2.writeAbortCount;
        cache2.writeAbortCount = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals(ShareTarget.METHOD_GET) || OkHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(urlToKey(response.request()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
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

    /* access modifiers changed from: private */
    public static int readInt(C13130e eVar) {
        try {
            long z = eVar.mo52568z();
            String U = eVar.mo52507U();
            if (z >= 0 && z <= 2147483647L && U.isEmpty()) {
                return (int) z;
            }
            throw new IOException("expected an int but was \"" + z + U + AbstractDebugRequestMapper.QUOTE);
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void remove(Request request) {
        this.cache.remove(urlToKey(request));
    }

    /* access modifiers changed from: private */
    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    /* access modifiers changed from: private */
    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    /* access modifiers changed from: private */
    public void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
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
    }

    private static String urlToKey(Request request) {
        return Util.md5Hex(request.urlString());
    }

    public void close() {
        this.cache.close();
    }

    public void delete() {
        this.cache.delete();
    }

    public void evictAll() {
        this.cache.evictAll();
    }

    public void flush() {
        this.cache.flush();
    }

    /* access modifiers changed from: package-private */
    public Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(urlToKey(request));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(request, snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly((Closeable) response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly((Closeable) snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public File getDirectory() {
        return this.cache.getDirectory();
    }

    public synchronized int getHitCount() {
        return this.hitCount;
    }

    public long getMaxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int getNetworkCount() {
        return this.networkCount;
    }

    public synchronized int getRequestCount() {
        return this.requestCount;
    }

    public long getSize() {
        return this.cache.size();
    }

    public synchronized int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public void initialize() {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public Iterator<String> urls() {
        return new Iterator<String>() {
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            String nextUrl;

            {
                this.delegate = Cache.this.cache.snapshots();
            }

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = C13145j0.m29739d(next.getSource(0)).mo52507U();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }
        };
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            public Response get(Request request) {
                return Cache.this.get(request);
            }

            public CacheRequest put(Response response) {
                return Cache.this.put(response);
            }

            public void remove(Request request) {
                Cache.this.remove(request);
            }

            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    private static final class Entry {
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final String url;
        private final Headers varyHeaders;

        public Entry(C13179y0 y0Var) {
            try {
                C13130e d = C13145j0.m29739d(y0Var);
                this.url = d.mo52507U();
                this.requestMethod = d.mo52507U();
                Headers.Builder builder = new Headers.Builder();
                int access$1000 = Cache.readInt(d);
                for (int i = 0; i < access$1000; i++) {
                    builder.addLenient(d.mo52507U());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(d.mo52507U());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int access$10002 = Cache.readInt(d);
                for (int i2 = 0; i2 < access$10002; i2++) {
                    builder2.addLenient(d.mo52507U());
                }
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String U = d.mo52507U();
                    if (U.length() <= 0) {
                        this.handshake = Handshake.get(d.mo52507U(), readCertificateList(d), readCertificateList(d));
                    } else {
                        throw new IOException("expected \"\" but was \"" + U + AbstractDebugRequestMapper.QUOTE);
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                y0Var.close();
            }
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(C13130e eVar) {
            int access$1000 = Cache.readInt(eVar);
            if (access$1000 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(access$1000);
                for (int i = 0; i < access$1000; i++) {
                    String U = eVar.mo52507U();
                    C13121c cVar = new C13121c();
                    cVar.mo52517b0(C13133f.m29651c(U));
                    arrayList.add(instance.generateCertificate(cVar.mo52540r0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(C13127d dVar, List<Certificate> list) {
            try {
                dVar.mo52535o0((long) list.size());
                dVar.writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo52486F(C13133f.m29655v(list.get(i).getEncoded()).mo52597a());
                    dVar.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            if (!this.url.equals(request.urlString()) || !this.requestMethod.equals(request.method()) || !OkHeaders.varyMatches(response, this.varyHeaders, request)) {
                return false;
            }
            return true;
        }

        public Response response(Request request, DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).build();
        }

        public void writeTo(DiskLruCache.Editor editor) {
            C13127d c = C13145j0.m29738c(editor.newSink(0));
            c.mo52486F(this.url);
            c.writeByte(10);
            c.mo52486F(this.requestMethod);
            c.writeByte(10);
            c.mo52535o0((long) this.varyHeaders.size());
            c.writeByte(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                c.mo52486F(this.varyHeaders.name(i));
                c.mo52486F(": ");
                c.mo52486F(this.varyHeaders.value(i));
                c.writeByte(10);
            }
            c.mo52486F(new StatusLine(this.protocol, this.code, this.message).toString());
            c.writeByte(10);
            c.mo52535o0((long) this.responseHeaders.size());
            c.writeByte(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c.mo52486F(this.responseHeaders.name(i2));
                c.mo52486F(": ");
                c.mo52486F(this.responseHeaders.value(i2));
                c.writeByte(10);
            }
            if (isHttps()) {
                c.writeByte(10);
                c.mo52486F(this.handshake.cipherSuite());
                c.writeByte(10);
                writeCertList(c, this.handshake.peerCertificates());
                writeCertList(c, this.handshake.localCertificates());
            }
            c.close();
        }

        public Entry(Response response) {
            this.url = response.request().urlString();
            this.varyHeaders = OkHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
        }
    }
}
