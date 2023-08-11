package androidx.compose.p002ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Oklab */
/* compiled from: Oklab.kt */
public final class Oklab extends ColorSpace {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final float[] InverseM1;
    private static final float[] InverseM2;

    /* renamed from: M1 */
    private static final float[] f272M1;

    /* renamed from: M2 */
    private static final float[] f273M2;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Oklab$Companion */
    /* compiled from: Oklab.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] mul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f272M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f273M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(mul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Oklab(String str, int i) {
        super(str, ColorModel.Companion.m36115getLabxdoWZVw(), i, (DefaultConstructorMarker) null);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
    }

    public float[] fromXyz(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        ColorSpaceKt.mul3x3Float3(f272M1, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d));
        ColorSpaceKt.mul3x3Float3(f273M2, fArr);
        return fArr;
    }

    public float getMaxValue(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    public float getMinValue(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    public boolean isWideGamut() {
        return true;
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float l = C13537l.m30885l(f, 0.0f, 1.0f);
        float l2 = C13537l.m30885l(f2, -0.5f, 0.5f);
        float l3 = C13537l.m30885l(f3, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, l, l2, l3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, l, l2, l3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, l, l2, l3);
        float f4 = mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0;
        float f5 = mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1;
        float f6 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        float[] fArr2 = InverseM1;
        return (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(fArr2, f4, f5, f6))) << 32) | (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(fArr2, f4, f5, f6))) & 4294967295L);
    }

    public float[] toXyz(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        fArr[0] = C13537l.m30885l(fArr[0], 0.0f, 1.0f);
        fArr[1] = C13537l.m30885l(fArr[1], -0.5f, 0.5f);
        fArr[2] = C13537l.m30885l(fArr[2], -0.5f, 0.5f);
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float l = C13537l.m30885l(f, 0.0f, 1.0f);
        float l2 = C13537l.m30885l(f2, -0.5f, 0.5f);
        float l3 = C13537l.m30885l(f3, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, l, l2, l3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, l, l2, l3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, l, l2, l3);
        float f4 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        return ColorSpaceKt.mul3x3Float3_2(InverseM1, mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0, mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1, f4);
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long m36130xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        float[] fArr = f272M1;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, f, f2, f3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, f, f2, f3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, f, f2, f3);
        double d = (double) 0.33333334f;
        float signum = Math.signum(mul3x3Float3_0) * ((float) Math.pow((double) Math.abs(mul3x3Float3_0), d));
        float signum2 = Math.signum(mul3x3Float3_1) * ((float) Math.pow((double) Math.abs(mul3x3Float3_1), d));
        float signum3 = Math.signum(mul3x3Float3_2) * ((float) Math.pow((double) Math.abs(mul3x3Float3_2), d));
        float[] fArr2 = f273M2;
        return ColorKt.Color(ColorSpaceKt.mul3x3Float3_0(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_1(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_2(fArr2, signum, signum2, signum3), f4, colorSpace);
    }
}
