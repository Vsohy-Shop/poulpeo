package p342ff;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C12692h;
import kotlin.jvm.internal.C12775o;

/* renamed from: ff.a */
/* compiled from: MapBuilder.kt */
public abstract class C11968a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C12692h<E> {
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
        return remove((Map.Entry<?, ?>) (Map.Entry) obj);
    }

    public abstract /* bridge */ boolean remove(Map.Entry<?, ?> entry);

    public final boolean contains(E e) {
        C12775o.m28639i(e, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        return containsEntry(e);
    }
}
