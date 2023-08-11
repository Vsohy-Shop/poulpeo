package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,55:1\n135#2:56\n*S KotlinDebug\n*F\n+ 1 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n*L\n33#1:56\n*E\n"})
/* compiled from: LazyGridItemScopeImpl.kt */
public final class LazyGridItemScopeImpl implements LazyGridItemScope {
    public static final LazyGridItemScopeImpl INSTANCE = new LazyGridItemScopeImpl();

    private LazyGridItemScopeImpl() {
    }

    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0541xd9ad5526(finiteAnimationSpec);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AnimateItemPlacementModifier(finiteAnimationSpec, function1));
    }
}
