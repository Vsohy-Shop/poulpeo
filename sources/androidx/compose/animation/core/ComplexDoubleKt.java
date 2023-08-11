package androidx.compose.animation.core;

import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p336ef.C11915r;

/* compiled from: ComplexDouble.kt */
public final class ComplexDoubleKt {
    public static final C11906l<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d, double d2, double d3) {
        double d4 = -d2;
        double d5 = (d2 * d2) - ((4.0d * d) * d3);
        ComplexDouble complexSqrt = complexSqrt(d5);
        complexSqrt._real = complexSqrt._real + d4;
        double d6 = d * 2.0d;
        complexSqrt._real = complexSqrt._real / d6;
        complexSqrt._imaginary = complexSqrt._imaginary / d6;
        ComplexDouble complexSqrt2 = complexSqrt(d5);
        double d7 = (double) -1;
        complexSqrt2._real = complexSqrt2._real * d7;
        complexSqrt2._imaginary = complexSqrt2._imaginary * d7;
        complexSqrt2._real = complexSqrt2._real + d4;
        complexSqrt2._real = complexSqrt2._real / d6;
        complexSqrt2._imaginary = complexSqrt2._imaginary / d6;
        return C11915r.m25707a(complexSqrt, complexSqrt2);
    }

    public static final ComplexDouble complexSqrt(double d) {
        if (d < 0.0d) {
            return new ComplexDouble(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new ComplexDouble(Math.sqrt(d), 0.0d);
    }

    public static final ComplexDouble minus(double d, ComplexDouble complexDouble) {
        C12775o.m28639i(complexDouble, "other");
        double d2 = (double) -1;
        complexDouble._real = complexDouble._real * d2;
        complexDouble._imaginary = complexDouble._imaginary * d2;
        complexDouble._real = complexDouble._real + d;
        return complexDouble;
    }

    public static final ComplexDouble plus(double d, ComplexDouble complexDouble) {
        C12775o.m28639i(complexDouble, "other");
        complexDouble._real = complexDouble._real + d;
        return complexDouble;
    }

    public static final ComplexDouble times(double d, ComplexDouble complexDouble) {
        C12775o.m28639i(complexDouble, "other");
        complexDouble._real = complexDouble._real * d;
        complexDouble._imaginary = complexDouble._imaginary * d;
        return complexDouble;
    }
}
