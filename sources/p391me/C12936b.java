package p391me;

import androidx.compose.animation.core.C0344a;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p361ie.C12141b;
import p364io.reactivex.exceptions.ProtocolViolationException;
import p397ne.C13016b;

/* renamed from: me.b */
/* compiled from: DisposableHelper */
public enum C12936b implements C12141b {
    DISPOSED;

    /* renamed from: a */
    public static boolean m29221a(AtomicReference<C12141b> atomicReference) {
        C12141b andSet;
        C12141b bVar = atomicReference.get();
        C12936b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    /* renamed from: b */
    public static boolean m29222b(C12141b bVar) {
        if (bVar == DISPOSED) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m29223c(AtomicReference<C12141b> atomicReference, C12141b bVar) {
        C12141b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!C0344a.m496a(atomicReference, bVar2, bVar));
        return true;
    }

    /* renamed from: d */
    public static void m29224d() {
        C10885a.m23270q(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: e */
    public static boolean m29225e(AtomicReference<C12141b> atomicReference, C12141b bVar) {
        C12141b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!C0344a.m496a(atomicReference, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    /* renamed from: f */
    public static boolean m29226f(AtomicReference<C12141b> atomicReference, C12141b bVar) {
        C13016b.m29390d(bVar, "d is null");
        if (C0344a.m496a(atomicReference, (Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m29224d();
        return false;
    }

    /* renamed from: g */
    public static boolean m29227g(C12141b bVar, C12141b bVar2) {
        if (bVar2 == null) {
            C10885a.m23270q(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            m29224d();
            return false;
        }
    }

    public boolean isDisposed() {
        return true;
    }

    public void dispose() {
    }
}
