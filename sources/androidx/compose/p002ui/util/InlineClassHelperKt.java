package androidx.compose.p002ui.util;

import kotlin.jvm.internal.C12763h;

/* renamed from: androidx.compose.ui.util.InlineClassHelperKt */
/* compiled from: InlineClassHelper.kt */
public final class InlineClassHelperKt {
    public static final long packFloats(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
    }

    public static final long packInts(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final float unpackFloat1(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float unpackFloat2(long j) {
        C12763h hVar = C12763h.f20419a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }
}
