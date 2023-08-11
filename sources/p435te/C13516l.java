package p435te;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p307af.C10885a;
import p341fe.C11958o;
import p341fe.C11960p;
import p341fe.C11961q;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12937c;
import p397ne.C13016b;
import p403oe.C13068e;

/* renamed from: te.l */
/* compiled from: ObservableScalarXMap */
public final class C13516l {

    /* renamed from: te.l$a */
    /* compiled from: ObservableScalarXMap */
    public static final class C13517a<T> extends AtomicInteger implements C13068e<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: b */
        final C11961q<? super T> f21755b;

        /* renamed from: c */
        final T f21756c;

        public C13517a(C11961q<? super T> qVar, T t) {
            this.f21755b = qVar;
            this.f21756c = t;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        public boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f21756c;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f21755b.mo46141d(this.f21756c);
                if (get() == 2) {
                    lazySet(3);
                    this.f21755b.mo46139b();
                }
            }
        }
    }

    /* renamed from: te.l$b */
    /* compiled from: ObservableScalarXMap */
    static final class C13518b<T, R> extends C11958o<R> {

        /* renamed from: b */
        final T f21757b;

        /* renamed from: c */
        final C12854e<? super T, ? extends C11960p<? extends R>> f21758c;

        C13518b(T t, C12854e<? super T, ? extends C11960p<? extends R>> eVar) {
            this.f21757b = t;
            this.f21758c = eVar;
        }

        /* renamed from: s */
        public void mo46143s(C11961q<? super R> qVar) {
            try {
                C11960p pVar = (C11960p) C13016b.m29390d(this.f21758c.apply(this.f21757b), "The mapper returned a null ObservableSource");
                if (pVar instanceof Callable) {
                    try {
                        Object call = ((Callable) pVar).call();
                        if (call == null) {
                            C12937c.m29230c(qVar);
                            return;
                        }
                        C13517a aVar = new C13517a(qVar, call);
                        qVar.mo46140c(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        C12937c.m29233f(th, qVar);
                    }
                } else {
                    pVar.mo49249a(qVar);
                }
            } catch (Throwable th2) {
                C12937c.m29233f(th2, qVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> C11958o<U> m30823a(T t, C12854e<? super T, ? extends C11960p<? extends U>> eVar) {
        return C10885a.m23266m(new C13518b(t, eVar));
    }

    /* renamed from: b */
    public static <T, R> boolean m30824b(C11960p<T> pVar, C11961q<? super R> qVar, C12854e<? super T, ? extends C11960p<? extends R>> eVar) {
        if (!(pVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) pVar).call();
            if (call == null) {
                C12937c.m29230c(qVar);
                return true;
            }
            try {
                C11960p pVar2 = (C11960p) C13016b.m29390d(eVar.apply(call), "The mapper returned a null ObservableSource");
                if (pVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) pVar2).call();
                        if (call2 == null) {
                            C12937c.m29230c(qVar);
                            return true;
                        }
                        C13517a aVar = new C13517a(qVar, call2);
                        qVar.mo46140c(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        C12937c.m29233f(th, qVar);
                        return true;
                    }
                } else {
                    pVar2.mo49249a(qVar);
                }
                return true;
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                C12937c.m29233f(th2, qVar);
                return true;
            }
        } catch (Throwable th3) {
            C12620a.m28007b(th3);
            C12937c.m29233f(th3, qVar);
            return true;
        }
    }
}
