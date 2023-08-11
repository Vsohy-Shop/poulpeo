package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,455:1\n76#2:456\n102#2,2:457\n76#2:459\n102#2,2:460\n76#2:462\n102#2,2:463\n76#2:484\n76#2:485\n102#2,2:486\n76#2:488\n102#2,2:489\n76#2:491\n76#2:492\n76#2:493\n171#3,13:465\n533#4,6:478\n452#5,4:494\n452#5,4:498\n452#5,4:502\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n96#1:456\n96#1:457,2\n98#1:459\n98#1:460,2\n100#1:462\n100#1:463,2\n177#1:484\n179#1:485\n179#1:486,2\n181#1:488\n181#1:489,2\n191#1:491\n204#1:492\n238#1:493\n133#1:465,13\n144#1:478,6\n262#1:494,4\n312#1:498,4\n328#1:502,4\n*E\n"})
@ExperimentalFoundationApi
@Stable
/* compiled from: PagerState.kt */
public final class PagerState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<PagerState, ?> Saver = ListSaverKt.listSaver(PagerState$Companion$Saver$1.INSTANCE, PagerState$Companion$Saver$2.INSTANCE);
    private final MutableState animationTargetPage$delegate;
    private final AwaitLazyListStateSet awaitLazyListStateSet;
    private final State currentPage$delegate;
    private final State currentPageOffsetFraction$delegate;
    private final int initialPage;
    private final float initialPageOffsetFraction;
    private final MutableState lazyListState$delegate;
    private final MutableState pageSpacing$delegate;
    private final State settledPage$delegate;
    private final MutableState settledPageState$delegate;
    private final MutableState snapRemainingScrollOffset$delegate;
    private final State targetPage$delegate;

    /* compiled from: PagerState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<PagerState, ?> getSaver() {
            return PagerState.Saver;
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, C12074d dVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object awaitScrollDependencies(p355hf.C12074d<? super p336ef.C11921v> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = (androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = new androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p336ef.C11910n.m25701b(r6)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            p336ef.C11910n.m25701b(r6)
            goto L_0x004d
        L_0x003c:
            p336ef.C11910n.m25701b(r6)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r6 = r5.awaitLazyListStateSet
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.waitFinalLazyListSetting(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.getLazyListState()
            if (r6 == 0) goto L_0x0066
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r6 = r6.getAwaitLayoutModifier$foundation_release()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.waitForFirstLayout(r0)
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        L_0x0066:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.awaitScrollDependencies(hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount$foundation_release() > 0) {
            return C13537l.m30886m(i, 0, getPageCount$foundation_release() - 1);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final int getAnimationTargetPage() {
        return ((Number) this.animationTargetPage$delegate.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final LazyListItemInfo getClosestPageToSnappedPosition() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        if (visiblePages.isEmpty()) {
            lazyListItemInfo = null;
        } else {
            LazyListItemInfo lazyListItemInfo2 = visiblePages.get(0);
            float f = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo2, PagerStateKt.getSnapAlignmentStartToStart()));
            int m = C12726w.m28526m(visiblePages);
            int i = 1;
            if (1 <= m) {
                while (true) {
                    LazyListItemInfo lazyListItemInfo3 = visiblePages.get(i);
                    float f2 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo3, PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f, f2) < 0) {
                        lazyListItemInfo2 = lazyListItemInfo3;
                        f = f2;
                    }
                    if (i == m) {
                        break;
                    }
                    i++;
                }
            }
            lazyListItemInfo = lazyListItemInfo2;
        }
        return lazyListItemInfo;
    }

    private final Density getDensity() {
        Density density$foundation_release;
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null || (density$foundation_release = lazyListState.getDensity$foundation_release()) == null) {
            return PagerStateKt.UnitDensity;
        }
        return density$foundation_release;
    }

    private final float getDistanceToSnapPosition() {
        LazyListItemInfo closestPageToSnappedPosition = getClosestPageToSnappedPosition();
        if (closestPageToSnappedPosition != null) {
            return LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), closestPageToSnappedPosition, PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    private final LazyListState getLazyListState() {
        return (LazyListState) this.lazyListState$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(getDensity().m38449toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), ((float) getPageSize$foundation_release()) / 2.0f) / ((float) getPageSize$foundation_release());
    }

    /* access modifiers changed from: private */
    public final int getSettledPageState() {
        return ((Number) this.settledPageState$delegate.getValue()).intValue();
    }

    private final List<LazyListItemInfo> getVisiblePages() {
        return getLayoutInfo$foundation_release().getVisibleItemsInfo();
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, C12074d dVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, dVar);
    }

    private final void setAnimationTargetPage(int i) {
        this.animationTargetPage$delegate.setValue(Integer.valueOf(i));
    }

    private final void setLazyListState(LazyListState lazyListState) {
        this.lazyListState$delegate.setValue(lazyListState);
    }

    private final void setSettledPageState(int i) {
        this.settledPageState$delegate.setValue(Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object animateScrollToPage(int r18, float r19, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r20, p355hf.C12074d<? super p336ef.C11921v> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            boolean r3 = r2 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r3 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r10 = p362if.C12150d.m26492c()
            int r4 = r3.label
            java.lang.String r11 = "Required value was null."
            r5 = 2
            r12 = 3
            r6 = 1
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0057
            if (r4 == r5) goto L_0x0044
            if (r4 != r12) goto L_0x003c
            java.lang.Object r1 = r3.L$0
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            p336ef.C11910n.m25701b(r2)
            goto L_0x0164
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            int r1 = r3.I$1
            int r4 = r3.I$0
            float r5 = r3.F$0
            java.lang.Object r6 = r3.L$1
            androidx.compose.animation.core.AnimationSpec r6 = (androidx.compose.animation.core.AnimationSpec) r6
            java.lang.Object r7 = r3.L$0
            androidx.compose.foundation.pager.PagerState r7 = (androidx.compose.foundation.pager.PagerState) r7
            p336ef.C11910n.m25701b(r2)
            goto L_0x0127
        L_0x0057:
            float r1 = r3.F$0
            int r4 = r3.I$0
            java.lang.Object r7 = r3.L$1
            androidx.compose.animation.core.AnimationSpec r7 = (androidx.compose.animation.core.AnimationSpec) r7
            java.lang.Object r8 = r3.L$0
            androidx.compose.foundation.pager.PagerState r8 = (androidx.compose.foundation.pager.PagerState) r8
            p336ef.C11910n.m25701b(r2)
            r2 = r1
            r1 = r4
            r13 = r7
            r14 = r8
            goto L_0x008f
        L_0x006b:
            p336ef.C11910n.m25701b(r2)
            int r2 = r17.getCurrentPage()
            if (r1 != r2) goto L_0x0077
            ef.v r1 = p336ef.C11921v.f18618a
            return r1
        L_0x0077:
            r3.L$0 = r0
            r2 = r20
            r3.L$1 = r2
            r3.I$0 = r1
            r4 = r19
            r3.F$0 = r4
            r3.label = r6
            java.lang.Object r7 = r0.awaitScrollDependencies(r3)
            if (r7 != r10) goto L_0x008c
            return r10
        L_0x008c:
            r14 = r0
            r13 = r2
            r2 = r4
        L_0x008f:
            double r7 = (double) r2
            r15 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r4 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            r9 = 0
            if (r4 > 0) goto L_0x009e
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r6 = r9
        L_0x009f:
            if (r6 == 0) goto L_0x0175
            int r4 = r14.getCurrentPage()
            int r15 = r14.coerceInPageRange(r1)
            r14.setAnimationTargetPage(r15)
            java.util.List r6 = r14.getVisiblePages()
            java.lang.Object r6 = kotlin.collections.C12686e0.m28221Z(r6)
            androidx.compose.foundation.lazy.LazyListItemInfo r6 = (androidx.compose.foundation.lazy.LazyListItemInfo) r6
            int r6 = r6.getIndex()
            java.util.List r7 = r14.getVisiblePages()
            java.lang.Object r7 = kotlin.collections.C12686e0.m28231j0(r7)
            androidx.compose.foundation.lazy.LazyListItemInfo r7 = (androidx.compose.foundation.lazy.LazyListItemInfo) r7
            int r7 = r7.getIndex()
            int r8 = r14.getCurrentPage()
            if (r1 <= r8) goto L_0x00d0
            if (r1 > r7) goto L_0x00d8
        L_0x00d0:
            int r7 = r14.getCurrentPage()
            if (r1 >= r7) goto L_0x0137
            if (r1 >= r6) goto L_0x0137
        L_0x00d8:
            int r6 = r14.getCurrentPage()
            int r6 = r1 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r6 < r12) goto L_0x0137
            int r6 = r14.getCurrentPage()
            if (r1 <= r6) goto L_0x00f8
            java.util.List r6 = r14.getVisiblePages()
            int r6 = r6.size()
            int r1 = r1 - r6
            int r1 = p436tf.C13537l.m30877d(r1, r4)
            goto L_0x0105
        L_0x00f8:
            java.util.List r6 = r14.getVisiblePages()
            int r6 = r6.size()
            int r4 = p436tf.C13537l.m30882i(r6, r4)
            int r1 = r1 + r4
        L_0x0105:
            androidx.compose.foundation.lazy.LazyListState r4 = r14.getLazyListState()
            if (r4 == 0) goto L_0x012d
            r6 = 0
            r8 = 2
            r9 = 0
            r3.L$0 = r14
            r3.L$1 = r13
            r3.F$0 = r2
            r3.I$0 = r15
            r3.I$1 = r1
            r3.label = r5
            r5 = r1
            r7 = r3
            java.lang.Object r4 = androidx.compose.foundation.lazy.LazyListState.scrollToItem$default(r4, r5, r6, r7, r8, r9)
            if (r4 != r10) goto L_0x0123
            return r10
        L_0x0123:
            r5 = r2
            r6 = r13
            r7 = r14
            r4 = r15
        L_0x0127:
            r15 = r4
            r2 = r5
            r13 = r6
            r4 = r1
            r1 = r7
            goto L_0x0138
        L_0x012d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r11.toString()
            r1.<init>(r2)
            throw r1
        L_0x0137:
            r1 = r14
        L_0x0138:
            int r5 = r1.getPageAvailableSpace()
            int r15 = r15 * r5
            int r5 = r1.getPageAvailableSpace()
            int r4 = r4 * r5
            float r5 = r1.getDistanceToSnapPosition()
            int r6 = r1.getPageAvailableSpace()
            float r6 = (float) r6
            float r2 = r2 * r6
            float r5 = r5 + r2
            int r15 = r15 - r4
            float r2 = (float) r15
            float r2 = r2 + r5
            androidx.compose.foundation.lazy.LazyListState r4 = r1.getLazyListState()
            if (r4 == 0) goto L_0x016b
            r3.L$0 = r1
            r5 = 0
            r3.L$1 = r5
            r3.label = r12
            java.lang.Object r2 = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(r4, r2, r13, r3)
            if (r2 != r10) goto L_0x0164
            return r10
        L_0x0164:
            r2 = -1
            r1.setAnimationTargetPage(r2)
            ef.v r1 = p336ef.C11921v.f18618a
            return r1
        L_0x016b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r11.toString()
            r1.<init>(r2)
            throw r1
        L_0x0175:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "pageOffsetFraction "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " is not within the range -0.5 to 0.5"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, hf.d):java.lang.Object");
    }

    public float dispatchRawDelta(float f) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.dispatchRawDelta(f);
        }
        return 0.0f;
    }

    public boolean getCanScrollBackward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollBackward();
        }
        return true;
    }

    public boolean getCanScrollForward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollForward();
        }
        return true;
    }

    public final int getCurrentPage() {
        return ((Number) this.currentPage$delegate.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction$delegate.getValue()).floatValue();
    }

    public final LazyListItemInfo getFirstVisiblePage$foundation_release() {
        LazyListItemInfo lazyListItemInfo;
        boolean z;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        ListIterator<LazyListItemInfo> listIterator = visiblePages.listIterator(visiblePages.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = listIterator.previous();
            if (LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo, PagerStateKt.getSnapAlignmentStartToStart()) <= 0.0f) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return lazyListItemInfo;
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    public final InteractionSource getInteractionSource() {
        InteractionSource interactionSource;
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null || (interactionSource = lazyListState.getInteractionSource()) == null) {
            return PagerStateKt.EmptyInteractionSources;
        }
        return interactionSource;
    }

    public final LazyListLayoutInfo getLayoutInfo$foundation_release() {
        LazyListLayoutInfo layoutInfo;
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null || (layoutInfo = lazyListState.getLayoutInfo()) == null) {
            return PagerStateKt.EmptyLayoutInfo;
        }
        return layoutInfo;
    }

    public final int getPageCount$foundation_release() {
        return getLayoutInfo$foundation_release().getTotalItemsCount();
    }

    public final int getPageSize$foundation_release() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) C12686e0.m28223b0(getVisiblePages());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getSize();
        }
        return 0;
    }

    public final int getPageSpacing$foundation_release() {
        return ((Number) this.pageSpacing$delegate.getValue()).intValue();
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return ((Number) this.snapRemainingScrollOffset$delegate.getValue()).floatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    public boolean isScrollInProgress() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.isScrollInProgress();
        }
        return false;
    }

    public final void loadNewState$foundation_release(LazyListState lazyListState) {
        C12775o.m28639i(lazyListState, "newState");
        setLazyListState(lazyListState);
        this.awaitLazyListStateSet.onStateLoaded();
    }

    public Object scroll(MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null) {
            return C11921v.f18618a;
        }
        Object scroll = lazyListState.scroll(mutatePriority, oVar, dVar);
        if (scroll == C12150d.m26492c()) {
            return scroll;
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object scrollToPage(int r11, float r12, p355hf.C12074d<? super p336ef.C11921v> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.pager.PagerState$scrollToPage$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$scrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$scrollToPage$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p336ef.C11910n.m25701b(r13)
            goto L_0x0085
        L_0x002c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0034:
            float r12 = r0.F$0
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            p336ef.C11910n.m25701b(r13)
            goto L_0x0053
        L_0x0040:
            p336ef.C11910n.m25701b(r13)
            r0.L$0 = r10
            r0.I$0 = r11
            r0.F$0 = r12
            r0.label = r4
            java.lang.Object r13 = r10.awaitScrollDependencies(r0)
            if (r13 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r10
        L_0x0053:
            double r5 = (double) r12
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r7 = 0
            if (r13 > 0) goto L_0x0062
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 > 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r4 = r7
        L_0x0063:
            if (r4 == 0) goto L_0x0094
            int r11 = r2.coerceInPageRange(r11)
            int r13 = r2.getPageAvailableSpace()
            float r13 = (float) r13
            float r13 = r13 * r12
            int r12 = p418qf.C13265c.m30134c(r13)
            androidx.compose.foundation.lazy.LazyListState r13 = r2.getLazyListState()
            if (r13 == 0) goto L_0x0088
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r13.scrollToItem(r11, r12, r0)
            if (r11 != r1) goto L_0x0085
            return r1
        L_0x0085:
            ef.v r11 = p336ef.C11921v.f18618a
            return r11
        L_0x0088:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0094:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "pageOffsetFraction "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = " is not within the range -0.5 to 0.5"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scrollToPage(int, float, hf.d):java.lang.Object");
    }

    public final void setPageSpacing$foundation_release(int i) {
        this.pageSpacing$delegate.setValue(Integer.valueOf(i));
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.snapRemainingScrollOffset$delegate.setValue(Float.valueOf(f));
    }

    public final void updateOnScrollStopped$foundation_release() {
        setSettledPageState(getCurrentPage());
    }

    public PagerState(int i, float f) {
        this.initialPage = i;
        this.initialPageOffsetFraction = f;
        double d = (double) f;
        if (-0.5d <= d && d <= 0.5d) {
            this.snapRemainingScrollOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
            this.lazyListState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.pageSpacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.awaitLazyListStateSet = new AwaitLazyListStateSet();
            this.currentPage$delegate = SnapshotStateKt.derivedStateOf(new PagerState$currentPage$2(this));
            this.animationTargetPage$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.settledPageState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), (SnapshotMutationPolicy) null, 2, (Object) null);
            this.settledPage$delegate = SnapshotStateKt.derivedStateOf(new PagerState$settledPage$2(this));
            this.targetPage$delegate = SnapshotStateKt.derivedStateOf(new PagerState$targetPage$2(this));
            this.currentPageOffsetFraction$delegate = SnapshotStateKt.derivedStateOf(new PagerState$currentPageOffsetFraction$2(this));
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }
}
