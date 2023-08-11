package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import java.util.Map;

/* compiled from: SelectionRegistrar.kt */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    /* compiled from: SelectionRegistrar.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    Map<Long, Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j);

    void notifySelectableChange(long j);

    /* renamed from: notifySelectionUpdate-5iVPX68  reason: not valid java name */
    boolean m33831notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j);

    /* renamed from: notifySelectionUpdateStart-d-4ec7I  reason: not valid java name */
    void m33832notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);
}
