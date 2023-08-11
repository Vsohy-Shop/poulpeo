package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandlesVM extends ViewModel {
    private final Map<String, SavedStateHandle> handles = new LinkedHashMap();

    public final Map<String, SavedStateHandle> getHandles() {
        return this.handles;
    }
}
