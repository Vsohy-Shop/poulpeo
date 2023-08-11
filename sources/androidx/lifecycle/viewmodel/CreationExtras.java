package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: CreationExtras.kt */
public abstract class CreationExtras {
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public <T> T get(Key<T> key) {
            C12775o.m28639i(key, "key");
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    public interface Key<T> {
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
