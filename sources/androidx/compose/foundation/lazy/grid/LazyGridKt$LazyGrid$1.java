package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyGrid.kt */
final class LazyGridKt$LazyGrid$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<LazyGridScope, C11921v> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C13088o<Density, Constraints, List<Integer>> $slotSizesSums;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridKt$LazyGrid$1(Modifier modifier, LazyGridState lazyGridState, C13088o<? super Density, ? super Constraints, ? extends List<Integer>> oVar, PaddingValues paddingValues, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, C11921v> function1, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$state = lazyGridState;
        this.$slotSizesSums = oVar;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z3;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$content = function1;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        LazyGridKt.LazyGrid(this.$modifier, this.$state, this.$slotSizesSums, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$verticalArrangement, this.$horizontalArrangement, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
