package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: AppBar.kt */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ EnterAlwaysScrollBehavior this$0;

    EnterAlwaysScrollBehavior$nestedScrollConnection$1(EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.this$0 = enterAlwaysScrollBehavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m34411onPostFlingRZ2iAVY(long r10, long r12, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = p362if.C12150d.m26492c()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r2) goto L_0x0036
            if (r1 != r8) goto L_0x002e
            long r10 = r0.J$0
            p336ef.C11910n.m25701b(r14)
            goto L_0x0080
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            long r12 = r0.J$0
            java.lang.Object r10 = r0.L$0
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1 r10 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1) r10
            p336ef.C11910n.m25701b(r14)
            goto L_0x0055
        L_0x0040:
            p336ef.C11910n.m25701b(r14)
            r0.L$0 = r9
            r0.J$0 = r12
            r0.label = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = super.m37044onPostFlingRZ2iAVY(r2, r4, r6)
            if (r14 != r7) goto L_0x0054
            return r7
        L_0x0054:
            r10 = r9
        L_0x0055:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.p002ui.unit.Velocity) r14
            long r1 = r14.m38702unboximpl()
            androidx.compose.material3.EnterAlwaysScrollBehavior r11 = r10.this$0
            androidx.compose.material3.TopAppBarState r11 = r11.getState()
            float r12 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            androidx.compose.material3.EnterAlwaysScrollBehavior r13 = r10.this$0
            androidx.compose.animation.core.DecayAnimationSpec r13 = r13.getFlingAnimationSpec()
            androidx.compose.material3.EnterAlwaysScrollBehavior r10 = r10.this$0
            androidx.compose.animation.core.AnimationSpec r10 = r10.getSnapAnimationSpec()
            r14 = 0
            r0.L$0 = r14
            r0.J$0 = r1
            r0.label = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.settleAppBar(r11, r12, r13, r10, r0)
            if (r14 != r7) goto L_0x007f
            return r7
        L_0x007f:
            r10 = r1
        L_0x0080:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.p002ui.unit.Velocity) r14
            long r12 = r14.m38702unboximpl()
            long r10 = androidx.compose.p002ui.unit.Velocity.m38697plusAH228Gc(r10, r12)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1.m34411onPostFlingRZ2iAVY(long, long, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (r9 != false) goto L_0x005e;
     */
    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m34412onPostScrollDzOQY0M(long r5, long r7, int r9) {
        /*
            r4 = this;
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            of.a r9 = r9.getCanScroll()
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0019
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.p002ui.geometry.Offset.Companion
            long r5 = r5.m35438getZeroF1C5BW0()
            return r5
        L_0x0019:
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.TopAppBarState r9 = r9.getState()
            float r0 = r9.getContentOffset()
            float r1 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r5)
            float r0 = r0 + r1
            r9.setContentOffset(r0)
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.TopAppBarState r9 = r9.getState()
            float r9 = r9.getHeightOffset()
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L_0x003e
            r9 = r1
            goto L_0x003f
        L_0x003e:
            r9 = r2
        L_0x003f:
            if (r9 != 0) goto L_0x005e
            androidx.compose.material3.EnterAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.TopAppBarState r9 = r9.getState()
            float r9 = r9.getHeightOffset()
            androidx.compose.material3.EnterAlwaysScrollBehavior r3 = r4.this$0
            androidx.compose.material3.TopAppBarState r3 = r3.getState()
            float r3 = r3.getHeightOffsetLimit()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x005b
            r9 = r1
            goto L_0x005c
        L_0x005b:
            r9 = r2
        L_0x005c:
            if (r9 == 0) goto L_0x007b
        L_0x005e:
            float r9 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r5)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            if (r1 == 0) goto L_0x007b
            float r7 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r7)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x007b
            androidx.compose.material3.EnterAlwaysScrollBehavior r7 = r4.this$0
            androidx.compose.material3.TopAppBarState r7 = r7.getState()
            r7.setContentOffset(r0)
        L_0x007b:
            androidx.compose.material3.EnterAlwaysScrollBehavior r7 = r4.this$0
            androidx.compose.material3.TopAppBarState r7 = r7.getState()
            androidx.compose.material3.EnterAlwaysScrollBehavior r8 = r4.this$0
            androidx.compose.material3.TopAppBarState r8 = r8.getState()
            float r8 = r8.getHeightOffset()
            float r5 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r5)
            float r8 = r8 + r5
            r7.setHeightOffset(r8)
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.p002ui.geometry.Offset.Companion
            long r5 = r5.m35438getZeroF1C5BW0()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1.m34412onPostScrollDzOQY0M(long, long, int):long");
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m34413onPreScrollOzD1aCk(long j, int i) {
        boolean z;
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m35423getYimpl(j));
        if (heightOffset == this.this$0.getState().getHeightOffset()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Offset.m35416copydBAh8RU$default(j, 0.0f, 0.0f, 2, (Object) null);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }
}
