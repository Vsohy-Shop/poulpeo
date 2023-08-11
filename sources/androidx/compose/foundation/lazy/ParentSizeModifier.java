package androidx.compose.foundation.lazy;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: LazyItemScopeImpl.kt */
final class ParentSizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final float fraction;
    private final State<Integer> heightState;
    private final State<Integer> widthState;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentSizeModifier(float f, Function1 function1, State state, State state2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, function1, (i & 4) != 0 ? null : state, (i & 8) != 0 ? null : state2);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeModifier)) {
            return false;
        }
        ParentSizeModifier parentSizeModifier = (ParentSizeModifier) obj;
        if (C12775o.m28634d(this.widthState, parentSizeModifier.widthState) && C12775o.m28634d(this.heightState, parentSizeModifier.heightState)) {
            if (this.fraction == parentSizeModifier.fraction) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    public int hashCode() {
        int i;
        State<Integer> state = this.widthState;
        int i2 = 0;
        if (state != null) {
            i = state.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        State<Integer> state2 = this.heightState;
        if (state2 != null) {
            i2 = state2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.hashCode(this.fraction);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        State<Integer> state = this.widthState;
        if (state == null || state.getValue().intValue() == Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else {
            i = C13265c.m30134c(this.widthState.getValue().floatValue() * this.fraction);
        }
        State<Integer> state2 = this.heightState;
        if (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = C13265c.m30134c(this.heightState.getValue().floatValue() * this.fraction);
        }
        if (i != Integer.MAX_VALUE) {
            i3 = i;
        } else {
            i3 = Constraints.m38414getMinWidthimpl(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            i4 = i2;
        } else {
            i4 = Constraints.m38413getMinHeightimpl(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = Constraints.m38412getMaxWidthimpl(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = Constraints.m38411getMaxHeightimpl(j);
        }
        Placeable r9 = measurable.m37365measureBRTryo0(ConstraintsKt.Constraints(i3, i, i4, i2));
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new ParentSizeModifier$measure$1(r9), 4, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParentSizeModifier(float f, Function1<? super InspectorInfo, C11921v> function1, State<Integer> state, State<Integer> state2) {
        super(function1);
        C12775o.m28639i(function1, "inspectorInfo");
        this.fraction = f;
        this.widthState = state;
        this.heightState = state2;
    }
}
