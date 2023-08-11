package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C6372R;
import com.google.android.material.animation.AnimationUtils;

class ClearTextEndIconDelegate extends EndIconDelegate {
    private static final int ANIMATION_FADE_DURATION = 100;
    private static final int ANIMATION_SCALE_DURATION = 150;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    @Nullable
    private EditText editText;
    private AnimatorSet iconInAnim;
    private ValueAnimator iconOutAnim;
    private final View.OnFocusChangeListener onFocusChangeListener = new C6605e(this);
    private final View.OnClickListener onIconClickListener = new C6604d(this);

    ClearTextEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    private void animateIcon(boolean z) {
        boolean z2;
        if (this.endLayout.isEndIconVisible() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.iconInAnim.isRunning()) {
            this.iconOutAnim.cancel();
            this.iconInAnim.start();
            if (z2) {
                this.iconInAnim.end();
            }
        } else if (!z) {
            this.iconInAnim.cancel();
            this.iconOutAnim.start();
            if (z2) {
                this.iconOutAnim.end();
            }
        }
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C6603c(this));
        return ofFloat;
    }

    private ValueAnimator getScaleAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{ANIMATION_SCALE_FROM_VALUE, 1.0f});
        ofFloat.setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C6602b(this));
        return ofFloat;
    }

    private void initAnimators() {
        ValueAnimator scaleAnimator = getScaleAnimator();
        ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(new Animator[]{scaleAnimator, alphaAnimator});
        this.iconInAnim.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(true);
            }
        });
        ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.iconOutAnim = alphaAnimator2;
        alphaAnimator2.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(false);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getAlphaAnimator$3(ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getScaleAnimator$4(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setScaleX(floatValue);
        this.endIconView.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            Editable text = editText2.getText();
            if (text != null) {
                text.clear();
            }
            refreshIconState();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z) {
        animateIcon(shouldBeVisible());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$tearDown$2() {
        animateIcon(true);
    }

    private boolean shouldBeVisible() {
        EditText editText2 = this.editText;
        if (editText2 == null || ((!editText2.hasFocus() && !this.endIconView.hasFocus()) || this.editText.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void afterEditTextChanged(@NonNull Editable editable) {
        if (this.endLayout.getSuffixText() == null) {
            animateIcon(shouldBeVisible());
        }
    }

    /* access modifiers changed from: package-private */
    public int getIconContentDescriptionResId() {
        return C6372R.string.clear_text_end_icon_content_description;
    }

    /* access modifiers changed from: package-private */
    public int getIconDrawableResId() {
        return C6372R.C6374drawable.mtrl_ic_cancel;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    public void onEditTextAttached(@Nullable EditText editText2) {
        this.editText = editText2;
        this.textInputLayout.setEndIconVisible(shouldBeVisible());
    }

    /* access modifiers changed from: package-private */
    public void onSuffixVisibilityChanged(boolean z) {
        if (this.endLayout.getSuffixText() != null) {
            animateIcon(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
        initAnimators();
    }

    /* access modifiers changed from: package-private */
    public void tearDown() {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            editText2.post(new C6601a(this));
        }
    }
}
