package p314bg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p320cg.C11061b;
import p320cg.C11062c;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C14010o;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,428:1\n1#2:429\n314#3,11:430\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n298#1:430,11\n*E\n"})
/* renamed from: bg.k0 */
/* compiled from: StateFlow.kt */
final class C10982k0 extends C11062c<C10975i0<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f16957a = AtomicReferenceFieldUpdater.newUpdater(C10982k0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    public boolean mo46017a(C10975i0<?> i0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16957a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, C10979j0.f16953a);
        return true;
    }

    /* renamed from: e */
    public final Object mo46049e(C12074d<? super C11921v> dVar) {
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        if (!C1248a.m719a(f16957a, this, C10979j0.f16953a, oVar)) {
            C11907m.C11908a aVar = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    /* renamed from: f */
    public C12074d<C11921v>[] mo46018b(C10975i0<?> i0Var) {
        f16957a.set(this, (Object) null);
        return C11061b.f17164a;
    }

    /* renamed from: g */
    public final void mo46051g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16957a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != C10979j0.f16954b) {
                if (obj == C10979j0.f16953a) {
                    if (C1248a.m719a(f16957a, this, obj, C10979j0.f16954b)) {
                        return;
                    }
                } else if (C1248a.m719a(f16957a, this, obj, C10979j0.f16953a)) {
                    C11907m.C11908a aVar = C11907m.f18600b;
                    ((C14010o) obj).resumeWith(C11907m.m25696a(C11921v.f18618a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo46052h() {
        Object andSet = f16957a.getAndSet(this, C10979j0.f16953a);
        C12775o.m28636f(andSet);
        if (andSet == C10979j0.f16954b) {
            return true;
        }
        return false;
    }
}
