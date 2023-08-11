package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import p404of.C13074a;

/* compiled from: SaveableStateRegistry.kt */
public interface SaveableStateRegistry {

    /* compiled from: SaveableStateRegistry.kt */
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map<String, List<Object>> performSave();

    Entry registerProvider(String str, C13074a<? extends Object> aVar);
}
