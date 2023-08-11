package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13528f;

/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProvider$1$itemProviderState$1 */
/* compiled from: LazyGridItemProvider.kt */
final class C0537x9de1a10b extends C12777p implements C13074a<LazyGridItemProviderImpl> {
    final /* synthetic */ State<Function1<LazyGridScope, C11921v>> $latestContent;
    final /* synthetic */ State<C13528f> $nearestItemsRangeState;
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0537x9de1a10b(State<? extends Function1<? super LazyGridScope, C11921v>> state, LazyGridState lazyGridState, State<C13528f> state2) {
        super(0);
        this.$latestContent = state;
        this.$state = lazyGridState;
        this.$nearestItemsRangeState = state2;
    }

    public final LazyGridItemProviderImpl invoke() {
        LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
        this.$latestContent.getValue().invoke(lazyGridScopeImpl);
        return new LazyGridItemProviderImpl(lazyGridScopeImpl.getIntervals$foundation_release(), lazyGridScopeImpl.getHasCustomSpans$foundation_release(), this.$state, this.$nearestItemsRangeState.getValue());
    }
}
