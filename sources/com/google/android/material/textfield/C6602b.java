package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6602b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ClearTextEndIconDelegate f8527a;

    public /* synthetic */ C6602b(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.f8527a = clearTextEndIconDelegate;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8527a.lambda$getScaleAnimator$4(valueAnimator);
    }
}
