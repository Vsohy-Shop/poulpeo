package p109h4;

import p109h4.C7913c;

/* renamed from: h4.h0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final /* synthetic */ class C7937h0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7944j0 f11119b;

    /* renamed from: c */
    public final /* synthetic */ String f11120c;

    /* renamed from: d */
    public final /* synthetic */ String f11121d;

    public /* synthetic */ C7937h0(C7944j0 j0Var, String str, String str2) {
        this.f11119b = j0Var;
        this.f11120c = str;
        this.f11121d = str2;
    }

    public final void run() {
        C7913c.C7919e eVar;
        C7944j0 j0Var = this.f11119b;
        String str = this.f11120c;
        String str2 = this.f11121d;
        synchronized (j0Var.f11145a.f11157C) {
            eVar = (C7913c.C7919e) j0Var.f11145a.f11157C.get(str);
        }
        if (eVar != null) {
            eVar.mo32161a(j0Var.f11145a.f11155A, str, str2);
            return;
        }
        C7947k0.f11151G.mo42754a("Discarded message for unknown namespace '%s'", str);
    }
}
