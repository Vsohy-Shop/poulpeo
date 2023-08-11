package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,61:1\n76#2:62\n102#2,2:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState\n*L\n32#1:62\n32#1:63,2\n*E\n"})
@ExperimentalFoundationApi
@Stable
/* compiled from: LazyLayoutPrefetchState.kt */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private final MutableState prefetcher$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* compiled from: LazyLayoutPrefetchState.kt */
    public interface PrefetchHandle {
        void cancel();
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    public interface Prefetcher {
        /* renamed from: schedulePrefetch-0kLqBqw  reason: not valid java name */
        PrefetchHandle m33540schedulePrefetch0kLqBqw(int i, long j);
    }

    public final Prefetcher getPrefetcher$foundation_release() {
        return (Prefetcher) this.prefetcher$delegate.getValue();
    }

    /* renamed from: schedulePrefetch-0kLqBqw  reason: not valid java name */
    public final PrefetchHandle m33539schedulePrefetch0kLqBqw(int i, long j) {
        PrefetchHandle r2;
        Prefetcher prefetcher$foundation_release = getPrefetcher$foundation_release();
        if (prefetcher$foundation_release == null || (r2 = prefetcher$foundation_release.m33540schedulePrefetch0kLqBqw(i, j)) == null) {
            return DummyHandle.INSTANCE;
        }
        return r2;
    }

    public final void setPrefetcher$foundation_release(Prefetcher prefetcher) {
        this.prefetcher$delegate.setValue(prefetcher);
    }
}
