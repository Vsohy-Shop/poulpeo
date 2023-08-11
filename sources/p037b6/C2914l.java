package p037b6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b6.l */
final class C2914l extends C2902f {

    /* renamed from: c */
    final /* synthetic */ IBinder f1311c;

    /* renamed from: d */
    final /* synthetic */ C2918n f1312d;

    C2914l(C2918n nVar, IBinder iBinder) {
        this.f1312d = nVar;
        this.f1311c = iBinder;
    }

    /* renamed from: a */
    public final void mo28426a() {
        C2920o oVar = this.f1312d.f1314b;
        oVar.f1326k = (IInterface) oVar.f1322g.mo28443a(this.f1311c);
        C2920o.m2371n(this.f1312d.f1314b);
        this.f1312d.f1314b.f1320e = false;
        for (Runnable run : this.f1312d.f1314b.f1319d) {
            run.run();
        }
        this.f1312d.f1314b.f1319d.clear();
    }
}
