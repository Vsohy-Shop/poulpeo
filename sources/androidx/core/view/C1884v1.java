package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.v1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1884v1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewPropertyAnimatorUpdateListener f532a;

    /* renamed from: b */
    public final /* synthetic */ View f533b;

    public /* synthetic */ C1884v1(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.f532a = viewPropertyAnimatorUpdateListener;
        this.f533b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f532a.onAnimationUpdate(this.f533b);
    }
}
