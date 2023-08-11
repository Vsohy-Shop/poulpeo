package okhttp3;

import kotlin.jvm.internal.C12775o;
import okio.C13127d;

/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    final /* synthetic */ int $byteCount;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ int $offset;
    final /* synthetic */ byte[] $this_toRequestBody;

    RequestBody$Companion$toRequestBody$2(MediaType mediaType, int i, byte[] bArr, int i2) {
        this.$contentType = mediaType;
        this.$byteCount = i;
        this.$this_toRequestBody = bArr;
        this.$offset = i2;
    }

    public long contentLength() {
        return (long) this.$byteCount;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(C13127d dVar) {
        C12775o.m28639i(dVar, "sink");
        dVar.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
    }
}
