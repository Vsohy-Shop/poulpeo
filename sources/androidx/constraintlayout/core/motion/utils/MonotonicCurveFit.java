package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f408mT;
    private double[][] mTangent;

    /* renamed from: mY */
    private double[][] f409mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        this.mSlopeTemp = new double[length2];
        int i = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr3[i4] - dArr3[i3];
                double[] dArr7 = dArr5[i3];
                double d2 = (dArr4[i4][i2] - dArr4[i3][i2]) / d;
                dArr7[i2] = d2;
                if (i3 == 0) {
                    dArr6[i3][i2] = d2;
                } else {
                    dArr6[i3][i2] = (dArr5[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr6[i][i2] = dArr5[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr5[i5][i6];
                if (d3 == 0.0d) {
                    dArr6[i5][i6] = 0.0d;
                    dArr6[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr6[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr6[i7][i6] / d3;
                    double hypot = Math.hypot(d4, d5);
                    if (hypot > 9.0d) {
                        double d6 = 3.0d / hypot;
                        double[] dArr8 = dArr6[i5];
                        double[] dArr9 = dArr5[i5];
                        dArr8[i6] = d4 * d6 * dArr9[i6];
                        dArr6[i7][i6] = d6 * d5 * dArr9[i6];
                    }
                }
            }
        }
        this.f408mT = dArr3;
        this.f409mY = dArr4;
        this.mTangent = dArr6;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i + 1));
    }

    private static double diff(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return (((((((((-6.0d * d7) * d4) + (d8 * d4)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    private static double interpolate(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d * d6;
        double d11 = d * d5;
        return ((((((((((-2.0d * d8) * d4) + (d9 * d4)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3) + (d10 * d8)) + (d8 * d11)) - (d10 * d7)) - (((d * 2.0d) * d5) * d7)) + (d11 * d2);
    }

    public void getPos(double d, double[] dArr) {
        double[] dArr2 = this.f408mT;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f409mY[0].length;
        if (this.mExtrapolate) {
            double d2 = dArr2[0];
            if (d <= d2) {
                getSlope(d2, this.mSlopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f409mY[0][i2] + ((d - this.f408mT[0]) * this.mSlopeTemp[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                getSlope(d3, this.mSlopeTemp);
                while (i < length2) {
                    dArr[i] = this.f409mY[i3][i] + ((d - this.f408mT[i3]) * this.mSlopeTemp[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f409mY[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f409mY[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f408mT[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f409mY[i6][i7];
                }
            }
            double[] dArr3 = this.f408mT;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr4 = this.f409mY;
                    double d8 = dArr4[i6][i];
                    double d9 = dArr4[i8][i];
                    double[][] dArr5 = this.mTangent;
                    dArr[i] = interpolate(d6, d7, d8, d9, dArr5[i6][i], dArr5[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    public void getSlope(double d, double[] dArr) {
        double[] dArr2 = this.f408mT;
        int length = dArr2.length;
        int length2 = this.f409mY[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f408mT;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f409mY;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.mTangent;
                    dArr[i3] = diff(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    public double[] getTimePoints() {
        return this.f408mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr4 = new double[length];
        for (int i = 0; i < dArr2.length; i++) {
            double d2 = dArr2[i];
            int i2 = i + length2;
            dArr3[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr4[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr3[i3][0] = d2 + 1.0d;
                dArr4[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr3[i4][0] = (d2 - 1.0d) - d;
                dArr4[i4] = (d3 - 4.0d) - d;
            }
        }
        return new MonotonicCurveFit(dArr4, dArr3);
    }

    public double getSlope(double d, int i) {
        double[] dArr = this.f408mT;
        int length = dArr.length;
        int i2 = 0;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f408mT;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d2 <= d3) {
                double d4 = dArr2[i2];
                double d5 = d3 - d4;
                double[][] dArr3 = this.f409mY;
                double d6 = dArr3[i2][i];
                double d7 = dArr3[i3][i];
                double[][] dArr4 = this.mTangent;
                return diff(d5, (d2 - d4) / d5, d6, d7, dArr4[i2][i], dArr4[i3][i]) / d5;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    public void getPos(double d, float[] fArr) {
        double[] dArr = this.f408mT;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f409mY[0].length;
        if (this.mExtrapolate) {
            double d2 = dArr[0];
            if (d <= d2) {
                getSlope(d2, this.mSlopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f409mY[0][i2] + ((d - this.f408mT[0]) * this.mSlopeTemp[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                getSlope(d3, this.mSlopeTemp);
                while (i < length2) {
                    fArr[i] = (float) (this.f409mY[i3][i] + ((d - this.f408mT[i3]) * this.mSlopeTemp[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f409mY[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f409mY[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f408mT[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f409mY[i6][i7];
                }
            }
            double[] dArr2 = this.f408mT;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr3 = this.f409mY;
                    double d8 = dArr3[i6][i];
                    double d9 = dArr3[i8][i];
                    double[][] dArr4 = this.mTangent;
                    fArr[i] = (float) interpolate(d6, d7, d8, d9, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    public double getPos(double d, int i) {
        double d2;
        double d3;
        double slope;
        int i2 = i;
        double[] dArr = this.f408mT;
        int length = dArr.length;
        int i3 = 0;
        if (this.mExtrapolate) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f409mY[0][i2];
                d3 = d - d4;
                slope = getSlope(d4, i2);
            } else {
                int i4 = length - 1;
                double d5 = dArr[i4];
                if (d >= d5) {
                    d2 = this.f409mY[i4][i2];
                    d3 = d - d5;
                    slope = getSlope(d5, i2);
                }
            }
            return d2 + (d3 * slope);
        } else if (d <= dArr[0]) {
            return this.f409mY[0][i2];
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                return this.f409mY[i5][i2];
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f408mT;
            double d6 = dArr2[i3];
            if (d == d6) {
                return this.f409mY[i3][i2];
            }
            int i6 = i3 + 1;
            double d7 = dArr2[i6];
            if (d < d7) {
                double d8 = d7 - d6;
                double d9 = (d - d6) / d8;
                double[][] dArr3 = this.f409mY;
                double d10 = dArr3[i3][i2];
                double d11 = dArr3[i6][i2];
                double[][] dArr4 = this.mTangent;
                return interpolate(d8, d9, d10, d11, dArr4[i3][i2], dArr4[i6][i2]);
            }
            i3 = i6;
        }
        return 0.0d;
    }
}
