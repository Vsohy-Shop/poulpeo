package androidx.compose.p002ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,79:1\n25#2,3:80\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:80,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Xyz */
/* compiled from: Xyz.kt */
public final class Xyz extends ColorSpace {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Xyz(String str, int i) {
        super(str, ColorModel.Companion.m36117getXyzxdoWZVw(), i, (DefaultConstructorMarker) null);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
    }

    private final float clamp(float f) {
        return C13537l.m30885l(f, -2.0f, 2.0f);
    }

    public float[] fromXyz(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    public float getMaxValue(int i) {
        return 2.0f;
    }

    public float getMinValue(int i) {
        return -2.0f;
    }

    public boolean isWideGamut() {
        return true;
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float clamp = clamp(f);
        float clamp2 = clamp(f2);
        long floatToIntBits = (long) Float.floatToIntBits(clamp);
        return (((long) Float.floatToIntBits(clamp2)) & 4294967295L) | (floatToIntBits << 32);
    }

    public float[] toXyz(float[] fArr) {
        C12775o.m28639i(fArr, "v");
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return clamp(f3);
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long m36143xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        return ColorKt.Color(clamp(f), clamp(f2), clamp(f3), f4, colorSpace);
    }
}
