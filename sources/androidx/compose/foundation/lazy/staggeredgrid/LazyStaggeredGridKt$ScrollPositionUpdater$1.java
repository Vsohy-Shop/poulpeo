package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyStaggeredGrid.kt */
final class LazyStaggeredGridKt$ScrollPositionUpdater$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridKt$ScrollPositionUpdater$1(LazyLayoutItemProvider lazyLayoutItemProvider, LazyStaggeredGridState lazyStaggeredGridState, int i) {
        super(2);
        this.$itemProvider = lazyLayoutItemProvider;
        this.$state = lazyStaggeredGridState;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        LazyStaggeredGridKt.ScrollPositionUpdater(this.$itemProvider, this.$state, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
