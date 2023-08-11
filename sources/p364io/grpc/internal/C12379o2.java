package p364io.grpc.internal;

import p111h6.C8012n;

/* renamed from: io.grpc.internal.o2 */
/* compiled from: TransportTracer */
public final class C12379o2 {

    /* renamed from: l */
    private static final C12381b f19671l = new C12381b(C12356l2.f19618a);

    /* renamed from: a */
    private final C12356l2 f19672a;

    /* renamed from: b */
    private long f19673b;

    /* renamed from: c */
    private long f19674c;

    /* renamed from: d */
    private long f19675d;

    /* renamed from: e */
    private long f19676e;

    /* renamed from: f */
    private long f19677f;

    /* renamed from: g */
    private C12382c f19678g;

    /* renamed from: h */
    private long f19679h;

    /* renamed from: i */
    private long f19680i;

    /* renamed from: j */
    private final C12244e1 f19681j;

    /* renamed from: k */
    private volatile long f19682k;

    /* renamed from: io.grpc.internal.o2$b */
    /* compiled from: TransportTracer */
    public static final class C12381b {

        /* renamed from: a */
        private final C12356l2 f19683a;

        public C12381b(C12356l2 l2Var) {
            this.f19683a = l2Var;
        }

        /* renamed from: a */
        public C12379o2 mo50029a() {
            return new C12379o2(this.f19683a);
        }
    }

    /* renamed from: io.grpc.internal.o2$c */
    /* compiled from: TransportTracer */
    public interface C12382c {
    }

    /* renamed from: a */
    public static C12381b m27239a() {
        return f19671l;
    }

    /* renamed from: b */
    public void mo50023b() {
        this.f19677f++;
    }

    /* renamed from: c */
    public void mo50024c() {
        this.f19673b++;
        this.f19674c = this.f19672a.mo49993a();
    }

    /* renamed from: d */
    public void mo50025d() {
        this.f19681j.add(1);
        this.f19682k = this.f19672a.mo49993a();
    }

    /* renamed from: e */
    public void mo50026e(int i) {
        if (i != 0) {
            this.f19679h += (long) i;
            this.f19680i = this.f19672a.mo49993a();
        }
    }

    /* renamed from: f */
    public void mo50027f(boolean z) {
        if (z) {
            this.f19675d++;
        } else {
            this.f19676e++;
        }
    }

    /* renamed from: g */
    public void mo50028g(C12382c cVar) {
        this.f19678g = (C12382c) C8012n.m15755n(cVar);
    }

    public C12379o2() {
        this.f19681j = C12258f1.m26837a();
        this.f19672a = C12356l2.f19618a;
    }

    private C12379o2(C12356l2 l2Var) {
        this.f19681j = C12258f1.m26837a();
        this.f19672a = l2Var;
    }
}
