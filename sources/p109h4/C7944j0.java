package p109h4;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import p150l4.C8677c;
import p150l4.C8681e;
import p150l4.C8691j;
import p150l4.C8692j0;

@VisibleForTesting
/* renamed from: h4.j0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C7944j0 extends C8691j {

    /* renamed from: a */
    final /* synthetic */ C7947k0 f11145a;

    C7944j0(C7947k0 k0Var) {
        this.f11145a = k0Var;
    }

    /* renamed from: I2 */
    public final void mo41753I2(C8681e eVar) {
        C7947k0.m15650W(this.f11145a).post(new C7926e0(this, eVar));
    }

    /* renamed from: N2 */
    public final void mo41754N2(String str, byte[] bArr) {
        C7947k0.f11151G.mo42754a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    /* renamed from: R1 */
    public final void mo41755R1(int i) {
        C7947k0.m15650W(this.f11145a).post(new C7941i0(this, i));
    }

    /* renamed from: a */
    public final void mo41756a(int i) {
        C7947k0.m15641G(this.f11145a, i);
    }

    /* renamed from: c1 */
    public final void mo41757c1(C8677c cVar) {
        C7947k0.m15650W(this.f11145a).post(new C7920c0(this, cVar));
    }

    /* renamed from: c2 */
    public final void mo41758c2(String str, double d, boolean z) {
        C7947k0.f11151G.mo42754a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    /* renamed from: d1 */
    public final void mo41759d1(String str, String str2) {
        C7947k0.f11151G.mo42754a("Receive (type=text, ns=%s) %s", str, str2);
        C7947k0.m15650W(this.f11145a).post(new C7937h0(this, str, str2));
    }

    /* renamed from: i */
    public final void mo41760i(int i) {
        C7947k0.m15641G(this.f11145a, i);
    }

    /* renamed from: m */
    public final void mo41761m(int i) {
        C7947k0.m15641G(this.f11145a, i);
        C7947k0 k0Var = this.f11145a;
        if (k0Var.f11158D != null) {
            C7947k0.m15650W(k0Var).post(new C7923d0(this, i));
        }
    }

    /* renamed from: n2 */
    public final void mo41762n2(String str, long j) {
        C7947k0.m15640F(this.f11145a, j, 0);
    }

    /* renamed from: o0 */
    public final void mo41763o0(String str, long j, int i) {
        C7947k0.m15640F(this.f11145a, j, i);
    }

    /* renamed from: q */
    public final void mo41764q(int i) {
        C7947k0.m15650W(this.f11145a).post(new C7929f0(this, i));
    }

    /* renamed from: q1 */
    public final void mo41765q1(C7910b bVar, String str, String str2, boolean z) {
        this.f11145a.f11170t = bVar;
        this.f11145a.f11171u = str;
        C7947k0.m15639E(this.f11145a, new C8692j0(new Status(0), bVar, str, str2, z));
    }

    /* renamed from: t */
    public final void mo41766t(int i) {
        this.f11145a.m15648T(i);
    }

    /* renamed from: z2 */
    public final void mo41767z2(int i) {
        C7947k0.m15650W(this.f11145a).post(new C7933g0(this, i));
    }
}
