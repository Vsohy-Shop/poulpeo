package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0127Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C6372R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    @C0127Px
    private int slideDistance = -1;
    private int slideEdge;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i) {
        this.slideEdge = i;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i, @C0127Px int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            if (isRtl(view)) {
                f = ((float) i2) + translationX;
            } else {
                f = translationX - ((float) i2);
            }
            return createTranslationXAnimator(view2, f, translationX, translationX);
        } else if (i == 8388613) {
            if (isRtl(view)) {
                f2 = translationX - ((float) i2);
            } else {
                f2 = ((float) i2) + translationX;
            }
            return createTranslationXAnimator(view2, f2, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i, @C0127Px int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            if (isRtl(view)) {
                f = translationX - ((float) i2);
            } else {
                f = ((float) i2) + translationX;
            }
            return createTranslationXAnimator(view2, translationX, f, translationX);
        } else if (i == 8388613) {
            if (isRtl(view)) {
                f2 = ((float) i2) + translationX;
            } else {
                f2 = translationX - ((float) i2);
            }
            return createTranslationXAnimator(view2, translationX, f2, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    private static Animator createTranslationXAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i = this.slideDistance;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(C6372R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @C0127Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@C0127Px int i) {
        if (i >= 0) {
            this.slideDistance = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i) {
        this.slideEdge = i;
    }
}
