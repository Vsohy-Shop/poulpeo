package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.b */
/* compiled from: Okio.kt */
final class C13117b implements C13175w0 {
    public C13181z0 timeout() {
        return C13181z0.NONE;
    }

    public void write(C13121c cVar, long j) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        cVar.skip(j);
    }

    public void close() {
    }

    public void flush() {
    }
}
