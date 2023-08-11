package okhttp3;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.C13127d;
import okio.C13133f;

/* compiled from: MultipartBody.kt */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final C13133f boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* compiled from: MultipartBody.kt */
    public static final class Builder {
        private final C13133f boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public final Builder addFormDataPart(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            C12775o.m28639i(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType mediaType) {
            C12775o.m28639i(mediaType, JSONAPIResourceIdSerializer.FIELD_TYPE);
            if (C12775o.m28634d(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("multipart != ", mediaType).toString());
        }

        public Builder(String str) {
            C12775o.m28639i(str, "boundary");
            this.boundary = C13133f.f20903e.mo52622d(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            C12775o.m28639i(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            C12775o.m28639i(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.C12775o.m28638h(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            C12775o.m28639i(sb, "<this>");
            C12775o.m28639i(str, "key");
            sb.append('\"');
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
                i = i2;
            }
            sb.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class Part {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final RequestBody body;
        private final Headers headers;

        /* compiled from: MultipartBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                C12775o.m28639i(requestBody, "body");
                return create((Headers) null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
                C12775o.m28639i(str2, "value");
                return createFormData(str, (String) null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                String str;
                C12775o.m28639i(requestBody, "body");
                boolean z = true;
                if ((headers == null ? null : headers.get("Content-Type")) == null) {
                    if (headers == null) {
                        str = null;
                    } else {
                        str = headers.get("Content-Length");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        return new Part(headers, requestBody, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
                C12775o.m28639i(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String sb2 = sb.toString();
                C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2).build(), requestBody);
            }
        }

        public /* synthetic */ Part(Headers headers2, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers2, requestBody);
        }

        public static final Part create(Headers headers2, RequestBody requestBody) {
            return Companion.create(headers2, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m38823deprecated_body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m38824deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get(ShareTarget.ENCODING_TYPE_MULTIPART);
    }

    public MultipartBody(C13133f fVar, MediaType mediaType, List<Part> list) {
        C12775o.m28639i(fVar, "boundaryByteString");
        C12775o.m28639i(mediaType, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(list, "parts");
        this.boundaryByteString = fVar;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(mediaType + "; boundary=" + boundary());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: okio.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: okio.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long writeOrCountBytes(okio.C13127d r14, boolean r15) {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x0009
            okio.c r14 = new okio.c
            r14.<init>()
            r0 = r14
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r13.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00b0
            int r6 = r5 + 1
            java.util.List<okhttp3.MultipartBody$Part> r7 = r13.parts
            java.lang.Object r5 = r7.get(r5)
            okhttp3.MultipartBody$Part r5 = (okhttp3.MultipartBody.Part) r5
            okhttp3.Headers r7 = r5.headers()
            okhttp3.RequestBody r5 = r5.body()
            kotlin.jvm.internal.C12775o.m28636f(r14)
            byte[] r8 = DASHDASH
            r14.write(r8)
            okio.f r8 = r13.boundaryByteString
            r14.mo52517b0(r8)
            byte[] r8 = CRLF
            r14.write(r8)
            if (r7 == 0) goto L_0x0062
            int r8 = r7.size()
            r9 = r2
        L_0x0041:
            if (r9 >= r8) goto L_0x0062
            int r10 = r9 + 1
            java.lang.String r11 = r7.name(r9)
            okio.d r11 = r14.mo52486F(r11)
            byte[] r12 = COLONSPACE
            okio.d r11 = r11.write(r12)
            java.lang.String r9 = r7.value(r9)
            okio.d r9 = r11.mo52486F(r9)
            byte[] r11 = CRLF
            r9.write(r11)
            r9 = r10
            goto L_0x0041
        L_0x0062:
            okhttp3.MediaType r7 = r5.contentType()
            if (r7 == 0) goto L_0x007b
            java.lang.String r8 = "Content-Type: "
            okio.d r8 = r14.mo52486F(r8)
            java.lang.String r7 = r7.toString()
            okio.d r7 = r8.mo52486F(r7)
            byte[] r8 = CRLF
            r7.write(r8)
        L_0x007b:
            long r7 = r5.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0095
            java.lang.String r9 = "Content-Length: "
            okio.d r9 = r14.mo52486F(r9)
            okio.d r9 = r9.mo52535o0(r7)
            byte[] r10 = CRLF
            r9.write(r10)
            goto L_0x009e
        L_0x0095:
            if (r15 == 0) goto L_0x009e
            kotlin.jvm.internal.C12775o.m28636f(r0)
            r0.mo52514a()
            return r9
        L_0x009e:
            byte[] r9 = CRLF
            r14.write(r9)
            if (r15 == 0) goto L_0x00a7
            long r3 = r3 + r7
            goto L_0x00aa
        L_0x00a7:
            r5.writeTo(r14)
        L_0x00aa:
            r14.write(r9)
            r5 = r6
            goto L_0x0014
        L_0x00b0:
            kotlin.jvm.internal.C12775o.m28636f(r14)
            byte[] r1 = DASHDASH
            r14.write(r1)
            okio.f r2 = r13.boundaryByteString
            r14.mo52517b0(r2)
            r14.write(r1)
            byte[] r1 = CRLF
            r14.write(r1)
            if (r15 == 0) goto L_0x00d2
            kotlin.jvm.internal.C12775o.m28636f(r0)
            long r14 = r0.size()
            long r3 = r3 + r14
            r0.mo52514a()
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.writeOrCountBytes(okio.d, boolean):long");
    }

    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m38819deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m38820deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m38821deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m38822deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.mo52595N();
    }

    public long contentLength() {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes((C13127d) null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    public void writeTo(C13127d dVar) {
        C12775o.m28639i(dVar, "sink");
        writeOrCountBytes(dVar, false);
    }
}
