package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", mo50610f = "TapGestureDetector.kt", mo50611l = {99}, mo50612m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$detectTapGestures$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Function1<Offset, C11921v> $onDoubleTap;
    final /* synthetic */ Function1<Offset, C11921v> $onLongPress;
    final /* synthetic */ C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> $onPress;
    final /* synthetic */ Function1<Offset, C11921v> $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", mo50610f = "TapGestureDetector.kt", mo50611l = {100, 114, 129, 141, 156, 178}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1 */
    /* compiled from: TapGestureDetector.kt */
    static final class C04211 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04211 r0 = new C04211(l0Var, pVar, function1, function12, function13, pressGestureScopeImpl, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C04211) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
            r4 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0;
            r4.consume();
            r9 = r4;
            r0 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04221((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04221>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
            if (r5 == androidx.compose.foundation.gestures.TapGestureDetectorKt.NoPressGesture) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b0, code lost:
            r9 = r4;
            r0 = r5;
            r1 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04242((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04242>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
            if (r6 == null) goto L_0x00cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
            r0 = r5.getViewConfiguration().getLongPressTimeoutMillis();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
            r0 = 4611686018427387903L;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
            r2 = new kotlin.jvm.internal.Ref$ObjectRef();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04253((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04253>) null);
            r6.L$0 = r5;
            r6.L$1 = r4;
            r6.L$2 = r2;
            r6.L$3 = r2;
            r6.J$0 = r0;
            r6.label = 2;
            r3 = r5.withTimeout(r0, r3, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
            if (r3 != r7) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f1, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
            r9 = r5;
            r5 = r4;
            r4 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            r2.f20403b = r3;
            r2 = r4.f20403b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
            if (r2 != null) goto L_0x010c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
            r10 = r4;
            r2 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r10, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04264((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04264>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x010c, code lost:
            r2.consume();
            r10 = r4;
            r2 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r10, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04275((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04275>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0122, code lost:
            r2 = r4;
            r4 = r5;
            r3 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
            r5.invoke(androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4.m37169getPositionF1C5BW0()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0147, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0160, code lost:
            if (r7 == null) goto L_0x0162;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0162, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0164, code lost:
            if (r0 != null) goto L_0x0166;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0166, code lost:
            r0.invoke(androidx.compose.p002ui.geometry.Offset.m35411boximpl(r2.m37169getPositionF1C5BW0()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0175, code lost:
            r6.L$0 = r9;
            r6.L$1 = r4;
            r6.L$2 = null;
            r6.L$3 = null;
            r6.J$0 = r0;
            r6.label = 4;
            r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitSecondDown(r9, r2, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
            if (r2 == r7) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x018a, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x018b, code lost:
            r3 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x018c, code lost:
            r2 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x018e, code lost:
            if (r2 == null) goto L_0x0190;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0190, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0192, code lost:
            if (r0 != null) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0194, code lost:
            r0.invoke(androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4.f20403b.m37169getPositionF1C5BW0()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a5, code lost:
            r9 = r4;
            r5 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04297((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04297>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
            if (r5 != androidx.compose.foundation.gestures.TapGestureDetectorKt.NoPressGesture) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bd, code lost:
            r10 = r4;
            r5 = r5;
            r9 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r10, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04308((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04308>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            r10 = r4;
            r11 = r7;
            r12 = r8;
            r14 = r9;
            r13 = r4;
            r9 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04319((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C04319>) null);
            r6.L$0 = r3;
            r6.L$1 = r4;
            r6.L$2 = r2;
            r6.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ec, code lost:
            if (r3.withTimeout(r0, r9, r6) == r7) goto L_0x01ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ee, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ef, code lost:
            r0 = r2;
            r2 = r3;
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f2, code lost:
            r3 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f4, code lost:
            if (r3 != null) goto L_0x01f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
            r3.invoke(androidx.compose.p002ui.geometry.Offset.m35411boximpl(r1.f20403b.m37169getPositionF1C5BW0()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0205, code lost:
            r1 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0207, code lost:
            if (r1 != null) goto L_0x0209;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0209, code lost:
            r1.invoke(androidx.compose.p002ui.geometry.Offset.m35411boximpl(r0.m37169getPositionF1C5BW0()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0214, code lost:
            r6.L$0 = null;
            r6.L$1 = null;
            r6.L$2 = null;
            r6.label = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0221, code lost:
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(r2, r6) == r7) goto L_0x0223;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0223, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0224, code lost:
            r9 = r4;
            r0 = r9;
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, (p355hf.C12079g) null, (p466yf.C14004n0) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C042310((p355hf.C12074d<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.C042310>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0147 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x015e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                java.lang.Object r7 = p362if.C12150d.m26492c()
                int r0 = r6.label
                r8 = 0
                switch(r0) {
                    case 0: goto L_0x0076;
                    case 1: goto L_0x006b;
                    case 2: goto L_0x004b;
                    case 3: goto L_0x003c;
                    case 4: goto L_0x002a;
                    case 5: goto L_0x0019;
                    case 6: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0014:
                p336ef.C11910n.m25701b(r17)
                goto L_0x0224
            L_0x0019:
                java.lang.Object r0 = r6.L$2
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r2 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r2
                p336ef.C11910n.m25701b(r17)     // Catch:{ PointerEventTimeoutCancellationException -> 0x01f2 }
                goto L_0x0234
            L_0x002a:
                long r0 = r6.J$0
                java.lang.Object r2 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r3 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r3
                p336ef.C11910n.m25701b(r17)
                r4 = r2
                r2 = r17
                goto L_0x018c
            L_0x003c:
                long r0 = r6.J$0
                java.lang.Object r2 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r3 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r3
                p336ef.C11910n.m25701b(r17)
                goto L_0x0148
            L_0x004b:
                long r0 = r6.J$0
                java.lang.Object r2 = r6.L$3
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r3 = r6.L$2
                kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
                java.lang.Object r4 = r6.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r4
                java.lang.Object r5 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5
                p336ef.C11910n.m25701b(r17)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0067 }
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r17
                goto L_0x00f5
            L_0x0067:
                r2 = r3
            L_0x0068:
                r3 = r5
                goto L_0x0125
            L_0x006b:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r0
                p336ef.C11910n.m25701b(r17)
                r5 = r0
                r0 = r17
                goto L_0x0092
            L_0x0076:
                p336ef.C11910n.m25701b(r17)
                java.lang.Object r0 = r6.L$0
                r9 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r9
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r6.L$0 = r9
                r0 = 1
                r6.label = r0
                r0 = r9
                r3 = r16
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x0091
                return r7
            L_0x0091:
                r5 = r9
            L_0x0092:
                r4 = r0
                androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r4
                r4.consume()
                yf.l0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r12.<init>(r0, r8)
                r13 = 3
                r14 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)
                of.p<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r0 = r5
                of.p r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.NoPressGesture
                if (r0 == r1) goto L_0x00c2
                yf.l0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2
                of.p<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r0 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r9
                r12.<init>(r0, r1, r4, r8)
                r13 = 3
                r14 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)
            L_0x00c2:
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r0 = r6
                if (r0 == 0) goto L_0x00cf
                androidx.compose.ui.platform.ViewConfiguration r0 = r5.getViewConfiguration()
                long r0 = r0.getLongPressTimeoutMillis()
                goto L_0x00d4
            L_0x00cf:
                r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            L_0x00d4:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r3.<init>(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$0 = r5     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$1 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$2 = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$3 = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.J$0 = r0     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r9 = 2
                r6.label = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                java.lang.Object r3 = r5.withTimeout(r0, r3, r6)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                if (r3 != r7) goto L_0x00f2
                return r7
            L_0x00f2:
                r9 = r5
                r5 = r4
                r4 = r2
            L_0x00f5:
                r2.f20403b = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                T r2 = r4.f20403b     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                if (r2 != 0) goto L_0x010c
                yf.l0 r10 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r11 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r13.<init>(r2, r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r14 = 3
                r15 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r10, r11, r12, r13, r14, r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                goto L_0x015a
            L_0x010c:
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r2.consume()     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                yf.l0 r10 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r11 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r13.<init>(r2, r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r14 = 3
                r15 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r10, r11, r12, r13, r14, r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                goto L_0x015a
            L_0x0122:
                r2 = r4
                r4 = r5
                r3 = r9
            L_0x0125:
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r5 = r6
                if (r5 == 0) goto L_0x0134
                long r9 = r4.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r4 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r9)
                r5.invoke(r4)
            L_0x0134:
                r6.L$0 = r3
                r6.L$1 = r2
                r6.L$2 = r8
                r6.L$3 = r8
                r6.J$0 = r0
                r4 = 3
                r6.label = r4
                java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(r3, r6)
                if (r4 != r7) goto L_0x0148
                return r7
            L_0x0148:
                yf.l0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r9
                r12.<init>(r4, r8)
                r13 = 3
                r14 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)
                r4 = r2
                r9 = r3
            L_0x015a:
                T r2 = r4.f20403b
                if (r2 == 0) goto L_0x0234
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r3 = r7
                if (r3 != 0) goto L_0x0175
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r0 = r8
                if (r0 == 0) goto L_0x0234
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r2
                long r1 = r2.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r1)
                r0.invoke(r1)
                goto L_0x0234
            L_0x0175:
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r2
                r6.L$0 = r9
                r6.L$1 = r4
                r6.L$2 = r8
                r6.L$3 = r8
                r6.J$0 = r0
                r3 = 4
                r6.label = r3
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitSecondDown(r9, r2, r6)
                if (r2 != r7) goto L_0x018b
                return r7
            L_0x018b:
                r3 = r9
            L_0x018c:
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r2
                if (r2 != 0) goto L_0x01a5
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r0 = r8
                if (r0 == 0) goto L_0x0234
                T r1 = r4.f20403b
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r1
                long r1 = r1.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r1)
                r0.invoke(r1)
                goto L_0x0234
            L_0x01a5:
                yf.l0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7
                androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r9
                r12.<init>(r5, r8)
                r13 = 3
                r14 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)
                of.p<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r5 = r5
                of.p r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.NoPressGesture
                if (r5 == r9) goto L_0x01cf
                yf.l0 r10 = r4
                r11 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8
                of.p<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r5 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r9 = r9
                r13.<init>(r5, r9, r2, r8)
                r14 = 3
                r15 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r10, r11, r12, r13, r14, r15)
            L_0x01cf:
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                yf.l0 r10 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r11 = r7     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r12 = r8     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r14 = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r15 = 0
                r9 = r5
                r13 = r4
                r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r6.L$0 = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r6.L$1 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r6.L$2 = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r9 = 5
                r6.label = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                java.lang.Object r0 = r3.withTimeout(r0, r5, r6)     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                if (r0 != r7) goto L_0x0234
                return r7
            L_0x01ef:
                r0 = r2
                r2 = r3
                r1 = r4
            L_0x01f2:
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r3 = r8
                if (r3 == 0) goto L_0x0205
                T r1 = r1.f20403b
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r1
                long r4 = r1.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4)
                r3.invoke(r1)
            L_0x0205:
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r1 = r6
                if (r1 == 0) goto L_0x0214
                long r3 = r0.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r3)
                r1.invoke(r0)
            L_0x0214:
                r6.L$0 = r8
                r6.L$1 = r8
                r6.L$2 = r8
                r0 = 6
                r6.label = r0
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(r2, r6)
                if (r0 != r7) goto L_0x0224
                return r7
            L_0x0224:
                yf.l0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r12.<init>(r0, r8)
                r13 = 3
                r14 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)
            L_0x0234:
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C04211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, C13089p<? super PressGestureScope, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar, Function1<? super Offset, C11921v> function1, Function1<? super Offset, C11921v> function12, Function1<? super Offset, C11921v> function13, C12074d<? super TapGestureDetectorKt$detectTapGestures$2> dVar) {
        super(2, dVar);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = pVar;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, dVar);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13995l0 l0Var = (C13995l0) this.L$0;
            final PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            final C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> pVar = this.$onPress;
            final Function1<Offset, C11921v> function1 = this.$onLongPress;
            final Function1<Offset, C11921v> function12 = this.$onDoubleTap;
            final Function1<Offset, C11921v> function13 = this.$onTap;
            C04211 r3 = new C04211((C12074d<? super C04211>) null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, r3, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
