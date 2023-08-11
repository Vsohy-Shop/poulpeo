package androidx.compose.p002ui.util;

/* renamed from: androidx.compose.ui.util.MathHelpersKt */
/* compiled from: MathHelpers.kt */
public final class MathHelpersKt {
    public static final float lerp(float f, float f2, float f3) {
        return ((((float) 1) - f3) * f) + (f3 * f2);
    }

    public static final int lerp(int i, int i2, float f) {
        return i + C13265c.m30133b(((double) (i2 - i)) * ((double) f));
    }

    public static final long lerp(long j, long j2, float f) {
        return j + C13265c.m30135d(((double) (j2 - j)) * ((double) f));
    }
}
