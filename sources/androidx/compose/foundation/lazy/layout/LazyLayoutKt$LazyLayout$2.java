package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyLayout.kt */
final class LazyLayoutKt$LazyLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ C13088o<LazyLayoutMeasureScope, Constraints, MeasureResult> $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutKt$LazyLayout$2(LazyLayoutItemProvider lazyLayoutItemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, C13088o<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> oVar, int i, int i2) {
        super(2);
        this.$itemProvider = lazyLayoutItemProvider;
        this.$modifier = modifier;
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$measurePolicy = oVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        LazyLayoutKt.LazyLayout(this.$itemProvider, this.$modifier, this.$prefetchState, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
