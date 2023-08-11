package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n135#2:306\n76#3:307\n102#3,2:308\n76#3:310\n102#3,2:311\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n149#1:306\n155#1:307\n155#1:308,2\n156#1:310\n156#1:311,2\n*E\n"})
/* compiled from: WindowInsetsPadding.kt */
public final class InsetsPaddingModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    private final MutableState consumedInsets$delegate;
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier(WindowInsets windowInsets, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(windowInsets, "insets");
        C12775o.m28639i(function1, "inspectorInfo");
        this.insets = windowInsets;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.consumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets$delegate.getValue();
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets$delegate.setValue(windowInsets);
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingModifier)) {
            return false;
        }
        return C12775o.m28634d(((InsetsPaddingModifier) obj).insets, this.insets);
    }

    public ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    public int hashCode() {
        return this.insets.hashCode();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33240measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        int left = getUnconsumedInsets().getLeft(measureScope, measureScope.getLayoutDirection());
        int top = getUnconsumedInsets().getTop(measureScope);
        int right = getUnconsumedInsets().getRight(measureScope, measureScope.getLayoutDirection()) + left;
        int bottom = getUnconsumedInsets().getBottom(measureScope) + top;
        Placeable r1 = measurable.m37365measureBRTryo0(ConstraintsKt.m38428offsetNN6EwU(j, -right, -bottom));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m38426constrainWidthK40F9xA(j, r1.getWidth() + right), ConstraintsKt.m38425constrainHeightK40F9xA(j, r1.getHeight() + bottom), (Map) null, new InsetsPaddingModifier$measure$1(r1, left, top), 4, (Object) null);
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, windowInsets));
        setConsumedInsets(WindowInsetsKt.union(windowInsets, this.insets));
    }

    public WindowInsets getValue() {
        return getConsumedInsets();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InsetsPaddingModifier(WindowInsets windowInsets, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, (i & 2) != 0 ? InspectableValueKt.isDebugInspectorInfoEnabled() ? new InsetsPaddingModifier$special$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo() : function1);
    }
}
