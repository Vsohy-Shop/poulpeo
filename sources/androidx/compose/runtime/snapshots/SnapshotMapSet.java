package androidx.compose.runtime.snapshots;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Set;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import p412pf.C13218f;

/* compiled from: SnapshotStateMap.kt */
abstract class SnapshotMapSet<K, V, E> implements Set<E>, C13218f {
    private final SnapshotStateMap<K, V> map;

    public SnapshotMapSet(SnapshotStateMap<K, V> snapshotStateMap) {
        C12775o.m28639i(snapshotStateMap, "map");
        this.map = snapshotStateMap;
    }

    public void clear() {
        this.map.clear();
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public int getSize() {
        return this.map.size();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }
}
