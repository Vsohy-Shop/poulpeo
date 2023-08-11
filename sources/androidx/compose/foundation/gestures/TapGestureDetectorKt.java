package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13999m0;

@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
/* compiled from: TapGestureDetector.kt */
public final class TapGestureDetectorKt {
    /* access modifiers changed from: private */
    public static final C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1((C12074d<? super TapGestureDetectorKt$NoPressGesture$1>) null);

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, PointerEventPass.Main, dVar);
    }

    /* access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, C12074d<? super PointerInputChange> dVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, (C12074d<? super TapGestureDetectorKt$awaitSecondDown$2>) null), dVar);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[LOOP:0: B:17:0x0050->B:18:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[EDGE_INSN: B:30:0x007a->B:25:0x007a ?: BREAK  , SYNTHETIC] */
    public static final java.lang.Object consumeUntilUp(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r8, p355hf.C12074d<? super p336ef.C11921v> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            p336ef.C11910n.m25701b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            p336ef.C11910n.m25701b(r9)
        L_0x0038:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p002ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x0050:
            if (r6 >= r4) goto L_0x005e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L_0x0050
        L_0x005e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
            r4 = r5
        L_0x0067:
            if (r4 >= r2) goto L_0x007a
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L_0x0077
            r5 = r3
            goto L_0x007a
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x0067
        L_0x007a:
            if (r5 != 0) goto L_0x0038
            ef.v r8 = p336ef.C11921v.f18618a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, hf.d):java.lang.Object");
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, C13089p<? super PressGestureScope, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar, Function1<? super Offset, C11921v> function1, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, pVar, function1, new PressGestureScopeImpl(pointerInputScope), (C12074d<? super TapGestureDetectorKt$detectTapAndPress$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> pVar, Function1 function1, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = NoPressGesture;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, pVar, function1, dVar);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, Function1<? super Offset, C11921v> function1, Function1<? super Offset, C11921v> function12, C13089p<? super PressGestureScope, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar, Function1<? super Offset, C11921v> function13, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, pVar, function12, function1, function13, (C12074d<? super TapGestureDetectorKt$detectTapGestures$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> pVar, Function1 function13, C12074d dVar, int i, Object obj) {
        Function1 function14;
        Function1 function15;
        Function1 function16;
        if ((i & 1) != 0) {
            function14 = null;
        } else {
            function14 = function1;
        }
        if ((i & 2) != 0) {
            function15 = null;
        } else {
            function15 = function12;
        }
        if ((i & 4) != 0) {
            pVar = NoPressGesture;
        }
        C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> pVar2 = pVar;
        if ((i & 8) != 0) {
            function16 = null;
        } else {
            function16 = function13;
        }
        return detectTapGestures(pointerInputScope, function14, function15, pVar2, function16, dVar);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077 A[SYNTHETIC] */
    public static final java.lang.Object awaitFirstDown(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r9, boolean r10, androidx.compose.p002ui.input.pointer.PointerEventPass r11, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.p002ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r11
            p336ef.C11910n.m25701b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            p336ef.C11910n.m25701b(r12)
        L_0x0042:
            r0.L$0 = r9
            r0.L$1 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r11, r0)
            if (r12 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.p002ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005d:
            if (r6 >= r4) goto L_0x0077
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            if (r10 == 0) goto L_0x006c
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L_0x0070
        L_0x006c:
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L_0x0070:
            if (r7 != 0) goto L_0x0074
            r2 = r5
            goto L_0x0078
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x005d
        L_0x0077:
            r2 = r3
        L_0x0078:
            if (r2 == 0) goto L_0x0042
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, hf.d):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.p002ui.input.pointer.PointerEventPass r19, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerInputChange> r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r1 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = p362if.C12150d.m26492c()
            int r3 = r1.label
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0053
            if (r3 == r7) goto L_0x0047
            if (r3 != r5) goto L_0x003f
            java.lang.Object r3 = r1.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r3 = (androidx.compose.p002ui.input.pointer.PointerEventPass) r3
            java.lang.Object r8 = r1.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            p336ef.C11910n.m25701b(r0)
        L_0x0037:
            r16 = r2
            r2 = r1
            r1 = r3
            r3 = r16
            goto L_0x00e1
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.Object r3 = r1.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r3 = (androidx.compose.p002ui.input.pointer.PointerEventPass) r3
            java.lang.Object r8 = r1.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r8
            p336ef.C11910n.m25701b(r0)
            goto L_0x0074
        L_0x0053:
            p336ef.C11910n.m25701b(r0)
            r0 = r18
            r3 = r2
            r2 = r1
            r1 = r19
        L_0x005c:
            r2.L$0 = r0
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r8 = r0.awaitPointerEvent(r1, r2)
            if (r8 != r3) goto L_0x0069
            return r3
        L_0x0069:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r3
            r3 = r1
            r1 = r2
            r2 = r17
        L_0x0074:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.p002ui.input.pointer.PointerEvent) r0
            java.util.List r9 = r0.getChanges()
            int r10 = r9.size()
            r11 = r6
        L_0x007f:
            if (r11 >= r10) goto L_0x0092
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r12
            boolean r12 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUp(r12)
            if (r12 != 0) goto L_0x008f
            r9 = r6
            goto L_0x0093
        L_0x008f:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x0092:
            r9 = r7
        L_0x0093:
            if (r9 == 0) goto L_0x009e
            java.util.List r0 = r0.getChanges()
            java.lang.Object r0 = r0.get(r6)
            return r0
        L_0x009e:
            java.util.List r0 = r0.getChanges()
            int r9 = r0.size()
            r10 = r6
        L_0x00a7:
            if (r10 >= r9) goto L_0x00ce
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r12 = r11.isConsumed()
            if (r12 != 0) goto L_0x00c6
            long r12 = r8.m37085getSizeYbymL2g()
            long r14 = r8.m37084getExtendedTouchPaddingNHjbRc()
            boolean r11 = androidx.compose.p002ui.input.pointer.PointerEventKt.m37117isOutOfBoundsjwHxaWs(r11, r12, r14)
            if (r11 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r11 = r6
            goto L_0x00c7
        L_0x00c6:
            r11 = r7
        L_0x00c7:
            if (r11 == 0) goto L_0x00cb
            r0 = r7
            goto L_0x00cf
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00ce:
            r0 = r6
        L_0x00cf:
            if (r0 == 0) goto L_0x00d2
            return r4
        L_0x00d2:
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r1.L$0 = r8
            r1.L$1 = r3
            r1.label = r5
            java.lang.Object r0 = r8.awaitPointerEvent(r0, r1)
            if (r0 != r2) goto L_0x0037
            return r2
        L_0x00e1:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.p002ui.input.pointer.PointerEvent) r0
            java.util.List r0 = r0.getChanges()
            int r9 = r0.size()
            r10 = r6
        L_0x00ec:
            if (r10 >= r9) goto L_0x00ff
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.isConsumed()
            if (r11 == 0) goto L_0x00fc
            r0 = r7
            goto L_0x0100
        L_0x00fc:
            int r10 = r10 + 1
            goto L_0x00ec
        L_0x00ff:
            r0 = r6
        L_0x0100:
            if (r0 == 0) goto L_0x0103
            return r4
        L_0x0103:
            r0 = r8
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, hf.d):java.lang.Object");
    }
}
