package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;
import p436tf.C13528f;

@ExperimentalFoundationApi
/* compiled from: LazyListItemProvider.kt */
final class LazyListItemProviderImpl implements LazyListItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    private final List<Integer> headerIndexes;
    private final LazyItemScopeImpl itemScope;

    public LazyListItemProviderImpl(IntervalList<LazyListIntervalContent> intervalList, C13528f fVar, List<Integer> list, final LazyItemScopeImpl lazyItemScopeImpl, final LazyListState lazyListState) {
        C12775o.m28639i(intervalList, "intervals");
        C12775o.m28639i(fVar, "nearestItemsRange");
        C12775o.m28639i(list, "headerIndexes");
        C12775o.m28639i(lazyItemScopeImpl, "itemScope");
        C12775o.m28639i(lazyListState, "state");
        this.headerIndexes = list;
        this.itemScope = lazyItemScopeImpl;
        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(intervalList, fVar, ComposableLambdaKt.composableLambdaInstance(2070454083, true, new C13090q<IntervalList.Interval<? extends LazyListIntervalContent>, Integer, Composer, Integer, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((IntervalList.Interval<LazyListIntervalContent>) (IntervalList.Interval) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C11921v.f18618a;
            }

            @Composable
            public final void invoke(final IntervalList.Interval<LazyListIntervalContent> interval, int i, Composer composer, int i2) {
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
                        ComposerKt.traceEventStart(2070454083, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)");
                    }
                    final int startIndex = i - interval.getStartIndex();
                    Function1<Integer, Object> key = interval.getValue().getKey();
                    Object invoke = key != null ? key.invoke(Integer.valueOf(startIndex)) : null;
                    LazyLayoutPinnedItemList pinnedItems$foundation_release = lazyListState.getPinnedItems$foundation_release();
                    final LazyItemScopeImpl lazyItemScopeImpl = lazyItemScopeImpl;
                    LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(invoke, i, pinnedItems$foundation_release, ComposableLambdaKt.composableLambda(composer, 1210565839, true, new C13088o<Composer, Integer, C11921v>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C11921v.f18618a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i) {
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1210565839, i, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyListItemProvider.kt:87)");
                                }
                                interval.getValue().getItem().invoke(lazyItemScopeImpl, Integer.valueOf(startIndex), composer, 0);
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
        Composer startRestartGroup = composer.startRestartGroup(-1645068522);
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
                ComposerKt.traceEventStart(-1645068522, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
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
            endRestartGroup.updateScope(new LazyListItemProviderImpl$Item$1(this, i, i2));
        }
    }

    public Object getContentType(int i) {
        return this.$$delegate_0.getContentType(i);
    }

    public List<Integer> getHeaderIndexes() {
        return this.headerIndexes;
    }

    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    public Object getKey(int i) {
        return this.$$delegate_0.getKey(i);
    }

    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }
}
