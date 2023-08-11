package p423re;

import java.util.concurrent.Callable;
import p307af.C10885a;
import p341fe.C11949f;
import p369je.C12620a;
import p384le.C12854e;
import p386lg.C12859a;
import p386lg.C12860b;
import p397ne.C13016b;
import p465ye.C13922d;
import p465ye.C13923e;

/* renamed from: re.x */
/* compiled from: FlowableScalarXMap */
public final class C13355x {

    /* renamed from: re.x$a */
    /* compiled from: FlowableScalarXMap */
    static final class C13356a<T, R> extends C11949f<R> {

        /* renamed from: c */
        final T f21402c;

        /* renamed from: d */
        final C12854e<? super T, ? extends C12859a<? extends R>> f21403d;

        C13356a(T t, C12854e<? super T, ? extends C12859a<? extends R>> eVar) {
            this.f21402c = t;
            this.f21403d = eVar;
        }

        /* renamed from: I */
        public void mo49200I(C12860b<? super R> bVar) {
            try {
                C12859a aVar = (C12859a) C13016b.m29390d(this.f21403d.apply(this.f21402c), "The mapper returned a null Publisher");
                if (aVar instanceof Callable) {
                    try {
                        Object call = ((Callable) aVar).call();
                        if (call == null) {
                            C13922d.m32170a(bVar);
                        } else {
                            bVar.mo49220e(new C13923e(bVar, call));
                        }
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        C13922d.m32171b(th, bVar);
                    }
                } else {
                    aVar.mo49202a(bVar);
                }
            } catch (Throwable th2) {
                C13922d.m32171b(th2, bVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> C11949f<U> m30381a(T t, C12854e<? super T, ? extends C12859a<? extends U>> eVar) {
        return C10885a.m23264k(new C13356a(t, eVar));
    }

    /* renamed from: b */
    public static <T, R> boolean m30382b(C12859a<T> aVar, C12860b<? super R> bVar, C12854e<? super T, ? extends C12859a<? extends R>> eVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) aVar).call();
            if (call == null) {
                C13922d.m32170a(bVar);
                return true;
            }
            try {
                C12859a aVar2 = (C12859a) C13016b.m29390d(eVar.apply(call), "The mapper returned a null Publisher");
                if (aVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) aVar2).call();
                        if (call2 == null) {
                            C13922d.m32170a(bVar);
                            return true;
                        }
                        bVar.mo49220e(new C13923e(bVar, call2));
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        C13922d.m32171b(th, bVar);
                        return true;
                    }
                } else {
                    aVar2.mo49202a(bVar);
                }
                return true;
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                C13922d.m32171b(th2, bVar);
                return true;
            }
        } catch (Throwable th3) {
            C12620a.m28007b(th3);
            C13922d.m32171b(th3, bVar);
            return true;
        }
    }
}
