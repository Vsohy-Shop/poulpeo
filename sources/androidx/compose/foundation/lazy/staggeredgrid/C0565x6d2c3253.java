package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13090q;
import p436tf.C13528f;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1 */
/* compiled from: LazyStaggeredGridItemProvider.kt */
final class C0565x6d2c3253 extends C12777p implements C13074a<C05661> {
    final /* synthetic */ State<Function1<LazyStaggeredGridScope, C11921v>> $latestContent;
    final /* synthetic */ State<C13528f> $nearestItemsRangeState;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0565x6d2c3253(State<? extends Function1<? super LazyStaggeredGridScope, C11921v>> state, State<C13528f> state2, LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.$latestContent = state;
        this.$nearestItemsRangeState = state2;
        this.$state = lazyStaggeredGridState;
    }

    public final C05661 invoke() {
        LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl = new LazyStaggeredGridScopeImpl();
        this.$latestContent.getValue().invoke(lazyStaggeredGridScopeImpl);
        return new Object(lazyStaggeredGridScopeImpl, this.$nearestItemsRangeState, this.$state) {
            private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
            private final LazyStaggeredGridSpanProvider spanProvider;

            {
                this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(r4.getIntervals(), r5.getValue(), ComposableLambdaKt.composableLambdaInstance(-364721306, true, new C13090q<IntervalList.Interval<? extends LazyStaggeredGridIntervalContent>, Integer, Composer, Integer, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((IntervalList.Interval<LazyStaggeredGridIntervalContent>) (IntervalList.Interval) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return C11921v.f18618a;
                    }

                    @Composable
                    public final void invoke(final IntervalList.Interval<LazyStaggeredGridIntervalContent> interval, int i, Composer composer, int i2) {
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
                                ComposerKt.traceEventStart(-364721306, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous> (LazyStaggeredGridItemProvider.kt:51)");
                            }
                            final int startIndex = i - interval.getStartIndex();
                            Function1<Integer, Object> key = interval.getValue().getKey();
                            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i, r6.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(composer, 1181040114, true, new C13088o<Composer, Integer, C11921v>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C11921v.f18618a;
                                }

                                @Composable
                                public final void invoke(Composer composer, int i) {
                                    if ((i & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1181040114, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous>.<anonymous> (LazyStaggeredGridItemProvider.kt:57)");
                                        }
                                        interval.getValue().getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer, 6);
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
                this.spanProvider = new LazyStaggeredGridSpanProvider(r4.getIntervals());
            }

            @Composable
            public void Item(int i, Composer composer, int i2) {
                composer.startReplaceableGroup(1163616889);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1163616889, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                }
                this.$$delegate_0.Item(i, composer, i2 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
            }

            public Object getContentType(int i) {
                return this.$$delegate_0.getContentType(i);
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

            public LazyStaggeredGridSpanProvider getSpanProvider() {
                return this.spanProvider;
            }
        };
    }
}
