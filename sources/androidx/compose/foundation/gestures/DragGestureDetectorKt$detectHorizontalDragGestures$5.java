package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", mo50610f = "DragGestureDetector.kt", mo50611l = {539, 541, 552}, mo50612m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13074a<C11921v> $onDragCancel;
    final /* synthetic */ C13074a<C11921v> $onDragEnd;
    final /* synthetic */ Function1<Offset, C11921v> $onDragStart;
    final /* synthetic */ C13088o<PointerInputChange, Float, C11921v> $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectHorizontalDragGestures$5(Function1<? super Offset, C11921v> function1, C13088o<? super PointerInputChange, ? super Float, C11921v> oVar, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C12074d<? super DragGestureDetectorKt$detectHorizontalDragGestures$5> dVar) {
        super(2, dVar);
        this.$onDragStart = function1;
        this.$onHorizontalDrag = oVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, dVar);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            p336ef.C11910n.m25701b(r13)
            goto L_0x00a7
        L_0x0016:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001e:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.C12757e0) r1
            java.lang.Object r3 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r3
            p336ef.C11910n.m25701b(r13)
            goto L_0x0072
        L_0x002a:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r13)
            goto L_0x004d
        L_0x0032:
            p336ef.C11910n.m25701b(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r12.L$0 = r13
            r12.label = r4
            r5 = r13
            r8 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L_0x004a
            return r0
        L_0x004a:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x004d:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            kotlin.jvm.internal.e0 r10 = new kotlin.jvm.internal.e0
            r10.<init>()
            long r5 = r13.m37168getIdJ3iCeTQ()
            int r7 = r13.m37172getTypeT8wyACA()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
            r8.<init>(r10)
            r12.L$0 = r1
            r12.L$1 = r10
            r12.label = r3
            r4 = r1
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33050awaitHorizontalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
            if (r13 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r3 = r1
            r1 = r10
        L_0x0072:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            if (r13 == 0) goto L_0x00ba
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r4 = r12.$onDragStart
            long r5 = r13.m37169getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r5)
            r4.invoke(r5)
            of.o<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, ef.v> r4 = r12.$onHorizontalDrag
            float r1 = r1.f20408b
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r1)
            r4.invoke(r13, r1)
            long r4 = r13.m37168getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
            of.o<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, ef.v> r1 = r12.$onHorizontalDrag
            r13.<init>(r1)
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33063horizontalDragjO51t88(r3, r4, r13, r12)
            if (r13 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00b5
            of.a<ef.v> r13 = r12.$onDragEnd
            r13.invoke()
            goto L_0x00ba
        L_0x00b5:
            of.a<ef.v> r13 = r12.$onDragCancel
            r13.invoke()
        L_0x00ba:
            ef.v r13 = p336ef.C11921v.f18618a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
