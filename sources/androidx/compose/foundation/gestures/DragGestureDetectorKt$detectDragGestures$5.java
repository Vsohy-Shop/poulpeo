package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n658#2,18:874\n676#2,4:901\n680#2,58:912\n116#3,2:892\n33#3,6:894\n118#3:900\n33#3,6:905\n118#3:911\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n180#1:874,18\n180#1:901,4\n180#1:912,58\n180#1:892,2\n180#1:894,6\n180#1:900\n180#1:905,6\n180#1:911\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", mo50610f = "DragGestureDetector.kt", mo50611l = {176, 890, 940, 193}, mo50612m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectDragGestures$5 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<PointerInputChange, Offset, C11921v> $onDrag;
    final /* synthetic */ C13074a<C11921v> $onDragCancel;
    final /* synthetic */ C13074a<C11921v> $onDragEnd;
    final /* synthetic */ Function1<Offset, C11921v> $onDragStart;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGestures$5(Function1<? super Offset, C11921v> function1, C13088o<? super PointerInputChange, ? super Offset, C11921v> oVar, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C12074d<? super DragGestureDetectorKt$detectDragGestures$5> dVar) {
        super(2, dVar);
        this.$onDragStart = function1;
        this.$onDrag = oVar;
        this.$onDragCancel = aVar;
        this.$onDragEnd = aVar2;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, dVar);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014a A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r6 = r22
            java.lang.Object r7 = p362if.C12150d.m26492c()
            int r0 = r6.label
            r8 = 4
            r9 = 3
            r10 = 2
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x009c
            if (r0 == r13) goto L_0x0091
            if (r0 == r10) goto L_0x0060
            if (r0 == r9) goto L_0x0027
            if (r0 != r8) goto L_0x001f
            p336ef.C11910n.m25701b(r23)
            r0 = r23
            r2 = r6
            goto L_0x0292
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            float r0 = r6.F$2
            float r1 = r6.F$1
            float r2 = r6.F$0
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$6
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r4
            java.lang.Object r5 = r6.L$5
            kotlin.jvm.internal.g0 r5 = (kotlin.jvm.internal.C12762g0) r5
            java.lang.Object r15 = r6.L$4
            androidx.compose.foundation.gestures.PointerDirectionConfig r15 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r15
            java.lang.Object r11 = r6.L$3
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r11
            java.lang.Object r12 = r6.L$2
            kotlin.jvm.internal.g0 r12 = (kotlin.jvm.internal.C12762g0) r12
            java.lang.Object r8 = r6.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r9
            p336ef.C11910n.m25701b(r23)
            r10 = 3
            r20 = r1
            r1 = r0
            r0 = r8
            r8 = r11
            r11 = r15
            r15 = r3
            r3 = r20
            r21 = r5
            r5 = r2
            r2 = r12
            r12 = r21
            goto L_0x01f9
        L_0x0060:
            float r0 = r6.F$2
            float r1 = r6.F$1
            float r2 = r6.F$0
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$5
            kotlin.jvm.internal.g0 r4 = (kotlin.jvm.internal.C12762g0) r4
            java.lang.Object r5 = r6.L$4
            androidx.compose.foundation.gestures.PointerDirectionConfig r5 = (androidx.compose.foundation.gestures.PointerDirectionConfig) r5
            java.lang.Object r8 = r6.L$3
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            java.lang.Object r9 = r6.L$2
            kotlin.jvm.internal.g0 r9 = (kotlin.jvm.internal.C12762g0) r9
            java.lang.Object r11 = r6.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            java.lang.Object r12 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r12
            p336ef.C11910n.m25701b(r23)
            r10 = r23
            r15 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            r11 = r5
            r5 = r2
            r2 = r9
            r9 = r12
            r12 = r4
            r4 = r6
            goto L_0x0115
        L_0x0091:
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r0
            p336ef.C11910n.m25701b(r23)
            r8 = r0
            r0 = r23
            goto L_0x00b6
        L_0x009c:
            p336ef.C11910n.m25701b(r23)
            java.lang.Object r0 = r6.L$0
            r8 = r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            r1 = 0
            r2 = 0
            r4 = 2
            r5 = 0
            r6.L$0 = r8
            r6.label = r13
            r0 = r8
            r3 = r22
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x00b6
            return r7
        L_0x00b6:
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0
            kotlin.jvm.internal.g0 r1 = new kotlin.jvm.internal.g0
            r1.<init>()
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.p002ui.geometry.Offset.Companion
            long r2 = r2.m35438getZeroF1C5BW0()
            r1.f20418b = r2
            r2 = r6
        L_0x00c6:
            long r3 = r0.m37168getIdJ3iCeTQ()
            int r5 = r0.m37172getTypeT8wyACA()
            androidx.compose.foundation.gestures.PointerDirectionConfig r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.getHorizontalPointerDirectionConfig()
            androidx.compose.ui.input.pointer.PointerEvent r11 = r8.getCurrentEvent()
            boolean r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33064isPointerUpDmW0f2w(r11, r3)
            if (r11 == 0) goto L_0x00df
            r6 = r14
            goto L_0x0244
        L_0x00df:
            androidx.compose.ui.platform.ViewConfiguration r11 = r8.getViewConfiguration()
            float r5 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33065pointerSlopE8SPZFQ(r11, r5)
            kotlin.jvm.internal.g0 r11 = new kotlin.jvm.internal.g0
            r11.<init>()
            r11.f20418b = r3
            r4 = r2
            r12 = r11
            r3 = 0
            r15 = 0
            r2 = r1
            r11 = r9
            r1 = 0
            r9 = r8
        L_0x00f6:
            r4.L$0 = r9
            r4.L$1 = r0
            r4.L$2 = r2
            r4.L$3 = r8
            r4.L$4 = r11
            r4.L$5 = r12
            r4.L$6 = r14
            r4.I$0 = r15
            r4.F$0 = r5
            r4.F$1 = r3
            r4.F$2 = r1
            r4.label = r10
            java.lang.Object r10 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r14, r4, r13, r14)
            if (r10 != r7) goto L_0x0115
            return r7
        L_0x0115:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p002ui.input.pointer.PointerEvent) r10
            java.util.List r13 = r10.getChanges()
            int r14 = r13.size()
            r6 = 0
        L_0x0120:
            if (r6 >= r14) goto L_0x014a
            java.lang.Object r16 = r13.get(r6)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r17
            r23 = r13
            r18 = r14
            long r13 = r17.m37168getIdJ3iCeTQ()
            r17 = r7
            r19 = r8
            long r7 = r12.f20418b
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r13, r7)
            if (r7 == 0) goto L_0x013f
            goto L_0x0150
        L_0x013f:
            int r6 = r6 + 1
            r13 = r23
            r7 = r17
            r14 = r18
            r8 = r19
            goto L_0x0120
        L_0x014a:
            r17 = r7
            r19 = r8
            r16 = 0
        L_0x0150:
            r6 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x015d
        L_0x0156:
            r1 = r2
            r2 = r4
            r8 = r9
            r7 = r17
            goto L_0x0202
        L_0x015d:
            boolean r7 = r6.isConsumed()
            if (r7 == 0) goto L_0x0164
            goto L_0x0156
        L_0x0164:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r7 == 0) goto L_0x019d
            java.util.List r6 = r10.getChanges()
            int r7 = r6.size()
            r8 = 0
        L_0x0173:
            if (r8 >= r7) goto L_0x0186
            java.lang.Object r10 = r6.get(r8)
            r13 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            boolean r13 = r13.getPressed()
            if (r13 == 0) goto L_0x0183
            goto L_0x0187
        L_0x0183:
            int r8 = r8 + 1
            goto L_0x0173
        L_0x0186:
            r10 = 0
        L_0x0187:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x018c
            goto L_0x0156
        L_0x018c:
            long r6 = r10.m37168getIdJ3iCeTQ()
            r12.f20418b = r6
            r6 = r22
            r7 = r17
            r8 = r19
        L_0x0198:
            r10 = 2
            r13 = 1
            r14 = 0
            goto L_0x00f6
        L_0x019d:
            long r7 = r6.m37169getPositionF1C5BW0()
            long r13 = r6.m37170getPreviousPositionF1C5BW0()
            float r10 = r11.m33091mainAxisDeltak4lQ0M(r7)
            float r16 = r11.m33091mainAxisDeltak4lQ0M(r13)
            float r10 = r10 - r16
            float r7 = r11.m33090crossAxisDeltak4lQ0M(r7)
            float r8 = r11.m33090crossAxisDeltak4lQ0M(r13)
            float r7 = r7 - r8
            float r3 = r3 + r10
            float r1 = r1 + r7
            if (r15 == 0) goto L_0x01c1
            float r7 = java.lang.Math.abs(r3)
            goto L_0x01c9
        L_0x01c1:
            long r7 = r11.m33092offsetFromChangesdBAh8RU(r3, r1)
            float r7 = androidx.compose.p002ui.geometry.Offset.m35420getDistanceimpl(r7)
        L_0x01c9:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x020c
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r4.L$0 = r9
            r4.L$1 = r0
            r4.L$2 = r2
            r8 = r19
            r4.L$3 = r8
            r4.L$4 = r11
            r4.L$5 = r12
            r4.L$6 = r6
            r4.I$0 = r15
            r4.F$0 = r5
            r4.F$1 = r3
            r4.F$2 = r1
            r10 = 3
            r4.label = r10
            java.lang.Object r7 = r8.awaitPointerEvent(r7, r4)
            r13 = r17
            if (r7 != r13) goto L_0x01f3
            return r13
        L_0x01f3:
            r7 = r13
            r20 = r6
            r6 = r4
            r4 = r20
        L_0x01f9:
            boolean r4 = r4.isConsumed()
            if (r4 == 0) goto L_0x0204
            r1 = r2
            r2 = r6
            r8 = r9
        L_0x0202:
            r6 = 0
            goto L_0x0244
        L_0x0204:
            r4 = r6
            r10 = 2
            r13 = 1
            r14 = 0
            r6 = r22
            goto L_0x00f6
        L_0x020c:
            r13 = r17
            r8 = r19
            r10 = 3
            if (r15 == 0) goto L_0x0220
            float r7 = java.lang.Math.signum(r3)
            float r7 = r7 * r5
            float r3 = r3 - r7
            long r16 = r11.m33092offsetFromChangesdBAh8RU(r3, r1)
            r14 = r0
            r3 = r11
            goto L_0x0232
        L_0x0220:
            r14 = r0
            long r0 = r11.m33092offsetFromChangesdBAh8RU(r3, r1)
            r3 = r11
            long r10 = androidx.compose.p002ui.geometry.Offset.m35417divtuRUvjQ(r0, r7)
            long r10 = androidx.compose.p002ui.geometry.Offset.m35429timestuRUvjQ(r10, r5)
            long r16 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r0, r10)
        L_0x0232:
            r0 = r16
            r6.consume()
            r2.f20418b = r0
            boolean r0 = r6.isConsumed()
            if (r0 == 0) goto L_0x02a8
            r1 = r2
            r2 = r4
            r8 = r9
            r7 = r13
            r0 = r14
        L_0x0244:
            if (r6 == 0) goto L_0x0254
            boolean r3 = r6.isConsumed()
            if (r3 == 0) goto L_0x024d
            goto L_0x0254
        L_0x024d:
            r6 = r22
            r10 = 2
            r13 = 1
            r14 = 0
            goto L_0x00c6
        L_0x0254:
            if (r6 == 0) goto L_0x02a5
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r0 = r2.$onDragStart
            long r3 = r6.m37169getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r3 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r3)
            r0.invoke(r3)
            of.o<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, ef.v> r0 = r2.$onDrag
            long r3 = r1.f20418b
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r3)
            r0.invoke(r6, r1)
            long r0 = r6.m37168getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2
            of.o<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, ef.v> r4 = r2.$onDrag
            r3.<init>(r4)
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.L$2 = r6
            r2.L$3 = r6
            r2.L$4 = r6
            r2.L$5 = r6
            r2.L$6 = r6
            r10 = 4
            r2.label = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33062dragjO51t88(r8, r0, r3, r2)
            if (r0 != r7) goto L_0x0292
            return r7
        L_0x0292:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02a0
            of.a<ef.v> r0 = r2.$onDragCancel
            r0.invoke()
            goto L_0x02a5
        L_0x02a0:
            of.a<ef.v> r0 = r2.$onDragEnd
            r0.invoke()
        L_0x02a5:
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        L_0x02a8:
            r6 = r22
            r11 = r3
            r7 = r13
            r0 = r14
            r1 = 0
            r3 = 0
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
