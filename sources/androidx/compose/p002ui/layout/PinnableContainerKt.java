package androidx.compose.p002ui.layout;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;

/* renamed from: androidx.compose.ui.layout.PinnableContainerKt */
/* compiled from: PinnableContainer.kt */
public final class PinnableContainerKt {
    private static final ProvidableCompositionLocal<PinnableContainer> LocalPinnableContainer = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, PinnableContainerKt$LocalPinnableContainer$1.INSTANCE, 1, (Object) null);

    public static final ProvidableCompositionLocal<PinnableContainer> getLocalPinnableContainer() {
        return LocalPinnableContainer;
    }
}
