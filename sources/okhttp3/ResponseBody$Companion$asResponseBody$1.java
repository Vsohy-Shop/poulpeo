package okhttp3;

import okio.C13130e;

/* compiled from: ResponseBody.kt */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C13130e $this_asResponseBody;

    ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, C13130e eVar) {
        this.$contentType = mediaType;
        this.$contentLength = j;
        this.$this_asResponseBody = eVar;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public C13130e source() {
        return this.$this_asResponseBody;
    }
}
