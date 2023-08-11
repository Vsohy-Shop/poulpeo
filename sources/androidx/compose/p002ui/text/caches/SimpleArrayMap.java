package androidx.compose.p002ui.text.caches;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.caches.SimpleArrayMap */
/* compiled from: SimpleArrayMap.kt */
public final class SimpleArrayMap<K, V> {
    private int _size;
    private int[] hashes;
    private Object[] keyValues;

    public SimpleArrayMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K k) {
        if (indexOfKey(k) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(V v) {
        if (indexOfValue$ui_text_release(v) >= 0) {
            return true;
        }
        return false;
    }

    public final void ensureCapacity(int i) {
        int i2 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i << 1);
            C12775o.m28638h(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
        }
        if (this._size != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this._size;
                if (i != simpleArrayMap._size) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object keyAt = keyAt(i2);
                    Object valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!C12775o.m28634d(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this._size != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this._size;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object keyAt2 = keyAt(i4);
                    Object valueAt2 = valueAt(i4);
                    Object obj3 = ((Map) obj).get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!C12775o.m28634d(valueAt2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final V get(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return this.keyValues[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return this.keyValues[(indexOfKey << 1) + 1];
        }
        return v;
    }

    /* access modifiers changed from: protected */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i2 = this._size;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* access modifiers changed from: protected */
    public final int indexOf(Object obj, int i) {
        C12775o.m28639i(obj, "key");
        int i2 = this._size;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i2, i);
        if (binarySearchInternal < 0 || C12775o.m28634d(obj, this.keyValues[binarySearchInternal << 1])) {
            return binarySearchInternal;
        }
        int i3 = binarySearchInternal + 1;
        while (i3 < i2 && this.hashes[i3] == i) {
            if (C12775o.m28634d(obj, this.keyValues[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = binarySearchInternal - 1;
        while (i4 >= 0 && this.hashes[i4] == i) {
            if (C12775o.m28634d(obj, this.keyValues[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final int indexOfKey(Object obj) {
        if (obj == null) {
            return indexOfNull();
        }
        return indexOf(obj, obj.hashCode());
    }

    /* access modifiers changed from: protected */
    public final int indexOfNull() {
        int i = this._size;
        if (i == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i, 0);
        if (binarySearchInternal < 0 || this.keyValues[binarySearchInternal << 1] == null) {
            return binarySearchInternal;
        }
        int i2 = binarySearchInternal + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.keyValues[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = binarySearchInternal - 1;
        while (i3 >= 0 && this.hashes[i3] == 0) {
            if (this.keyValues[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public final int indexOfValue$ui_text_release(V v) {
        int i = this._size << 1;
        Object[] objArr = this.keyValues;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (C12775o.m28634d(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this._size <= 0) {
            return true;
        }
        return false;
    }

    public final K keyAt(int i) {
        return this.keyValues[i << 1];
    }

    public final V put(K k, V v) {
        int i;
        int i2;
        int i3 = this._size;
        if (k == null) {
            i2 = indexOfNull();
            i = 0;
        } else {
            i = k.hashCode();
            i2 = indexOf(k, i);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.keyValues;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.hashes;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i6 << 1);
            C12775o.m28638h(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
            if (i3 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.hashes;
            int i7 = i5 + 1;
            int[] unused = C12708o.m28340g(iArr2, iArr2, i7, i5, i3);
            Object[] objArr = this.keyValues;
            Object[] unused2 = C12708o.m28342i(objArr, objArr, i7 << 1, i5 << 1, this._size << 1);
        }
        int i8 = this._size;
        if (i3 == i8) {
            int[] iArr3 = this.hashes;
            if (i5 < iArr3.length) {
                iArr3[i5] = i;
                Object[] objArr2 = this.keyValues;
                int i9 = i5 << 1;
                objArr2[i9] = k;
                objArr2[i9 + 1] = v;
                this._size = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        C12775o.m28639i(simpleArrayMap, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        int i = simpleArrayMap._size;
        ensureCapacity(this._size + i);
        if (this._size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(simpleArrayMap.keyAt(i2), simpleArrayMap.valueAt(i2));
            }
        } else if (i > 0) {
            int[] unused = C12708o.m28340g(simpleArrayMap.hashes, this.hashes, 0, 0, i);
            Object[] unused2 = C12708o.m28342i(simpleArrayMap.keyValues, this.keyValues, 0, 0, i << 1);
            this._size = i;
        }
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public final V remove(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public final V removeAt(int i) {
        V[] vArr = this.keyValues;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this._size;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.hashes;
            int i5 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 + 1;
                    int[] unused = C12708o.m28340g(iArr, iArr, i, i6, i7);
                    Object[] objArr = this.keyValues;
                    Object[] unused2 = C12708o.m28342i(objArr, objArr, i2, i6 << 1, i7 << 1);
                }
                Object[] objArr2 = this.keyValues;
                int i8 = i4 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                int[] iArr2 = new int[i5];
                this.hashes = iArr2;
                this.keyValues = new Object[(i5 << 1)];
                if (i > 0) {
                    int[] unused3 = C12708o.m28340g(iArr, iArr2, 0, 0, i);
                    Object[] unused4 = C12708o.m28342i(vArr, this.keyValues, 0, 0, i2);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    int[] unused5 = C12708o.m28340g(iArr, this.hashes, i, i9, i10);
                    Object[] unused6 = C12708o.m28342i(vArr, this.keyValues, i2, i9 << 1, i10 << 1);
                }
            }
            if (i3 == this._size) {
                this._size = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    public final V replace(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public final V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.keyValues;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* access modifiers changed from: protected */
    public final void set_size(int i) {
        this._size = i;
    }

    public final int size() {
        return this._size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object keyAt = keyAt(i2);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "buffer.toString()");
        return sb2;
    }

    public final V valueAt(int i) {
        return this.keyValues[(i << 1) + 1];
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i];
            this.keyValues = new Object[(i << 1)];
        }
        this._size = 0;
    }

    public final boolean remove(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !C12775o.m28634d(v, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || valueAt(indexOfKey) != v) {
            return false;
        }
        setValueAt(indexOfKey, v2);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, (DefaultConstructorMarker) null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    public static /* synthetic */ void size$annotations() {
    }
}
