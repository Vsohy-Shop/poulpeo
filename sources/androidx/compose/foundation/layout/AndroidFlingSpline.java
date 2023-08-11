package androidx.compose.foundation.layout;

import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n25#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n684#1:709,3\n*E\n"})
/* compiled from: WindowInsetsConnection.android.kt */
final class AndroidFlingSpline {
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final int NbSamples = 100;
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f11 = ((float) i) / ((float) 100);
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                if (((double) Math.abs(f13 - f11)) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            SplinePositions[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (((double) Math.abs(f16 - f11)) < 1.0E-5d) {
                    break;
                }
                if (f16 > f11) {
                    f15 = f5;
                } else {
                    f10 = f5;
                }
                f14 = 0.5f;
            }
            SplineTimes[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    /* renamed from: flingPosition-LfoxSSI  reason: not valid java name */
    public final long m33175flingPositionLfoxSSI(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = SplinePositions;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        long floatToIntBits = (long) Float.floatToIntBits(f2);
        return FlingResult.m33177constructorimpl((((long) Float.floatToIntBits(f3)) & 4294967295L) | (floatToIntBits << 32));
    }

    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n34#2:709\n41#2:710\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n701#1:709\n706#1:710\n*E\n"})
    /* compiled from: WindowInsetsConnection.android.kt */
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j) {
            this.packedValue = j;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ FlingResult m33176boximpl(long j) {
            return new FlingResult(j);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m33178equalsimpl(long j, Object obj) {
            if ((obj instanceof FlingResult) && j == ((FlingResult) obj).m33184unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m33179equalsimpl0(long j, long j2) {
            if (j == j2) {
                return true;
            }
            return false;
        }

        /* renamed from: getDistanceCoefficient-impl  reason: not valid java name */
        public static final float m33180getDistanceCoefficientimpl(long j) {
            C12763h hVar = C12763h.f20419a;
            return Float.intBitsToFloat((int) (j >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl  reason: not valid java name */
        public static final float m33181getVelocityCoefficientimpl(long j) {
            C12763h hVar = C12763h.f20419a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m33182hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m33183toStringimpl(long j) {
            return "FlingResult(packedValue=" + j + ')';
        }

        public boolean equals(Object obj) {
            return m33178equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m33182hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m33183toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ long m33184unboximpl() {
            return this.packedValue;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static long m33177constructorimpl(long j) {
            return j;
        }
    }
}
