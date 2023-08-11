package androidx.compose.animation.core;

import kotlin.jvm.internal.C12775o;

/* compiled from: ComplexDouble.kt */
public final class ComplexDouble {
    /* access modifiers changed from: private */
    public double _imaginary;
    /* access modifiers changed from: private */
    public double _real;

    public ComplexDouble(double d, double d2) {
        this._real = d;
        this._imaginary = d2;
    }

    private final double component1() {
        return this._real;
    }

    private final double component2() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = complexDouble._real;
        }
        if ((i & 2) != 0) {
            d2 = complexDouble._imaginary;
        }
        return complexDouble.copy(d, d2);
    }

    public final ComplexDouble copy(double d, double d2) {
        return new ComplexDouble(d, d2);
    }

    public final ComplexDouble div(double d) {
        this._real = this._real / d;
        this._imaginary = this._imaginary / d;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) obj;
        if (C12775o.m28634d(Double.valueOf(this._real), Double.valueOf(complexDouble._real)) && C12775o.m28634d(Double.valueOf(this._imaginary), Double.valueOf(complexDouble._imaginary))) {
            return true;
        }
        return false;
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final double getReal() {
        return this._real;
    }

    public int hashCode() {
        return (Double.hashCode(this._real) * 31) + Double.hashCode(this._imaginary);
    }

    public final ComplexDouble minus(double d) {
        this._real = this._real + (-d);
        return this;
    }

    public final ComplexDouble plus(double d) {
        this._real = this._real + d;
        return this;
    }

    public final ComplexDouble times(double d) {
        this._real = this._real * d;
        this._imaginary = this._imaginary * d;
        return this;
    }

    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }

    public final ComplexDouble unaryMinus() {
        double d = (double) -1;
        this._real = this._real * d;
        this._imaginary = this._imaginary * d;
        return this;
    }

    public final ComplexDouble minus(ComplexDouble complexDouble) {
        C12775o.m28639i(complexDouble, "other");
        double d = (double) -1;
        complexDouble._real = complexDouble._real * d;
        complexDouble._imaginary = complexDouble._imaginary * d;
        this._real = this._real + complexDouble.getReal();
        this._imaginary = this._imaginary + complexDouble.getImaginary();
        return this;
    }

    public final ComplexDouble plus(ComplexDouble complexDouble) {
        C12775o.m28639i(complexDouble, "other");
        this._real = this._real + complexDouble.getReal();
        this._imaginary = this._imaginary + complexDouble.getImaginary();
        return this;
    }

    public final ComplexDouble times(ComplexDouble complexDouble) {
        C12775o.m28639i(complexDouble, "other");
        this._real = (getReal() * complexDouble.getReal()) - (getImaginary() * complexDouble.getImaginary());
        this._imaginary = (getReal() * complexDouble.getImaginary()) + (complexDouble.getReal() * getImaginary());
        return this;
    }
}
