package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;
import p436tf.C13528f;

@ExperimentalFoundationApi
/* compiled from: LazyGridItemProvider.kt */
final class LazyGridItemProviderImpl implements LazyGridItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    private final boolean hasCustomSpans;
    private final IntervalList<LazyGridIntervalContent> intervals;
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);

    public LazyGridItemProviderImpl(IntervalList<LazyGridIntervalContent> intervalList, boolean z, final LazyGridState lazyGridState, C13528f fVar) {
        C12775o.m28639i(intervalList, "intervals");
        C12775o.m28639i(lazyGridState, "state");
        C12775o.m28639i(fVar, "nearestItemsRange");
        this.intervals = intervalList;
        this.hasCustomSpans = z;
        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(intervalList, fVar, ComposableLambdaKt.composableLambdaInstance(-1961468361, true, new C13090q<IntervalList.Interval<? extends LazyGridIntervalContent>, Integer, Composer, Integer, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((IntervalList.Interval<LazyGridIntervalContent>) (IntervalList.Interval) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C11921v.f18618a;
            }

            @Composable
            public final void invoke(final IntervalList.Interval<LazyGridIntervalContent> interval, int i, Composer composer, int i2) {
                int i3;
                C12775o.m28639i(interval, "interval");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed((Object) interval) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) != 146 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1961468361, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous> (LazyGridItemProvider.kt:89)");
                    }
                    final int startIndex = i - interval.getStartIndex();
                    Function1<Integer, Object> key = interval.getValue().getKey();
                    LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i, lazyGridState.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(composer, -269692885, true, new C13088o<Composer, Integer, C11921v>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C11921v.f18618a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i) {
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-269692885, i, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyGridItemProvider.kt:95)");
                                }
                                interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }), composer, (i3 & 112) | 3592);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    @Composable
    public void Item(int i, Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1355196996);
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
                ComposerKt.traceEventStart(1355196996, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:-1)");
            }
            this.$$delegate_0.Item(i, startRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridItemProviderImpl$Item$1(this, i, i2));
        }
    }

    public Object getContentType(int i) {
        return this.$$delegate_0.getContentType(i);
    }

    public boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    public Object getKey(int i) {
        return this.$$delegate_0.getKey(i);
    }

    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }

    /* renamed from: getSpan-_-orMbw  reason: not valid java name */
    public long m33467getSpan_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        C12775o.m28639i(lazyGridItemSpanScope, "$this$getSpan");
        IntervalList.Interval<LazyGridIntervalContent> interval = this.intervals.get(i);
        return interval.getValue().getSpan().invoke(lazyGridItemSpanScope, Integer.valueOf(i - interval.getStartIndex())).m33439unboximpl();
    }

    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
