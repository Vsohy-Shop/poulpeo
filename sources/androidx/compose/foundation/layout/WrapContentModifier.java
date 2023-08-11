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
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Size.kt */
final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {
    private final Object align;
    /* access modifiers changed from: private */
    public final C13088o<IntSize, LayoutDirection, IntOffset> alignmentCallback;
    private final Direction direction;
    private final boolean unbounded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentModifier(Direction direction2, boolean z, C13088o<? super IntSize, ? super LayoutDirection, IntOffset> oVar, Object obj, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(direction2, "direction");
        C12775o.m28639i(oVar, "alignmentCallback");
        C12775o.m28639i(obj, "align");
        C12775o.m28639i(function1, "inspectorInfo");
        this.direction = direction2;
        this.unbounded = z;
        this.alignmentCallback = oVar;
        this.align = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
        if (this.direction == wrapContentModifier.direction && this.unbounded == wrapContentModifier.unbounded && C12775o.m28634d(this.align, wrapContentModifier.align)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33388measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i;
        int i2;
        Measurable measurable2 = measurable;
        MeasureScope measureScope2 = measureScope;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable2, "measurable");
        Direction direction2 = this.direction;
        Direction direction3 = Direction.Vertical;
        int i3 = 0;
        if (direction2 != direction3) {
            i = 0;
        } else {
            i = Constraints.m38414getMinWidthimpl(j);
        }
        Direction direction4 = this.direction;
        Direction direction5 = Direction.Horizontal;
        if (direction4 == direction5) {
            i3 = Constraints.m38413getMinHeightimpl(j);
        }
        int i4 = Integer.MAX_VALUE;
        if (this.direction == direction3 || !this.unbounded) {
            i2 = Constraints.m38412getMaxWidthimpl(j);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (this.direction == direction5 || !this.unbounded) {
            i4 = Constraints.m38411getMaxHeightimpl(j);
        }
        Placeable r3 = measurable2.m37365measureBRTryo0(ConstraintsKt.Constraints(i, i2, i3, i4));
        int m = C13537l.m30886m(r3.getWidth(), Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(j));
        int m2 = C13537l.m30886m(r3.getHeight(), Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, m, m2, (Map) null, new WrapContentModifier$measure$1(this, m, r3, m2, measureScope), 4, (Object) null);
    }
}
