package p253v4;

import android.content.Context;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.internal.C4756h;
import com.google.android.gms.tasks.Task;
import p121i5.C8183d;
import p231t4.C9725t;
import p231t4.C9731v;
import p231t4.C9734w;

/* renamed from: v4.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9938d extends C4730b<C9734w> implements C9731v {

    /* renamed from: k */
    private static final C4719a.C4729g<C9939e> f14932k;

    /* renamed from: l */
    private static final C4719a.C4720a<C9939e, C9734w> f14933l;

    /* renamed from: m */
    private static final C4719a<C9734w> f14934m;

    /* renamed from: n */
    public static final /* synthetic */ int f14935n = 0;

    static {
        C4719a.C4729g<C9939e> gVar = new C4719a.C4729g<>();
        f14932k = gVar;
        C9937c cVar = new C9937c();
        f14933l = cVar;
        f14934m = new C4719a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C9938d(Context context, C9734w wVar) {
        super(context, f14934m, wVar, C4730b.C4731a.f4916c);
    }

    /* renamed from: g */
    public final Task<Void> mo44261g(C9725t tVar) {
        C4756h.C4757a a = C4756h.m6576a();
        a.mo32520d(C8183d.f11505a);
        a.mo32519c(false);
        a.mo32518b(new C9936b(tVar));
        return mo32410j(a.mo32517a());
    }
}
