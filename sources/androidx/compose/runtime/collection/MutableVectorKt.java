package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1194:1\n1161#1,2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1182#1:1195,2\n*E\n"})
/* compiled from: MutableVector.kt */
public final class MutableVectorKt {
    public static /* synthetic */ MutableVector MutableVector$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        C12775o.m28644n(0, "T?");
        return new MutableVector(new Object[i], 0);
    }

    /* access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i, Function1<? super Integer, ? extends T> function1) {
        C12775o.m28639i(function1, "init");
        C12775o.m28644n(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = function1.invoke(Integer.valueOf(i2));
        }
        return new MutableVector<>(objArr, i);
    }
}
