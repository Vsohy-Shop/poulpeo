package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C6372R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;
    @Nullable
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    StartCompoundLayout(TextInputLayout textInputLayout2, TintTypedArray tintTypedArray) {
        super(textInputLayout2.getContext());
        this.textInputLayout = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C6372R.C6377layout.design_text_input_start_icon, this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(tintTypedArray);
        initPrefixTextView(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(TintTypedArray tintTypedArray) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(C6372R.C6375id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(this.prefixTextView, 1);
        setPrefixTextAppearance(tintTypedArray.getResourceId(C6372R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i = C6372R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i)) {
            setPrefixTextColor(tintTypedArray.getColorStateList(i));
        }
        setPrefixText(tintTypedArray.getText(C6372R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        int i = C6372R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i);
        }
        int i2 = C6372R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i2)) {
            this.startIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = C6372R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i3)) {
            setStartIconDrawable(tintTypedArray.getDrawable(i3));
            int i4 = C6372R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i4)) {
                setStartIconContentDescription(tintTypedArray.getText(i4));
            }
            setStartIconCheckable(tintTypedArray.getBoolean(C6372R.styleable.TextInputLayout_startIconCheckable, true));
        }
    }

    private void updateVisibility() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.prefixText == null || this.hintExpanded) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.startIconView.getVisibility() == 0 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    /* access modifiers changed from: package-private */
    public boolean isStartIconVisible() {
        if (this.startIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    /* access modifiers changed from: package-private */
    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    /* access modifiers changed from: package-private */
    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.prefixText = charSequence2;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    /* access modifiers changed from: package-private */
    public void setPrefixTextAppearance(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.prefixTextView, i);
    }

    /* access modifiers changed from: package-private */
    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    /* access modifiers changed from: package-private */
    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    /* access modifiers changed from: package-private */
    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void setStartIconVisible(boolean z) {
        int i;
        if (isStartIconVisible() != z) {
            CheckableImageButton checkableImageButton = this.startIconView;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    /* access modifiers changed from: package-private */
    public void setupAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.prefixTextView.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(this.prefixTextView);
            accessibilityNodeInfoCompat.setTraversalAfter(this.prefixTextView);
            return;
        }
        accessibilityNodeInfoCompat.setTraversalAfter(this.startIconView);
    }

    /* access modifiers changed from: package-private */
    public void updatePrefixTextViewPadding() {
        int i;
        EditText editText = this.textInputLayout.editText;
        if (editText != null) {
            if (isStartIconVisible()) {
                i = 0;
            } else {
                i = ViewCompat.getPaddingStart(editText);
            }
            ViewCompat.setPaddingRelative(this.prefixTextView, i, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C6372R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }
}
