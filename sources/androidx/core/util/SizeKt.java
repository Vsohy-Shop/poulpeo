package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

/* compiled from: Size.kt */
public final class SizeKt {
    @RequiresApi(21)
    public static final int component1(Size size) {
        C12775o.m28639i(size, "<this>");
        return size.getWidth();
    }

    @RequiresApi(21)
    public static final int component2(Size size) {
        C12775o.m28639i(size, "<this>");
        return size.getHeight();
    }

    @RequiresApi(21)
    public static final float component1(SizeF sizeF) {
        C12775o.m28639i(sizeF, "<this>");
        return sizeF.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(SizeF sizeF) {
        C12775o.m28639i(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        C12775o.m28639i(sizeFCompat, "<this>");
        return sizeFCompat.getWidth();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        C12775o.m28639i(sizeFCompat, "<this>");
        return sizeFCompat.getHeight();
    }
}
