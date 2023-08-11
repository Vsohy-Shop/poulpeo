package p051c8;

import java.util.HashSet;
import p257v8.C10050c;
import p268w8.C10134a;
import p268w8.C10137b;
import p268w8.C10146e;
import p341fe.C11945b;
import p341fe.C11947d;
import p341fe.C11953j;
import p341fe.C11965s;

/* renamed from: c8.w0 */
/* compiled from: ImpressionStorageClient */
public class C4019w0 {

    /* renamed from: c */
    private static final C10137b f3208c = C10137b.m21341N();

    /* renamed from: a */
    private final C4013u2 f3209a;

    /* renamed from: b */
    private C11953j<C10137b> f3210b = C11953j.m25866g();

    C4019w0(C4013u2 u2Var) {
        this.f3209a = u2Var;
    }

    /* renamed from: g */
    private static C10137b m4724g(C10137b bVar, C10134a aVar) {
        return (C10137b) C10137b.m21343R(bVar).mo44734z(aVar).build();
    }

    /* renamed from: i */
    private void m4725i() {
        this.f3210b = C11953j.m25866g();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m4730p(C10137b bVar) {
        this.f3210b = C11953j.m25868n(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ C11947d m4728n(HashSet hashSet, C10137b bVar) {
        C3961l2.m4602a("Existing impressions: " + bVar.toString());
        C10137b.C10139b P = C10137b.m21342P();
        for (C10134a next : bVar.mo44733M()) {
            if (!hashSet.contains(next.mo44730L())) {
                P.mo44734z(next);
            }
        }
        C10137b bVar2 = (C10137b) P.build();
        C3961l2.m4602a("New cleared impression list: " + bVar2.toString());
        return this.f3209a.mo30036f(bVar2).mo49180g(new C4015v0(this, bVar2));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m4729o(Throwable th) {
        m4725i();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ C11947d m4731q(C10134a aVar, C10137b bVar) {
        C10137b g = m4724g(bVar, aVar);
        return this.f3209a.mo30036f(g).mo49180g(new C3984q0(this, g));
    }

    /* renamed from: h */
    public C11945b mo30038h(C10146e eVar) {
        String str;
        HashSet hashSet = new HashSet();
        for (C10050c next : eVar.mo44743M()) {
            if (next.mo44631N().equals(C10050c.C10053c.VANILLA_PAYLOAD)) {
                str = next.mo44634S().mo44636K();
            } else {
                str = next.mo44629L().mo44623K();
            }
            hashSet.add(str);
        }
        C3961l2.m4602a("Potential impressions to clear: " + hashSet.toString());
        return mo30039j().mo49222c(f3208c).mo49227j(new C4011u0(this, hashSet));
    }

    /* renamed from: j */
    public C11953j<C10137b> mo30039j() {
        return this.f3210b.mo49239x(this.f3209a.mo30035e(C10137b.m21344S()).mo49224f(new C3969n0(this))).mo49223e(new C3974o0(this));
    }

    /* renamed from: l */
    public C11965s<Boolean> mo30040l(C10050c cVar) {
        String str;
        if (cVar.mo44631N().equals(C10050c.C10053c.VANILLA_PAYLOAD)) {
            str = cVar.mo44634S().mo44636K();
        } else {
            str = cVar.mo44629L().mo44623K();
        }
        return mo30039j().mo49230o(new C3991r0()).mo49228k(new C4003s0()).mo49259r(new C4007t0()).mo49251g(str);
    }

    /* renamed from: r */
    public C11945b mo30041r(C10134a aVar) {
        return mo30039j().mo49222c(f3208c).mo49227j(new C3979p0(this, aVar));
    }
}
