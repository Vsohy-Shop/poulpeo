package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13090q;
import p436tf.C13528f;

/* compiled from: LazyLayoutItemProvider.kt */
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    public static final LazyLayoutItemProvider DelegatingLazyLayoutItemProvider(State<? extends LazyLayoutItemProvider> state) {
        C12775o.m28639i(state, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(state);
    }

    @ExperimentalFoundationApi
    public static final <T extends LazyLayoutIntervalContent> LazyLayoutItemProvider LazyLayoutItemProvider(IntervalList<? extends T> intervalList, C13528f fVar, C13090q<? super IntervalList.Interval<? extends T>, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(intervalList, "intervals");
        C12775o.m28639i(fVar, "nearestItemsRange");
        C12775o.m28639i(qVar, "itemContent");
        return new DefaultLazyLayoutItemsProvider(qVar, intervalList, fVar);
    }

    @ExperimentalFoundationApi
    public static final int findIndexByKey(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i) {
        Integer num;
        C12775o.m28639i(lazyLayoutItemProvider, "<this>");
        if (obj == null) {
            return i;
        }
        if ((i >= lazyLayoutItemProvider.getItemCount() || !C12775o.m28634d(obj, lazyLayoutItemProvider.getKey(i))) && (num = lazyLayoutItemProvider.getKeyToIndexMap().get(obj)) != null) {
            return num.intValue();
        }
        return i;
    }
}
