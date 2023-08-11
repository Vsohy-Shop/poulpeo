package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

abstract class EndIconDelegate {
    final Context context;
    final CheckableImageButton endIconView;
    final EndCompoundLayout endLayout;
    final TextInputLayout textInputLayout;

    EndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        this.textInputLayout = endCompoundLayout.textInputLayout;
        this.endLayout = endCompoundLayout;
        this.context = endCompoundLayout.getContext();
        this.endIconView = endCompoundLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    @StringRes
    public int getIconContentDescriptionResId() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @DrawableRes
    public int getIconDrawableResId() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnIconClickListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean isBoxBackgroundModeSupported(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconActivable() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconActivated() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconCheckable() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconChecked() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void refreshIconState() {
        this.endLayout.refreshIconState(false);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldTintIconOnError() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
    }

    /* access modifiers changed from: package-private */
    public void tearDown() {
    }

    /* access modifiers changed from: package-private */
    public void afterEditTextChanged(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public void onEditTextAttached(@Nullable EditText editText) {
    }

    /* access modifiers changed from: package-private */
    public void onSuffixVisibilityChanged(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* access modifiers changed from: package-private */
    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: package-private */
    public void beforeEditTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
