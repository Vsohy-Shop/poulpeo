package okio;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;

/* renamed from: okio.n */
/* compiled from: ForwardingTimeout.kt */
public class C13153n extends C13181z0 {

    /* renamed from: a */
    private C13181z0 f20935a;

    public C13153n(C13181z0 z0Var) {
        C12775o.m28639i(z0Var, "delegate");
        this.f20935a = z0Var;
    }

    /* renamed from: a */
    public final C13181z0 mo52667a() {
        return this.f20935a;
    }

    /* renamed from: b */
    public final C13153n mo52668b(C13181z0 z0Var) {
        C12775o.m28639i(z0Var, "delegate");
        this.f20935a = z0Var;
        return this;
    }

    public C13181z0 clearDeadline() {
        return this.f20935a.clearDeadline();
    }

    public C13181z0 clearTimeout() {
        return this.f20935a.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f20935a.deadlineNanoTime();
    }

    public boolean hasDeadline() {
        return this.f20935a.hasDeadline();
    }

    public void throwIfReached() {
        this.f20935a.throwIfReached();
    }

    public C13181z0 timeout(long j, TimeUnit timeUnit) {
        C12775o.m28639i(timeUnit, "unit");
        return this.f20935a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f20935a.timeoutNanos();
    }

    public C13181z0 deadlineNanoTime(long j) {
        return this.f20935a.deadlineNanoTime(j);
    }
}
