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
/* compiled from: AbsoluteRoundedCornerShape.kt */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsoluteRoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        C12775o.m28639i(cornerSize, "topLeft");
        C12775o.m28639i(cornerSize2, "topRight");
        C12775o.m28639i(cornerSize3, "bottomRight");
        C12775o.m28639i(cornerSize4, "bottomLeft");
    }

    /* renamed from: toRadius-Bz7bX_o  reason: not valid java name */
    private final long m33603toRadiusBz7bX_o(float f) {
        return CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, (Object) null);
    }

    /* renamed from: createOutline-LjSzlW0  reason: not valid java name */
    public Outline m33604createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        boolean z;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        C12775o.m28639i(layoutDirection, "layoutDirection");
        if (f5 + f6 + f7 + f8 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Outline.Rectangle(SizeKt.m35512toRectuvyYCjk(j));
        }
        Rect r6 = SizeKt.m35512toRectuvyYCjk(j);
        long CornerRadius$default = CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, (Object) null);
        return new Outline.Rounded(RoundRectKt.m35474RoundRectZAM2FJo(r6, CornerRadius$default, CornerRadiusKt.CornerRadius$default(f6, 0.0f, 2, (Object) null), CornerRadiusKt.CornerRadius$default(f7, 0.0f, 2, (Object) null), CornerRadiusKt.CornerRadius$default(f8, 0.0f, 2, (Object) null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        if (C12775o.m28634d(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && C12775o.m28634d(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && C12775o.m28634d(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && C12775o.m28634d(getBottomStart(), absoluteRoundedCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    public AbsoluteRoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        C12775o.m28639i(cornerSize, "topStart");
        C12775o.m28639i(cornerSize2, "topEnd");
        C12775o.m28639i(cornerSize3, "bottomEnd");
        C12775o.m28639i(cornerSize4, "bottomStart");
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
