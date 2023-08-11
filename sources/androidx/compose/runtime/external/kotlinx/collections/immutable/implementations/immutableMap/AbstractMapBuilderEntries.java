package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C12692h<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return contains((Map.Entry) obj);
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return remove((Map.Entry) obj);
    }

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> entry);

    public final boolean contains(E e) {
        C12775o.m28639i(e, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        if (!((e instanceof Object ? e : null) instanceof Map.Entry)) {
            return false;
        }
        return containsEntry(e);
    }

    public final boolean remove(E e) {
        C12775o.m28639i(e, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        if (!((e instanceof Object ? e : null) instanceof Map.Entry)) {
            return false;
        }
        return removeEntry(e);
    }
}
