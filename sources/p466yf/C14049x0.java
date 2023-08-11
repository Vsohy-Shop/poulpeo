package p466yf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;
import p331dg.C11820c0;
import p331dg.C11833j;
import p355hf.C12074d;
import p355hf.C12079g;

/* renamed from: yf.x0 */
/* compiled from: Builders.common.kt */
public final class C14049x0<T> extends C11820c0<T> {

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f22963f = AtomicIntegerFieldUpdater.newUpdater(C14049x0.class, "_decision");
    private volatile int _decision;

    public C14049x0(C12079g gVar, C12074d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* renamed from: M0 */
    private final boolean m32576M0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22963f;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f22963f.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N0 */
    private final boolean m32577N0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22963f;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f22963f.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo48980H0(Object obj) {
        if (!m32576M0()) {
            C11833j.m25483c(C12147c.m26491b(this.f18464e), C13948e0.m32250a(obj, this.f18464e), (Function1) null, 2, (Object) null);
        }
    }

    /* renamed from: L0 */
    public final Object mo53815L0() {
        if (m32577N0()) {
            return C12150d.m26492c();
        }
        Object h = C13969g2.m32371h(mo53707T());
        if (!(h instanceof C13932b0)) {
            return h;
        }
        throw ((C13932b0) h).f22850a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo48982t(Object obj) {
        mo48980H0(obj);
    }
}
