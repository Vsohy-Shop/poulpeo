package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nLazyLayoutItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n1#1,231:1\n135#1,3:232\n135#1,3:235\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n122#1:232,3\n127#1:235,3\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: LazyLayoutItemProvider.kt */
final class DefaultLazyLayoutItemsProvider<IntervalContent extends LazyLayoutIntervalContent> implements LazyLayoutItemProvider {
    private final IntervalList<IntervalContent> intervals;
    private final C13090q<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, C11921v> itemContentProvider;
    private final Map<Object, Integer> keyToIndexMap;

    public DefaultLazyLayoutItemsProvider(C13090q<? super IntervalList.Interval<? extends IntervalContent>, ? super Integer, ? super Composer, ? super Integer, C11921v> qVar, IntervalList<? extends IntervalContent> intervalList, C13528f fVar) {
        C12775o.m28639i(qVar, "itemContentProvider");
        C12775o.m28639i(intervalList, "intervals");
        C12775o.m28639i(fVar, "nearestItemsRange");
        this.itemContentProvider = qVar;
        this.intervals = intervalList;
        this.keyToIndexMap = generateKeyToIndexMap(fVar, intervalList);
    }

    @ExperimentalFoundationApi
    private final Map<Object, Integer> generateKeyToIndexMap(C13528f fVar, IntervalList<? extends LazyLayoutIntervalContent> intervalList) {
        boolean z;
        int j = fVar.mo53147j();
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int min = Math.min(fVar.mo53148k(), intervalList.getSize() - 1);
            if (min < j) {
                return C12716r0.m28416g();
            }
            HashMap hashMap = new HashMap();
            intervalList.forEach(j, min, new DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1(j, min, hashMap));
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final <T> T withLocalIntervalIndex(int i, C13088o<? super Integer, ? super IntervalContent, ? extends T> oVar) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(i);
        return oVar.invoke(Integer.valueOf(i - interval.getStartIndex()), interval.getValue());
    }

    @Composable
    public void Item(int i, Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1877726744);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (startRestartGroup.changed((Object) this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1877726744, i3, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            this.itemContentProvider.invoke(this.intervals.get(i), Integer.valueOf(i), startRestartGroup, Integer.valueOf((i3 << 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DefaultLazyLayoutItemsProvider$Item$1(this, i, i2));
        }
    }

    public Object getContentType(int i) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(i);
        return ((LazyLayoutIntervalContent) interval.getValue()).getType().invoke(Integer.valueOf(i - interval.getStartIndex()));
    }

    public final IntervalList<IntervalContent> getIntervals() {
        return this.intervals;
    }

    public final C13090q<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, C11921v> getItemContentProvider() {
        return this.itemContentProvider;
    }

    public int getItemCount() {
        return this.intervals.getSize();
    }

    public Object getKey(int i) {
        Object invoke;
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(i);
        int startIndex = i - interval.getStartIndex();
        Function1<Integer, Object> key = ((LazyLayoutIntervalContent) interval.getValue()).getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) {
            return Lazy_androidKt.getDefaultLazyLayoutKey(i);
        }
        return invoke;
    }

    public Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }
}
