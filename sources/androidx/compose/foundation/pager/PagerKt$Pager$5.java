package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Pager.kt */
final class PagerKt$Pager$5 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ SnapFlingBehavior $flingBehavior;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function1<Integer, Object> $key;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ C13089p<Integer, Composer, Integer, C11921v> $pageContent;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$Pager$5(Modifier modifier, PagerState pagerState, int i, PageSize pageSize, float f, Orientation orientation, int i2, Alignment.Vertical vertical, Alignment.Horizontal horizontal, PaddingValues paddingValues, SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, C13089p<? super Integer, ? super Composer, ? super Integer, C11921v> pVar, int i3, int i4, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$state = pagerState;
        this.$pageCount = i;
        this.$pageSize = pageSize;
        this.$pageSpacing = f;
        this.$orientation = orientation;
        this.$beyondBoundsPageCount = i2;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$contentPadding = paddingValues;
        this.$flingBehavior = snapFlingBehavior;
        this.$userScrollEnabled = z;
        this.$reverseLayout = z2;
        this.$key = function1;
        this.$pageNestedScrollConnection = nestedScrollConnection;
        this.$pageContent = pVar;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        Modifier modifier = this.$modifier;
        Modifier modifier2 = modifier;
        PagerKt.m33585PagerwKDqQAw(modifier2, this.$state, this.$pageCount, this.$pageSize, this.$pageSpacing, this.$orientation, this.$beyondBoundsPageCount, this.$verticalAlignment, this.$horizontalAlignment, this.$contentPadding, this.$flingBehavior, this.$userScrollEnabled, this.$reverseLayout, this.$key, this.$pageNestedScrollConnection, this.$pageContent, composer2, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
