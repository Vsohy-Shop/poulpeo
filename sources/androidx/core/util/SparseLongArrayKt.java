package androidx.core.util;

import android.util.SparseLongArray;
import androidx.annotation.RequiresApi;
import kotlin.collections.C12703l0;
import kotlin.collections.C12705m0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: SparseLongArray.kt */
public final class SparseLongArrayKt {
    @RequiresApi(18)
    public static final boolean contains(SparseLongArray sparseLongArray, int i) {
        C12775o.m28639i(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    public static final boolean containsKey(SparseLongArray sparseLongArray, int i) {
        C12775o.m28639i(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    public static final boolean containsValue(SparseLongArray sparseLongArray, long j) {
        C12775o.m28639i(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfValue(j) >= 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    public static final void forEach(SparseLongArray sparseLongArray, C13088o<? super Integer, ? super Long, C11921v> oVar) {
        C12775o.m28639i(sparseLongArray, "<this>");
        C12775o.m28639i(oVar, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            oVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @RequiresApi(18)
    public static final long getOrDefault(SparseLongArray sparseLongArray, int i, long j) {
        C12775o.m28639i(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @RequiresApi(18)
    public static final long getOrElse(SparseLongArray sparseLongArray, int i, C13074a<Long> aVar) {
        C12775o.m28639i(sparseLongArray, "<this>");
        C12775o.m28639i(aVar, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return aVar.invoke().longValue();
    }

    @RequiresApi(18)
    public static final int getSize(SparseLongArray sparseLongArray) {
        C12775o.m28639i(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @RequiresApi(18)
    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        C12775o.m28639i(sparseLongArray, "<this>");
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        C12775o.m28639i(sparseLongArray, "<this>");
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    @RequiresApi(18)
    public static final C12703l0 keyIterator(SparseLongArray sparseLongArray) {
        C12775o.m28639i(sparseLongArray, "<this>");
        return new SparseLongArrayKt$keyIterator$1(sparseLongArray);
    }

    @RequiresApi(18)
    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        C12775o.m28639i(sparseLongArray, "<this>");
        C12775o.m28639i(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @RequiresApi(18)
    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        C12775o.m28639i(sparseLongArray, "<this>");
        C12775o.m28639i(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    @RequiresApi(18)
    public static final boolean remove(SparseLongArray sparseLongArray, int i, long j) {
        C12775o.m28639i(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @RequiresApi(18)
    public static final void set(SparseLongArray sparseLongArray, int i, long j) {
        C12775o.m28639i(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @RequiresApi(18)
    public static final C12705m0 valueIterator(SparseLongArray sparseLongArray) {
        C12775o.m28639i(sparseLongArray, "<this>");
        return new SparseLongArrayKt$valueIterator$1(sparseLongArray);
    }
}
