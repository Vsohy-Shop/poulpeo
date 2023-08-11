package com.squareup.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.squareup.okhttp.internal.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.C13127d;
import okio.C13133f;

public final class MultipartBuilder {
    public static final MediaType ALTERNATIVE = MediaType.parse("multipart/alternative");
    /* access modifiers changed from: private */
    public static final byte[] COLONSPACE = {58, 32};
    /* access modifiers changed from: private */
    public static final byte[] CRLF = {13, 10};
    /* access modifiers changed from: private */
    public static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.parse("multipart/digest");
    public static final MediaType FORM = MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART);
    public static final MediaType MIXED = MediaType.parse("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.parse("multipart/parallel");
    private final C13133f boundary;
    private final List<RequestBody> partBodies;
    private final List<Headers> partHeaders;
    private MediaType type;

    private static final class MultipartRequestBody extends RequestBody {
        private final C13133f boundary;
        private long contentLength = -1;
        private final MediaType contentType;
        private final List<RequestBody> partBodies;
        private final List<Headers> partHeaders;

        public MultipartRequestBody(MediaType mediaType, C13133f fVar, List<Headers> list, List<RequestBody> list2) {
            if (mediaType != null) {
                this.boundary = fVar;
                this.contentType = MediaType.parse(mediaType + "; boundary=" + fVar.mo52595N());
                this.partHeaders = Util.immutableList(list);
                this.partBodies = Util.immutableList(list2);
                return;
            }
            throw new NullPointerException("type == null");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: okio.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: okio.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long writeOrCountBytes(okio.C13127d r13, boolean r14) {
            /*
                r12 = this;
                if (r14 == 0) goto L_0x0009
                okio.c r13 = new okio.c
                r13.<init>()
                r0 = r13
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                java.util.List<com.squareup.okhttp.Headers> r1 = r12.partHeaders
                int r1 = r1.size()
                r2 = 0
                r3 = 0
                r5 = r2
            L_0x0014:
                if (r5 >= r1) goto L_0x00c2
                java.util.List<com.squareup.okhttp.Headers> r6 = r12.partHeaders
                java.lang.Object r6 = r6.get(r5)
                com.squareup.okhttp.Headers r6 = (com.squareup.okhttp.Headers) r6
                java.util.List<com.squareup.okhttp.RequestBody> r7 = r12.partBodies
                java.lang.Object r7 = r7.get(r5)
                com.squareup.okhttp.RequestBody r7 = (com.squareup.okhttp.RequestBody) r7
                byte[] r8 = com.squareup.okhttp.MultipartBuilder.DASHDASH
                r13.write(r8)
                okio.f r8 = r12.boundary
                r13.mo52517b0(r8)
                byte[] r8 = com.squareup.okhttp.MultipartBuilder.CRLF
                r13.write(r8)
                if (r6 == 0) goto L_0x0064
                int r8 = r6.size()
                r9 = r2
            L_0x0040:
                if (r9 >= r8) goto L_0x0064
                java.lang.String r10 = r6.name(r9)
                okio.d r10 = r13.mo52486F(r10)
                byte[] r11 = com.squareup.okhttp.MultipartBuilder.COLONSPACE
                okio.d r10 = r10.write(r11)
                java.lang.String r11 = r6.value(r9)
                okio.d r10 = r10.mo52486F(r11)
                byte[] r11 = com.squareup.okhttp.MultipartBuilder.CRLF
                r10.write(r11)
                int r9 = r9 + 1
                goto L_0x0040
            L_0x0064:
                com.squareup.okhttp.MediaType r6 = r7.contentType()
                if (r6 == 0) goto L_0x007f
                java.lang.String r8 = "Content-Type: "
                okio.d r8 = r13.mo52486F(r8)
                java.lang.String r6 = r6.toString()
                okio.d r6 = r8.mo52486F(r6)
                byte[] r8 = com.squareup.okhttp.MultipartBuilder.CRLF
                r6.write(r8)
            L_0x007f:
                long r6 = r7.contentLength()
                r8 = -1
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x009b
                java.lang.String r8 = "Content-Length: "
                okio.d r8 = r13.mo52486F(r8)
                okio.d r8 = r8.mo52535o0(r6)
                byte[] r9 = com.squareup.okhttp.MultipartBuilder.CRLF
                r8.write(r9)
                goto L_0x00a1
            L_0x009b:
                if (r14 == 0) goto L_0x00a1
                r0.mo52514a()
                return r8
            L_0x00a1:
                byte[] r8 = com.squareup.okhttp.MultipartBuilder.CRLF
                r13.write(r8)
                if (r14 == 0) goto L_0x00ac
                long r3 = r3 + r6
                goto L_0x00b7
            L_0x00ac:
                java.util.List<com.squareup.okhttp.RequestBody> r6 = r12.partBodies
                java.lang.Object r6 = r6.get(r5)
                com.squareup.okhttp.RequestBody r6 = (com.squareup.okhttp.RequestBody) r6
                r6.writeTo(r13)
            L_0x00b7:
                byte[] r6 = com.squareup.okhttp.MultipartBuilder.CRLF
                r13.write(r6)
                int r5 = r5 + 1
                goto L_0x0014
            L_0x00c2:
                byte[] r1 = com.squareup.okhttp.MultipartBuilder.DASHDASH
                r13.write(r1)
                okio.f r1 = r12.boundary
                r13.mo52517b0(r1)
                byte[] r1 = com.squareup.okhttp.MultipartBuilder.DASHDASH
                r13.write(r1)
                byte[] r1 = com.squareup.okhttp.MultipartBuilder.CRLF
                r13.write(r1)
                if (r14 == 0) goto L_0x00e6
                long r13 = r0.size()
                long r3 = r3 + r13
                r0.mo52514a()
            L_0x00e6:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.MultipartBuilder.MultipartRequestBody.writeOrCountBytes(okio.d, boolean):long");
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

        public void writeTo(C13127d dVar) {
            writeOrCountBytes(dVar, false);
        }
    }

    public MultipartBuilder() {
        this(UUID.randomUUID().toString());
    }

    private static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    public MultipartBuilder addFormDataPart(String str, String str2) {
        return addFormDataPart(str, (String) null, RequestBody.create((MediaType) null, str2));
    }

    public MultipartBuilder addPart(RequestBody requestBody) {
        return addPart((Headers) null, requestBody);
    }

    public RequestBody build() {
        if (!this.partHeaders.isEmpty()) {
            return new MultipartRequestBody(this.type, this.boundary, this.partHeaders, this.partBodies);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }

    public MultipartBuilder type(MediaType mediaType) {
        if (mediaType == null) {
            throw new NullPointerException("type == null");
        } else if (mediaType.type().equals("multipart")) {
            this.type = mediaType;
            return this;
        } else {
            throw new IllegalArgumentException("multipart != " + mediaType);
        }
    }

    public MultipartBuilder(String str) {
        this.type = MIXED;
        this.partHeaders = new ArrayList();
        this.partBodies = new ArrayList();
        this.boundary = C13133f.m29652e(str);
    }

    public MultipartBuilder addFormDataPart(String str, String str2, RequestBody requestBody) {
        if (str != null) {
            StringBuilder sb = new StringBuilder("form-data; name=");
            appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                appendQuotedString(sb, str2);
            }
            return addPart(Headers.m25116of("Content-Disposition", sb.toString()), requestBody);
        }
        throw new NullPointerException("name == null");
    }

    public MultipartBuilder addPart(Headers headers, RequestBody requestBody) {
        if (requestBody == null) {
            throw new NullPointerException("body == null");
        } else if (headers != null && headers.get("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (headers == null || headers.get("Content-Length") == null) {
            this.partHeaders.add(headers);
            this.partBodies.add(requestBody);
            return this;
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }
}
