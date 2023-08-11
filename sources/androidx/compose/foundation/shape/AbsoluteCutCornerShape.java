package androidx.compose.foundation.shape;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: AbsoluteCutCornerShape.kt */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsoluteCutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        C12775o.m28639i(cornerSize, "topLeft");
        C12775o.m28639i(cornerSize2, "topRight");
        C12775o.m28639i(cornerSize3, "bottomRight");
        C12775o.m28639i(cornerSize4, "bottomLeft");
    }

    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public Outline m33599createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        boolean z;
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (f + f2 + f4 + f3 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Outline.Rectangle(SizeKt.m35512toRectuvyYCjk(j));
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, f);
        Path.lineTo(f, 0.0f);
        Path.lineTo(Size.m35491getWidthimpl(j) - f2, 0.0f);
        Path.lineTo(Size.m35491getWidthimpl(j), f2);
        Path.lineTo(Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j) - f3);
        Path.lineTo(Size.m35491getWidthimpl(j) - f3, Size.m35488getHeightimpl(j));
        Path.lineTo(f4, Size.m35488getHeightimpl(j));
        Path.lineTo(0.0f, Size.m35488getHeightimpl(j) - f4);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        if (C12775o.m28634d(getTopStart(), absoluteCutCornerShape.getTopStart()) && C12775o.m28634d(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && C12775o.m28634d(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && C12775o.m28634d(getBottomStart(), absoluteCutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    public AbsoluteCutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
        return new AbsoluteCutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
