package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p002ui.unit.Velocity;

/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
/* compiled from: BottomSheetScaffold.kt */
public final class C0704x7deaba9e implements NestedScrollConnection {
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ SwipeableV2State<?> $state;

    C0704x7deaba9e(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        this.$state = swipeableV2State;
        this.$orientation = orientation;
    }

    private final float offsetToFloat(long j) {
        if (this.$orientation == Orientation.Horizontal) {
            return Offset.m35422getXimpl(j);
        }
        return Offset.m35423getYimpl(j);
    }

    private final long toOffset(float f) {
        float f2;
        Orientation orientation = this.$orientation;
        if (orientation == Orientation.Horizontal) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return OffsetKt.Offset(f2, f);
    }

    private final float velocityToFloat(long j) {
        if (this.$orientation == Orientation.Horizontal) {
            return Velocity.m38693getXimpl(j);
        }
        return Velocity.m38694getYimpl(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m33913onPostFlingRZ2iAVY(long r3, long r5, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.C0705x8eaee744
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.C0705x8eaee744) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.label = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = p362if.C12150d.m26492c()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.J$0
            p336ef.C11910n.m25701b(r4)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0033:
            p336ef.C11910n.m25701b(r4)
            androidx.compose.material.SwipeableV2State<?> r4 = r2.$state
            float r0 = r2.velocityToFloat(r5)
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r3 = r4.settle(r0, r3)
            if (r3 != r7) goto L_0x0047
            return r7
        L_0x0047:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C0704x7deaba9e.m33913onPostFlingRZ2iAVY(long, long, hf.d):java.lang.Object");
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m33914onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat(j2)));
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m33915onPreFlingQWom1Mo(long r6, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.C0706xe2eca24b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.C0706xe2eca24b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r6 = r0.J$0
            p336ef.C11910n.m25701b(r8)
            goto L_0x0062
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p336ef.C11910n.m25701b(r8)
            float r8 = r5.velocityToFloat(r6)
            androidx.compose.material.SwipeableV2State<?> r2 = r5.$state
            float r2 = r2.requireOffset()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x005c
            androidx.compose.material.SwipeableV2State<?> r4 = r5.$state
            float r4 = r4.getMinOffset()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x005c
            androidx.compose.material.SwipeableV2State<?> r2 = r5.$state
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.settle(r8, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x005c:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.p002ui.unit.Velocity.Companion
            long r6 = r6.m38704getZero9UxMQ8M()
        L_0x0062:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C0704x7deaba9e.m33915onPreFlingQWom1Mo(long, hf.d):java.lang.Object");
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m33916onPreScrollOzD1aCk(long j, int i) {
        float offsetToFloat = offsetToFloat(j);
        if (offsetToFloat >= 0.0f || !NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI())) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        return toOffset(this.$state.dispatchRawDelta(offsetToFloat));
    }
}
