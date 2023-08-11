package androidx.compose.material;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;

/* compiled from: Swipeable.kt */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ SwipeableState<T> $this_PreUpPostDownNestedScrollConnection;

    SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState<T> swipeableState) {
        this.$this_PreUpPostDownNestedScrollConnection = swipeableState;
    }

    private final float toFloat(long j) {
        return Offset.m35423getYimpl(j);
    }

    private final long toOffset(float f) {
        return OffsetKt.Offset(0.0f, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m34141onPostFlingRZ2iAVY(long r5, long r7, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r5 == 0) goto L_0x0013
            r5 = r9
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r5
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0013
            int r6 = r6 - r0
            r5.label = r6
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r5.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r6 = r5.result
            java.lang.Object r9 = p362if.C12150d.m26492c()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r7 = r5.J$0
            p336ef.C11910n.m25701b(r6)
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p336ef.C11910n.m25701b(r6)
            androidx.compose.material.SwipeableState<T> r6 = r4.$this_PreUpPostDownNestedScrollConnection
            float r0 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r7)
            float r2 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r7)
            long r2 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r0, r2)
            float r0 = r4.toFloat(r2)
            r5.J$0 = r7
            r5.label = r1
            java.lang.Object r5 = r6.performFling(r0, r5)
            if (r5 != r9) goto L_0x0053
            return r9
        L_0x0053:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.m34141onPostFlingRZ2iAVY(long, long, hf.d):java.lang.Object");
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m34142onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI())) {
            return toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(toFloat(j2)));
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m34143onPreFlingQWom1Mo(long r7, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r7 = r0.J$0
            p336ef.C11910n.m25701b(r9)
            goto L_0x0078
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p336ef.C11910n.m25701b(r9)
            float r9 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r7)
            float r2 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r7)
            long r4 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r9, r2)
            float r9 = r6.toFloat(r4)
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            androidx.compose.material.SwipeableState<T> r2 = r6.$this_PreUpPostDownNestedScrollConnection
            androidx.compose.runtime.State r2 = r2.getOffset()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.material.SwipeableState<T> r4 = r6.$this_PreUpPostDownNestedScrollConnection
            float r4 = r4.getMinBound$material_release()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0072
            androidx.compose.material.SwipeableState<T> r2 = r6.$this_PreUpPostDownNestedScrollConnection
            r0.J$0 = r7
            r0.label = r3
            java.lang.Object r9 = r2.performFling(r9, r0)
            if (r9 != r1) goto L_0x0078
            return r1
        L_0x0072:
            androidx.compose.ui.unit.Velocity$Companion r7 = androidx.compose.p002ui.unit.Velocity.Companion
            long r7 = r7.m38704getZero9UxMQ8M()
        L_0x0078:
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.m34143onPreFlingQWom1Mo(long, hf.d):java.lang.Object");
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m34144onPreScrollOzD1aCk(long j, int i) {
        float f = toFloat(j);
        if (f >= 0.0f || !NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI())) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        return toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(f));
    }
}
