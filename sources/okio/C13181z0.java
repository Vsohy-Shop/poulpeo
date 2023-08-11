package okio;

import androidx.compose.animation.core.AnimationKt;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/* renamed from: okio.z0 */
/* compiled from: Timeout.kt */
public class C13181z0 {
    public static final C13183b Companion = new C13183b((DefaultConstructorMarker) null);
    public static final C13181z0 NONE = new C13182a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: okio.z0$b */
    /* compiled from: Timeout.kt */
    public static final class C13183b {
        private C13183b() {
        }

        public /* synthetic */ C13183b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo52729a(long j, long j2) {
            if (j != 0 && (j2 == 0 || j < j2)) {
                return j;
            }
            return j2;
        }
    }

    public final void awaitSignal(Condition condition) {
        C12775o.m28639i(condition, "condition");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    condition.await(timeoutNanos2, TimeUnit.NANOSECONDS);
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            condition.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C13181z0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C13181z0 clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final C13181z0 deadline(long j, TimeUnit timeUnit) {
        boolean z;
        C12775o.m28639i(timeUnit, "unit");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(C13181z0 z0Var, C13074a<? extends T> aVar) {
        C12775o.m28639i(z0Var, "other");
        C12775o.m28639i(aVar, "block");
        long timeoutNanos2 = timeoutNanos();
        long a = Companion.mo52729a(z0Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime2 = deadlineNanoTime();
            if (z0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), z0Var.deadlineNanoTime()));
            }
            try {
                T invoke = aVar.invoke();
                C12773m.m28629b(1);
                timeout(timeoutNanos2, timeUnit);
                if (z0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                C12773m.m28628a(1);
                return invoke;
            } catch (Throwable th) {
                C12773m.m28629b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (z0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                C12773m.m28628a(1);
                throw th;
            }
        } else {
            if (z0Var.hasDeadline()) {
                deadlineNanoTime(z0Var.deadlineNanoTime());
            }
            try {
                T invoke2 = aVar.invoke();
                C12773m.m28629b(1);
                timeout(timeoutNanos2, timeUnit);
                if (z0Var.hasDeadline()) {
                    clearDeadline();
                }
                C12773m.m28628a(1);
                return invoke2;
            } catch (Throwable th2) {
                C12773m.m28629b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (z0Var.hasDeadline()) {
                    clearDeadline();
                }
                C12773m.m28628a(1);
                throw th2;
            }
        }
    }

    public void throwIfReached() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C13181z0 timeout(long j, TimeUnit timeUnit) {
        boolean z;
        C12775o.m28639i(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) {
        C12775o.m28639i(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / AnimationKt.MillisToNanos;
                    obj.wait(j2, (int) (timeoutNanos2 - (AnimationKt.MillisToNanos * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C13181z0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    /* renamed from: okio.z0$a */
    /* compiled from: Timeout.kt */
    public static final class C13182a extends C13181z0 {
        C13182a() {
        }

        public C13181z0 timeout(long j, TimeUnit timeUnit) {
            C12775o.m28639i(timeUnit, "unit");
            return this;
        }

        public void throwIfReached() {
        }

        public C13181z0 deadlineNanoTime(long j) {
            return this;
        }
    }
}
