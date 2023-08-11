package androidx.core.util;

import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.collections.C12705m0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: LongSparseArray.kt */
public final class LongSparseArrayKt {
    @RequiresApi(16)
    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        C12775o.m28639i(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j) {
        C12775o.m28639i(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        C12775o.m28639i(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    public static final <T> void forEach(LongSparseArray<T> longSparseArray, C13088o<? super Long, ? super T, C11921v> oVar) {
        C12775o.m28639i(longSparseArray, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            oVar.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    @RequiresApi(16)
    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        C12775o.m28639i(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    @RequiresApi(16)
    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, C13074a<? extends T> aVar) {
        C12775o.m28639i(longSparseArray, "<this>");
        C12775o.m28639i(aVar, "defaultValue");
        T t = longSparseArray.get(j);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    @RequiresApi(16)
    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        C12775o.m28639i(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @RequiresApi(16)
    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        C12775o.m28639i(longSparseArray, "<this>");
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        C12775o.m28639i(longSparseArray, "<this>");
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(16)
    public static final <T> C12705m0 keyIterator(LongSparseArray<T> longSparseArray) {
        C12775o.m28639i(longSparseArray, "<this>");
        return new LongSparseArrayKt$keyIterator$1(longSparseArray);
    }

    @RequiresApi(16)
    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        C12775o.m28639i(longSparseArray, "<this>");
        C12775o.m28639i(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @RequiresApi(16)
    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        C12775o.m28639i(longSparseArray, "<this>");
        C12775o.m28639i(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    @RequiresApi(16)
    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        C12775o.m28639i(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !C12775o.m28634d(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @RequiresApi(16)
    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        C12775o.m28639i(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    @RequiresApi(16)
    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        C12775o.m28639i(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
