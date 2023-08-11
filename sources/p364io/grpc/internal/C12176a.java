package p364io.grpc.internal;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p122i6.C8186a;
import p364io.grpc.C12159b;
import p364io.grpc.C12168f;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12231d;
import p364io.grpc.internal.C12362m1;
import p364io.grpc.internal.C12402r;
import p458xd.C13809k;
import p458xd.C13819p;
import p458xd.C13824r;

/* renamed from: io.grpc.internal.a */
/* compiled from: AbstractClientStream */
public abstract class C12176a extends C12231d implements C12398q, C12362m1.C12366d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f19088g = Logger.getLogger(C12176a.class.getName());

    /* renamed from: a */
    private final C12379o2 f19089a;

    /* renamed from: b */
    private final C12395p0 f19090b;

    /* renamed from: c */
    private boolean f19091c;

    /* renamed from: d */
    private boolean f19092d;

    /* renamed from: e */
    private C12564o f19093e;

    /* renamed from: f */
    private volatile boolean f19094f;

    /* renamed from: io.grpc.internal.a$b */
    /* compiled from: AbstractClientStream */
    protected interface C12178b {
        /* renamed from: a */
        void mo49683a(C12594t tVar);

        /* renamed from: b */
        void mo49684b(C12397p2 p2Var, boolean z, boolean z2, int i);

        /* renamed from: c */
        void mo49685c(C12564o oVar, byte[] bArr);
    }

    /* renamed from: io.grpc.internal.a$c */
    /* compiled from: AbstractClientStream */
    protected static abstract class C12179c extends C12231d.C12232a {

        /* renamed from: i */
        private final C12324i2 f19100i;

        /* renamed from: j */
        private boolean f19101j;

        /* renamed from: k */
        private C12402r f19102k;

        /* renamed from: l */
        private boolean f19103l;

        /* renamed from: m */
        private C13824r f19104m = C13824r.m31754c();

        /* renamed from: n */
        private boolean f19105n = false;

        /* renamed from: o */
        private Runnable f19106o;

        /* renamed from: p */
        private volatile boolean f19107p;

        /* renamed from: q */
        private boolean f19108q;

        /* renamed from: r */
        private boolean f19109r;

        /* renamed from: io.grpc.internal.a$c$a */
        /* compiled from: AbstractClientStream */
        class C12180a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f19110b;

            /* renamed from: c */
            final /* synthetic */ C12402r.C12403a f19111c;

            /* renamed from: d */
            final /* synthetic */ C12564o f19112d;

            C12180a(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
                this.f19110b = tVar;
                this.f19111c = aVar;
                this.f19112d = oVar;
            }

            public void run() {
                C12179c.this.m26594C(this.f19110b, this.f19111c, this.f19112d);
            }
        }

        protected C12179c(int i, C12324i2 i2Var, C12379o2 o2Var) {
            super(i, i2Var, o2Var);
            this.f19100i = (C12324i2) C8012n.m15756o(i2Var, "statsTraceCtx");
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public void m26594C(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
            if (!this.f19101j) {
                this.f19101j = true;
                this.f19100i.mo49948m(tVar);
                mo49695n().mo49740d(tVar, aVar, oVar);
                if (mo49782l() != null) {
                    mo49782l().mo50027f(tVar.mo50308p());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: I */
        public void m26595I(C13824r rVar) {
            boolean z;
            if (this.f19102k == null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "Already called start");
            this.f19104m = (C13824r) C8012n.m15756o(rVar, "decompressorRegistry");
        }

        /* access modifiers changed from: private */
        /* renamed from: J */
        public void m26596J(boolean z) {
            this.f19103l = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: L */
        public final void m26597L() {
            this.f19107p = true;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49686D(p364io.grpc.internal.C12451v1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "frame"
                p111h6.C8012n.m15756o(r5, r0)
                r0 = 1
                boolean r1 = r4.f19108q     // Catch:{ all -> 0x0020 }
                if (r1 == 0) goto L_0x0019
                java.util.logging.Logger r1 = p364io.grpc.internal.C12176a.f19088g     // Catch:{ all -> 0x0020 }
                java.util.logging.Level r2 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0020 }
                java.lang.String r3 = "Received data on closed stream"
                r1.log(r2, r3)     // Catch:{ all -> 0x0020 }
                r5.close()
                return
            L_0x0019:
                r4.mo49781k(r5)     // Catch:{ all -> 0x001d }
                return
            L_0x001d:
                r1 = move-exception
                r0 = 0
                goto L_0x0021
            L_0x0020:
                r1 = move-exception
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r5.close()
            L_0x0026:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12176a.C12179c.mo49686D(io.grpc.internal.v1):void");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49687E(p364io.grpc.C12564o r6) {
            /*
                r5 = this;
                boolean r0 = r5.f19108q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                p111h6.C8012n.m15762u(r0, r2)
                io.grpc.internal.i2 r0 = r5.f19100i
                r0.mo49937a()
                io.grpc.o$g<java.lang.String> r0 = p364io.grpc.internal.C12404r0.f19747f
                java.lang.Object r0 = r6.mo50241f(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f19103l
                r3 = 0
                if (r2 == 0) goto L_0x004f
                if (r0 == 0) goto L_0x004f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x002f
                io.grpc.internal.s0 r0 = new io.grpc.internal.s0
                r0.<init>()
                r5.mo49788w(r0)
                r0 = r1
                goto L_0x0050
            L_0x002f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x004f
                io.grpc.t r6 = p364io.grpc.C12594t.f20197t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                io.grpc.t r6 = r6.mo50310r(r0)
                io.grpc.StatusRuntimeException r6 = r6.mo50300d()
                r5.mo49833d(r6)
                return
            L_0x004f:
                r0 = r3
            L_0x0050:
                io.grpc.o$g<java.lang.String> r2 = p364io.grpc.internal.C12404r0.f19745d
                java.lang.Object r2 = r6.mo50241f(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x0099
                xd.r r4 = r5.f19104m
                xd.q r4 = r4.mo53494e(r2)
                if (r4 != 0) goto L_0x007a
                io.grpc.t r6 = p364io.grpc.C12594t.f20197t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.t r6 = r6.mo50310r(r0)
                io.grpc.StatusRuntimeException r6 = r6.mo50300d()
                r5.mo49833d(r6)
                return
            L_0x007a:
                xd.i r1 = p458xd.C13799i.C13801b.f22244a
                if (r4 == r1) goto L_0x0099
                if (r0 == 0) goto L_0x0096
                io.grpc.t r6 = p364io.grpc.C12594t.f20197t
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.String r0 = java.lang.String.format(r0, r1)
                io.grpc.t r6 = r6.mo50310r(r0)
                io.grpc.StatusRuntimeException r6 = r6.mo50300d()
                r5.mo49833d(r6)
                return
            L_0x0096:
                r5.mo49787v(r4)
            L_0x0099:
                io.grpc.internal.r r0 = r5.mo49695n()
                r0.mo49738b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12176a.C12179c.mo49687E(io.grpc.o):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public void mo49688F(C12564o oVar, C12594t tVar) {
            C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            C8012n.m15756o(oVar, "trailers");
            if (this.f19108q) {
                C12176a.f19088g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{tVar, oVar});
                return;
            }
            this.f19100i.mo49938b(oVar);
            mo49693N(tVar, false, oVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: G */
        public final boolean mo49689G() {
            return this.f19107p;
        }

        /* access modifiers changed from: protected */
        /* renamed from: H */
        public final C12402r mo49695n() {
            return this.f19102k;
        }

        /* renamed from: K */
        public final void mo49691K(C12402r rVar) {
            boolean z;
            if (this.f19102k == null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "Already called setListener");
            this.f19102k = (C12402r) C8012n.m15756o(rVar, "listener");
        }

        /* renamed from: M */
        public final void mo49692M(C12594t tVar, C12402r.C12403a aVar, boolean z, C12564o oVar) {
            C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            C8012n.m15756o(oVar, "trailers");
            if (!this.f19108q || z) {
                this.f19108q = true;
                this.f19109r = tVar.mo50308p();
                mo49785s();
                if (this.f19105n) {
                    this.f19106o = null;
                    m26594C(tVar, aVar, oVar);
                    return;
                }
                this.f19106o = new C12180a(tVar, aVar, oVar);
                mo49780j(z);
            }
        }

        /* renamed from: N */
        public final void mo49693N(C12594t tVar, boolean z, C12564o oVar) {
            mo49692M(tVar, C12402r.C12403a.PROCESSED, z, oVar);
        }

        /* renamed from: b */
        public void mo49694b(boolean z) {
            C8012n.m15762u(this.f19108q, "status should have been reported on deframer closed");
            this.f19105n = true;
            if (this.f19109r && z) {
                mo49693N(C12594t.f20197t.mo50310r("Encountered end-of-stream mid-frame"), true, new C12564o());
            }
            Runnable runnable = this.f19106o;
            if (runnable != null) {
                runnable.run();
                this.f19106o = null;
            }
        }
    }

    protected C12176a(C12401q2 q2Var, C12324i2 i2Var, C12379o2 o2Var, C12564o oVar, C12159b bVar, boolean z) {
        C8012n.m15756o(oVar, "headers");
        this.f19089a = (C12379o2) C8012n.m15756o(o2Var, "transportTracer");
        this.f19091c = C12404r0.m27336o(bVar);
        this.f19092d = z;
        if (!z) {
            this.f19090b = new C12362m1(this, q2Var, i2Var);
            this.f19093e = oVar;
            return;
        }
        this.f19090b = new C12177a(oVar, i2Var);
    }

    /* renamed from: a */
    public final void mo49660a(C12594t tVar) {
        C8012n.m15746e(!tVar.mo50308p(), "Should not cancel with OK status");
        this.f19094f = true;
        mo49673t().mo49683a(tVar);
    }

    /* renamed from: c */
    public void mo49661c(int i) {
        mo49672s().mo49789x(i);
    }

    /* renamed from: d */
    public void mo49662d(int i) {
        this.f19090b.mo49678d(i);
    }

    /* renamed from: f */
    public void mo49663f(C13819p pVar) {
        C12564o oVar = this.f19093e;
        C12564o.C12571g<Long> gVar = C12404r0.f19744c;
        oVar.mo50240d(gVar);
        this.f19093e.mo50244n(gVar, Long.valueOf(Math.max(0, pVar.mo53489i(TimeUnit.NANOSECONDS))));
    }

    /* renamed from: h */
    public final void mo49664h(C12460x0 x0Var) {
        x0Var.mo50128b("remote_addr", getAttributes().mo49607b(C12168f.f19077a));
    }

    /* renamed from: i */
    public final void mo49665i() {
        if (!mo49672s().mo49689G()) {
            mo49672s().m26597L();
            mo49777p();
        }
    }

    public final boolean isReady() {
        if (!super.isReady() || this.f19094f) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo49667j(C12402r rVar) {
        mo49672s().mo49691K(rVar);
        if (!this.f19092d) {
            mo49673t().mo49685c(this.f19093e, (byte[]) null);
            this.f19093e = null;
        }
    }

    /* renamed from: m */
    public final void mo49668m(C12397p2 p2Var, boolean z, boolean z2, int i) {
        boolean z3;
        if (p2Var != null || z) {
            z3 = true;
        } else {
            z3 = false;
        }
        C8012n.m15746e(z3, "null frame before EOS");
        mo49673t().mo49684b(p2Var, z, z2, i);
    }

    /* renamed from: n */
    public final void mo49669n(C13824r rVar) {
        mo49672s().m26595I(rVar);
    }

    /* renamed from: o */
    public final void mo49670o(boolean z) {
        mo49672s().m26596J(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C12395p0 mo49671q() {
        return this.f19090b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract C12178b mo49673t();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C12379o2 mo49674v() {
        return this.f19089a;
    }

    /* renamed from: w */
    public final boolean mo49675w() {
        return this.f19091c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract C12179c mo49672s();

    /* renamed from: io.grpc.internal.a$a */
    /* compiled from: AbstractClientStream */
    private class C12177a implements C12395p0 {

        /* renamed from: a */
        private C12564o f19095a;

        /* renamed from: b */
        private boolean f19096b;

        /* renamed from: c */
        private final C12324i2 f19097c;

        /* renamed from: d */
        private byte[] f19098d;

        public C12177a(C12564o oVar, C12324i2 i2Var) {
            this.f19095a = (C12564o) C8012n.m15756o(oVar, "headers");
            this.f19097c = (C12324i2) C8012n.m15756o(i2Var, "statsTraceCtx");
        }

        public void close() {
            boolean z = true;
            this.f19096b = true;
            if (this.f19098d == null) {
                z = false;
            }
            C8012n.m15762u(z, "Lack of request message. GET request is only supported for unary requests");
            C12176a.this.mo49673t().mo49685c(this.f19095a, this.f19098d);
            this.f19098d = null;
            this.f19095a = null;
        }

        /* renamed from: f */
        public void mo49680f(InputStream inputStream) {
            boolean z;
            if (this.f19098d == null) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "writePayload should not be called multiple times");
            try {
                this.f19098d = C8186a.m16201d(inputStream);
                this.f19097c.mo49944i(0);
                C12324i2 i2Var = this.f19097c;
                byte[] bArr = this.f19098d;
                i2Var.mo49945j(0, (long) bArr.length, (long) bArr.length);
                this.f19097c.mo49946k((long) this.f19098d.length);
                this.f19097c.mo49947l((long) this.f19098d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean isClosed() {
            return this.f19096b;
        }

        public void flush() {
        }

        /* renamed from: d */
        public void mo49678d(int i) {
        }

        /* renamed from: e */
        public C12395p0 mo49679e(C13809k kVar) {
            return this;
        }
    }
}
