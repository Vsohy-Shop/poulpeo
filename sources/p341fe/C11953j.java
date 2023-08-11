package p341fe;

import java.util.concurrent.Callable;
import p307af.C10885a;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12851b;
import p384le.C12853d;
import p384le.C12854e;
import p384le.C12856g;
import p397ne.C12999a;
import p397ne.C13016b;
import p403oe.C13065b;
import p403oe.C13067d;
import p429se.C13402b;
import p429se.C13403c;
import p429se.C13405d;
import p429se.C13406e;
import p429se.C13410g;
import p429se.C13412h;
import p429se.C13415i;
import p429se.C13420l;
import p429se.C13422m;
import p429se.C13423n;
import p429se.C13425o;
import p429se.C13427p;
import p429se.C13430q;
import p429se.C13432r;
import p429se.C13435s;
import p429se.C13438t;
import p429se.C13440u;
import p429se.C13442v;

/* renamed from: fe.j */
/* compiled from: Maybe */
public abstract class C11953j<T> implements C11957n<T> {
    /* renamed from: A */
    public static <T1, T2, R> C11953j<R> m25863A(C11957n<? extends T1> nVar, C11957n<? extends T2> nVar2, C12851b<? super T1, ? super T2, ? extends R> bVar) {
        C13016b.m29390d(nVar, "source1 is null");
        C13016b.m29390d(nVar2, "source2 is null");
        return m25864B(C12999a.m29381g(bVar), nVar, nVar2);
    }

    /* renamed from: B */
    public static <T, R> C11953j<R> m25864B(C12854e<? super Object[], ? extends R> eVar, C11957n<? extends T>... nVarArr) {
        C13016b.m29390d(nVarArr, "sources is null");
        if (nVarArr.length == 0) {
            return m25866g();
        }
        C13016b.m29390d(eVar, "zipper is null");
        return C10885a.m23265l(new C13442v(nVarArr, eVar));
    }

    /* renamed from: b */
    public static <T> C11953j<T> m25865b(C11956m<T> mVar) {
        C13016b.m29390d(mVar, "onSubscribe is null");
        return C10885a.m23265l(new C13403c(mVar));
    }

    /* renamed from: g */
    public static <T> C11953j<T> m25866g() {
        return C10885a.m23265l(C13405d.f21480b);
    }

    /* renamed from: l */
    public static <T> C11953j<T> m25867l(Callable<? extends T> callable) {
        C13016b.m29390d(callable, "callable is null");
        return C10885a.m23265l(new C13415i(callable));
    }

    /* renamed from: n */
    public static <T> C11953j<T> m25868n(T t) {
        C13016b.m29390d(t, "item is null");
        return C10885a.m23265l(new C13422m(t));
    }

    /* renamed from: a */
    public final void mo49221a(C11955l<? super T> lVar) {
        C13016b.m29390d(lVar, "observer is null");
        C11955l<? super Object> u = C10885a.m23274u(this, lVar);
        C13016b.m29390d(u, "observer returned by the RxJavaPlugins hook is null");
        try {
            mo49236u(u);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12620a.m28007b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final C11953j<T> mo49222c(T t) {
        C13016b.m29390d(t, "item is null");
        return mo49239x(m25868n(t));
    }

    /* renamed from: e */
    public final C11953j<T> mo49223e(C12853d<? super Throwable> dVar) {
        C12850a aVar = C12999a.f20802c;
        return C10885a.m23265l(new C13430q(this, C12999a.m29376b(), C12999a.m29376b(), (C12853d) C13016b.m29390d(dVar, "onError is null"), aVar, aVar, aVar));
    }

    /* renamed from: f */
    public final C11953j<T> mo49224f(C12853d<? super T> dVar) {
        C12853d b = C12999a.m29376b();
        C12850a aVar = C12999a.f20802c;
        return C10885a.m23265l(new C13430q(this, C12999a.m29376b(), (C12853d) C13016b.m29390d(dVar, "onSubscribe is null"), b, aVar, aVar, aVar));
    }

    /* renamed from: h */
    public final C11953j<T> mo49225h(C12856g<? super T> gVar) {
        C13016b.m29390d(gVar, "predicate is null");
        return C10885a.m23265l(new C13406e(this, gVar));
    }

    /* renamed from: i */
    public final <R> C11953j<R> mo49226i(C12854e<? super T, ? extends C11957n<? extends R>> eVar) {
        C13016b.m29390d(eVar, "mapper is null");
        return C10885a.m23265l(new C13412h(this, eVar));
    }

    /* renamed from: j */
    public final C11945b mo49227j(C12854e<? super T, ? extends C11947d> eVar) {
        C13016b.m29390d(eVar, "mapper is null");
        return C10885a.m23263j(new C13410g(this, eVar));
    }

    /* renamed from: k */
    public final <R> C11958o<R> mo49228k(C12854e<? super T, ? extends C11960p<? extends R>> eVar) {
        return mo49241z().mo49253j(eVar);
    }

    /* renamed from: m */
    public final C11965s<Boolean> mo49229m() {
        return C10885a.m23267n(new C13420l(this));
    }

    /* renamed from: o */
    public final <R> C11953j<R> mo49230o(C12854e<? super T, ? extends R> eVar) {
        C13016b.m29390d(eVar, "mapper is null");
        return C10885a.m23265l(new C13423n(this, eVar));
    }

    /* renamed from: p */
    public final C11953j<T> mo49231p(C11962r rVar) {
        C13016b.m29390d(rVar, "scheduler is null");
        return C10885a.m23265l(new C13425o(this, rVar));
    }

    /* renamed from: q */
    public final C11953j<T> mo49232q(C11957n<? extends T> nVar) {
        C13016b.m29390d(nVar, "next is null");
        return mo49233r(C12999a.m29379e(nVar));
    }

    /* renamed from: r */
    public final C11953j<T> mo49233r(C12854e<? super Throwable, ? extends C11957n<? extends T>> eVar) {
        C13016b.m29390d(eVar, "resumeFunction is null");
        return C10885a.m23265l(new C13427p(this, eVar, true));
    }

    /* renamed from: s */
    public final C12141b mo49234s() {
        return mo49235t(C12999a.m29376b(), C12999a.f20805f, C12999a.f20802c);
    }

    /* renamed from: t */
    public final C12141b mo49235t(C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar) {
        C13016b.m29390d(dVar, "onSuccess is null");
        C13016b.m29390d(dVar2, "onError is null");
        C13016b.m29390d(aVar, "onComplete is null");
        return (C12141b) mo49238w(new C13402b(dVar, dVar2, aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo49236u(C11955l<? super T> lVar);

    /* renamed from: v */
    public final C11953j<T> mo49237v(C11962r rVar) {
        C13016b.m29390d(rVar, "scheduler is null");
        return C10885a.m23265l(new C13432r(this, rVar));
    }

    /* renamed from: w */
    public final <E extends C11955l<? super T>> E mo49238w(E e) {
        mo49221a(e);
        return e;
    }

    /* renamed from: x */
    public final C11953j<T> mo49239x(C11957n<? extends T> nVar) {
        C13016b.m29390d(nVar, "other is null");
        return C10885a.m23265l(new C13435s(this, nVar));
    }

    /* renamed from: y */
    public final C11949f<T> mo49240y() {
        if (this instanceof C13065b) {
            return ((C13065b) this).mo50966d();
        }
        return C10885a.m23264k(new C13438t(this));
    }

    /* renamed from: z */
    public final C11958o<T> mo49241z() {
        if (this instanceof C13067d) {
            return ((C13067d) this).mo50968b();
        }
        return C10885a.m23266m(new C13440u(this));
    }
}
