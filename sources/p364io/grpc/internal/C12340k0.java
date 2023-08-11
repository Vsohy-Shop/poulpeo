package p364io.grpc.internal;

import java.util.concurrent.Executor;
import p111h6.C8003j;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12341k1;
import p364io.grpc.internal.C12422s;
import p458xd.C13783d0;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.k0 */
/* compiled from: ForwardingConnectionClientTransport */
abstract class C12340k0 implements C12447v {
    C12340k0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12447v mo49977a();

    /* renamed from: b */
    public void mo49697b(C12594t tVar) {
        mo49977a().mo49697b(tVar);
    }

    /* renamed from: c */
    public void mo49698c(C12594t tVar) {
        mo49977a().mo49698c(tVar);
    }

    /* renamed from: d */
    public C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
        return mo49977a().mo49699d(d0Var, oVar, bVar, cVarArr);
    }

    /* renamed from: e */
    public Runnable mo49700e(C12341k1.C12342a aVar) {
        return mo49977a().mo49700e(aVar);
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        return mo49977a().mo49701f();
    }

    /* renamed from: g */
    public void mo49978g(C12422s.C12423a aVar, Executor executor) {
        mo49977a().mo49978g(aVar, executor);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", mo49977a()).toString();
    }
}
