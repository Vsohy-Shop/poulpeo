package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;

/* compiled from: Scrollable.kt */
final class ScrollingLogic {
    private final FlingBehavior flingBehavior;
    private final MutableState<Boolean> isNestedFlinging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState scrollableState;

    public ScrollingLogic(Orientation orientation2, boolean z, State<NestedScrollDispatcher> state, ScrollableState scrollableState2, FlingBehavior flingBehavior2, OverscrollEffect overscrollEffect2) {
        C12775o.m28639i(orientation2, "orientation");
        C12775o.m28639i(state, "nestedScrollDispatcher");
        C12775o.m28639i(scrollableState2, "scrollableState");
        C12775o.m28639i(flingBehavior2, "flingBehavior");
        this.orientation = orientation2;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = state;
        this.scrollableState = scrollableState2;
        this.flingBehavior = flingBehavior2;
        this.overscrollEffect = overscrollEffect2;
    }

    private final boolean getShouldDispatchOverscroll() {
        if (this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward()) {
            return true;
        }
        return false;
    }

    /* renamed from: dispatchScroll-3eAAhYA  reason: not valid java name */
    public final long m33134dispatchScroll3eAAhYA(ScrollScope scrollScope, long j, int i) {
        C12775o.m28639i(scrollScope, "$this$dispatchScroll");
        long r3 = m33139singleAxisOffsetMKHz9U(j);
        ScrollingLogic$dispatchScroll$performScroll$1 scrollingLogic$dispatchScroll$performScroll$1 = new ScrollingLogic$dispatchScroll$performScroll$1(this, i, scrollScope);
        if (this.overscrollEffect == null || !getShouldDispatchOverscroll()) {
            return ((Offset) scrollingLogic$dispatchScroll$performScroll$1.invoke(Offset.m35411boximpl(r3))).m35432unboximpl();
        }
        return this.overscrollEffect.m33027applyToScrollRhakbz0(r3, i, scrollingLogic$dispatchScroll$performScroll$1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: doFlingAnimation-QWom1Mo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m33135doFlingAnimationQWom1Mo(long r13, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L_0x0018:
            r4 = r0
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r13 = r4.L$0
            kotlin.jvm.internal.g0 r13 = (kotlin.jvm.internal.C12762g0) r13
            p336ef.C11910n.m25701b(r15)
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            p336ef.C11910n.m25701b(r15)
            kotlin.jvm.internal.g0 r15 = new kotlin.jvm.internal.g0
            r15.<init>()
            r15.f20418b = r13
            androidx.compose.foundation.gestures.ScrollableState r1 = r12.scrollableState
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r13 = r15
        L_0x005d:
            long r13 = r13.f20418b
            androidx.compose.ui.unit.Velocity r13 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m33135doFlingAnimationQWom1Mo(long, hf.d):java.lang.Object");
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: onDragStopped-sF-c-tU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m33136onDragStoppedsFctU(long r6, p355hf.C12074d<? super p336ef.C11921v> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            p336ef.C11910n.m25701b(r8)
            goto L_0x0071
        L_0x0039:
            p336ef.C11910n.m25701b(r8)
            r5.registerNestedFling(r4)
            long r6 = r5.m33140singleAxisVelocityAH228Gc(r6)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r8 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r8.<init>(r5, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            if (r2 == 0) goto L_0x0062
            boolean r2 = r5.getShouldDispatchOverscroll()
            if (r2 == 0) goto L_0x0062
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r2.m33026applyToFlingBMRW4eQ(r6, r8, r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r6 = r5
            goto L_0x0071
        L_0x0062:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0071:
            r7 = 0
            r6.registerNestedFling(r7)
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m33136onDragStoppedsFctU(long, hf.d):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U  reason: not valid java name */
    public final long m33137performRawScrollMKHz9U(long j) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        return m33143toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m33142toFloatk4lQ0M(j)))));
    }

    public final void registerNestedFling(boolean z) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z));
    }

    public final float reverseIfNeeded(float f) {
        if (this.reverseDirection) {
            return f * ((float) -1);
        }
        return f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U  reason: not valid java name */
    public final long m33138reverseIfNeededMKHz9U(long j) {
        if (this.reverseDirection) {
            return Offset.m35429timestuRUvjQ(j, -1.0f);
        }
        return j;
    }

    public final boolean shouldScrollImmediately() {
        boolean z;
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect2 = this.overscrollEffect;
            if (overscrollEffect2 != null) {
                z = overscrollEffect2.isInProgress();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U  reason: not valid java name */
    public final long m33139singleAxisOffsetMKHz9U(long j) {
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m35416copydBAh8RU$default(j, 0.0f, 0.0f, 1, (Object) null);
        }
        return Offset.m35416copydBAh8RU$default(j, 0.0f, 0.0f, 2, (Object) null);
    }

    /* renamed from: singleAxisVelocity-AH228Gc  reason: not valid java name */
    public final long m33140singleAxisVelocityAH228Gc(long j) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m38689copyOhffZ5M$default(j, 0.0f, 0.0f, 1, (Object) null);
        }
        return Velocity.m38689copyOhffZ5M$default(j, 0.0f, 0.0f, 2, (Object) null);
    }

    /* renamed from: toFloat-TH1AsA0  reason: not valid java name */
    public final float m33141toFloatTH1AsA0(long j) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m38693getXimpl(j);
        }
        return Velocity.m38694getYimpl(j);
    }

    /* renamed from: toFloat-k-4lQ0M  reason: not valid java name */
    public final float m33142toFloatk4lQ0M(long j) {
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m35422getXimpl(j);
        }
        return Offset.m35423getYimpl(j);
    }

    /* renamed from: toOffset-tuRUvjQ  reason: not valid java name */
    public final long m33143toOffsettuRUvjQ(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return OffsetKt.Offset(f, 0.0f);
        }
        return OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: update-QWom1Mo  reason: not valid java name */
    public final long m33144updateQWom1Mo(long j, float f) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m38689copyOhffZ5M$default(j, f, 0.0f, 2, (Object) null);
        }
        return Velocity.m38689copyOhffZ5M$default(j, 0.0f, f, 1, (Object) null);
    }
}
