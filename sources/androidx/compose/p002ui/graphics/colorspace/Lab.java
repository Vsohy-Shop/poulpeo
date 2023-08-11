package androidx.compose.p002ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Lab */
/* compiled from: Lab.kt */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f268A = 0.008856452f;

    /* renamed from: B */
    private static final float f269B = 7.787037f;

    /* renamed from: C */
    private static final float f270C = 0.13793103f;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: D */
    private static final float f271D = 0.20689656f;

    /* renamed from: androidx.compose.ui.graphics.colorspace.Lab$Companion */
    /* compiled from: Lab.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Lab(String str, int i) {
        super(str, ColorModel.Companion.m36115getLabxdoWZVw(), i, (DefaultConstructorMarker) null);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
    }

    public float[] fromXyz(float[] fArr) {
        float f;
        float f2;
        float f3;
        float[] fArr2 = fArr;
        C12775o.m28639i(fArr2, "v");
        float f4 = fArr2[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f5 = f4 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f6 = fArr2[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f7 = fArr2[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f5 > f268A) {
            f = (float) Math.pow((double) f5, (double) 0.33333334f);
        } else {
            f = (f5 * f269B) + f270C;
        }
        if (f6 > f268A) {
            f2 = (float) Math.pow((double) f6, (double) 0.33333334f);
        } else {
            f2 = (f6 * f269B) + f270C;
        }
        if (f7 > f268A) {
            f3 = (float) Math.pow((double) f7, (double) 0.33333334f);
        } else {
            f3 = (f7 * f269B) + f270C;
        }
        fArr2[0] = C13537l.m30885l((116.0f * f2) - 16.0f, 0.0f, 100.0f);
        fArr2[1] = C13537l.m30885l((f - f2) * 500.0f, -128.0f, 128.0f);
        fArr2[2] = C13537l.m30885l((f2 - f3) * 200.0f, -128.0f, 128.0f);
        return fArr2;
    }

    public float getMaxValue(int i) {
        if (i == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    public float getMinValue(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -128.0f;
    }

    public boolean isWideGamut() {
        return true;
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float f4;
        float f5;
        float l = (C13537l.m30885l(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float l2 = (C13537l.m30885l(f, -128.0f, 128.0f) * 0.002f) + l;
        if (l2 > f271D) {
            f4 = l2 * l2 * l2;
        } else {
            f4 = (l2 - f270C) * 0.12841855f;
        }
        if (l > f271D) {
            f5 = l * l * l;
        } else {
            f5 = (l - f270C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        return (((long) Float.floatToIntBits(f4 * illuminant.getD50Xyz$ui_graphics_release()[0])) << 32) | (((long) Float.floatToIntBits(f5 * illuminant.getD50Xyz$ui_graphics_release()[1])) & 4294967295L);
    }

    public float[] toXyz(float[] fArr) {
        float f;
        float f2;
        float f3;
        C12775o.m28639i(fArr, "v");
        fArr[0] = C13537l.m30885l(fArr[0], 0.0f, 100.0f);
        fArr[1] = C13537l.m30885l(fArr[1], -128.0f, 128.0f);
        float l = C13537l.m30885l(fArr[2], -128.0f, 128.0f);
        fArr[2] = l;
        float f4 = (fArr[0] + 16.0f) / 116.0f;
        float f5 = (fArr[1] * 0.002f) + f4;
        float f6 = f4 - (l * 0.005f);
        if (f5 > f271D) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - f270C) * 0.12841855f;
        }
        if (f4 > f271D) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - f270C) * 0.12841855f;
        }
        if (f6 > f271D) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - f270C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f * illuminant.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f2 * illuminant.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f3 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float f4;
        float l = ((C13537l.m30885l(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (C13537l.m30885l(f3, -128.0f, 128.0f) * 0.005f);
        if (l > f271D) {
            f4 = l * l * l;
        } else {
            f4 = 0.12841855f * (l - f270C);
        }
        return f4 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long m36129xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float f5;
        float f6;
        float f7;
        C12775o.m28639i(colorSpace, "colorSpace");
        Illuminant illuminant = Illuminant.INSTANCE;
        float f8 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f9 = f2 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f10 = f3 / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f8 > f268A) {
            f5 = (float) Math.pow((double) f8, (double) 0.33333334f);
        } else {
            f5 = (f8 * f269B) + f270C;
        }
        if (f9 > f268A) {
            f6 = (float) Math.pow((double) f9, (double) 0.33333334f);
        } else {
            f6 = (f9 * f269B) + f270C;
        }
        if (f10 > f268A) {
            f7 = (float) Math.pow((double) f10, (double) 0.33333334f);
        } else {
            f7 = (f10 * f269B) + f270C;
        }
        return ColorKt.Color(C13537l.m30885l((116.0f * f6) - 16.0f, 0.0f, 100.0f), C13537l.m30885l((f5 - f6) * 500.0f, -128.0f, 128.0f), C13537l.m30885l((f6 - f7) * 200.0f, -128.0f, 128.0f), f4, colorSpace);
    }
}
