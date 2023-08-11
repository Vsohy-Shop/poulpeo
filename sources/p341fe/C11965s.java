package p341fe;

import p307af.C10885a;
import p369je.C12620a;
import p384le.C12853d;
import p384le.C12854e;
import p384le.C12856g;
import p397ne.C12999a;
import p397ne.C13016b;
import p403oe.C13065b;
import p429se.C13408f;
import p441ue.C13580a;
import p441ue.C13582b;
import p441ue.C13584c;
import p441ue.C13585d;
import p441ue.C13587e;

/* renamed from: fe.s */
/* compiled from: Single */
public abstract class C11965s<T> implements C11967u<T> {
    /* renamed from: h */
    public static <T> C11965s<T> m25925h(T t) {
        C13016b.m29390d(t, "value is null");
        return C10885a.m23267n(new C13584c(t));
    }

    /* renamed from: a */
    public final void mo49269a(C11966t<? super T> tVar) {
        C13016b.m29390d(tVar, "subscriber is null");
        C11966t<? super Object> w = C10885a.m23276w(this, tVar);
        C13016b.m29390d(w, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            mo49275k(w);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12620a.m28007b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public final C11965s<T> mo49270e(C12853d<? super Throwable> dVar) {
        C13016b.m29390d(dVar, "onError is null");
        return C10885a.m23267n(new C13580a(this, dVar));
    }

    /* renamed from: f */
    public final C11965s<T> mo49271f(C12853d<? super T> dVar) {
        C13016b.m29390d(dVar, "onSuccess is null");
        return C10885a.m23267n(new C13582b(this, dVar));
    }

    /* renamed from: g */
    public final C11953j<T> mo49272g(C12856g<? super T> gVar) {
        C13016b.m29390d(gVar, "predicate is null");
        return C10885a.m23265l(new C13408f(this, gVar));
    }

    /* renamed from: i */
    public final C11965s<T> mo49273i(C11965s<? extends T> sVar) {
        C13016b.m29390d(sVar, "resumeSingleInCaseOfError is null");
        return mo49274j(C12999a.m29379e(sVar));
    }

    /* renamed from: j */
    public final C11965s<T> mo49274j(C12854e<? super Throwable, ? extends C11967u<? extends T>> eVar) {
        C13016b.m29390d(eVar, "resumeFunctionInCaseOfError is null");
        return C10885a.m23267n(new C13585d(this, eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo49275k(C11966t<? super T> tVar);

    /* renamed from: l */
    public final C11949f<T> mo49276l() {
        if (this instanceof C13065b) {
            return ((C13065b) this).mo50966d();
        }
        return C10885a.m23264k(new C13587e(this));
    }
}
