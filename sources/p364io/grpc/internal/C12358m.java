package p364io.grpc.internal;

/* renamed from: io.grpc.internal.m */
/* compiled from: CallTracer */
final class C12358m {

    /* renamed from: f */
    static final C12360b f19619f = new C12359a();

    /* renamed from: a */
    private final C12356l2 f19620a;

    /* renamed from: b */
    private final C12244e1 f19621b = C12258f1.m26837a();

    /* renamed from: c */
    private final C12244e1 f19622c = C12258f1.m26837a();

    /* renamed from: d */
    private final C12244e1 f19623d = C12258f1.m26837a();

    /* renamed from: e */
    private volatile long f19624e;

    /* renamed from: io.grpc.internal.m$a */
    /* compiled from: CallTracer */
    class C12359a implements C12360b {
        C12359a() {
        }

        /* renamed from: a */
        public C12358m mo49844a() {
            return new C12358m(C12356l2.f19618a);
        }
    }

    /* renamed from: io.grpc.internal.m$b */
    /* compiled from: CallTracer */
    public interface C12360b {
        /* renamed from: a */
        C12358m mo49844a();
    }

    C12358m(C12356l2 l2Var) {
        this.f19620a = l2Var;
    }

    /* renamed from: a */
    public void mo49994a(boolean z) {
        if (z) {
            this.f19622c.add(1);
        } else {
            this.f19623d.add(1);
        }
    }

    /* renamed from: b */
    public void mo49995b() {
        this.f19621b.add(1);
        this.f19624e = this.f19620a.mo49993a();
    }
}
