package p364io.grpc.internal;

import java.io.InputStream;
import p111h6.C8012n;
import p335ee.C11890b;
import p335ee.C11891c;
import p364io.grpc.internal.C12248f;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12350l1;
import p458xd.C13799i;
import p458xd.C13809k;
import p458xd.C13823q;

/* renamed from: io.grpc.internal.d */
/* compiled from: AbstractStream */
public abstract class C12231d implements C12337j2 {

    /* renamed from: io.grpc.internal.d$a */
    /* compiled from: AbstractStream */
    public static abstract class C12232a implements C12248f.C12256h, C12350l1.C12352b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C12462y f19261a;

        /* renamed from: b */
        private final Object f19262b = new Object();

        /* renamed from: c */
        private final C12324i2 f19263c;

        /* renamed from: d */
        private final C12379o2 f19264d;

        /* renamed from: e */
        private final C12350l1 f19265e;

        /* renamed from: f */
        private int f19266f;

        /* renamed from: g */
        private boolean f19267g;

        /* renamed from: h */
        private boolean f19268h;

        /* renamed from: io.grpc.internal.d$a$a */
        /* compiled from: AbstractStream */
        class C12233a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C11890b f19269b;

            /* renamed from: c */
            final /* synthetic */ int f19270c;

            C12233a(C11890b bVar, int i) {
                this.f19269b = bVar;
                this.f19270c = i;
            }

            public void run() {
                C11891c.m25678f("AbstractStream.request");
                C11891c.m25676d(this.f19269b);
                try {
                    C12232a.this.f19261a.mo49815b(this.f19270c);
                } catch (Throwable th) {
                    C11891c.m25680h("AbstractStream.request");
                    throw th;
                }
                C11891c.m25680h("AbstractStream.request");
            }
        }

        protected C12232a(int i, C12324i2 i2Var, C12379o2 o2Var) {
            this.f19263c = (C12324i2) C8012n.m15756o(i2Var, "statsTraceCtx");
            this.f19264d = (C12379o2) C8012n.m15756o(o2Var, "transportTracer");
            C12350l1 l1Var = new C12350l1(this, C13799i.C13801b.f22244a, i, i2Var, o2Var);
            this.f19265e = l1Var;
            this.f19261a = l1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public boolean m26765m() {
            boolean z;
            synchronized (this.f19262b) {
                if (!this.f19267g || this.f19266f >= 32768 || this.f19268h) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: o */
        private void m26766o() {
            boolean m;
            synchronized (this.f19262b) {
                m = m26765m();
            }
            if (m) {
                mo49695n().mo49739c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public void m26767p(int i) {
            synchronized (this.f19262b) {
                this.f19266f += i;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public void m26768u(int i) {
            mo49838e(new C12233a(C11891c.m25677e(), i));
        }

        /* renamed from: a */
        public void mo49779a(C12343k2.C12344a aVar) {
            mo49695n().mo49737a(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final void mo49780j(boolean z) {
            if (z) {
                this.f19261a.close();
            } else {
                this.f19261a.mo49818k();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final void mo49781k(C12451v1 v1Var) {
            try {
                this.f19261a.mo49814G(v1Var);
            } catch (Throwable th) {
                mo49833d(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public C12379o2 mo49782l() {
            return this.f19264d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract C12343k2 mo49695n();

        /* renamed from: q */
        public final void mo49783q(int i) {
            boolean z;
            boolean z2;
            boolean z3;
            synchronized (this.f19262b) {
                C8012n.m15762u(this.f19267g, "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = this.f19266f;
                z = true;
                if (i2 < 32768) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = i2 - i;
                this.f19266f = i3;
                if (i3 < 32768) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 || !z3) {
                    z = false;
                }
            }
            if (z) {
                m26766o();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo49784r() {
            boolean z;
            boolean z2 = false;
            if (mo49695n() != null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15761t(z);
            synchronized (this.f19262b) {
                if (!this.f19267g) {
                    z2 = true;
                }
                C8012n.m15762u(z2, "Already allocated");
                this.f19267g = true;
            }
            m26766o();
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public final void mo49785s() {
            synchronized (this.f19262b) {
                this.f19268h = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo49786t() {
            this.f19265e.mo49986j0(this);
            this.f19261a = this.f19265e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public final void mo49787v(C13823q qVar) {
            this.f19261a.mo49813A(qVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public void mo49788w(C12424s0 s0Var) {
            this.f19265e.mo49984c0(s0Var);
            this.f19261a = new C12248f(this, this, this.f19265e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public final void mo49789x(int i) {
            this.f19261a.mo49816c(i);
        }
    }

    /* renamed from: b */
    public final void mo49716b(int i) {
        mo49672s().m26768u(i);
    }

    /* renamed from: e */
    public final void mo49717e(C13809k kVar) {
        mo49671q().mo49679e((C13809k) C8012n.m15756o(kVar, "compressor"));
    }

    public final void flush() {
        if (!mo49671q().isClosed()) {
            mo49671q().flush();
        }
    }

    public boolean isReady() {
        if (mo49671q().isClosed()) {
            return false;
        }
        return mo49672s().m26765m();
    }

    /* renamed from: k */
    public final void mo49720k(InputStream inputStream) {
        C8012n.m15756o(inputStream, "message");
        try {
            if (!mo49671q().isClosed()) {
                mo49671q().mo49680f(inputStream);
            }
        } finally {
            C12404r0.m27326e(inputStream);
        }
    }

    /* renamed from: l */
    public void mo49721l() {
        mo49672s().mo49786t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo49777p() {
        mo49671q().close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract C12395p0 mo49671q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo49778r(int i) {
        mo49672s().m26767p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract C12232a mo49672s();
}
