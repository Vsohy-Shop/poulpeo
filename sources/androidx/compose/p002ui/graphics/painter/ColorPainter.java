package androidx.compose.p002ui.graphics.painter;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.painter.ColorPainter */
/* compiled from: ColorPainter.kt */
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    public /* synthetic */ ColorPainter(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter2) {
        this.colorFilter = colorFilter2;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorPainter) && Color.m35672equalsimpl0(this.color, ((ColorPainter) obj).color)) {
            return true;
        }
        return false;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m36365getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m36366getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m35678hashCodeimpl(this.color);
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        DrawScope.m36250drawRectnJ9OG0$default(drawScope, this.color, 0, 0, this.alpha, (DrawStyle) null, this.colorFilter, 0, 86, (Object) null);
    }

    public String toString() {
        return "ColorPainter(color=" + Color.m35679toStringimpl(this.color) + ')';
    }

    private ColorPainter(long j) {
        this.color = j;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m35499getUnspecifiedNHjbRc();
    }
}
