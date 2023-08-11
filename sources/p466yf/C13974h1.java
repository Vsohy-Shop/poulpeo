package p466yf;

import androidx.core.location.LocationRequestCompat;
import kotlin.collections.C12699k;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11847o;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* renamed from: yf.h1 */
/* compiled from: EventLoop.common.kt */
public abstract class C13974h1 extends C13971h0 {

    /* renamed from: b */
    private long f22903b;

    /* renamed from: c */
    private boolean f22904c;

    /* renamed from: d */
    private C12699k<C14053y0<?>> f22905d;

    /* renamed from: u0 */
    public static /* synthetic */ void m32380u0(C13974h1 h1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            h1Var.mo53755t0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: v0 */
    private final long m32381v0(boolean z) {
        if (z) {
            return 4294967296L;
        }
        return 1;
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m32382z0(C13974h1 h1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            h1Var.mo53758y0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: A0 */
    public final boolean mo53749A0() {
        if (this.f22903b >= m32381v0(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final boolean mo53750B0() {
        C12699k<C14053y0<?>> kVar = this.f22905d;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    /* renamed from: C0 */
    public long mo53751C0() {
        if (!mo53752D0()) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return 0;
    }

    /* renamed from: D0 */
    public final boolean mo53752D0() {
        C14053y0 v;
        C12699k<C14053y0<?>> kVar = this.f22905d;
        if (kVar == null || (v = kVar.mo50587v()) == null) {
            return false;
        }
        v.run();
        return true;
    }

    /* renamed from: E0 */
    public boolean mo53753E0() {
        return false;
    }

    public final C13971h0 limitedParallelism(int i) {
        C11847o.m25529a(i);
        return this;
    }

    /* renamed from: t0 */
    public final void mo53755t0(boolean z) {
        long v0 = this.f22903b - m32381v0(z);
        this.f22903b = v0;
        if (v0 <= 0 && this.f22904c) {
            shutdown();
        }
    }

    /* renamed from: w0 */
    public final void mo53756w0(C14053y0<?> y0Var) {
        C12699k<C14053y0<?>> kVar = this.f22905d;
        if (kVar == null) {
            kVar = new C12699k<>();
            this.f22905d = kVar;
        }
        kVar.addLast(y0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public long mo53757x0() {
        C12699k<C14053y0<?>> kVar = this.f22905d;
        if (kVar != null && !kVar.isEmpty()) {
            return 0;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    /* renamed from: y0 */
    public final void mo53758y0(boolean z) {
        this.f22903b += m32381v0(z);
        if (!z) {
            this.f22904c = true;
        }
    }

    public void shutdown() {
    }
}
