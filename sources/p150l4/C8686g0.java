package p150l4;

import android.content.Context;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.internal.C4756h;
import com.google.android.gms.tasks.Task;
import p109h4.C7958q;

/* renamed from: l4.g0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8686g0 extends C4730b {

    /* renamed from: k */
    private static final C4719a.C4729g f12425k;

    /* renamed from: l */
    private static final C4719a.C4720a f12426l;

    /* renamed from: m */
    private static final C4719a f12427m;

    static {
        C4719a.C4729g gVar = new C4719a.C4729g();
        f12425k = gVar;
        C8678c0 c0Var = new C8678c0();
        f12426l = c0Var;
        f12427m = new C4719a("CastApi.API", c0Var, gVar);
    }

    public C8686g0(Context context) {
        super(context, f12427m, C4719a.C4723d.f4905N, C4730b.C4731a.f4916c);
    }

    /* renamed from: B */
    public final Task mo42783B(String[] strArr) {
        return mo32411k(C4756h.m6576a().mo32518b(new C8674a0(this, strArr)).mo32520d(C7958q.f11186d).mo32519c(false).mo32521e(8425).mo32517a());
    }
}
