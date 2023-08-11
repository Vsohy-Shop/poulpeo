package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.BlendMode */
/* compiled from: BlendMode.kt */
public final class BlendMode {
    /* access modifiers changed from: private */
    public static final int Clear = m35571constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Color = m35571constructorimpl(27);
    /* access modifiers changed from: private */
    public static final int ColorBurn = m35571constructorimpl(19);
    /* access modifiers changed from: private */
    public static final int ColorDodge = m35571constructorimpl(18);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Darken = m35571constructorimpl(16);
    /* access modifiers changed from: private */
    public static final int Difference = m35571constructorimpl(22);
    /* access modifiers changed from: private */
    public static final int Dst = m35571constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int DstAtop = m35571constructorimpl(10);
    /* access modifiers changed from: private */
    public static final int DstIn = m35571constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int DstOut = m35571constructorimpl(8);
    /* access modifiers changed from: private */
    public static final int DstOver = m35571constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Exclusion = m35571constructorimpl(23);
    /* access modifiers changed from: private */
    public static final int Hardlight = m35571constructorimpl(20);
    /* access modifiers changed from: private */
    public static final int Hue = m35571constructorimpl(25);
    /* access modifiers changed from: private */
    public static final int Lighten = m35571constructorimpl(17);
    /* access modifiers changed from: private */
    public static final int Luminosity = m35571constructorimpl(28);
    /* access modifiers changed from: private */
    public static final int Modulate = m35571constructorimpl(13);
    /* access modifiers changed from: private */
    public static final int Multiply = m35571constructorimpl(24);
    /* access modifiers changed from: private */
    public static final int Overlay = m35571constructorimpl(15);
    /* access modifiers changed from: private */
    public static final int Plus = m35571constructorimpl(12);
    /* access modifiers changed from: private */
    public static final int Saturation = m35571constructorimpl(26);
    /* access modifiers changed from: private */
    public static final int Screen = m35571constructorimpl(14);
    /* access modifiers changed from: private */
    public static final int Softlight = m35571constructorimpl(21);
    /* access modifiers changed from: private */
    public static final int Src = m35571constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int SrcAtop = m35571constructorimpl(9);
    /* access modifiers changed from: private */
    public static final int SrcIn = m35571constructorimpl(5);
    /* access modifiers changed from: private */
    public static final int SrcOut = m35571constructorimpl(7);
    /* access modifiers changed from: private */
    public static final int SrcOver = m35571constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Xor = m35571constructorimpl(11);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.BlendMode$Companion */
    /* compiled from: BlendMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClear-0nO6VwU  reason: not valid java name */
        public final int m35577getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU  reason: not valid java name */
        public final int m35578getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU  reason: not valid java name */
        public final int m35579getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU  reason: not valid java name */
        public final int m35580getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU  reason: not valid java name */
        public final int m35581getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU  reason: not valid java name */
        public final int m35582getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU  reason: not valid java name */
        public final int m35583getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU  reason: not valid java name */
        public final int m35584getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU  reason: not valid java name */
        public final int m35585getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU  reason: not valid java name */
        public final int m35586getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU  reason: not valid java name */
        public final int m35587getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU  reason: not valid java name */
        public final int m35588getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU  reason: not valid java name */
        public final int m35589getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU  reason: not valid java name */
        public final int m35590getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU  reason: not valid java name */
        public final int m35591getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU  reason: not valid java name */
        public final int m35592getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU  reason: not valid java name */
        public final int m35593getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU  reason: not valid java name */
        public final int m35594getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU  reason: not valid java name */
        public final int m35595getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU  reason: not valid java name */
        public final int m35596getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU  reason: not valid java name */
        public final int m35597getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU  reason: not valid java name */
        public final int m35598getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU  reason: not valid java name */
        public final int m35599getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU  reason: not valid java name */
        public final int m35600getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU  reason: not valid java name */
        public final int m35601getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU  reason: not valid java name */
        public final int m35602getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU  reason: not valid java name */
        public final int m35603getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU  reason: not valid java name */
        public final int m35604getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU  reason: not valid java name */
        public final int m35605getXor0nO6VwU() {
            return BlendMode.Xor;
        }
    }

    private /* synthetic */ BlendMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ BlendMode m35570boximpl(int i) {
        return new BlendMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35572equalsimpl(int i, Object obj) {
        if ((obj instanceof BlendMode) && i == ((BlendMode) obj).m35576unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35573equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35574hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35575toStringimpl(int i) {
        if (m35573equalsimpl0(i, Clear)) {
            return "Clear";
        }
        if (m35573equalsimpl0(i, Src)) {
            return "Src";
        }
        if (m35573equalsimpl0(i, Dst)) {
            return "Dst";
        }
        if (m35573equalsimpl0(i, SrcOver)) {
            return "SrcOver";
        }
        if (m35573equalsimpl0(i, DstOver)) {
            return "DstOver";
        }
        if (m35573equalsimpl0(i, SrcIn)) {
            return "SrcIn";
        }
        if (m35573equalsimpl0(i, DstIn)) {
            return "DstIn";
        }
        if (m35573equalsimpl0(i, SrcOut)) {
            return "SrcOut";
        }
        if (m35573equalsimpl0(i, DstOut)) {
            return "DstOut";
        }
        if (m35573equalsimpl0(i, SrcAtop)) {
            return "SrcAtop";
        }
        if (m35573equalsimpl0(i, DstAtop)) {
            return "DstAtop";
        }
        if (m35573equalsimpl0(i, Xor)) {
            return "Xor";
        }
        if (m35573equalsimpl0(i, Plus)) {
            return "Plus";
        }
        if (m35573equalsimpl0(i, Modulate)) {
            return "Modulate";
        }
        if (m35573equalsimpl0(i, Screen)) {
            return "Screen";
        }
        if (m35573equalsimpl0(i, Overlay)) {
            return "Overlay";
        }
        if (m35573equalsimpl0(i, Darken)) {
            return "Darken";
        }
        if (m35573equalsimpl0(i, Lighten)) {
            return "Lighten";
        }
        if (m35573equalsimpl0(i, ColorDodge)) {
            return "ColorDodge";
        }
        if (m35573equalsimpl0(i, ColorBurn)) {
            return "ColorBurn";
        }
        if (m35573equalsimpl0(i, Hardlight)) {
            return "HardLight";
        }
        if (m35573equalsimpl0(i, Softlight)) {
            return "Softlight";
        }
        if (m35573equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m35573equalsimpl0(i, Exclusion)) {
            return "Exclusion";
        }
        if (m35573equalsimpl0(i, Multiply)) {
            return "Multiply";
        }
        if (m35573equalsimpl0(i, Hue)) {
            return "Hue";
        }
        if (m35573equalsimpl0(i, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m35573equalsimpl0(i, Color)) {
            return "Color";
        }
        if (m35573equalsimpl0(i, Luminosity)) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35572equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35574hashCodeimpl(this.value);
    }

    public String toString() {
        return m35575toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35576unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35571constructorimpl(int i) {
        return i;
    }
}
