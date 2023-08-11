package p466yf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yf.b0 */
/* compiled from: CompletionState.kt */
public class C13932b0 {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f22849b = AtomicIntegerFieldUpdater.newUpdater(C13932b0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f22850a;

    public C13932b0(Throwable th, boolean z) {
        this.f22850a = th;
        this._handled = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo53681a() {
        if (f22849b.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo53682b() {
        return f22849b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C14015p0.m32518a(this) + '[' + this.f22850a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13932b0(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
