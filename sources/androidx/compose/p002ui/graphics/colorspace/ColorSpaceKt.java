package androidx.compose.p002ui.graphics.colorspace;

import androidx.compose.p002ui.graphics.colorspace.ColorModel;
import androidx.compose.p002ui.graphics.colorspace.Connector;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaceKt */
/* compiled from: ColorSpace.kt */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = d;
        if (d8 < 0.0d) {
            d7 = -d8;
        } else {
            d7 = d8;
        }
        return Math.copySign(rcpResponse(d7, d2, d3, d4, d5, d6), d8);
    }

    public static final double absResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        double d8 = d;
        if (d8 < 0.0d) {
            d7 = -d8;
        } else {
            d7 = d8;
        }
        return Math.copySign(response(d7, d2, d3, d4, d5, d6), d8);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        C12775o.m28639i(colorSpace, "<this>");
        C12775o.m28639i(whitePoint, "whitePoint");
        return adapt$default(colorSpace, whitePoint, (Adaptation) null, 2, (Object) null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i, Object obj) {
        if ((i & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        C12775o.m28639i(fArr, "matrix");
        C12775o.m28639i(fArr2, "srcWhitePoint");
        C12775o.m28639i(fArr3, "dstWhitePoint");
        float[] mul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] mul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{mul3x3Float32[0] / mul3x3Float3[0], mul3x3Float32[1] / mul3x3Float3[1], mul3x3Float32[2] / mul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        C12775o.m28639i(transferParameters, Constants.APPBOY_PUSH_CONTENT_KEY);
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4  reason: not valid java name */
    public static final Connector m36120connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        C12775o.m28639i(colorSpace, "$this$connect");
        C12775o.m28639i(colorSpace2, "destination");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (colorSpace == colorSpaces.getSrgb()) {
            if (colorSpace2 == colorSpaces.getSrgb()) {
                return Connector.Companion.getSrgbIdentity$ui_graphics_release();
            }
            if (colorSpace2 == colorSpaces.getOklab() && RenderIntent.m36134equalsimpl0(i, RenderIntent.Companion.m36139getPerceptualuksYyKA())) {
                return Connector.Companion.getSrgbToOklabPerceptual$ui_graphics_release();
            }
        } else if (colorSpace == colorSpaces.getOklab() && colorSpace2 == colorSpaces.getSrgb() && RenderIntent.m36134equalsimpl0(i, RenderIntent.Companion.m36139getPerceptualuksYyKA())) {
            return Connector.Companion.getOklabToSrgbPerceptual$ui_graphics_release();
        }
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace);
        }
        long r0 = colorSpace.m36118getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        if (!ColorModel.m36109equalsimpl0(r0, companion.m36116getRgbxdoWZVw()) || !ColorModel.m36109equalsimpl0(colorSpace2.m36118getModelxdoWZVw(), companion.m36116getRgbxdoWZVw())) {
            return new Connector(colorSpace, colorSpace2, i, (DefaultConstructorMarker) null);
        }
        return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i, (DefaultConstructorMarker) null);
    }

    /* renamed from: connect-YBCOT_4$default  reason: not valid java name */
    public static /* synthetic */ Connector m36121connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = RenderIntent.Companion.m36139getPerceptualuksYyKA();
        }
        return m36120connectYBCOT_4(colorSpace, colorSpace2, i);
    }

    public static final float[] inverse3x3(float[] fArr) {
        float[] fArr2 = fArr;
        C12775o.m28639i(fArr2, "m");
        float f = fArr2[0];
        float f2 = fArr2[3];
        float f3 = fArr2[6];
        float f4 = fArr2[1];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[2];
        float f8 = fArr2[5];
        float f9 = fArr2[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f10 / f13;
        fArr3[1] = f11 / f13;
        fArr3[2] = f12 / f13;
        fArr3[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr3[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr3[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr3[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr3[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr3[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr3;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C12775o.m28639i(fArr3, "lhs");
        C12775o.m28639i(fArr4, "rhs");
        float f = fArr3[3];
        float f2 = fArr4[1];
        float f3 = fArr3[6];
        float f4 = fArr4[2];
        float f5 = fArr3[1];
        float f6 = fArr4[0];
        float f7 = fArr3[4];
        float f8 = fArr3[7];
        float f9 = fArr3[5];
        float f10 = fArr3[8];
        float f11 = fArr3[0];
        float f12 = fArr4[4];
        float f13 = (fArr4[3] * f11) + (f * f12);
        float f14 = fArr4[5];
        float f15 = fArr3[1];
        float f16 = fArr4[3];
        float f17 = fArr3[2];
        float f18 = f11 * fArr4[6];
        float f19 = fArr3[3];
        float f20 = fArr4[7];
        float f21 = f18 + (f19 * f20);
        float f22 = fArr4[8];
        float f23 = fArr4[6];
        return new float[]{(fArr3[0] * fArr4[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (fArr3[2] * f6) + (fArr4[1] * f9) + (f4 * f10), f13 + (f3 * f14), (f15 * f16) + (f7 * f12) + (f8 * f14), (f16 * f17) + (f9 * fArr4[4]) + (f14 * f10), f21 + (f3 * f22), (f15 * f23) + (fArr3[4] * f20) + (f8 * f22), (f17 * f23) + (fArr3[5] * fArr4[7]) + (f10 * f22)};
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        C12775o.m28639i(fArr, "lhs");
        C12775o.m28639i(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        C12775o.m28639i(fArr, "lhs");
        C12775o.m28639i(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f, float f2, float f3) {
        C12775o.m28639i(fArr, "lhs");
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f, float f2, float f3) {
        C12775o.m28639i(fArr, "lhs");
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f, float f2, float f3) {
        C12775o.m28639i(fArr, "lhs");
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        C12775o.m28639i(colorSpace, "<this>");
        C12775o.m28639i(whitePoint, "whitePoint");
        C12775o.m28639i(adaptation, "adaptation");
        if (!ColorModel.m36109equalsimpl0(colorSpace.m36118getModelxdoWZVw(), ColorModel.Companion.m36116getRgbxdoWZVw())) {
            return colorSpace;
        }
        Rgb rgb = (Rgb) colorSpace;
        if (compare(rgb.getWhitePoint(), whitePoint)) {
            return colorSpace;
        }
        return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        C12775o.m28639i(whitePoint, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(whitePoint2, "b");
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        C12775o.m28639i(fArr, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
