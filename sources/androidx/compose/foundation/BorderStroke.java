package androidx.compose.foundation;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: BorderStroke.kt */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f, Brush brush2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush2);
    }

    /* renamed from: copy-D5KLDUw$default  reason: not valid java name */
    public static /* synthetic */ BorderStroke m32973copyD5KLDUw$default(BorderStroke borderStroke, float f, Brush brush2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderStroke.width;
        }
        if ((i & 2) != 0) {
            brush2 = borderStroke.brush;
        }
        return borderStroke.m32974copyD5KLDUw(f, brush2);
    }

    /* renamed from: copy-D5KLDUw  reason: not valid java name */
    public final BorderStroke m32974copyD5KLDUw(float f, Brush brush2) {
        C12775o.m28639i(brush2, "brush");
        return new BorderStroke(f, brush2, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        if (C1232Dp.m38473equalsimpl0(this.width, borderStroke.width) && C12775o.m28634d(this.brush, borderStroke.brush)) {
            return true;
        }
        return false;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m32975getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C1232Dp.m38474hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + C1232Dp.m38479toStringimpl(this.width) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f, Brush brush2) {
        this.width = f;
        this.brush = brush2;
    }
}
