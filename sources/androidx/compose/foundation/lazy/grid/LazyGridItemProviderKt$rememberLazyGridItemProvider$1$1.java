package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyGridItemProvider.kt */
public final class LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1 implements LazyGridItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    final /* synthetic */ State<LazyGridItemProvider> $itemProviderState;

    LazyGridItemProviderKt$rememberLazyGridItemProvider$1$1(State<? extends LazyGridItemProvider> state) {
        this.$itemProviderState = state;
        this.$$delegate_0 = LazyLayoutItemProviderKt.DelegatingLazyLayoutItemProvider(state);
    }

    @Composable
    public void Item(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(125380152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(125380152, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
        }
        this.$$delegate_0.Item(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public Object getContentType(int i) {
        return this.$$delegate_0.getContentType(i);
    }

    public boolean getHasCustomSpans() {
        return this.$itemProviderState.getValue().getHasCustomSpans();
    }

    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    public Object getKey(int i) {
        return this.$$delegate_0.getKey(i);
    }

    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }

    /* renamed from: getSpan-_-orMbw  reason: not valid java name */
    public long m33468getSpan_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        C12775o.m28639i(lazyGridItemSpanScope, "$this$getSpan");
        return this.$itemProviderState.getValue().m33466getSpan_orMbw(lazyGridItemSpanScope, i);
    }

    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.$itemProviderState.getValue().getSpanLayoutProvider();
    }
}
