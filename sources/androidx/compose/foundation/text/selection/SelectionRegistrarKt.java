package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import java.util.Map;

/* compiled from: SelectionRegistrar.kt */
public final class SelectionRegistrarKt {
    private static final ProvidableCompositionLocal<SelectionRegistrar> LocalSelectionRegistrar = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, SelectionRegistrarKt$LocalSelectionRegistrar$1.INSTANCE, 1, (Object) null);

    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }

    public static final boolean hasSelection(SelectionRegistrar selectionRegistrar, long j) {
        Map<Long, Selection> subselections;
        if (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(Long.valueOf(j));
    }
}
