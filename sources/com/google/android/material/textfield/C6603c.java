package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6603c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ClearTextEndIconDelegate f8528a;

    public /* synthetic */ C6603c(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.f8528a = clearTextEndIconDelegate;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8528a.lambda$getAlphaAnimator$3(valueAnimator);
    }
}
