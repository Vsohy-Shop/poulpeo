package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", mo50610f = "TapGestureDetector.kt", mo50611l = {232}, mo50612m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$detectTapAndPress$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> $onPress;
    final /* synthetic */ Function1<Offset, C11921v> $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ PointerInputScope $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
    @C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", mo50610f = "TapGestureDetector.kt", mo50611l = {237, 245}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1 */
    /* compiled from: TapGestureDetector.kt */
    static final class C04161 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04161 r0 = new C04161(l0Var, pVar, function1, pressGestureScopeImpl, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C04161) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r6 = r23
                java.lang.Object r7 = p362if.C12150d.m26492c()
                int r0 = r6.label
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L_0x002a
                if (r0 == r9) goto L_0x001f
                if (r0 != r8) goto L_0x0017
                p336ef.C11910n.m25701b(r24)
                r0 = r24
                goto L_0x007d
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r0
                p336ef.C11910n.m25701b(r24)
                r11 = r0
                r0 = r24
                goto L_0x0051
            L_0x002a:
                p336ef.C11910n.m25701b(r24)
                java.lang.Object r0 = r6.L$0
                r11 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r11
                yf.l0 r0 = r4
                r1 = 0
                r2 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r7
                r3.<init>(r4, r10)
                r4 = 3
                r5 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r0, r1, r2, r3, r4, r5)
                r1 = 0
                r6.L$0 = r11
                r6.label = r9
                r0 = r11
                r3 = r23
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x0051
                return r7
            L_0x0051:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0
                r0.consume()
                of.p<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r1 = r5
                of.p r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.NoPressGesture
                if (r1 == r2) goto L_0x0072
                yf.l0 r12 = r4
                r13 = 0
                r14 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                of.p<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, hf.d<? super ef.v>, java.lang.Object> r1 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r7
                r15.<init>(r1, r2, r0, r10)
                r16 = 3
                r17 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r12, r13, r14, r15, r16, r17)
            L_0x0072:
                r6.L$0 = r10
                r6.label = r8
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r11, r10, r6, r9, r10)
                if (r0 != r7) goto L_0x007d
                return r7
            L_0x007d:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r0
                if (r0 != 0) goto L_0x0093
                yf.l0 r11 = r4
                r12 = 0
                r13 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r14 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r7
                r14.<init>(r0, r10)
                r15 = 3
                r16 = 0
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r11, r12, r13, r14, r15, r16)
                goto L_0x00bd
            L_0x0093:
                r0.consume()
                yf.l0 r1 = r4
                r18 = 0
                r19 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r3 = r7
                r2.<init>(r3, r10)
                r21 = 3
                r22 = 0
                r17 = r1
                r20 = r2
                p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r17, r18, r19, r20, r21, r22)
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r1 = r6
                if (r1 == 0) goto L_0x00bd
                long r2 = r0.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r2)
                r1.invoke(r0)
            L_0x00bd:
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.C04161.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, C13089p<? super PressGestureScope, ? super Offset, ? super C12074d<? super C11921v>, ? extends Object> pVar, Function1<? super Offset, C11921v> function1, PressGestureScopeImpl pressGestureScopeImpl, C12074d<? super TapGestureDetectorKt$detectTapAndPress$2> dVar) {
        super(2, dVar);
        this.$this_detectTapAndPress = pointerInputScope;
        this.$onPress = pVar;
        this.$onTap = function1;
        this.$pressScope = pressGestureScopeImpl;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, dVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13995l0 l0Var = (C13995l0) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
            final C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> pVar = this.$onPress;
            final Function1<Offset, C11921v> function1 = this.$onTap;
            final PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            C04161 r3 = new C04161((C12074d<? super C04161>) null);
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
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
