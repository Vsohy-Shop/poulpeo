package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n76#2:218\n102#2,2:219\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n184#1:218\n184#1:219,2\n*E\n"})
@Stable
/* compiled from: WindowInsetsSize.kt */
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    private final C13088o<WindowInsets, Density, Integer> heightCalc;
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedHeightModifier(WindowInsets windowInsets, Function1<? super InspectorInfo, C11921v> function1, C13088o<? super WindowInsets, ? super Density, Integer> oVar) {
        super(function1);
        C12775o.m28639i(windowInsets, "insets");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(oVar, "heightCalc");
        this.insets = windowInsets;
        this.heightCalc = oVar;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        if (!C12775o.m28634d(this.insets, derivedHeightModifier.insets) || !C12775o.m28634d(this.heightCalc, derivedHeightModifier.heightCalc)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33235measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        int intValue = this.heightCalc.invoke(getUnconsumedInsets(), measureScope).intValue();
        if (intValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, (Map) null, DerivedHeightModifier$measure$1.INSTANCE, 4, (Object) null);
        }
        Placeable r11 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, intValue, intValue, 3, (Object) null));
        return MeasureScope.layout$default(measureScope, r11.getWidth(), intValue, (Map) null, new DerivedHeightModifier$measure$2(r11), 4, (Object) null);
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }
}
