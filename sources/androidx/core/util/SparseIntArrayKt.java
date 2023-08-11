package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: SparseIntArray.kt */
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i) {
        C12775o.m28639i(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i) {
        C12775o.m28639i(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i) {
        C12775o.m28639i(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfValue(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseIntArray sparseIntArray, C13088o<? super Integer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(sparseIntArray, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            oVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i, int i2) {
        C12775o.m28639i(sparseIntArray, "<this>");
        return sparseIntArray.get(i, i2);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i, C13074a<Integer> aVar) {
        C12775o.m28639i(sparseIntArray, "<this>");
        C12775o.m28639i(aVar, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return aVar.invoke().intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        C12775o.m28639i(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        C12775o.m28639i(sparseIntArray, "<this>");
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        C12775o.m28639i(sparseIntArray, "<this>");
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final C12703l0 keyIterator(SparseIntArray sparseIntArray) {
        C12775o.m28639i(sparseIntArray, "<this>");
        return new SparseIntArrayKt$keyIterator$1(sparseIntArray);
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        C12775o.m28639i(sparseIntArray, "<this>");
        C12775o.m28639i(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        C12775o.m28639i(sparseIntArray, "<this>");
        C12775o.m28639i(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i, int i2) {
        C12775o.m28639i(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 || i2 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i, int i2) {
        C12775o.m28639i(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    public static final C12703l0 valueIterator(SparseIntArray sparseIntArray) {
        C12775o.m28639i(sparseIntArray, "<this>");
        return new SparseIntArrayKt$valueIterator$1(sparseIntArray);
    }
}
