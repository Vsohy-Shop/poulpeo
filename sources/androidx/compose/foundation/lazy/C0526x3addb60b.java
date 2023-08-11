package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p436tf.C13528f;

/* renamed from: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProvider$1$itemProviderState$1 */
/* compiled from: LazyListItemProvider.kt */
final class C0526x3addb60b extends C12777p implements C13074a<LazyListItemProviderImpl> {
    final /* synthetic */ LazyItemScopeImpl $itemScope;
    final /* synthetic */ State<Function1<LazyListScope, C11921v>> $latestContent;
    final /* synthetic */ State<C13528f> $nearestItemsRangeState;
    final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0526x3addb60b(State<? extends Function1<? super LazyListScope, C11921v>> state, State<C13528f> state2, LazyItemScopeImpl lazyItemScopeImpl, LazyListState lazyListState) {
        super(0);
        this.$latestContent = state;
        this.$nearestItemsRangeState = state2;
        this.$itemScope = lazyItemScopeImpl;
        this.$state = lazyListState;
    }

    public final LazyListItemProviderImpl invoke() {
        LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
        this.$latestContent.getValue().invoke(lazyListScopeImpl);
        return new LazyListItemProviderImpl(lazyListScopeImpl.getIntervals(), this.$nearestItemsRangeState.getValue(), lazyListScopeImpl.getHeaderIndexes(), this.$itemScope, this.$state);
    }
}
