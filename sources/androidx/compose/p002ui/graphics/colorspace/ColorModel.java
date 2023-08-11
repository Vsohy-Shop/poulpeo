package androidx.compose.p002ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,89:1\n55#2:90\n48#2:91\n48#2:92\n48#2:93\n48#2:94\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n48#1:90\n57#1:91\n64#1:92\n71#1:93\n79#1:94\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorModel */
/* compiled from: ColorModel.kt */
public final class ColorModel {
    /* access modifiers changed from: private */
    public static final long Cmyk;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Lab;
    /* access modifiers changed from: private */
    public static final long Rgb;
    /* access modifiers changed from: private */
    public static final long Xyz;
    private final long packedValue;

    /* renamed from: androidx.compose.ui.graphics.colorspace.ColorModel$Companion */
    /* compiled from: ColorModel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw  reason: not valid java name */
        public final long m36114getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw  reason: not valid java name */
        public final long m36115getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw  reason: not valid java name */
        public final long m36116getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw  reason: not valid java name */
        public final long m36117getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }
    }

    static {
        long j = (long) 3;
        long j2 = j << 32;
        Rgb = m36107constructorimpl((((long) 0) & 4294967295L) | j2);
        Xyz = m36107constructorimpl((((long) 1) & 4294967295L) | j2);
        Lab = m36107constructorimpl(j2 | (((long) 2) & 4294967295L));
        Cmyk = m36107constructorimpl((j & 4294967295L) | (((long) 4) << 32));
    }

    private /* synthetic */ ColorModel(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorModel m36106boximpl(long j) {
        return new ColorModel(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36108equalsimpl(long j, Object obj) {
        if ((obj instanceof ColorModel) && j == ((ColorModel) obj).m36113unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36109equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getComponentCount-impl  reason: not valid java name */
    public static final int m36110getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36111hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36112toStringimpl(long j) {
        if (m36109equalsimpl0(j, Rgb)) {
            return "Rgb";
        }
        if (m36109equalsimpl0(j, Xyz)) {
            return "Xyz";
        }
        if (m36109equalsimpl0(j, Lab)) {
            return "Lab";
        }
        if (m36109equalsimpl0(j, Cmyk)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36108equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m36111hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m36112toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m36113unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m36107constructorimpl(long j) {
        return j;
    }
}
