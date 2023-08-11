package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;

@ExperimentalFoundationApi
/* compiled from: LazyLayoutPrefetchState.kt */
final class DummyHandle implements LazyLayoutPrefetchState.PrefetchHandle {
    public static final DummyHandle INSTANCE = new DummyHandle();

    private DummyHandle() {
    }

    public void cancel() {
    }
}
