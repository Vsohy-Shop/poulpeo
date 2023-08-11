package okhttp3;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;
import p336ef.C11921v;
import p454wf.C13726d;

/* compiled from: ResponseBody.kt */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final C13130e source;

        public BomAwareReader(C13130e eVar, Charset charset2) {
            C12775o.m28639i(eVar, APIParams.SOURCE);
            C12775o.m28639i(charset2, "charset");
            this.source = eVar;
            this.charset = charset2;
        }

        public void close() {
            C11921v vVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                vVar = null;
            } else {
                reader.close();
                vVar = C11921v.f18618a;
            }
            if (vVar == null) {
                this.source.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            C12775o.m28639i(cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.mo52540r0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            C12775o.m28639i(str, "<this>");
            Charset charset = C13726d.f22152b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null);
                if (charset$default == null) {
                    MediaType.Companion companion = MediaType.Companion;
                    mediaType = companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            C13121c R0 = new C13121c().mo52504R0(str, charset);
            return create((C13130e) R0, mediaType, R0.size());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C13133f fVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C13130e eVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(eVar, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            C12775o.m28639i(bArr, "<this>");
            return create((C13130e) new C13121c().write(bArr), mediaType, (long) bArr.length);
        }

        public final ResponseBody create(C13133f fVar, MediaType mediaType) {
            C12775o.m28639i(fVar, "<this>");
            return create((C13130e) new C13121c().mo52517b0(fVar), mediaType, (long) fVar.mo52590H());
        }

        public final ResponseBody create(C13130e eVar, MediaType mediaType, long j) {
            C12775o.m28639i(eVar, "<this>");
            return new ResponseBody$Companion$asResponseBody$1(mediaType, j, eVar);
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            C12775o.m28639i(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            C12775o.m28639i(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, C13133f fVar) {
            C12775o.m28639i(fVar, "content");
            return create(fVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, C13130e eVar) {
            C12775o.m28639i(eVar, "content");
            return create(eVar, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType == null) {
            charset = null;
        } else {
            charset = contentType.charset(C13726d.f22152b);
        }
        if (charset == null) {
            return C13726d.f22152b;
        }
        return charset;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        kotlin.jvm.internal.C12773m.m28629b(1);
        p392mf.C12941b.m29245a(r2, r6);
        kotlin.jvm.internal.C12773m.m28628a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(kotlin.jvm.functions.Function1<? super okio.C13130e, ? extends T> r6, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r7) {
        /*
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0066
            okio.e r2 = r5.source()
            r3 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.C12773m.m28629b(r3)
            r4 = 0
            p392mf.C12941b.m29245a(r2, r4)
            kotlin.jvm.internal.C12773m.m28628a(r3)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            long r2 = (long) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0034
            goto L_0x0058
        L_0x0034:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L_0x0058:
            return r6
        L_0x0059:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005b }
        L_0x005b:
            r7 = move-exception
            kotlin.jvm.internal.C12773m.m28629b(r3)
            p392mf.C12941b.m29245a(r2, r6)
            kotlin.jvm.internal.C12773m.m28628a(r3)
            throw r7
        L_0x0066:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Cannot buffer entire body for content length: "
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = kotlin.jvm.internal.C12775o.m28647q(r7, r0)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public final InputStream byteStream() {
        return source().mo52540r0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        p392mf.C12941b.m29245a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okio.C13133f byteString() {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
            okio.e r2 = r6.source()
            okio.f r3 = r2.mo52498M()     // Catch:{ all -> 0x004c }
            r4 = 0
            p392mf.C12941b.m29245a(r2, r4)
            int r2 = r3.mo52590H()
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x004b
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            goto L_0x004b
        L_0x0027:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x004b:
            return r3
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            p392mf.C12941b.m29245a(r2, r0)
            throw r1
        L_0x0053:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = kotlin.jvm.internal.C12775o.m28647q(r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.byteString():okio.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        p392mf.C12941b.m29245a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            okio.e r2 = r6.source()
            byte[] r3 = r2.mo52548s()     // Catch:{ all -> 0x0049 }
            r4 = 0
            p392mf.C12941b.m29245a(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0048
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0024
            goto L_0x0048
        L_0x0024:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0048:
            return r3
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            p392mf.C12941b.m29245a(r2, r0)
            throw r1
        L_0x0050:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = kotlin.jvm.internal.C12775o.m28647q(r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.bytes():byte[]");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract C13130e source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p392mf.C12941b.m29245a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() {
        /*
            r3 = this;
            okio.e r0 = r3.source()
            java.nio.charset.Charset r1 = r3.charset()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = okhttp3.internal.Util.readBomAsCharset(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.mo52491I(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            p392mf.C12941b.m29245a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            p392mf.C12941b.m29245a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.string():java.lang.String");
    }

    public static final ResponseBody create(MediaType mediaType, long j, C13130e eVar) {
        return Companion.create(mediaType, j, eVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, C13133f fVar) {
        return Companion.create(mediaType, fVar);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(C13130e eVar, MediaType mediaType, long j) {
        return Companion.create(eVar, mediaType, j);
    }

    public static final ResponseBody create(C13133f fVar, MediaType mediaType) {
        return Companion.create(fVar, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
