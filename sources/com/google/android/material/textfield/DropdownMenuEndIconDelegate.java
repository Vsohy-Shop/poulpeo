package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C6372R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;

class DropdownMenuEndIconDelegate extends EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    @ChecksSdkIntAtLeast(api = 21)
    private static final boolean IS_LOLLIPOP = true;
    @Nullable
    private AccessibilityManager accessibilityManager;
    @Nullable
    private AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt = LocationRequestCompat.PASSIVE_INTERVAL;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    /* access modifiers changed from: private */
    public ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final View.OnFocusChangeListener onEditTextFocusChangeListener = new C6607g(this);
    private final View.OnClickListener onIconClickListener = new C6606f(this);
    private final AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new C6608h(this);

    DropdownMenuEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @NonNull
    private static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator getAlphaAnimator(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C6609i(this));
        return ofFloat;
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(67, 0.0f, 1.0f);
        ValueAnimator alphaAnimator = getAlphaAnimator(50, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate.this.refreshIconState();
                DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    private boolean isDropdownPopupActive() {
        long currentTimeMillis = System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$afterEditTextChanged$3() {
        boolean isPopupShowing = this.autoCompleteTextView.isPopupShowing();
        setEndIconChecked(isPopupShowing);
        this.dropdownPopupDirty = isPopupShowing;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getAlphaAnimator$6(ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        showHideDropdown();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z) {
        this.editTextHasFocus = z;
        refreshIconState();
        if (!z) {
            setEndIconChecked(false);
            this.dropdownPopupDirty = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(boolean z) {
        int i;
        AutoCompleteTextView autoCompleteTextView2 = this.autoCompleteTextView;
        if (autoCompleteTextView2 != null && !EditTextUtils.isEditable(autoCompleteTextView2)) {
            CheckableImageButton checkableImageButton = this.endIconView;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            ViewCompat.setImportantForAccessibility(checkableImageButton, i);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpDropdownShowHideBehavior$4(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (isDropdownPopupActive()) {
                this.dropdownPopupDirty = false;
            }
            showHideDropdown();
            updateDropdownPopupDirty();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpDropdownShowHideBehavior$5() {
        updateDropdownPopupDirty();
        setEndIconChecked(false);
    }

    private void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    private void setUpDropdownShowHideBehavior() {
        this.autoCompleteTextView.setOnTouchListener(new C6611k(this));
        if (IS_LOLLIPOP) {
            this.autoCompleteTextView.setOnDismissListener(new C6612l(this));
        }
        this.autoCompleteTextView.setThreshold(0);
    }

    private void showHideDropdown() {
        if (this.autoCompleteTextView != null) {
            if (isDropdownPopupActive()) {
                this.dropdownPopupDirty = false;
            }
            if (!this.dropdownPopupDirty) {
                if (IS_LOLLIPOP) {
                    setEndIconChecked(!this.isEndIconChecked);
                } else {
                    this.isEndIconChecked = !this.isEndIconChecked;
                    refreshIconState();
                }
                if (this.isEndIconChecked) {
                    this.autoCompleteTextView.requestFocus();
                    this.autoCompleteTextView.showDropDown();
                    return;
                }
                this.autoCompleteTextView.dismissDropDown();
                return;
            }
            this.dropdownPopupDirty = false;
        }
    }

    private void updateDropdownPopupDirty() {
        this.dropdownPopupDirty = true;
        this.dropdownPopupActivatedAt = System.currentTimeMillis();
    }

    public void afterEditTextChanged(Editable editable) {
        if (this.accessibilityManager.isTouchExplorationEnabled() && EditTextUtils.isEditable(this.autoCompleteTextView) && !this.endIconView.hasFocus()) {
            this.autoCompleteTextView.dismissDropDown();
        }
        this.autoCompleteTextView.post(new C6610j(this));
    }

    /* access modifiers changed from: package-private */
    public int getIconContentDescriptionResId() {
        return C6372R.string.exposed_dropdown_menu_content_description;
    }

    /* access modifiers changed from: package-private */
    public int getIconDrawableResId() {
        if (IS_LOLLIPOP) {
            return C6372R.C6374drawable.mtrl_dropdown_arrow;
        }
        return C6372R.C6374drawable.mtrl_ic_arrow_drop_down;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onEditTextFocusChangeListener;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    public AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.touchExplorationStateChangeListener;
    }

    /* access modifiers changed from: package-private */
    public boolean isBoxBackgroundModeSupported(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconActivable() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconActivated() {
        return this.editTextHasFocus;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconCheckable() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconChecked() {
        return this.isEndIconChecked;
    }

    public void onEditTextAttached(@Nullable EditText editText) {
        this.autoCompleteTextView = castAutoCompleteTextViewOrThrow(editText);
        setUpDropdownShowHideBehavior();
        this.textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!EditTextUtils.isEditable(editText) && this.accessibilityManager.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.endIconView, 2);
        }
        this.textInputLayout.setEndIconVisible(true);
    }

    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!EditTextUtils.isEditable(this.autoCompleteTextView)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText((CharSequence) null);
        }
    }

    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.accessibilityManager.isEnabled() && !EditTextUtils.isEditable(this.autoCompleteTextView)) {
            showHideDropdown();
            updateDropdownPopupDirty();
        }
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
        initAnimators();
        this.accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean shouldTintIconOnError() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void tearDown() {
        AutoCompleteTextView autoCompleteTextView2 = this.autoCompleteTextView;
        if (autoCompleteTextView2 != null) {
            autoCompleteTextView2.setOnTouchListener((View.OnTouchListener) null);
            if (IS_LOLLIPOP) {
                this.autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
