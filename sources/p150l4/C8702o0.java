package p150l4;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.C4968j0;
import java.util.concurrent.atomic.AtomicReference;
import p109h4.C7910b;

/* renamed from: l4.o0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C8702o0 extends C8691j {

    /* renamed from: a */
    private final AtomicReference f12456a;

    /* renamed from: b */
    private final Handler f12457b;

    public C8702o0(C8704p0 p0Var) {
        this.f12456a = new AtomicReference(p0Var);
        this.f12457b = new C4968j0(p0Var.mo44123C());
    }

    /* renamed from: G */
    public final C8704p0 mo42807G() {
        C8704p0 p0Var = (C8704p0) this.f12456a.getAndSet((Object) null);
        if (p0Var == null) {
            return null;
        }
        p0Var.m17567z0();
        return p0Var;
    }

    /* renamed from: I2 */
    public final void mo41753I2(C8681e eVar) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            C8704p0.f12460t0.mo42754a("onDeviceStatusChanged", new Object[0]);
            this.f12457b.post(new C8696l0(this, p0Var, eVar));
        }
    }

    /* renamed from: N2 */
    public final void mo41754N2(String str, byte[] bArr) {
        if (((C8704p0) this.f12456a.get()) != null) {
            C8704p0.f12460t0.mo42754a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    /* renamed from: a */
    public final void mo41756a(int i) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.m17550C0(i);
        }
    }

    /* renamed from: c1 */
    public final void mo41757c1(C8677c cVar) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            C8704p0.f12460t0.mo42754a("onApplicationStatusChanged", new Object[0]);
            this.f12457b.post(new C8698m0(this, p0Var, cVar));
        }
    }

    /* renamed from: c2 */
    public final void mo41758c2(String str, double d, boolean z) {
        C8704p0.f12460t0.mo42754a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    /* renamed from: d1 */
    public final void mo41759d1(String str, String str2) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            C8704p0.f12460t0.mo42754a("Receive (type=text, ns=%s) %s", str, str2);
            this.f12457b.post(new C8700n0(this, p0Var, str, str2));
        }
    }

    /* renamed from: i */
    public final void mo41760i(int i) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.m17550C0(i);
        }
    }

    /* renamed from: m */
    public final void mo41761m(int i) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.f12480n0 = null;
            p0Var.f12481o0 = null;
            p0Var.m17550C0(i);
            if (p0Var.f12465M != null) {
                this.f12457b.post(new C8694k0(this, p0Var, i));
            }
        }
    }

    /* renamed from: n2 */
    public final void mo41762n2(String str, long j) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.m17549B0(j, 0);
        }
    }

    /* renamed from: o0 */
    public final void mo41763o0(String str, long j, int i) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.m17549B0(j, i);
        }
    }

    /* renamed from: q */
    public final void mo41764q(int i) {
        C8704p0 G = mo42807G();
        if (G != null) {
            C8704p0.f12460t0.mo42754a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                G.mo44134R(2);
            }
        }
    }

    /* renamed from: q1 */
    public final void mo41765q1(C7910b bVar, String str, String str2, boolean z) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.f12463J = bVar;
            p0Var.f12480n0 = bVar.mo41655A();
            p0Var.f12481o0 = str2;
            p0Var.f12470d0 = str;
            synchronized (C8704p0.f12461u0) {
                if (p0Var.f12484r0 != null) {
                    p0Var.f12484r0.mo32470a(new C8692j0(new Status(0), bVar, str, str2, z));
                    p0Var.f12484r0 = null;
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo41766t(int i) {
        C8704p0 p0Var = (C8704p0) this.f12456a.get();
        if (p0Var != null) {
            p0Var.mo42812y0(i);
        }
    }

    /* renamed from: R1 */
    public final void mo41755R1(int i) {
    }

    /* renamed from: z2 */
    public final void mo41767z2(int i) {
    }
}
