package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.collections.C12703l0;
import kotlin.collections.C12715r;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: SparseBooleanArray.kt */
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfValue(z) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, C13088o<? super Integer, ? super Boolean, C11921v> oVar) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            oVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i, C13074a<Boolean> aVar) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        C12775o.m28639i(aVar, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return aVar.invoke().booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final C12703l0 keyIterator(SparseBooleanArray sparseBooleanArray) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        return new SparseBooleanArrayKt$keyIterator$1(sparseBooleanArray);
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        C12775o.m28639i(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        C12775o.m28639i(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i, z);
    }

    public static final C12715r valueIterator(SparseBooleanArray sparseBooleanArray) {
        C12775o.m28639i(sparseBooleanArray, "<this>");
        return new SparseBooleanArrayKt$valueIterator$1(sparseBooleanArray);
    }
}
