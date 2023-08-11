package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n48#2:217\n523#2:218\n523#2:219\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n192#1:217\n197#1:218\n206#1:219\n*E\n"})
/* compiled from: IntervalList.kt */
public final class IntervalListKt {
    /* access modifiers changed from: private */
    @ExperimentalFoundationApi
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i) {
        int size = mutableVector.getSize() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = ((size - i2) / 2) + i2;
            int startIndex = ((IntervalList.Interval) mutableVector.getContent()[i3]).getStartIndex();
            if (startIndex == i) {
                return i3;
            }
            if (startIndex < i) {
                i2 = i3 + 1;
                if (i < ((IntervalList.Interval) mutableVector.getContent()[i2]).getStartIndex()) {
                    return i3;
                }
            } else {
                size = i3 - 1;
            }
        }
        return i2;
    }
}
