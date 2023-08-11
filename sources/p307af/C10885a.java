package p307af;

import java.util.concurrent.Callable;
import p341fe.C11945b;
import p341fe.C11946c;
import p341fe.C11949f;
import p341fe.C11953j;
import p341fe.C11955l;
import p341fe.C11958o;
import p341fe.C11961q;
import p341fe.C11962r;
import p341fe.C11965s;
import p341fe.C11966t;
import p364io.reactivex.exceptions.CompositeException;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p364io.reactivex.exceptions.OnErrorNotImplementedException;
import p364io.reactivex.exceptions.UndeliverableException;
import p376ke.C12657a;
import p384le.C12851b;
import p384le.C12853d;
import p384le.C12854e;
import p386lg.C12860b;
import p397ne.C13016b;
import p471ze.C14112g;

/* renamed from: af.a */
/* compiled from: RxJavaPlugins */
public final class C10885a {

    /* renamed from: a */
    static volatile C12853d<? super Throwable> f16750a;

    /* renamed from: b */
    static volatile C12854e<? super Runnable, ? extends Runnable> f16751b;

    /* renamed from: c */
    static volatile C12854e<? super Callable<C11962r>, ? extends C11962r> f16752c;

    /* renamed from: d */
    static volatile C12854e<? super Callable<C11962r>, ? extends C11962r> f16753d;

    /* renamed from: e */
    static volatile C12854e<? super Callable<C11962r>, ? extends C11962r> f16754e;

    /* renamed from: f */
    static volatile C12854e<? super Callable<C11962r>, ? extends C11962r> f16755f;

    /* renamed from: g */
    static volatile C12854e<? super C11962r, ? extends C11962r> f16756g;

    /* renamed from: h */
    static volatile C12854e<? super C11962r, ? extends C11962r> f16757h;

    /* renamed from: i */
    static volatile C12854e<? super C11949f, ? extends C11949f> f16758i;

    /* renamed from: j */
    static volatile C12854e<? super C12657a, ? extends C12657a> f16759j;

    /* renamed from: k */
    static volatile C12854e<? super C11958o, ? extends C11958o> f16760k;

    /* renamed from: l */
    static volatile C12854e<? super C11953j, ? extends C11953j> f16761l;

    /* renamed from: m */
    static volatile C12854e<? super C11965s, ? extends C11965s> f16762m;

    /* renamed from: n */
    static volatile C12854e<? super C11945b, ? extends C11945b> f16763n;

    /* renamed from: o */
    static volatile C12851b<? super C11949f, ? super C12860b, ? extends C12860b> f16764o;

    /* renamed from: p */
    static volatile C12851b<? super C11953j, ? super C11955l, ? extends C11955l> f16765p;

    /* renamed from: q */
    static volatile C12851b<? super C11958o, ? super C11961q, ? extends C11961q> f16766q;

    /* renamed from: r */
    static volatile C12851b<? super C11965s, ? super C11966t, ? extends C11966t> f16767r;

    /* renamed from: s */
    static volatile C12851b<? super C11945b, ? super C11946c, ? extends C11946c> f16768s;

