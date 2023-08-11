package androidx.compose.material3;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: TabRow.kt */
public final class TabPosition {
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        if (C1232Dp.m38473equalsimpl0(this.left, tabPosition.left) && C1232Dp.m38473equalsimpl0(this.width, tabPosition.width)) {
            return true;
        }
        return false;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m34633getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m34634getRightD9Ej5fM() {
        return C1232Dp.m38468constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m34635getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C1232Dp.m38474hashCodeimpl(this.left) * 31) + C1232Dp.m38474hashCodeimpl(this.width);
    }

    public String toString() {
        return "TabPosition(left=" + C1232Dp.m38479toStringimpl(this.left) + ", right=" + C1232Dp.m38479toStringimpl(m34634getRightD9Ej5fM()) + ", width=" + C1232Dp.m38479toStringimpl(this.width) + ')';
    }

    private TabPosition(float f, float f2) {
        this.left = f;
        this.width = f2;
    }
}
