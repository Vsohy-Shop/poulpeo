package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n86#2,2:874\n33#2,6:876\n88#2:882\n101#2,2:883\n33#2,6:885\n103#2:891\n101#2,2:892\n33#2,6:894\n103#2:900\n116#2,2:901\n33#2,6:903\n118#2:909\n116#2,2:910\n33#2,6:912\n118#2:918\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n812#1:874,2\n812#1:876,6\n812#1:882\n818#1:883,2\n818#1:885,6\n818#1:891\n829#1:892,2\n829#1:894,6\n829#1:900\n833#1:901,2\n833#1:903,6\n833#1:909\n843#1:910,2\n843#1:912,6\n843#1:918\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", mo50610f = "DragGestureDetector.kt", mo50611l = {811, 828}, mo50612m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Ref$ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref$ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$ObjectRef<PointerInputChange> ref$ObjectRef, Ref$ObjectRef<PointerInputChange> ref$ObjectRef2, C12074d<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> dVar) {
        super(2, dVar);
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, dVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r6) goto L_0x002b
            if (r2 != r3) goto L_0x0023
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.p002ui.input.pointer.PointerEvent) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            p336ef.C11910n.m25701b(r18)
            r4 = r18
            r5 = r0
            goto L_0x00c5
        L_0x0023:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002b:
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r7
            p336ef.C11910n.m25701b(r18)
            r9 = r18
            r8 = r7
            r7 = r0
            goto L_0x005b
        L_0x0039:
            p336ef.C11910n.m25701b(r18)
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r2
            r8 = r0
            r7 = r2
            r2 = 0
        L_0x0043:
            if (r2 != 0) goto L_0x015f
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.p002ui.input.pointer.PointerEventPass.Main
            r8.L$0 = r7
            r8.L$1 = r4
            r8.I$0 = r2
            r8.label = r6
            java.lang.Object r9 = r7.awaitPointerEvent(r9, r8)
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r16 = r8
            r8 = r7
            r7 = r16
        L_0x005b:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p002ui.input.pointer.PointerEvent) r9
            java.util.List r10 = r9.getChanges()
            int r11 = r10.size()
            r12 = 0
        L_0x0066:
            if (r12 >= r11) goto L_0x0079
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            boolean r13 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r13)
            if (r13 != 0) goto L_0x0076
            r10 = 0
            goto L_0x007a
        L_0x0076:
            int r12 = r12 + 1
            goto L_0x0066
        L_0x0079:
            r10 = r6
        L_0x007a:
            if (r10 == 0) goto L_0x007d
            r2 = r6
        L_0x007d:
            java.util.List r10 = r9.getChanges()
            int r11 = r10.size()
            r12 = 0
        L_0x0086:
            if (r12 >= r11) goto L_0x00ae
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            boolean r14 = r13.isConsumed()
            if (r14 != 0) goto L_0x00a5
            long r14 = r8.m37085getSizeYbymL2g()
            long r4 = r8.m37084getExtendedTouchPaddingNHjbRc()
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.m37117isOutOfBoundsjwHxaWs(r13, r14, r4)
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r4 = 0
            goto L_0x00a6
        L_0x00a5:
            r4 = r6
        L_0x00a6:
            if (r4 == 0) goto L_0x00aa
            r4 = r6
            goto L_0x00af
        L_0x00aa:
            int r12 = r12 + 1
            r4 = 0
            goto L_0x0086
        L_0x00ae:
            r4 = 0
        L_0x00af:
            if (r4 == 0) goto L_0x00b2
            r2 = r6
        L_0x00b2:
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r7.L$0 = r8
            r7.L$1 = r9
            r7.I$0 = r2
            r7.label = r3
            java.lang.Object r4 = r8.awaitPointerEvent(r4, r7)
            if (r4 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r5 = r7
            r7 = r9
        L_0x00c5:
            androidx.compose.ui.input.pointer.PointerEvent r4 = (androidx.compose.p002ui.input.pointer.PointerEvent) r4
            java.util.List r4 = r4.getChanges()
            int r9 = r4.size()
            r10 = 0
        L_0x00d0:
            if (r10 >= r9) goto L_0x00e3
            java.lang.Object r11 = r4.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.isConsumed()
            if (r11 == 0) goto L_0x00e0
            r4 = r6
            goto L_0x00e4
        L_0x00e0:
            int r10 = r10 + 1
            goto L_0x00d0
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r4 == 0) goto L_0x00e7
            r2 = r6
        L_0x00e7:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$currentDown
            T r4 = r4.f20403b
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r4
            long r9 = r4.m37168getIdJ3iCeTQ()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33064isPointerUpDmW0f2w(r7, r9)
            if (r4 == 0) goto L_0x0125
            java.util.List r4 = r7.getChanges()
            int r7 = r4.size()
            r9 = 0
        L_0x0100:
            if (r9 >= r7) goto L_0x0113
            java.lang.Object r10 = r4.get(r9)
            r11 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            int r9 = r9 + 1
            goto L_0x0100
        L_0x0113:
            r10 = 0
        L_0x0114:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 == 0) goto L_0x0121
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$currentDown
            r4.f20403b = r10
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$longPress
            r4.f20403b = r10
            goto L_0x0159
        L_0x0121:
            r2 = r6
            r7 = r8
            r4 = 0
            goto L_0x015c
        L_0x0125:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r4 = r5.$longPress
            java.util.List r7 = r7.getChanges()
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> r9 = r5.$currentDown
            int r10 = r7.size()
            r11 = 0
        L_0x0132:
            if (r11 >= r10) goto L_0x0156
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            long r13 = r13.m37168getIdJ3iCeTQ()
            T r15 = r9.f20403b
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r15
            r18 = r7
            long r6 = r15.m37168getIdJ3iCeTQ()
            boolean r6 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r13, r6)
            if (r6 == 0) goto L_0x0150
            goto L_0x0157
        L_0x0150:
            int r11 = r11 + 1
            r7 = r18
            r6 = 1
            goto L_0x0132
        L_0x0156:
            r12 = 0
        L_0x0157:
            r4.f20403b = r12
        L_0x0159:
            r7 = r8
            r4 = 0
            r6 = 1
        L_0x015c:
            r8 = r5
            goto L_0x0043
        L_0x015f:
            ef.v r1 = p336ef.C11921v.f18618a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
