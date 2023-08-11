package p260w0;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import kotlin.jvm.internal.C12775o;
import p018a0.C2110h;
import p019a1.C2112a;
import p069e0.C7358a;
import p069e0.C7408o;
import p238u0.C9858l;

/* renamed from: w0.a */
/* compiled from: DefaultInAppMessageAnimationFactory.kt */
public class C10086a implements C9858l {

    /* renamed from: a */
    private final long f15246a = ((long) Resources.getSystem().getInteger(17694720));

    /* renamed from: a */
    public Animation mo44367a(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        if (!(aVar instanceof C7408o)) {
            return C2112a.m1458b(new AlphaAnimation(1.0f, 0.0f), this.f15246a, false);
        }
        if (((C7408o) aVar).mo41050x0() == C2110h.TOP) {
            return C2112a.m1457a(0.0f, -1.0f, this.f15246a, false);
        }
        return C2112a.m1457a(0.0f, 1.0f, this.f15246a, false);
    }

    /* renamed from: b */
    public Animation mo44368b(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        if (!(aVar instanceof C7408o)) {
            return C2112a.m1458b(new AlphaAnimation(0.0f, 1.0f), this.f15246a, true);
        }
        if (((C7408o) aVar).mo41050x0() == C2110h.TOP) {
            return C2112a.m1457a(-1.0f, 0.0f, this.f15246a, false);
        }
        return C2112a.m1457a(1.0f, 0.0f, this.f15246a, false);
    }
}
