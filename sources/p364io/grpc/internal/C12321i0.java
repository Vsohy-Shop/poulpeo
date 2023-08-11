package p364io.grpc.internal;

import p111h6.C8003j;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12402r;

/* renamed from: io.grpc.internal.i0 */
/* compiled from: ForwardingClientStreamListener */
abstract class C12321i0 implements C12402r {
    C12321i0() {
    }

    /* renamed from: a */
    public void mo49737a(C12343k2.C12344a aVar) {
        mo49934e().mo49737a(aVar);
    }

    /* renamed from: b */
    public void mo49738b(C12564o oVar) {
        mo49934e().mo49738b(oVar);
    }

    /* renamed from: c */
    public void mo49739c() {
        mo49934e().mo49739c();
    }

    /* renamed from: d */
    public void mo49740d(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
        mo49934e().mo49740d(tVar, aVar, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12402r mo49934e();

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", mo49934e()).toString();
    }
}
