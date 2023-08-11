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
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n76#2:218\n102#2,2:219\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n*L\n139#1:218\n139#1:219,2\n*E\n"})
@Stable
/* compiled from: WindowInsetsSize.kt */
final class DerivedWidthModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;
    private final C13089p<WindowInsets, LayoutDirection, Density, Integer> widthCalc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedWidthModifier(WindowInsets windowInsets, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super WindowInsets, ? super LayoutDirection, ? super Density, Integer> pVar) {
        super(function1);
        C12775o.m28639i(windowInsets, "insets");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "widthCalc");
        this.insets = windowInsets;
        this.widthCalc = pVar;
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
        if (!(obj instanceof DerivedWidthModifier)) {
            return false;
        }
        DerivedWidthModifier derivedWidthModifier = (DerivedWidthModifier) obj;
        if (!C12775o.m28634d(this.insets, derivedWidthModifier.insets) || !C12775o.m28634d(this.widthCalc, derivedWidthModifier.widthCalc)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.widthCalc.hashCode();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33236measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        int intValue = this.widthCalc.invoke(getUnconsumedInsets(), measureScope.getLayoutDirection(), measureScope).intValue();
        if (intValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, (Map) null, DerivedWidthModifier$measure$1.INSTANCE, 4, (Object) null);
        }
        Placeable r11 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, intValue, intValue, 0, 0, 12, (Object) null));
        return MeasureScope.layout$default(measureScope, intValue, r11.getHeight(), (Map) null, new DerivedWidthModifier$measure$2(r11), 4, (Object) null);
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }
}
