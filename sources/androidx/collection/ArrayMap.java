package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    @Nullable
    ArrayMap<K, V>.EntrySet mEntrySet;
    @Nullable
    ArrayMap<K, V>.KeySet mKeySet;
    @Nullable
    ArrayMap<K, V>.ValueCollection mValues;

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator();
        }

        public int size() {
            return ArrayMap.this.mSize;
        }
    }

    final class KeyIterator extends IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(ArrayMap.this.mSize);
        }

        /* access modifiers changed from: protected */
        public K elementAt(int i) {
            return ArrayMap.this.keyAt(i);
        }

        /* access modifiers changed from: protected */
        public void removeAt(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex = -1;

        MapIterator() {
            this.mEnd = ArrayMap.this.mSize - 1;
        }

        public boolean equals(Object obj) {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!ContainerHelpers.equal(entry.getKey(), ArrayMap.this.keyAt(this.mIndex)) || !ContainerHelpers.equal(entry.getValue(), ArrayMap.this.valueAt(this.mIndex))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.mEntryValid) {
                return ArrayMap.this.keyAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.mEntryValid) {
                return ArrayMap.this.valueAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            if (this.mIndex < this.mEnd) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (this.mEntryValid) {
                Object keyAt = ArrayMap.this.keyAt(this.mIndex);
                Object valueAt = ArrayMap.this.valueAt(this.mIndex);
                int i2 = 0;
                if (keyAt == null) {
                    i = 0;
                } else {
                    i = keyAt.hashCode();
                }
                if (valueAt != null) {
                    i2 = valueAt.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.mEntryValid) {
                ArrayMap.this.removeAt(this.mIndex);
                this.mIndex--;
                this.mEnd--;
                this.mEntryValid = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.mEntryValid) {
                return ArrayMap.this.setValueAt(this.mIndex, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.mIndex++;
                this.mEntryValid = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    final class ValueIterator extends IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(ArrayMap.this.mSize);
        }

        /* access modifiers changed from: protected */
        public V elementAt(int i) {
            return ArrayMap.this.valueAt(i);
        }

        /* access modifiers changed from: protected */
        public void removeAt(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    public ArrayMap() {
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        ArrayMap<K, V>.EntrySet entrySet = this.mEntrySet;
        if (entrySet != null) {
            return entrySet;
        }
        ArrayMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.mEntrySet = entrySet2;
        return entrySet2;
    }

    @NonNull
    public Set<K> keySet() {
        ArrayMap<K, V>.KeySet keySet = this.mKeySet;
        if (keySet != null) {
            return keySet;
        }
        ArrayMap<K, V>.KeySet keySet2 = new KeySet();
        this.mKeySet = keySet2;
        return keySet2;
    }

    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        int i = this.mSize;
        for (Object remove : collection) {
            remove(remove);
        }
        if (i != this.mSize) {
            return true;
        }
        return false;
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        int i = this.mSize;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(keyAt(i2))) {
                removeAt(i2);
            }
        }
        if (i != this.mSize) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public <T> T[] toArrayHelper(T[] tArr, int i) {
        int i2 = this.mSize;
        if (tArr.length < i2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.mArray[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @NonNull
    public Collection<V> values() {
        ArrayMap<K, V>.ValueCollection valueCollection = this.mValues;
        if (valueCollection != null) {
            return valueCollection;
        }
        ArrayMap<K, V>.ValueCollection valueCollection2 = new ValueCollection();
        this.mValues = valueCollection2;
        return valueCollection2;
    }

    public ArrayMap(int i) {
        super(i);
    }

    final class KeySet implements Set<K> {
        KeySet() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            ArrayMap.this.clear();
        }

        public boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return ArrayMap.this.containsAll(collection);
        }

        public boolean equals(Object obj) {
            return ArrayMap.equalsSetHelper(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int i3 = ArrayMap.this.mSize - 1; i3 >= 0; i3--) {
                Object keyAt = ArrayMap.this.keyAt(i3);
                if (keyAt == null) {
                    i = 0;
                } else {
                    i = keyAt.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        public boolean remove(Object obj) {
            int indexOfKey = ArrayMap.this.indexOfKey(obj);
            if (indexOfKey < 0) {
                return false;
            }
            ArrayMap.this.removeAt(indexOfKey);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return ArrayMap.this.removeAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return ArrayMap.this.retainAll(collection);
        }

        public int size() {
            return ArrayMap.this.mSize;
        }

        public Object[] toArray() {
            int i = ArrayMap.this.mSize;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ArrayMap.this.keyAt(i2);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return ArrayMap.this.toArrayHelper(tArr, 0);
        }
    }

    final class ValueCollection implements Collection<V> {
        ValueCollection() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            ArrayMap.this.clear();
        }

        public boolean contains(Object obj) {
            if (ArrayMap.this.indexOfValue(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        public boolean remove(Object obj) {
            int indexOfValue = ArrayMap.this.indexOfValue(obj);
            if (indexOfValue < 0) {
                return false;
            }
            ArrayMap.this.removeAt(indexOfValue);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = ArrayMap.this.mSize;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(ArrayMap.this.valueAt(i2))) {
                    ArrayMap.this.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = ArrayMap.this.mSize;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(ArrayMap.this.valueAt(i2))) {
                    ArrayMap.this.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public int size() {
            return ArrayMap.this.mSize;
        }

        public Object[] toArray() {
            int i = ArrayMap.this.mSize;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = ArrayMap.this.valueAt(i2);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return ArrayMap.this.toArrayHelper(tArr, 1);
        }
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}
