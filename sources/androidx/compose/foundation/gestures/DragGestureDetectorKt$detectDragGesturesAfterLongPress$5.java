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

@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n33#2,6:874\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n247#1:874,6\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", mo50610f = "DragGestureDetector.kt", mo50611l = {235, 236, 241}, mo50612m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<PointerInputChange, Offset, C11921v> $onDrag;
    final /* synthetic */ C13074a<C11921v> $onDragCancel;
    final /* synthetic */ C13074a<C11921v> $onDragEnd;
    final /* synthetic */ Function1<Offset, C11921v> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(Function1<? super Offset, C11921v> function1, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13088o<? super PointerInputChange, ? super Offset, C11921v> oVar, C12074d<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> dVar) {
        super(2, dVar);
        this.$onDragStart = function1;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
        this.$onDrag = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, dVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ CancellationException -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ CancellationException -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5 A[Catch:{ CancellationException -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r0
            p336ef.C11910n.m25701b(r12)     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x0086
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r12)     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x005e
        L_0x0029:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r12)     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x004d
        L_0x0031:
            r12 = move-exception
            goto L_0x00bd
        L_0x0034:
            p336ef.C11910n.m25701b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0031 }
            r11.label = r4     // Catch:{ CancellationException -> 0x0031 }
            r5 = r1
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x0031 }
            if (r12 != r0) goto L_0x004d
            return r0
        L_0x004d:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12     // Catch:{ CancellationException -> 0x0031 }
            long r4 = r12.m37168getIdJ3iCeTQ()     // Catch:{ CancellationException -> 0x0031 }
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0031 }
            r11.label = r3     // Catch:{ CancellationException -> 0x0031 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33052awaitLongPressOrCancellationrnUCldI(r1, r4, r11)     // Catch:{ CancellationException -> 0x0031 }
            if (r12 != r0) goto L_0x005e
            return r0
        L_0x005e:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12     // Catch:{ CancellationException -> 0x0031 }
            if (r12 == 0) goto L_0x00ba
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r3 = r11.$onDragStart     // Catch:{ CancellationException -> 0x0031 }
            long r4 = r12.m37169getPositionF1C5BW0()     // Catch:{ CancellationException -> 0x0031 }
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4)     // Catch:{ CancellationException -> 0x0031 }
            r3.invoke(r4)     // Catch:{ CancellationException -> 0x0031 }
            long r3 = r12.m37168getIdJ3iCeTQ()     // Catch:{ CancellationException -> 0x0031 }
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch:{ CancellationException -> 0x0031 }
            of.o<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, ef.v> r5 = r11.$onDrag     // Catch:{ CancellationException -> 0x0031 }
            r12.<init>(r5)     // Catch:{ CancellationException -> 0x0031 }
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0031 }
            r11.label = r2     // Catch:{ CancellationException -> 0x0031 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33062dragjO51t88(r1, r3, r12, r11)     // Catch:{ CancellationException -> 0x0031 }
            if (r12 != r0) goto L_0x0085
            return r0
        L_0x0085:
            r0 = r1
        L_0x0086:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ CancellationException -> 0x0031 }
            boolean r12 = r12.booleanValue()     // Catch:{ CancellationException -> 0x0031 }
            if (r12 == 0) goto L_0x00b5
            androidx.compose.ui.input.pointer.PointerEvent r12 = r0.getCurrentEvent()     // Catch:{ CancellationException -> 0x0031 }
            java.util.List r12 = r12.getChanges()     // Catch:{ CancellationException -> 0x0031 }
            int r0 = r12.size()     // Catch:{ CancellationException -> 0x0031 }
            r1 = 0
        L_0x009b:
            if (r1 >= r0) goto L_0x00af
            java.lang.Object r2 = r12.get(r1)     // Catch:{ CancellationException -> 0x0031 }
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r2     // Catch:{ CancellationException -> 0x0031 }
            boolean r3 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUp(r2)     // Catch:{ CancellationException -> 0x0031 }
            if (r3 == 0) goto L_0x00ac
            r2.consume()     // Catch:{ CancellationException -> 0x0031 }
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00af:
            of.a<ef.v> r12 = r11.$onDragEnd     // Catch:{ CancellationException -> 0x0031 }
            r12.invoke()     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x00ba
        L_0x00b5:
            of.a<ef.v> r12 = r11.$onDragCancel     // Catch:{ CancellationException -> 0x0031 }
            r12.invoke()     // Catch:{ CancellationException -> 0x0031 }
        L_0x00ba:
            ef.v r12 = p336ef.C11921v.f18618a
            return r12
        L_0x00bd:
            of.a<ef.v> r0 = r11.$onDragCancel
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
