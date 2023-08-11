package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.C6372R;
import com.google.android.material.drawable.DrawableUtils;

public class MaterialSwitch extends SwitchCompat {
    private static final int DEF_STYLE_RES = C6372R.C6378style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] STATE_SET_WITH_ICON = {C6372R.attr.state_with_icon};
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;
    @Nullable
    private Drawable thumbDrawable;
    @Nullable
    private Drawable thumbIconDrawable;
    @Nullable
    private ColorStateList thumbIconTintList;
    @NonNull
    private PorterDuff.Mode thumbIconTintMode;
    @Nullable
    private ColorStateList thumbTintList;
    @Nullable
    private Drawable trackDecorationDrawable;
    @Nullable
    private ColorStateList trackDecorationTintList;
    @NonNull
    private PorterDuff.Mode trackDecorationTintMode;
    @Nullable
    private Drawable trackDrawable;
    @Nullable
    private ColorStateList trackTintList;

    public MaterialSwitch(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    private void refreshThumbDrawable() {
        this.thumbDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbDrawable, this.thumbTintList, getThumbTintMode());
        this.thumbIconDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.thumbDrawable, this.thumbIconDrawable));
        refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        this.trackDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDrawable, this.trackTintList, getTrackTintMode());
        this.trackDecorationDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        Drawable drawable = this.trackDrawable;
        if (drawable != null && this.trackDecorationDrawable != null) {
            drawable = new LayerDrawable(new Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (drawable == null) {
            drawable = this.trackDecorationDrawable;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    private static void setInterpolatedDrawableTintIfPossible(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f) {
        if (drawable != null && colorStateList != null) {
            DrawableCompat.setTint(drawable, ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    private void updateDrawableTints() {
        if (this.thumbTintList != null || this.thumbIconTintList != null || this.trackTintList != null || this.trackDecorationTintList != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.thumbTintList;
            if (colorStateList != null) {
                setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
            }
            ColorStateList colorStateList2 = this.thumbIconTintList;
            if (colorStateList2 != null) {
                setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
            }
            ColorStateList colorStateList3 = this.trackTintList;
            if (colorStateList3 != null) {
                setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
            }
            ColorStateList colorStateList4 = this.trackDecorationTintList;
            if (colorStateList4 != null) {
                setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
            }
        }
    }

    @Nullable
    public Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    @Nullable
    public Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    public void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.thumbIconDrawable != null) {
            View.mergeDrawableStates(onCreateDrawableState, STATE_SET_WITH_ICON);
        }
        this.currentStateUnchecked = DrawableUtils.getUncheckedState(onCreateDrawableState);
        this.currentStateChecked = DrawableUtils.getCheckedState(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C6372R.attr.materialSwitchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r7 = super.getThumbDrawable()
            r6.thumbDrawable = r7
            android.content.res.ColorStateList r7 = super.getThumbTintList()
            r6.thumbTintList = r7
            r7 = 0
            super.setThumbTintList(r7)
            android.graphics.drawable.Drawable r1 = super.getTrackDrawable()
            r6.trackDrawable = r1
            android.content.res.ColorStateList r1 = super.getTrackTintList()
            r6.trackTintList = r1
            super.setTrackTintList(r7)
            int[] r2 = com.google.android.material.C6372R.styleable.MaterialSwitch
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            androidx.appcompat.widget.TintTypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C6372R.styleable.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r6.thumbIconDrawable = r9
            int r9 = com.google.android.material.C6372R.styleable.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r9 = r8.getColorStateList(r9)
            r6.thumbIconTintList = r9
            int r9 = com.google.android.material.C6372R.styleable.MaterialSwitch_thumbIconTintMode
            r0 = -1
            int r9 = r8.getInt(r9, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r1)
            r6.thumbIconTintMode = r9
            int r9 = com.google.android.material.C6372R.styleable.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r6.trackDecorationDrawable = r9
            int r9 = com.google.android.material.C6372R.styleable.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r9 = r8.getColorStateList(r9)
            r6.trackDecorationTintList = r9
            int r9 = com.google.android.material.C6372R.styleable.MaterialSwitch_trackDecorationTintMode
            int r9 = r8.getInt(r9, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r0)
            r6.trackDecorationTintMode = r9
            r8.recycle()
            r6.setEnforceSwitchWidth(r7)
            r6.refreshThumbDrawable()
            r6.refreshTrackDrawable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
