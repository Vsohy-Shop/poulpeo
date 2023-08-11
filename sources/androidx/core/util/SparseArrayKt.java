package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: SparseArray.kt */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArray<T> sparseArray, int i) {
        C12775o.m28639i(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i) {
        C12775o.m28639i(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t) {
        C12775o.m28639i(sparseArray, "<this>");
        if (sparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, C13088o<? super Integer, ? super T, C11921v> oVar) {
        C12775o.m28639i(sparseArray, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            oVar.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i, T t) {
        C12775o.m28639i(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i, C13074a<? extends T> aVar) {
        C12775o.m28639i(sparseArray, "<this>");
        C12775o.m28639i(aVar, "defaultValue");
        T t = sparseArray.get(i);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        C12775o.m28639i(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        C12775o.m28639i(sparseArray, "<this>");
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        C12775o.m28639i(sparseArray, "<this>");
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> C12703l0 keyIterator(SparseArray<T> sparseArray) {
        C12775o.m28639i(sparseArray, "<this>");
        return new SparseArrayKt$keyIterator$1(sparseArray);
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        C12775o.m28639i(sparseArray, "<this>");
        C12775o.m28639i(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        C12775o.m28639i(sparseArray, "<this>");
        C12775o.m28639i(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i, T t) {
        C12775o.m28639i(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !C12775o.m28634d(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i, T t) {
        C12775o.m28639i(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        C12775o.m28639i(sparseArray, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
