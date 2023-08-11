package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.staggeredgrid.C0565x6d2c3253;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.Map;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$1 */
/* compiled from: LazyStaggeredGridItemProvider.kt */
public final class C0564x329c90aa implements LazyLayoutItemProvider, LazyStaggeredGridItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    final /* synthetic */ State<C0565x6d2c3253.C05661> $itemProviderState;

    C0564x329c90aa(State<C0565x6d2c3253.C05661> state) {
        this.$itemProviderState = state;
        this.$$delegate_0 = LazyLayoutItemProviderKt.DelegatingLazyLayoutItemProvider(state);
    }

    @Composable
    public void Item(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-143578742);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-143578742, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
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

    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    public Object getKey(int i) {
        return this.$$delegate_0.getKey(i);
    }

    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }

    public LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.$itemProviderState.getValue().getSpanProvider();
    }
}
