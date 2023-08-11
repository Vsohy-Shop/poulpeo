package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyGrid.kt */
final class LazyGridKt$ScrollPositionUpdater$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LazyGridItemProvider $itemProvider;
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridKt$ScrollPositionUpdater$1(LazyGridItemProvider lazyGridItemProvider, LazyGridState lazyGridState, int i) {
        super(2);
        this.$itemProvider = lazyGridItemProvider;
        this.$state = lazyGridState;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        LazyGridKt.ScrollPositionUpdater(this.$itemProvider, this.$state, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
