package p019a1;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.C12775o;

/* renamed from: a1.a */
/* compiled from: AnimationUtils.kt */
public final class C2112a {

    /* renamed from: a */
    private static final Interpolator f796a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f797b = new DecelerateInterpolator();

    /* renamed from: a */
    public static final Animation m1457a(float f, float f2, long j, boolean z) {
        return m1458b(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f, 1, f2), j, z);
    }

    /* renamed from: b */
    public static final Animation m1458b(Animation animation, long j, boolean z) {
        C12775o.m28639i(animation, "animation");
        animation.setDuration(j);
        if (z) {
            animation.setInterpolator(f796a);
        } else {
            animation.setInterpolator(f797b);
        }
        return animation;
    }
}
