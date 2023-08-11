package androidx.compose.p002ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb */
/* compiled from: Rgb.kt */
public final class Rgb extends ColorSpace {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final DoubleFunction DoubleIdentity = new C0972d();
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    /* access modifiers changed from: private */
    public final float max;
    /* access modifiers changed from: private */
    public final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$Companion */
    /* compiled from: Rgb.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }

        private final boolean compare(double d, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            if (Math.abs(doubleFunction.invoke(d) - doubleFunction2.invoke(d)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        /* access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = (float) 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (x / y) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - x) / y) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (cross(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, int i) {
            boolean z;
            boolean z2;
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (f2 == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if ((area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) && (f >= 0.0f || f2 <= 1.0f)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                float[] unused = C12708o.m28344k(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] fArr) {
            C12775o.m28639i(fArr, "toXYZ");
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            float f4 = mul3x3Float32[0] + mul3x3Float32[1] + mul3x3Float32[2];
            float f5 = mul3x3Float33[0] + mul3x3Float33[1] + mul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, mul3x3Float32[0] / f4, mul3x3Float32[1] / f4, mul3x3Float33[0] / f5, mul3x3Float33[1] / f5};
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r16, float[] r17, androidx.compose.p002ui.graphics.colorspace.WhitePoint r18, float[] r19, androidx.compose.p002ui.graphics.colorspace.DoubleFunction r20, androidx.compose.p002ui.graphics.colorspace.DoubleFunction r21, float r22, float r23, androidx.compose.p002ui.graphics.colorspace.TransferParameters r24, int r25) {
        /*
            r15 = this;
            r6 = r15
            r7 = r17
            r9 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r0 = "name"
            r1 = r16
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "primaries"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "whitePoint"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "oetf"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "eotf"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r0 = androidx.compose.p002ui.graphics.colorspace.ColorModel.Companion
            long r2 = r0.m36116getRgbxdoWZVw()
            r5 = 0
            r0 = r15
            r4 = r25
            r0.<init>(r1, r2, r4, r5)
            r6.whitePoint = r9
            r6.min = r12
            r6.max = r13
            r0 = r24
            r6.transferParameters = r0
            r6.oetfOrig = r10
            androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            r0.<init>(r15)
            r6.oetf = r0
            androidx.compose.ui.graphics.colorspace.j r0 = new androidx.compose.ui.graphics.colorspace.j
            r0.<init>(r15)
            r6.oetfFunc = r0
            r6.eotfOrig = r11
            androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            r0.<init>(r15)
            r6.eotf = r0
            androidx.compose.ui.graphics.colorspace.k r0 = new androidx.compose.ui.graphics.colorspace.k
            r0.<init>(r15)
            r6.eotfFunc = r0
            int r0 = r7.length
            r1 = 6
            r2 = 9
            if (r0 == r1) goto L_0x0073
            int r0 = r7.length
            if (r0 != r2) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r0.<init>(r1)
            throw r0
        L_0x0073:
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c8
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = Companion
            float[] r1 = r0.xyPrimaries(r7)
            r6.primaries = r1
            if (r8 != 0) goto L_0x0088
            float[] r2 = r0.computeXYZMatrix(r1, r9)
            r6.transform = r2
            goto L_0x008d
        L_0x0088:
            int r3 = r8.length
            if (r3 != r2) goto L_0x00b0
            r6.transform = r8
        L_0x008d:
            float[] r2 = r6.transform
            float[] r2 = androidx.compose.p002ui.graphics.colorspace.ColorSpaceKt.inverse3x3(r2)
            r6.inverseTransform = r2
            boolean r2 = r0.isWideGamut(r1, r12, r13)
            r6.isWideGamut = r2
            r7 = r0
            r8 = r1
            r9 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r25
            boolean r0 = r7.isSrgb(r8, r9, r10, r11, r12, r13, r14)
            r6.isSrgb = r0
            return
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transform must have 9 entries! Has "
            r1.append(r2)
            int r2 = r8.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid range: min="
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ", max="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "; min must be strictly < max"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, float[], androidx.compose.ui.graphics.colorspace.DoubleFunction, androidx.compose.ui.graphics.colorspace.DoubleFunction, float, float, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$10(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$11(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 function1, double d) {
        C12775o.m28639i(function1, "$oetf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 function1, double d) {
        C12775o.m28639i(function1, "$eotf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 function1, double d) {
        C12775o.m28639i(function1, "$oetf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 function1, double d) {
        C12775o.m28639i(function1, "$eotf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters2, double d) {
        C12775o.m28639i(transferParameters2, "$function");
        return ColorSpaceKt.rcpResponse(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters2, double d) {
        C12775o.m28639i(transferParameters2, "$function");
        return ColorSpaceKt.rcpResponse(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters2, double d) {
        C12775o.m28639i(transferParameters2, "$function");
        return ColorSpaceKt.response(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters2, double d) {
        C12775o.m28639i(transferParameters2, "$function");
        return ColorSpaceKt.response(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d) {
        C12775o.m28639i(rgb, "this$0");
        return rgb.eotfOrig.invoke(C13537l.m30884k(d, (double) rgb.min, (double) rgb.max));
    }

    /* access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        C12775o.m28639i(rgb, "this$0");
        return C13537l.m30884k(rgb.oetfOrig.invoke(d), (double) rgb.min, (double) rgb.max);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !C12775o.m28634d(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters2 = this.transferParameters;
        if (transferParameters2 != null) {
            return C12775o.m28634d(transferParameters2, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (!C12775o.m28634d(this.oetfOrig, rgb.oetfOrig)) {
            return false;
        }
        return C12775o.m28634d(this.eotfOrig, rgb.eotfOrig);
    }

    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    public float[] fromXyz(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        fArr[0] = (float) this.oetfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke((double) fArr[2]);
        return fArr;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    public float getMaxValue(int i) {
        return this.max;
    }

    public float getMinValue(int i) {
        return this.min;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    public int hashCode() {
        boolean z;
        int i;
        int i2;
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f = this.min;
        boolean z2 = true;
        int i3 = 0;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.max;
        if (f2 != 0.0f) {
            z2 = false;
        }
        if (!z2) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        TransferParameters transferParameters2 = this.transferParameters;
        if (transferParameters2 != null) {
            i3 = transferParameters2.hashCode();
        }
        int i6 = i5 + i3;
        if (this.transferParameters == null) {
            return (((i6 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i6;
    }

    public boolean isSrgb() {
        return this.isSrgb;
    }

    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float invoke = (float) this.eotfFunc.invoke((double) f);
        float invoke2 = (float) this.eotfFunc.invoke((double) f2);
        float invoke3 = (float) this.eotfFunc.invoke((double) f3);
        return (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(this.transform, invoke, invoke2, invoke3))) << 32) | (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(this.transform, invoke, invoke2, invoke3))) & 4294967295L);
    }

    public float[] toXyz(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        fArr[0] = (float) this.eotfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke((double) fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke((double) f), (float) this.eotfFunc.invoke((double) f2), (float) this.eotfFunc.invoke((double) f3));
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long m36142xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        return ColorKt.Color((float) this.oetfFunc.invoke((double) ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, f, f2, f3)), (float) this.oetfFunc.invoke((double) ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, f, f2, f3)), (float) this.oetfFunc.invoke((double) ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, f, f2, f3)), f4, colorSpace);
    }

    public final float[] fromLinear(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        fArr[0] = (float) this.oetfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke((double) fArr[2]);
        return fArr;
    }

    public final float[] getInverseTransform(float[] fArr) {
        C12775o.m28639i(fArr, "inverseTransform");
        return C12708o.m28344k(this.inverseTransform, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getPrimaries(float[] fArr) {
        C12775o.m28639i(fArr, "primaries");
        return C12708o.m28344k(this.primaries, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] fArr) {
        C12775o.m28639i(fArr, "transform");
        return C12708o.m28344k(this.transform, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] toLinear(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        fArr[0] = (float) this.eotfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke((double) fArr[2]);
        return fArr;
    }

    /* access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d) {
        return d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r16, float[] r17, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r18, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "name"
            r5 = r16
            kotlin.jvm.internal.C12775o.m28639i(r5, r3)
            java.lang.String r3 = "toXYZ"
            kotlin.jvm.internal.C12775o.m28639i(r0, r3)
            java.lang.String r3 = "oetf"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            java.lang.String r3 = "eotf"
            kotlin.jvm.internal.C12775o.m28639i(r2, r3)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r3 = Companion
            float[] r6 = r3.computePrimaries$ui_graphics_release(r0)
            androidx.compose.ui.graphics.colorspace.WhitePoint r7 = r3.computeWhitePoint(r0)
            r8 = 0
            androidx.compose.ui.graphics.colorspace.h r9 = new androidx.compose.ui.graphics.colorspace.h
            r9.<init>(r1)
            androidx.compose.ui.graphics.colorspace.i r10 = new androidx.compose.ui.graphics.colorspace.i
            r10.<init>(r2)
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = -1
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r15, float[] r16, androidx.compose.p002ui.graphics.colorspace.WhitePoint r17, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r18, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r19, float r20, float r21) {
        /*
            r14 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "name"
            r4 = r15
            kotlin.jvm.internal.C12775o.m28639i(r15, r2)
            java.lang.String r2 = "primaries"
            r5 = r16
            kotlin.jvm.internal.C12775o.m28639i(r5, r2)
            java.lang.String r2 = "whitePoint"
            r6 = r17
            kotlin.jvm.internal.C12775o.m28639i(r6, r2)
            java.lang.String r2 = "oetf"
            kotlin.jvm.internal.C12775o.m28639i(r0, r2)
            java.lang.String r2 = "eotf"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            r7 = 0
            androidx.compose.ui.graphics.colorspace.c r8 = new androidx.compose.ui.graphics.colorspace.c
            r8.<init>(r0)
            androidx.compose.ui.graphics.colorspace.g r9 = new androidx.compose.ui.graphics.colorspace.g
            r9.<init>(r1)
            r12 = 0
            r13 = -1
            r3 = r14
            r10 = r20
            r11 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, float, float):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r8, float[] r9, androidx.compose.p002ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = r0.computeWhitePoint(r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint2, TransferParameters transferParameters2) {
        this(str, fArr, whitePoint2, transferParameters2, -1);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fArr, "primaries");
        C12775o.m28639i(whitePoint2, "whitePoint");
        C12775o.m28639i(transferParameters2, "function");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r14, float[] r15, androidx.compose.p002ui.graphics.colorspace.WhitePoint r16, androidx.compose.p002ui.graphics.colorspace.TransferParameters r17, int r18) {
        /*
            r13 = this;
            r9 = r17
            java.lang.String r0 = "name"
            r1 = r14
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "primaries"
            r2 = r15
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r16
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r4 = 0
            double r5 = r17.getE()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0029
            r0 = r5
            goto L_0x002a
        L_0x0029:
            r0 = r6
        L_0x002a:
            if (r0 == 0) goto L_0x003f
            double r10 = r17.getF()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            r0 = r5
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.graphics.colorspace.l r0 = new androidx.compose.ui.graphics.colorspace.l
            r0.<init>(r9)
            goto L_0x0044
        L_0x003f:
            androidx.compose.ui.graphics.colorspace.m r0 = new androidx.compose.ui.graphics.colorspace.m
            r0.<init>(r9)
        L_0x0044:
            r10 = r0
            double r11 = r17.getE()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            r0 = r5
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            if (r0 == 0) goto L_0x0064
            double r11 = r17.getF()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r5 = r6
        L_0x005c:
            if (r5 == 0) goto L_0x0064
            androidx.compose.ui.graphics.colorspace.n r0 = new androidx.compose.ui.graphics.colorspace.n
            r0.<init>(r9)
            goto L_0x0069
        L_0x0064:
            androidx.compose.ui.graphics.colorspace.o r0 = new androidx.compose.ui.graphics.colorspace.o
            r0.<init>(r9)
        L_0x0069:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r10
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r11, float[] r12, double r13) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = r0.computeWhitePoint(r12)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>((java.lang.String) r2, (float[]) r3, (androidx.compose.p002ui.graphics.colorspace.WhitePoint) r4, (double) r5, (float) r7, (float) r8, (int) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint2, double d) {
        this(str, fArr, whitePoint2, d, 0.0f, 1.0f, -1);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fArr, "primaries");
        C12775o.m28639i(whitePoint2, "whitePoint");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r24, float[] r25, androidx.compose.p002ui.graphics.colorspace.WhitePoint r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            r5 = r3
            goto L_0x0024
        L_0x0023:
            r5 = r4
        L_0x0024:
            if (r5 == 0) goto L_0x0029
            androidx.compose.ui.graphics.colorspace.DoubleFunction r5 = DoubleIdentity
            goto L_0x002e
        L_0x0029:
            androidx.compose.ui.graphics.colorspace.e r5 = new androidx.compose.ui.graphics.colorspace.e
            r5.<init>(r1)
        L_0x002e:
            r18 = r5
            if (r0 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r4
        L_0x0034:
            if (r3 == 0) goto L_0x0039
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = DoubleIdentity
            goto L_0x003e
        L_0x0039:
            androidx.compose.ui.graphics.colorspace.f r0 = new androidx.compose.ui.graphics.colorspace.f
            r0.<init>(r1)
        L_0x003e:
            r19 = r0
            androidx.compose.ui.graphics.colorspace.TransferParameters r20 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint2) {
        this(rgb.getName(), rgb.primaries, whitePoint2, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
        C12775o.m28639i(rgb, "colorSpace");
        C12775o.m28639i(fArr, "transform");
        C12775o.m28639i(whitePoint2, "whitePoint");
    }
}
