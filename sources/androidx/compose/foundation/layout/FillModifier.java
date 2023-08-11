package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Size.kt */
final class FillModifier extends InspectorValueInfo implements LayoutModifier {
    private final Direction direction;
    private final float fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FillModifier(Direction direction2, float f, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(direction2, "direction");
        C12775o.m28639i(function1, "inspectorInfo");
        this.direction = direction2;
        this.fraction = f;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof FillModifier)) {
            return false;
        }
        FillModifier fillModifier = (FillModifier) obj;
        if (this.direction != fillModifier.direction) {
            return false;
        }
        if (this.fraction == fillModifier.fraction) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33237measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        if (!Constraints.m38408getHasBoundedWidthimpl(j) || this.direction == Direction.Vertical) {
            i2 = Constraints.m38414getMinWidthimpl(j);
            i = Constraints.m38412getMaxWidthimpl(j);
        } else {
            i2 = C13537l.m30886m(C13265c.m30134c(((float) Constraints.m38412getMaxWidthimpl(j)) * this.fraction), Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(j));
            i = i2;
        }
        if (!Constraints.m38407getHasBoundedHeightimpl(j) || this.direction == Direction.Horizontal) {
            int r2 = Constraints.m38413getMinHeightimpl(j);
            i3 = Constraints.m38411getMaxHeightimpl(j);
            i4 = r2;
        } else {
            i4 = C13537l.m30886m(C13265c.m30134c(((float) Constraints.m38411getMaxHeightimpl(j)) * this.fraction), Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(j));
            i3 = i4;
        }
        Placeable r9 = measurable.m37365measureBRTryo0(ConstraintsKt.Constraints(i2, i, i4, i3));
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new FillModifier$measure$1(r9), 4, (Object) null);
    }
}
