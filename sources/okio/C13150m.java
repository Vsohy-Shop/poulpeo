package okio;

import kotlin.jvm.internal.C12775o;

/* renamed from: okio.m */
/* compiled from: ForwardingSource.kt */
public abstract class C13150m implements C13179y0 {
    private final C13179y0 delegate;

    public C13150m(C13179y0 y0Var) {
        C12775o.m28639i(y0Var, "delegate");
        this.delegate = y0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C13179y0 m38878deprecated_delegate() {
        return this.delegate;
    }

    public void close() {
        this.delegate.close();
    }

    public final C13179y0 delegate() {
        return this.delegate;
    }

    public long read(C13121c cVar, long j) {
        C12775o.m28639i(cVar, "sink");
        return this.delegate.read(cVar, j);
    }

    public C13181z0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
