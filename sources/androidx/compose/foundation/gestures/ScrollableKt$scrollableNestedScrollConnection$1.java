package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.State;

/* compiled from: Scrollable.kt */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    ScrollableKt$scrollableNestedScrollConnection$1(State<ScrollingLogic> state, boolean z) {
        this.$scrollLogic = state;
        this.$enabled = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m33131onPostFlingRZ2iAVY(long r3, long r5, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.label = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = p362if.C12150d.m26492c()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x002f
            long r5 = r3.J$0
            java.lang.Object r3 = r3.L$0
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1) r3
            p336ef.C11910n.m25701b(r4)
            goto L_0x0054
        L_0x002f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0037:
            p336ef.C11910n.m25701b(r4)
            boolean r4 = r2.$enabled
            if (r4 == 0) goto L_0x005f
            androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.$scrollLogic
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r3.L$0 = r2
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.m33135doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L_0x0053
            return r7
        L_0x0053:
            r3 = r2
        L_0x0054:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.p002ui.unit.Velocity) r4
            long r0 = r4.m38702unboximpl()
            long r4 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r5, r0)
            goto L_0x0066
        L_0x005f:
            androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.p002ui.unit.Velocity.Companion
            long r4 = r3.m38704getZero9UxMQ8M()
            r3 = r2
        L_0x0066:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r4)
            androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r3 = r3.$scrollLogic
            r4.m38702unboximpl()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            r5 = 0
            r3.registerNestedFling(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.m33131onPostFlingRZ2iAVY(long, long, hf.d):java.lang.Object");
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m33132onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.$enabled) {
            return this.$scrollLogic.getValue().m33137performRawScrollMKHz9U(j2);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m33133onPreScrollOzD1aCk(long j, int i) {
        if (NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37069getFlingWNlRxjI())) {
            this.$scrollLogic.getValue().registerNestedFling(true);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }
}
