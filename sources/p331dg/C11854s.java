package p331dg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: dg.s */
/* compiled from: LockFreeTaskQueue.kt */
public class C11854s<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f18513a = AtomicReferenceFieldUpdater.newUpdater(C11854s.class, Object.class, "_cur");
    private volatile Object _cur;

    public C11854s(boolean z) {
        this._cur = new C11855t(8, z);
    }

    /* renamed from: a */
    public final boolean mo49042a(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18513a;
        while (true) {
            C11855t tVar = (C11855t) atomicReferenceFieldUpdater.get(this);
            int a = tVar.mo49046a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C1248a.m719a(f18513a, this, tVar, tVar.mo49050i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo49043b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18513a;
        while (true) {
            C11855t tVar = (C11855t) atomicReferenceFieldUpdater.get(this);
            if (!tVar.mo49047d()) {
                C1248a.m719a(f18513a, this, tVar, tVar.mo49050i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo49044c() {
        return ((C11855t) f18513a.get(this)).mo49048f();
    }

    /* renamed from: d */
    public final E mo49045d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18513a;
        while (true) {
            C11855t tVar = (C11855t) atomicReferenceFieldUpdater.get(this);
            E j = tVar.mo49051j();
            if (j != C11855t.f18517h) {
                return j;
            }
            C1248a.m719a(f18513a, this, tVar, tVar.mo49050i());
        }
    }
}
