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
/* compiled from: CutCornerShape.kt */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
    }

    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public Outline m33613createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        boolean z;
        float f5;
        float f6;
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
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        Path.moveTo(0.0f, f5);
        Path.lineTo(f5, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f = f2;
        }
        Path.lineTo(Size.m35491getWidthimpl(j) - f, 0.0f);
        Path.lineTo(Size.m35491getWidthimpl(j), f);
        if (layoutDirection == layoutDirection2) {
            f6 = f3;
        } else {
            f6 = f4;
        }
        Path.lineTo(Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j) - f6);
        Path.lineTo(Size.m35491getWidthimpl(j) - f6, Size.m35488getHeightimpl(j));
        if (layoutDirection == layoutDirection2) {
            f3 = f4;
        }
        Path.lineTo(f3, Size.m35488getHeightimpl(j));
        Path.lineTo(0.0f, Size.m35488getHeightimpl(j) - f3);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        if (C12775o.m28634d(getTopStart(), cutCornerShape.getTopStart()) && C12775o.m28634d(getTopEnd(), cutCornerShape.getTopEnd()) && C12775o.m28634d(getBottomEnd(), cutCornerShape.getBottomEnd()) && C12775o.m28634d(getBottomStart(), cutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public CutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
