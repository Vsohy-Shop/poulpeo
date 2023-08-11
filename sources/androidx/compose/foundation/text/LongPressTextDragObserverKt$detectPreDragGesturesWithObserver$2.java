package androidx.compose.foundation.text;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n101#2,2:125\n33#2,6:127\n103#2:133\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n103#1:125,2\n103#1:127,6\n103#1:133\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", mo50610f = "LongPressTextDragObserver.kt", mo50611l = {98, 102}, mo50612m = "invokeSuspend")
/* compiled from: LongPressTextDragObserver.kt */
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(TextDragObserver textDragObserver, C12074d<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> dVar) {
        super(2, dVar);
        this.$observer = textDragObserver;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, dVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A[EDGE_INSN: B:30:0x0099->B:26:0x0099 ?: BREAK  , SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            java.lang.Object r7 = p362if.C12150d.m26492c()
            int r0 = r6.label
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r9) goto L_0x0027
            if (r0 != r8) goto L_0x001f
            java.lang.Object r0 = r6.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r17)
            r3 = r17
            r2 = r6
            goto L_0x0067
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r0
            p336ef.C11910n.m25701b(r17)
            r10 = r0
            r0 = r17
            goto L_0x004c
        L_0x0032:
            p336ef.C11910n.m25701b(r17)
            java.lang.Object r0 = r6.L$0
            r10 = r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r10
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            r6.L$0 = r10
            r6.label = r9
            r0 = r10
            r3 = r16
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x004c
            return r7
        L_0x004c:
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0
            androidx.compose.foundation.text.TextDragObserver r1 = r6.$observer
            long r2 = r0.m37169getPositionF1C5BW0()
            r1.m33710onDownk4lQ0M(r2)
            r2 = r6
            r1 = r10
        L_0x0059:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.label = r8
            r3 = 0
            java.lang.Object r3 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r3, r2, r9, r3)
            if (r3 != r7) goto L_0x0067
            return r7
        L_0x0067:
            androidx.compose.ui.input.pointer.PointerEvent r3 = (androidx.compose.p002ui.input.pointer.PointerEvent) r3
            java.util.List r3 = r3.getChanges()
            int r4 = r3.size()
            r5 = 0
            r10 = r5
        L_0x0073:
            if (r10 >= r4) goto L_0x0099
            java.lang.Object r11 = r3.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            long r12 = r11.m37168getIdJ3iCeTQ()
            long r14 = r0.m37168getIdJ3iCeTQ()
            boolean r12 = androidx.compose.p002ui.input.pointer.PointerId.m37154equalsimpl0(r12, r14)
            if (r12 == 0) goto L_0x0091
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L_0x0091
            r11 = r9
            goto L_0x0092
        L_0x0091:
            r11 = r5
        L_0x0092:
            if (r11 == 0) goto L_0x0096
            r5 = r9
            goto L_0x0099
        L_0x0096:
            int r10 = r10 + 1
            goto L_0x0073
        L_0x0099:
            if (r5 != 0) goto L_0x0059
            androidx.compose.foundation.text.TextDragObserver r0 = r2.$observer
            r0.onUp()
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
