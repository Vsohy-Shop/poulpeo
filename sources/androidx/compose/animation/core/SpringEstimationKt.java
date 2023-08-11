package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import p336ef.C11906l;

/* compiled from: SpringEstimation.kt */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return estimateAnimationDurationMillis((double) f, (double) f2, (double) f3, (double) f4, (double) f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[LOOP:0: B:35:0x00ac->B:39:0x00b9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final double estimateCriticallyDamped(p336ef.C11906l<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r19, double r20, double r22, double r24) {
        /*
            r8 = r24
            java.lang.Object r0 = r19.mo49111c()
            androidx.compose.animation.core.ComplexDouble r0 = (androidx.compose.animation.core.ComplexDouble) r0
            double r10 = r0.getReal()
            double r0 = r10 * r20
            double r12 = r22 - r0
            double r2 = r8 / r20
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r10
            double r4 = r8 / r12
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = estimateCriticallyDamped$t2Iterate(r4, r10)
            double r4 = r4 / r10
            boolean r6 = java.lang.Double.isInfinite(r2)
            r14 = 0
            r7 = 1
            if (r6 != 0) goto L_0x003a
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x003a
            r6 = r7
            goto L_0x003b
        L_0x003a:
            r6 = r14
        L_0x003b:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0040
            r15 = r4
            goto L_0x0058
        L_0x0040:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x004e
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x004e
            r6 = r7
            goto L_0x004f
        L_0x004e:
            r6 = r14
        L_0x004f:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            double r2 = java.lang.Math.max(r2, r4)
        L_0x0057:
            r15 = r2
        L_0x0058:
            double r0 = r0 + r12
            double r0 = -r0
            double r2 = r10 * r12
            double r4 = r0 / r2
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x0091
            r17 = 0
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            goto L_0x0091
        L_0x006b:
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r0 = r20
            r2 = r10
            r6 = r12
            double r0 = estimateCriticallyDamped$xInflection(r0, r2, r4, r6)
            double r0 = -r0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            int r0 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r15 = r17
            goto L_0x0091
        L_0x0087:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r10
            double r0 = -r0
            double r2 = r20 / r12
            double r15 = r0 - r2
            r7 = r8
            goto L_0x0093
        L_0x0091:
            double r0 = -r8
            r7 = r0
        L_0x0093:
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1 r9 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            r0 = r9
            r1 = r20
            r3 = r12
            r5 = r10
            r0.<init>(r1, r3, r5, r7)
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 r7 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            r0 = r7
            r1 = r12
            r3 = r10
            r5 = r20
            r0.<init>(r1, r3, r5)
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00ac:
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            r0 = 100
            if (r14 >= r0) goto L_0x00e2
            int r14 = r14 + 1
            java.lang.Double r0 = java.lang.Double.valueOf(r15)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 / r2
            double r0 = r15 - r0
            double r15 = r15 - r0
            double r2 = java.lang.Math.abs(r15)
            r15 = r0
            r0 = r2
            goto L_0x00ac
        L_0x00e2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateCriticallyDamped(ef.l, double, double, double):double");
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d, double d2) {
        double d3 = d;
        for (int i = 0; i < 6; i++) {
            d3 = d - Math.log(Math.abs(d3 / d2));
        }
        return d3;
    }

    private static final double estimateCriticallyDamped$xInflection(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (d * Math.exp(d5)) + (d4 * d3 * Math.exp(d5));
    }

    private static final long estimateDurationInternal(C11906l<ComplexDouble, ComplexDouble> lVar, double d, double d2, double d3, double d4) {
        boolean z;
        double d5;
        int i = (d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1));
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (d2 != 0.0d) {
                z2 = false;
            }
            if (z2) {
                return 0;
            }
        }
        if (i < 0) {
            d2 = -d2;
        }
        double d6 = d2;
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            d5 = estimateOverDamped(lVar, abs, d6, d4);
        } else if (d < 1.0d) {
            d5 = estimateUnderDamped(lVar, abs, d6, d4);
        } else {
            d5 = estimateCriticallyDamped(lVar, abs, d6, d4);
        }
        return (long) (d5 * 1000.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final double estimateOverDamped(p336ef.C11906l<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r31, double r32, double r34, double r36) {
        /*
            r0 = r36
            java.lang.Object r2 = r31.mo49111c()
            androidx.compose.animation.core.ComplexDouble r2 = (androidx.compose.animation.core.ComplexDouble) r2
            double r14 = r2.getReal()
            java.lang.Object r2 = r31.mo49112d()
            androidx.compose.animation.core.ComplexDouble r2 = (androidx.compose.animation.core.ComplexDouble) r2
            double r16 = r2.getReal()
            double r2 = r14 * r32
            double r2 = r2 - r34
            double r18 = r14 - r16
            double r11 = r2 / r18
            double r20 = r32 - r11
            double r2 = r0 / r20
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r14
            double r4 = r0 / r11
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = r4 / r16
            boolean r6 = java.lang.Double.isInfinite(r2)
            r22 = 0
            r7 = 1
            if (r6 != 0) goto L_0x0048
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x0048
            r6 = r7
            goto L_0x004a
        L_0x0048:
            r6 = r22
        L_0x004a:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0050
            r23 = r4
            goto L_0x006a
        L_0x0050:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x005e
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x005e
            r6 = r7
            goto L_0x0060
        L_0x005e:
            r6 = r22
        L_0x0060:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            double r2 = java.lang.Math.max(r2, r4)
        L_0x0068:
            r23 = r2
        L_0x006a:
            double r25 = r20 * r14
            double r2 = -r11
            double r2 = r2 * r16
            double r2 = r25 / r2
            double r2 = java.lang.Math.log(r2)
            double r4 = r16 - r14
            double r7 = r2 / r4
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x00b8
            r27 = 0
            int r2 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r2 > 0) goto L_0x0086
            goto L_0x00b8
        L_0x0086:
            int r2 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a6
            r3 = r20
            r5 = r14
            r9 = r11
            r29 = r11
            r11 = r16
            double r2 = m32912estimateOverDamped$xInflection0(r3, r5, r7, r9, r11)
            double r2 = -r2
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a8
            int r2 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ba
            int r2 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ba
            r23 = r27
            goto L_0x00ba
        L_0x00a6:
            r29 = r11
        L_0x00a8:
            double r11 = r29 * r16
            double r11 = r11 * r16
            double r2 = -r11
            double r25 = r25 * r14
            double r2 = r2 / r25
            double r2 = java.lang.Math.log(r2)
            double r23 = r2 / r18
            goto L_0x00bb
        L_0x00b8:
            r29 = r11
        L_0x00ba:
            double r0 = -r0
        L_0x00bb:
            r12 = r0
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1 r0 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
            r3 = r0
            r4 = r20
            r6 = r14
            r8 = r29
            r10 = r16
            r3.<init>(r4, r6, r8, r10, r12)
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1 r1 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
            r3 = r1
            r3.<init>(r4, r6, r8, r10)
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r2 = java.lang.Math.abs(r2)
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00eb
            return r23
        L_0x00eb:
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = r22
        L_0x00f2:
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x012a
            r2 = 100
            if (r4 >= r2) goto L_0x012a
            int r4 = r4 + 1
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r23)
            java.lang.Object r5 = r1.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r2 = r2 / r5
            double r2 = r23 - r2
            double r23 = r23 - r2
            double r5 = java.lang.Math.abs(r23)
            r23 = r2
            r2 = r5
            goto L_0x00f2
        L_0x012a:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(ef.l, double, double, double):double");
    }

    /* renamed from: estimateOverDamped$xInflection-0  reason: not valid java name */
    private static final double m32912estimateOverDamped$xInflection0(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final double estimateUnderDamped(C11906l<ComplexDouble, ComplexDouble> lVar, double d, double d2, double d3) {
        double real = lVar.mo49111c().getReal();
        double imaginary = (d2 - (real * d)) / lVar.mo49111c().getImaginary();
        return Math.log(d3 / Math.sqrt((d * d) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d) {
        boolean z;
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    private static final double iterateNewtonsMethod(double d, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d - (function1.invoke(Double.valueOf(d)).doubleValue() / function12.invoke(Double.valueOf(d)).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d2 * Math.sqrt(d), d), d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d3, d2, d), d2 / (Math.sqrt(d * d3) * 2.0d), d4, d5, d6);
    }
}
