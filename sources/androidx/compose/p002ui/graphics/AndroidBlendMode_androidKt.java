package androidx.compose.p002ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.BlendMode;

/* renamed from: androidx.compose.ui.graphics.AndroidBlendMode_androidKt */
/* compiled from: AndroidBlendMode.android.kt */
public final class AndroidBlendMode_androidKt {
    /* renamed from: isSupported-s9anfk8  reason: not valid java name */
    public static final boolean m35513isSupporteds9anfk8(int i) {
        if (Build.VERSION.SDK_INT >= 29 || BlendMode.m35573equalsimpl0(i, BlendMode.Companion.m35604getSrcOver0nO6VwU()) || m35515toPorterDuffModes9anfk8(i) != PorterDuff.Mode.SRC_OVER) {
            return true;
        }
        return false;
    }

    @RequiresApi(29)
    /* renamed from: toAndroidBlendMode-s9anfk8  reason: not valid java name */
    public static final BlendMode m35514toAndroidBlendModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m35573equalsimpl0(i, companion.m35577getClear0nO6VwU())) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35600getSrc0nO6VwU())) {
            return android.graphics.BlendMode.SRC;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35583getDst0nO6VwU())) {
            return android.graphics.BlendMode.DST;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35604getSrcOver0nO6VwU())) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35587getDstOver0nO6VwU())) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35602getSrcIn0nO6VwU())) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35585getDstIn0nO6VwU())) {
            return android.graphics.BlendMode.DST_IN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35603getSrcOut0nO6VwU())) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35586getDstOut0nO6VwU())) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35601getSrcAtop0nO6VwU())) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35584getDstAtop0nO6VwU())) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35605getXor0nO6VwU())) {
            return android.graphics.BlendMode.XOR;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35596getPlus0nO6VwU())) {
            return android.graphics.BlendMode.PLUS;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35593getModulate0nO6VwU())) {
            return android.graphics.BlendMode.MODULATE;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35598getScreen0nO6VwU())) {
            return android.graphics.BlendMode.SCREEN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35595getOverlay0nO6VwU())) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35581getDarken0nO6VwU())) {
            return android.graphics.BlendMode.DARKEN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35591getLighten0nO6VwU())) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35580getColorDodge0nO6VwU())) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35579getColorBurn0nO6VwU())) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35589getHardlight0nO6VwU())) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35599getSoftlight0nO6VwU())) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35582getDifference0nO6VwU())) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35588getExclusion0nO6VwU())) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35594getMultiply0nO6VwU())) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35590getHue0nO6VwU())) {
            return android.graphics.BlendMode.HUE;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35597getSaturation0nO6VwU())) {
            return android.graphics.BlendMode.SATURATION;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35578getColor0nO6VwU())) {
            return android.graphics.BlendMode.COLOR;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35592getLuminosity0nO6VwU())) {
            return android.graphics.BlendMode.LUMINOSITY;
        }
        return android.graphics.BlendMode.SRC_OVER;
    }

    /* renamed from: toPorterDuffMode-s9anfk8  reason: not valid java name */
    public static final PorterDuff.Mode m35515toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m35573equalsimpl0(i, companion.m35577getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35600getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35583getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35604getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35587getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35602getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35585getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35603getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35586getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35601getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35584getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35605getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35596getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35598getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35595getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35581getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35591getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m35573equalsimpl0(i, companion.m35593getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
