package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyStaggeredGrid.kt */
final class LazyStaggeredGridKt$LazyStaggeredGrid$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<LazyStaggeredGridScope, C11921v> $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ C13088o<Density, Constraints, int[]> $slotSizesSums;
    final /* synthetic */ LazyStaggeredGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridKt$LazyStaggeredGrid$1(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, C13088o<? super Density, ? super Constraints, int[]> oVar, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, Function1<? super LazyStaggeredGridScope, C11921v> function1, int i, int i2, int i3) {
        super(2);
        this.$state = lazyStaggeredGridState;
        this.$orientation = orientation;
        this.$slotSizesSums = oVar;
        this.$modifier = modifier;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z2;
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
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
        LazyStaggeredGridKt.m33550LazyStaggeredGridLJWHXA8(this.$state, this.$orientation, this.$slotSizesSums, this.$modifier, this.$contentPadding, this.$reverseLayout, this.$flingBehavior, this.$userScrollEnabled, this.$mainAxisSpacing, this.$crossAxisSpacing, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
