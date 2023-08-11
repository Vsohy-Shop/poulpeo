package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,155:1\n135#2:156\n135#2:157\n135#2:158\n135#2:159\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n53#1:156\n64#1:157\n75#1:158\n84#1:159\n*E\n"})
/* compiled from: LazyItemScopeImpl.kt */
public final class LazyItemScopeImpl implements LazyItemScope {
    private MutableState<Integer> maxHeightState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.MAX_VALUE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private MutableState<Integer> maxWidthState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.MAX_VALUE, (SnapshotMutationPolicy) null, 2, (Object) null);

    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0518xd19f6fc0(finiteAnimationSpec);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AnimateItemPlacementModifier(finiteAnimationSpec, function1));
    }

    public Modifier fillParentMaxHeight(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        MutableState<Integer> mutableState = this.maxHeightState;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0519x44a8b19f(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ParentSizeModifier(f, function1, (State) null, mutableState, 4, (DefaultConstructorMarker) null));
    }

    public Modifier fillParentMaxSize(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        MutableState<Integer> mutableState = this.maxWidthState;
        MutableState<Integer> mutableState2 = this.maxHeightState;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0520x2be35ef9(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ParentSizeModifier(f, function1, mutableState, mutableState2));
    }

    public Modifier fillParentMaxWidth(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        MutableState<Integer> mutableState = this.maxWidthState;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0521xa7eb0b3e(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ParentSizeModifier(f, function1, mutableState, (State) null, 8, (DefaultConstructorMarker) null));
    }

    public final void setMaxSize(int i, int i2) {
        this.maxWidthState.setValue(Integer.valueOf(i));
        this.maxHeightState.setValue(Integer.valueOf(i2));
    }
}
