package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@ExperimentalFoundationApi
/* compiled from: LazyLayoutItemProvider.kt */
final class DefaultDelegatingLazyLayoutItemProvider implements LazyLayoutItemProvider {
    private final State<LazyLayoutItemProvider> delegate;

    public DefaultDelegatingLazyLayoutItemProvider(State<? extends LazyLayoutItemProvider> state) {
        C12775o.m28639i(state, "delegate");
        this.delegate = state;
    }

    @Composable
    public void Item(int i, Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1633511187);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (startRestartGroup.changed((Object) this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633511187, i3, -1, "androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item (LazyLayoutItemProvider.kt:194)");
            }
            this.delegate.getValue().Item(i, startRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DefaultDelegatingLazyLayoutItemProvider$Item$1(this, i, i2));
        }
    }

    public Object getContentType(int i) {
        return this.delegate.getValue().getContentType(i);
    }

    public int getItemCount() {
        return this.delegate.getValue().getItemCount();
    }

    public Object getKey(int i) {
        return this.delegate.getValue().getKey(i);
    }

    public Map<Object, Integer> getKeyToIndexMap() {
        return this.delegate.getValue().getKeyToIndexMap();
    }
}
