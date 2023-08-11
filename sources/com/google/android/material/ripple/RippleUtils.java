package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.C0127Px;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C6372R;
import com.google.android.material.color.MaterialColors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleUtils {
    private static final int[] ENABLED_PRESSED_STATE_SET = {16842910, 16842919};
    private static final int[] FOCUSED_STATE_SET = {16842908};
    private static final int[] HOVERED_FOCUSED_STATE_SET = {16843623, 16842908};
    private static final int[] HOVERED_STATE_SET = {16843623};
    @VisibleForTesting
    static final String LOG_TAG = RippleUtils.class.getSimpleName();
    private static final int[] PRESSED_STATE_SET = {16842919};
    private static final int[] SELECTED_FOCUSED_STATE_SET = {16842913, 16842908};
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = {16842913, 16843623, 16842908};
    private static final int[] SELECTED_HOVERED_STATE_SET = {16842913, 16843623};
    private static final int[] SELECTED_PRESSED_STATE_SET = {16842913, 16842919};
    private static final int[] SELECTED_STATE_SET = {16842913};
    @VisibleForTesting
    static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    @RequiresApi(21)
    private static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
        }

        /* access modifiers changed from: private */
        @DoNotInline
        public static Drawable createOvalRipple(@NonNull Context context, @C0127Px int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(MaterialColors.getColorStateList(context, C6372R.attr.colorControlHighlight, ColorStateList.valueOf(0)), (Drawable) null, new InsetDrawable(gradientDrawable, i, i, i, i));
        }
    }

    private RippleUtils() {
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[] iArr = FOCUSED_STATE_SET;
            return new ColorStateList(new int[][]{SELECTED_STATE_SET, iArr, StateSet.NOTHING}, new int[]{getColorForState(colorStateList, SELECTED_PRESSED_STATE_SET), getColorForState(colorStateList, iArr), getColorForState(colorStateList, PRESSED_STATE_SET)});
        }
        int[] iArr2 = SELECTED_PRESSED_STATE_SET;
        int[] iArr3 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        int[] iArr4 = SELECTED_FOCUSED_STATE_SET;
        int[] iArr5 = SELECTED_HOVERED_STATE_SET;
        int[] iArr6 = PRESSED_STATE_SET;
        int[] iArr7 = HOVERED_FOCUSED_STATE_SET;
        int[] iArr8 = FOCUSED_STATE_SET;
        int[] iArr9 = HOVERED_STATE_SET;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, SELECTED_STATE_SET, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{getColorForState(colorStateList, iArr2), getColorForState(colorStateList, iArr3), getColorForState(colorStateList, iArr4), getColorForState(colorStateList, iArr5), 0, getColorForState(colorStateList, iArr6), getColorForState(colorStateList, iArr7), getColorForState(colorStateList, iArr8), getColorForState(colorStateList, iArr9), 0});
    }

    @RequiresApi(21)
    @NonNull
    public static Drawable createOvalRippleLollipop(@NonNull Context context, @C0127Px int i) {
        return RippleUtilsLollipop.createOvalRipple(context, i);
    }

    @ColorInt
    private static int doubleAlpha(@ColorInt int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @ColorInt
    private static int getColorForState(@Nullable ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (USE_FRAMEWORK_RIPPLE) {
            return doubleAlpha(i);
        }
        return i;
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(ENABLED_PRESSED_STATE_SET, 0)) != 0) {
            Log.w(LOG_TAG, TRANSPARENT_DEFAULT_COLOR_WARNING);
        }
        return colorStateList;
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
