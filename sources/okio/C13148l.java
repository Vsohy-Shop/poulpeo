package okio;

import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.l */
/* compiled from: ForwardingSink.kt */
public abstract class C13148l implements C13175w0 {
    private final C13175w0 delegate;

    public C13148l(C13175w0 w0Var) {
        C12775o.m28639i(w0Var, "delegate");
        this.delegate = w0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C13175w0 m38877deprecated_delegate() {
        return this.delegate;
    }

    public void close() {
        this.delegate.close();
    }

    public final C13175w0 delegate() {
        return this.delegate;
    }

    public void flush() {
        this.delegate.flush();
    }

    public C13181z0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(C13121c cVar, long j) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        this.delegate.write(cVar, j);
    }
}
