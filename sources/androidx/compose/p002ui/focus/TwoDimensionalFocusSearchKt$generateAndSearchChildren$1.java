package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.layout.BeyondBoundsLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 */
/* compiled from: TwoDimensionalFocusSearch.kt */
final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends C12777p implements Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {
    final /* synthetic */ int $direction;
    final /* synthetic */ FocusTargetModifierNode $focusedItem;
    final /* synthetic */ Function1<FocusTargetModifierNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetModifierNode $this_generateAndSearchChildren;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        super(1);
        this.$this_generateAndSearchChildren = focusTargetModifierNode;
        this.$focusedItem = focusTargetModifierNode2;
        this.$direction = i;
        this.$onFound = function1;
    }

    public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        C12775o.m28639i(beyondBoundsScope, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m35386searchChildren4C6V_qg(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound));
        if (valueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
            return valueOf;
        }
        return null;
    }
}
