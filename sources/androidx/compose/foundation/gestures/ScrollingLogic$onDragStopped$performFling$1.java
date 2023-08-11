package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", mo50610f = "Scrollable.kt", mo50611l = {406, 408, 410}, mo50612m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollingLogic$onDragStopped$performFling$1 extends C12746l implements C13088o<Velocity, C12074d<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, C12074d<? super ScrollingLogic$onDragStopped$performFling$1> dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, dVar);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).m38702unboximpl();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33147invokesFctU(((Velocity) obj).m38702unboximpl(), (C12074d) obj2);
    }

    /* renamed from: invoke-sF-c-tU  reason: not valid java name */
    public final Object m33147invokesFctU(long j, C12074d<? super Velocity> dVar) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m38684boximpl(j), dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = p362if.C12150d.m26492c()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r3) goto L_0x002e
            if (r0 == r2) goto L_0x0024
            if (r0 != r1) goto L_0x001c
            long r0 = r13.J$1
            long r2 = r13.J$0
            p336ef.C11910n.m25701b(r14)
            r9 = r0
            r0 = r14
            goto L_0x0095
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            long r2 = r13.J$1
            long r4 = r13.J$0
            p336ef.C11910n.m25701b(r14)
            r0 = r14
            r7 = r4
            goto L_0x006e
        L_0x002e:
            long r3 = r13.J$0
            p336ef.C11910n.m25701b(r14)
            r0 = r14
            goto L_0x0052
        L_0x0035:
            p336ef.C11910n.m25701b(r14)
            long r4 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher) r0
            r13.J$0 = r4
            r13.label = r3
            java.lang.Object r0 = r0.m37054dispatchPreFlingQWom1Mo(r4, r13)
            if (r0 != r6) goto L_0x0051
            return r6
        L_0x0051:
            r3 = r4
        L_0x0052:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p002ui.unit.Velocity) r0
            long r7 = r0.m38702unboximpl()
            long r7 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m33135doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L_0x006b
            return r6
        L_0x006b:
            r11 = r3
            r2 = r7
            r7 = r11
        L_0x006e:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p002ui.unit.Velocity) r0
            long r9 = r0.m38702unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher) r0
            long r2 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.m37052dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L_0x0094
            return r6
        L_0x0094:
            r2 = r7
        L_0x0095:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p002ui.unit.Velocity) r0
            long r0 = r0.m38702unboximpl()
            long r0 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r9, r0)
            long r0 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