    /* renamed from: a */
    static <T, U, R> R m23254a(C12851b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.apply(t, u);
        } catch (Throwable th) {
            throw C14112g.m32759d(th);
        }
    }

    /* renamed from: b */
    static <T, R> R m23255b(C12854e<T, R> eVar, T t) {
        try {
            return eVar.apply(t);
        } catch (Throwable th) {
            throw C14112g.m32759d(th);
        }
    }

    /* renamed from: c */
    static C11962r m23256c(C12854e<? super Callable<C11962r>, ? extends C11962r> eVar, Callable<C11962r> callable) {
        return (C11962r) C13016b.m29390d(m23255b(eVar, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    static C11962r m23257d(Callable<C11962r> callable) {
        try {
            return (C11962r) C13016b.m29390d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C14112g.m32759d(th);
        }
    }

    /* renamed from: e */
    public static C11962r m23258e(Callable<C11962r> callable) {
        C13016b.m29390d(callable, "Scheduler Callable can't be null");
        C12854e<? super Callable<C11962r>, ? extends C11962r> eVar = f16752c;
        if (eVar == null) {
            return m23257d(callable);
        }
        return m23256c(eVar, callable);
    }

    /* renamed from: f */
    public static C11962r m23259f(Callable<C11962r> callable) {
        C13016b.m29390d(callable, "Scheduler Callable can't be null");
        C12854e<? super Callable<C11962r>, ? extends C11962r> eVar = f16754e;
        if (eVar == null) {
            return m23257d(callable);
        }
        return m23256c(eVar, callable);
    }

    /* renamed from: g */
    public static C11962r m23260g(Callable<C11962r> callable) {
        C13016b.m29390d(callable, "Scheduler Callable can't be null");
        C12854e<? super Callable<C11962r>, ? extends C11962r> eVar = f16755f;
        if (eVar == null) {
            return m23257d(callable);
        }
        return m23256c(eVar, callable);
    }

    /* renamed from: h */
    public static C11962r m23261h(Callable<C11962r> callable) {
        C13016b.m29390d(callable, "Scheduler Callable can't be null");
        C12854e<? super Callable<C11962r>, ? extends C11962r> eVar = f16753d;
        if (eVar == null) {
            return m23257d(callable);
        }
        return m23256c(eVar, callable);
    }

    /* renamed from: i */
    static boolean m23262i(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static C11945b m23263j(C11945b bVar) {
        C12854e<? super C11945b, ? extends C11945b> eVar = f16763n;
        if (eVar != null) {
            return (C11945b) m23255b(eVar, bVar);
        }
        return bVar;
    }

    /* renamed from: k */
    public static <T> C11949f<T> m23264k(C11949f<T> fVar) {
        C12854e<? super C11949f, ? extends C11949f> eVar = f16758i;
        if (eVar != null) {
            return (C11949f) m23255b(eVar, fVar);
        }
        return fVar;
    }

    /* renamed from: l */
    public static <T> C11953j<T> m23265l(C11953j<T> jVar) {
        C12854e<? super C11953j, ? extends C11953j> eVar = f16761l;
        if (eVar != null) {
            return (C11953j) m23255b(eVar, jVar);
        }
        return jVar;
    }

    /* renamed from: m */
    public static <T> C11958o<T> m23266m(C11958o<T> oVar) {
        C12854e<? super C11958o, ? extends C11958o> eVar = f16760k;
        if (eVar != null) {
            return (C11958o) m23255b(eVar, oVar);
        }
        return oVar;
    }

    /* renamed from: n */
    public static <T> C11965s<T> m23267n(C11965s<T> sVar) {
        C12854e<? super C11965s, ? extends C11965s> eVar = f16762m;
        if (eVar != null) {
            return (C11965s) m23255b(eVar, sVar);
        }
        return sVar;
    }

    /* renamed from: o */
    public static <T> C12657a<T> m23268o(C12657a<T> aVar) {
        C12854e<? super C12657a, ? extends C12657a> eVar = f16759j;
        if (eVar != null) {
            return (C12657a) m23255b(eVar, aVar);
        }
        return aVar;
    }

    /* renamed from: p */
    public static C11962r m23269p(C11962r rVar) {
        C12854e<? super C11962r, ? extends C11962r> eVar = f16756g;
        if (eVar == null) {
            return rVar;
        }
        return (C11962r) m23255b(eVar, rVar);
    }

    /* renamed from: q */
    public static void m23270q(Throwable th) {
        C12853d<? super Throwable> dVar = f16750a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m23262i(th)) {
            th = new UndeliverableException(th);
        }
        if (dVar != null) {
            try {
                dVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m23278y(th2);
            }
        }
        th.printStackTrace();
        m23278y(th);
    }

    /* renamed from: r */
    public static C11962r m23271r(C11962r rVar) {
        C12854e<? super C11962r, ? extends C11962r> eVar = f16757h;
        if (eVar == null) {
            return rVar;
        }
        return (C11962r) m23255b(eVar, rVar);
    }

    /* renamed from: s */
    public static Runnable m23272s(Runnable runnable) {
        C13016b.m29390d(runnable, "run is null");
        C12854e<? super Runnable, ? extends Runnable> eVar = f16751b;
        if (eVar == null) {
            return runnable;
        }
        return (Runnable) m23255b(eVar, runnable);
    }

    /* renamed from: t */
    public static C11946c m23273t(C11945b bVar, C11946c cVar) {
        C12851b<? super C11945b, ? super C11946c, ? extends C11946c> bVar2 = f16768s;
        if (bVar2 != null) {
            return (C11946c) m23254a(bVar2, bVar, cVar);
        }
        return cVar;
    }

    /* renamed from: u */
    public static <T> C11955l<? super T> m23274u(C11953j<T> jVar, C11955l<? super T> lVar) {
        C12851b<? super C11953j, ? super C11955l, ? extends C11955l> bVar = f16765p;
        if (bVar != null) {
            return (C11955l) m23254a(bVar, jVar, lVar);
        }
        return lVar;
    }

    /* renamed from: v */
    public static <T> C11961q<? super T> m23275v(C11958o<T> oVar, C11961q<? super T> qVar) {
        C12851b<? super C11958o, ? super C11961q, ? extends C11961q> bVar = f16766q;
        if (bVar != null) {
            return (C11961q) m23254a(bVar, oVar, qVar);
        }
        return qVar;
    }

    /* renamed from: w */
    public static <T> C11966t<? super T> m23276w(C11965s<T> sVar, C11966t<? super T> tVar) {
        C12851b<? super C11965s, ? super C11966t, ? extends C11966t> bVar = f16767r;
        if (bVar != null) {
            return (C11966t) m23254a(bVar, sVar, tVar);
        }
        return tVar;
    }

    /* renamed from: x */
    public static <T> C12860b<? super T> m23277x(C11949f<T> fVar, C12860b<? super T> bVar) {
        C12851b<? super C11949f, ? super C12860b, ? extends C12860b> bVar2 = f16764o;
        if (bVar2 != null) {
            return (C12860b) m23254a(bVar2, fVar, bVar);
        }
        return bVar;
    }

    /* renamed from: y */
    static void m23278y(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
