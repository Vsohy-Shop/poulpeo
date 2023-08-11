package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: TypedArray.kt */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, @StyleableRes int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    @ColorInt
    public static final int getColorOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    @Dimension
    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    @Dimension
    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        C12775o.m28636f(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    @RequiresApi(26)
    public static final Typeface getFontOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return TypedArrayApi26ImplKt.getFont(typedArray, i);
    }

    public static final int getIntOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    @AnyRes
    public static final int getResourceIdOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        CharSequence[] textArray = typedArray.getTextArray(i);
        C12775o.m28638h(textArray, "getTextArray(index)");
        return textArray;
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "<this>");
        checkAttribute(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R use(TypedArray typedArray, Function1<? super TypedArray, ? extends R> function1) {
        C12775o.m28639i(typedArray, "<this>");
        C12775o.m28639i(function1, "block");
        R invoke = function1.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
