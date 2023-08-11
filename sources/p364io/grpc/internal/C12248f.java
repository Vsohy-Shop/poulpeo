package p364io.grpc.internal;

import java.io.Closeable;
import java.io.InputStream;
import p111h6.C8012n;
import p364io.grpc.internal.C12265g;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12350l1;
import p458xd.C13823q;

/* renamed from: io.grpc.internal.f */
/* compiled from: ApplicationThreadDeframer */
public class C12248f implements C12462y {

    /* renamed from: b */
    private final C12350l1.C12352b f19290b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12265g f19291c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12350l1 f19292d;

    /* renamed from: io.grpc.internal.f$a */
    /* compiled from: ApplicationThreadDeframer */
    class C12249a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f19293b;

        C12249a(int i) {
            this.f19293b = i;
        }

        public void run() {
            if (!C12248f.this.f19292d.isClosed()) {
                try {
                    C12248f.this.f19292d.mo49815b(this.f19293b);
                } catch (Throwable th) {
                    C12248f.this.f19291c.mo49833d(th);
                    C12248f.this.f19292d.close();
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.f$b */
    /* compiled from: ApplicationThreadDeframer */
    class C12250b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12451v1 f19295b;

        C12250b(C12451v1 v1Var) {
            this.f19295b = v1Var;
        }

        public void run() {
            try {
                C12248f.this.f19292d.mo49814G(this.f19295b);
            } catch (Throwable th) {
                C12248f.this.f19291c.mo49833d(th);
                C12248f.this.f19292d.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$c */
    /* compiled from: ApplicationThreadDeframer */
    class C12251c implements Closeable {

        /* renamed from: b */
        final /* synthetic */ C12451v1 f19297b;

        C12251c(C12451v1 v1Var) {
            this.f19297b = v1Var;
        }

        public void close() {
            this.f19297b.close();
        }
    }

    /* renamed from: io.grpc.internal.f$d */
    /* compiled from: ApplicationThreadDeframer */
    class C12252d implements Runnable {
        C12252d() {
        }

        public void run() {
            C12248f.this.f19292d.mo49818k();
        }
    }

    /* renamed from: io.grpc.internal.f$e */
    /* compiled from: ApplicationThreadDeframer */
    class C12253e implements Runnable {
        C12253e() {
        }

        public void run() {
            C12248f.this.f19292d.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f */
    /* compiled from: ApplicationThreadDeframer */
    private class C12254f extends C12255g implements Closeable {

        /* renamed from: e */
        private final Closeable f19301e;

        public C12254f(Runnable runnable, Closeable closeable) {
            super(C12248f.this, runnable, (C12249a) null);
            this.f19301e = closeable;
        }

        public void close() {
            this.f19301e.close();
        }
    }

    /* renamed from: io.grpc.internal.f$g */
    /* compiled from: ApplicationThreadDeframer */
    private class C12255g implements C12343k2.C12344a {

        /* renamed from: b */
        private final Runnable f19303b;

        /* renamed from: c */
        private boolean f19304c;

        /* synthetic */ C12255g(C12248f fVar, Runnable runnable, C12249a aVar) {
            this(runnable);
        }

        /* renamed from: a */
        private void m26834a() {
            if (!this.f19304c) {
                this.f19303b.run();
                this.f19304c = true;
            }
        }

        public InputStream next() {
            m26834a();
            return C12248f.this.f19291c.mo49834f();
        }

        private C12255g(Runnable runnable) {
            this.f19304c = false;
            this.f19303b = runnable;
        }
    }

    /* renamed from: io.grpc.internal.f$h */
    /* compiled from: ApplicationThreadDeframer */
    interface C12256h extends C12265g.C12269d {
    }

    C12248f(C12350l1.C12352b bVar, C12256h hVar, C12350l1 l1Var) {
        C12319h2 h2Var = new C12319h2((C12350l1.C12352b) C8012n.m15756o(bVar, "listener"));
        this.f19290b = h2Var;
        C12265g gVar = new C12265g(h2Var, hVar);
        this.f19291c = gVar;
        l1Var.mo49986j0(gVar);
        this.f19292d = l1Var;
    }

    /* renamed from: A */
    public void mo49813A(C13823q qVar) {
        this.f19292d.mo49813A(qVar);
    }

    /* renamed from: G */
    public void mo49814G(C12451v1 v1Var) {
        this.f19290b.mo49779a(new C12254f(new C12250b(v1Var), new C12251c(v1Var)));
    }

    /* renamed from: b */
    public void mo49815b(int i) {
        this.f19290b.mo49779a(new C12255g(this, new C12249a(i), (C12249a) null));
    }

    /* renamed from: c */
    public void mo49816c(int i) {
        this.f19292d.mo49816c(i);
    }

    public void close() {
        this.f19292d.mo49987k0();
        this.f19290b.mo49779a(new C12255g(this, new C12253e(), (C12249a) null));
    }

    /* renamed from: k */
    public void mo49818k() {
        this.f19290b.mo49779a(new C12255g(this, new C12252d(), (C12249a) null));
    }
}
