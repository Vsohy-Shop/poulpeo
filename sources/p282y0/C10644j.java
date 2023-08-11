package p282y0;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: y0.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10644j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C10645k f16195a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup.LayoutParams f16196b;

    public /* synthetic */ C10644j(C10645k kVar, ViewGroup.LayoutParams layoutParams) {
        this.f16195a = kVar;
        this.f16196b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16195a.m22603e(this.f16196b, valueAnimator);
    }
}
