package p341fe;

import java.util.concurrent.Callable;
import p307af.C10885a;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12853d;
import p384le.C12854e;
import p384le.C12856g;
import p397ne.C12999a;
import p397ne.C13016b;
import p403oe.C13066c;
import p411pe.C13210e;
import p417qe.C13250a;
import p417qe.C13252b;
import p417qe.C13253c;
import p417qe.C13254d;
import p417qe.C13255e;
import p417qe.C13256f;
import p417qe.C13258g;
import p417qe.C13260h;
import p429se.C13416j;

/* renamed from: fe.b */
/* compiled from: Completable */
public abstract class C11945b implements C11947d {
    /* renamed from: d */
    public static C11945b m25803d() {
        return C10885a.m23263j(C13252b.f21136b);
    }

    /* renamed from: e */
    public static C11945b m25804e(C11947d... dVarArr) {
        C13016b.m29390d(dVarArr, "sources is null");
        if (dVarArr.length == 0) {
            return m25803d();
        }
        if (dVarArr.length == 1) {
            return m25809s(dVarArr[0]);
        }
        return C10885a.m23263j(new C13250a(dVarArr));
    }

    /* renamed from: i */
    private C11945b m25805i(C12853d<? super C12141b> dVar, C12853d<? super Throwable> dVar2, C12850a aVar, C12850a aVar2, C12850a aVar3, C12850a aVar4) {
        C13016b.m29390d(dVar, "onSubscribe is null");
        C13016b.m29390d(dVar2, "onError is null");
        C13016b.m29390d(aVar, "onComplete is null");
        C13016b.m29390d(aVar2, "onTerminate is null");
        C13016b.m29390d(aVar3, "onAfterTerminate is null");
        C13016b.m29390d(aVar4, "onDispose is null");
        return C10885a.m23263j(new C13258g(this, dVar, dVar2, aVar, aVar2, aVar3, aVar4));
    }

    /* renamed from: j */
    public static C11945b m25806j(C12850a aVar) {
        C13016b.m29390d(aVar, "run is null");
        return C10885a.m23263j(new C13253c(aVar));
    }

    /* renamed from: k */
    public static C11945b m25807k(Callable<?> callable) {
        C13016b.m29390d(callable, "callable is null");
        return C10885a.m23263j(new C13254d(callable));
    }

    /* renamed from: r */
    private static NullPointerException m25808r(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: s */
    public static C11945b m25809s(C11947d dVar) {
        C13016b.m29390d(dVar, "source is null");
        if (dVar instanceof C11945b) {
            return C10885a.m23263j((C11945b) dVar);
        }
        return C10885a.m23263j(new C13255e(dVar));
    }

    /* renamed from: a */
    public final void mo49177a(C11946c cVar) {
        C13016b.m29390d(cVar, "s is null");
        try {
            mo49186p(C10885a.m23273t(this, cVar));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C10885a.m23270q(th);
            throw m25808r(th);
        }
    }

    /* renamed from: c */
    public final C11945b mo49178c(C11947d dVar) {
        return mo49179f(dVar);
    }

    /* renamed from: f */
    public final C11945b mo49179f(C11947d dVar) {
        C13016b.m29390d(dVar, "other is null");
        return m25804e(this, dVar);
    }

    /* renamed from: g */
    public final C11945b mo49180g(C12850a aVar) {
        C12853d b = C12999a.m29376b();
        C12853d b2 = C12999a.m29376b();
        C12850a aVar2 = C12999a.f20802c;
        return m25805i(b, b2, aVar, aVar2, aVar2, aVar2);
    }

    /* renamed from: h */
    public final C11945b mo49181h(C12853d<? super Throwable> dVar) {
        C12853d b = C12999a.m29376b();
        C12850a aVar = C12999a.f20802c;
        return m25805i(b, dVar, aVar, aVar, aVar, aVar);
    }

    /* renamed from: l */
    public final C11945b mo49182l() {
        return mo49183m(C12999a.m29375a());
    }

    /* renamed from: m */
    public final C11945b mo49183m(C12856g<? super Throwable> gVar) {
        C13016b.m29390d(gVar, "predicate is null");
        return C10885a.m23263j(new C13256f(this, gVar));
    }

    /* renamed from: n */
    public final C11945b mo49184n(C12854e<? super Throwable, ? extends C11947d> eVar) {
        C13016b.m29390d(eVar, "errorMapper is null");
        return C10885a.m23263j(new C13260h(this, eVar));
    }

    /* renamed from: o */
    public final C12141b mo49185o() {
        C13210e eVar = new C13210e();
        mo49177a(eVar);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo49186p(C11946c cVar);

    /* renamed from: q */
    public final <T> C11953j<T> mo49187q() {
        if (this instanceof C13066c) {
            return ((C13066c) this).mo50967c();
        }
        return C10885a.m23265l(new C13416j(this));
    }
}
