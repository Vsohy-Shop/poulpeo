package p150l4;

import p109h4.C7913c;

/* renamed from: l4.n0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C8700n0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C8704p0 f12452b;

    /* renamed from: c */
    final /* synthetic */ String f12453c;

    /* renamed from: d */
    final /* synthetic */ String f12454d;

    C8700n0(C8702o0 o0Var, C8704p0 p0Var, String str, String str2) {
        this.f12452b = p0Var;
        this.f12453c = str;
        this.f12454d = str2;
    }

    public final void run() {
        C7913c.C7919e eVar;
        synchronized (this.f12452b.f12466X) {
            eVar = (C7913c.C7919e) this.f12452b.f12466X.get(this.f12453c);
        }
        if (eVar != null) {
            eVar.mo32161a(this.f12452b.f12464K, this.f12453c, this.f12454d);
            return;
        }
        C8704p0.f12460t0.mo42754a("Discarded message for unknown namespace '%s'", this.f12453c);
    }
}
