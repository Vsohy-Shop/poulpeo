package p077e8;

import android.app.Application;
import p051c8.C3954k0;
import p376ke.C12657a;

/* renamed from: e8.q */
/* compiled from: ForegroundFlowableModule */
public class C7514q {
    /* renamed from: a */
    public C12657a<String> mo41235a(Application application) {
        C3954k0 k0Var = new C3954k0();
        C12657a<String> b = k0Var.mo29981b();
        b.mo50402K();
        application.registerActivityLifecycleCallbacks(k0Var);
        return b;
    }
}
