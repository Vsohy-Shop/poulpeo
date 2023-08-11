package androidx.compose.p002ui.geometry;

/* renamed from: androidx.compose.ui.geometry.GeometryUtilsKt */
/* compiled from: GeometryUtils.kt */
public final class GeometryUtilsKt {
    public static final String toStringAsFixed(float f, int i) {
        int max = Math.max(i, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - ((float) i2) >= 0.5f) {
            i2++;
        }
        float f3 = ((float) i2) / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }
}
