package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Context.kt */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        C12775o.m28639i(context, "<this>");
        C12775o.m28644n(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ContextCompat.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, @AttrRes int i, @StyleRes int i2, Function1<? super TypedArray, C11921v> function1) {
        C12775o.m28639i(context, "<this>");
        C12775o.m28639i(iArr, "attrs");
        C12775o.m28639i(function1, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C12775o.m28638h(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        function1.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        C12775o.m28639i(context, "<this>");
        C12775o.m28639i(iArr, "attrs");
        C12775o.m28639i(function1, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C12775o.m28638h(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        function1.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, @StyleRes int i, int[] iArr, Function1<? super TypedArray, C11921v> function1) {
        C12775o.m28639i(context, "<this>");
        C12775o.m28639i(iArr, "attrs");
        C12775o.m28639i(function1, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        C12775o.m28638h(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        function1.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
