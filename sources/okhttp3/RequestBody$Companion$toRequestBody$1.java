package okhttp3;

import kotlin.jvm.internal.C12775o;
import okio.C13127d;
import okio.C13133f;

/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C13133f $this_toRequestBody;

    RequestBody$Companion$toRequestBody$1(MediaType mediaType, C13133f fVar) {
        this.$contentType = mediaType;
        this.$this_toRequestBody = fVar;
    }

    public long contentLength() {
        return (long) this.$this_toRequestBody.mo52590H();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(C13127d dVar) {
        C12775o.m28639i(dVar, "sink");
        dVar.mo52517b0(this.$this_toRequestBody);
    }
}
