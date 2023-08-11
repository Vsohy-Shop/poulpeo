package p364io.grpc.internal;

import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p458xd.C13773a;
import p458xd.C13783d0;
import p458xd.C13815o;

/* renamed from: io.grpc.internal.n1 */
/* compiled from: MetadataApplierImpl */
final class C12371n1 extends C13773a.C13774a {

    /* renamed from: a */
    private final C12422s f19649a;

    /* renamed from: b */
    private final C13783d0<?, ?> f19650b;

    /* renamed from: c */
    private final C12564o f19651c;

    /* renamed from: d */
    private final C12159b f19652d;

    /* renamed from: e */
    private final C13815o f19653e;

    /* renamed from: f */
    private final C12372a f19654f;

    /* renamed from: g */
    private final C12161c[] f19655g;

    /* renamed from: h */
    private final Object f19656h = new Object();

    /* renamed from: i */
    private C12398q f19657i;

    /* renamed from: j */
    boolean f19658j;

    /* renamed from: k */
    C12191b0 f19659k;

    /* renamed from: io.grpc.internal.n1$a */
    /* compiled from: MetadataApplierImpl */
    public interface C12372a {
        /* renamed from: b */
        void mo49983b();
    }

    C12371n1(C12422s sVar, C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12372a aVar, C12161c[] cVarArr) {
        this.f19649a = sVar;
        this.f19650b = d0Var;
        this.f19651c = oVar;
        this.f19652d = bVar;
        this.f19653e = C13815o.m31725e();
        this.f19654f = aVar;
        this.f19655g = cVarArr;
    }

    /* renamed from: b */
    private void m27207b(C12398q qVar) {
        boolean z;
        boolean z2 = true;
        C8012n.m15762u(!this.f19658j, "already finalized");
        this.f19658j = true;
        synchronized (this.f19656h) {
            if (this.f19657i == null) {
                this.f19657i = qVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f19654f.mo49983b();
            return;
        }
        if (this.f19659k == null) {
            z2 = false;
        }
        C8012n.m15762u(z2, "delayedStream is null");
        Runnable v = this.f19659k.mo49722v(qVar);
        if (v != null) {
            v.run();
        }
        this.f19654f.mo49983b();
    }

    /* renamed from: a */
    public void mo50006a(C12594t tVar) {
        C8012n.m15746e(!tVar.mo50308p(), "Cannot fail with OK status");
        C8012n.m15762u(!this.f19658j, "apply() or fail() already called");
        m27207b(new C12257f0(tVar, this.f19655g));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12398q mo50007c() {
        synchronized (this.f19656h) {
            C12398q qVar = this.f19657i;
            if (qVar != null) {
                return qVar;
            }
            C12191b0 b0Var = new C12191b0();
            this.f19659k = b0Var;
            this.f19657i = b0Var;
            return b0Var;
        }
    }
}
