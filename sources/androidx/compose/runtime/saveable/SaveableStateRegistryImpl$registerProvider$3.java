package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import p404of.C13074a;

/* compiled from: SaveableStateRegistry.kt */
public final class SaveableStateRegistryImpl$registerProvider$3 implements SaveableStateRegistry.Entry {
    final /* synthetic */ String $key;
    final /* synthetic */ C13074a<Object> $valueProvider;
    final /* synthetic */ SaveableStateRegistryImpl this$0;

    SaveableStateRegistryImpl$registerProvider$3(SaveableStateRegistryImpl saveableStateRegistryImpl, String str, C13074a<? extends Object> aVar) {
        this.this$0 = saveableStateRegistryImpl;
        this.$key = str;
        this.$valueProvider = aVar;
    }

    public void unregister() {
        List list = (List) this.this$0.valueProviders.remove(this.$key);
        if (list != null) {
            list.remove(this.$valueProvider);
        }
        if (list != null && (!list.isEmpty())) {
            this.this$0.valueProviders.put(this.$key, list);
        }
    }
}
