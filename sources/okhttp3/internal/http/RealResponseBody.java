package okhttp3.internal.http;

import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.C13130e;

/* compiled from: RealResponseBody.kt */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final C13130e source;

    public RealResponseBody(String str, long j, C13130e eVar) {
        C12775o.m28639i(eVar, APIParams.SOURCE);
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = eVar;
    }

    public long contentLength() {
        return this.contentLength;
    }

    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }

    public C13130e source() {
        return this.source;
    }
}
