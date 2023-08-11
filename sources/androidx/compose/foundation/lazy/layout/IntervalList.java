package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@ExperimentalFoundationApi
/* compiled from: IntervalList.kt */
public interface IntervalList<T> {

    @StabilityInferred(parameters = 1)
    @SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    /* compiled from: IntervalList.kt */
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i, int i2, T t) {
            boolean z;
            this.startIndex = i;
            this.size = i2;
            this.value = t;
            boolean z2 = true;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!(i2 <= 0 ? false : z2)) {
                    throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }
    }

    static /* synthetic */ void forEach$default(IntervalList intervalList, int i, int i2, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = intervalList.getSize() - 1;
            }
            intervalList.forEach(i, i2, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
    }

    void forEach(int i, int i2, Function1<? super Interval<? extends T>, C11921v> function1);

    Interval<T> get(int i);

    int getSize();
}
