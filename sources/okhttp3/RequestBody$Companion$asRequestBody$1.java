package okhttp3;

import java.io.File;

/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ File $this_asRequestBody;

    RequestBody$Companion$asRequestBody$1(MediaType mediaType, File file) {
        this.$contentType = mediaType;
        this.$this_asRequestBody = file;
    }

    public long contentLength() {
        return this.$this_asRequestBody.length();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        p392mf.C12941b.m29245a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(okio.C13127d r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.io.File r0 = r2.$this_asRequestBody
            okio.y0 r0 = okio.C13145j0.m29746k(r0)
            r3.mo52494K(r0)     // Catch:{ all -> 0x0013 }
            r3 = 0
            p392mf.C12941b.m29245a(r0, r3)
            return
        L_0x0013:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            p392mf.C12941b.m29245a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody$Companion$asRequestBody$1.writeTo(okio.d):void");
    }
}
