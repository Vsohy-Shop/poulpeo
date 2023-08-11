package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:149\n*E\n"})
/* renamed from: androidx.compose.ui.text.style.ColorStyle */
/* compiled from: TextForegroundStyle.kt */
final class ColorStyle implements TextForegroundStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: copy-8_81llA$default  reason: not valid java name */
    public static /* synthetic */ ColorStyle m38251copy8_81llA$default(ColorStyle colorStyle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorStyle.value;
        }
        return colorStyle.m38253copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU  reason: not valid java name */
    public final long m38252component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA  reason: not valid java name */
    public final ColorStyle m38253copy8_81llA(long j) {
        return new ColorStyle(j, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorStyle) && Color.m35672equalsimpl0(this.value, ((ColorStyle) obj).value)) {
            return true;
        }
        return false;
    }

    public float getAlpha() {
        return Color.m35673getAlphaimpl(m38254getColor0d7_KjU());
    }

    public Brush getBrush() {
        return null;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long m38254getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU  reason: not valid java name */
    public final long m38255getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m35678hashCodeimpl(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + Color.m35679toStringimpl(this.value) + ')';
    }

    private ColorStyle(long j) {
        this.value = j;
        if (!(j != Color.Companion.m35707getUnspecified0d7_KjU())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
