package androidx.compose.foundation.shape;

import androidx.compose.p002ui.geometry.CornerRadiusKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRectKt;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: RoundedCornerShape.kt */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
    }

    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public Outline m33625createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        LayoutDirection layoutDirection2 = layoutDirection;
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Outline.Rectangle(SizeKt.m35512toRectuvyYCjk(j));
        }
        Rect r3 = SizeKt.m35512toRectuvyYCjk(j);
        LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
        if (layoutDirection2 == layoutDirection3) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long CornerRadius$default = CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, (Object) null);
        if (layoutDirection2 == layoutDirection3) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long CornerRadius$default2 = CornerRadiusKt.CornerRadius$default(f6, 0.0f, 2, (Object) null);
        if (layoutDirection2 == layoutDirection3) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long CornerRadius$default3 = CornerRadiusKt.CornerRadius$default(f7, 0.0f, 2, (Object) null);
        if (layoutDirection2 == layoutDirection3) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new Outline.Rounded(RoundRectKt.m35474RoundRectZAM2FJo(r3, CornerRadius$default, CornerRadius$default2, CornerRadius$default3, CornerRadiusKt.CornerRadius$default(f8, 0.0f, 2, (Object) null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        if (C12775o.m28634d(getTopStart(), roundedCornerShape.getTopStart()) && C12775o.m28634d(getTopEnd(), roundedCornerShape.getTopEnd()) && C12775o.m28634d(getBottomEnd(), roundedCornerShape.getBottomEnd()) && C12775o.m28634d(getBottomStart(), roundedCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public RoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
