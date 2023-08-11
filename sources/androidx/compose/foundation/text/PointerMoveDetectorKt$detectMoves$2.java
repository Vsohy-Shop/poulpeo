package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", mo50610f = "PointerMoveDetector.kt", mo50611l = {41}, mo50612m = "invokeSuspend")
/* compiled from: PointerMoveDetector.kt */
final class PointerMoveDetectorKt$detectMoves$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Function1<Offset, C11921v> $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
    @C12739f(mo50609c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", mo50610f = "PointerMoveDetector.kt", mo50611l = {44}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1 */
    /* compiled from: PointerMoveDetector.kt */
    static final class C06241 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C06241 r0 = new C06241(context, pointerEventPass, function1, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C06241) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r9.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r3 = r9.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r3
                p336ef.C11910n.m25701b(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L_0x004e
            L_0x001b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0023:
                p336ef.C11910n.m25701b(r10)
                java.lang.Object r10 = r9.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r10
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r3 = r10
                r10 = r9
            L_0x0031:
                hf.g r4 = r8
                boolean r4 = p466yf.C13934b2.m32227o(r4)
                if (r4 == 0) goto L_0x00b3
                androidx.compose.ui.input.pointer.PointerEventPass r4 = r4
                r10.L$0 = r3
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r4 = r3.awaitPointerEvent(r4, r10)
                if (r4 != r0) goto L_0x0048
                return r0
            L_0x0048:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L_0x004e:
                androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p002ui.input.pointer.PointerEvent) r10
                int r5 = r10.m37114getType7fucELk()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.p002ui.input.pointer.PointerEventType.Companion
                int r7 = r6.m37127getMove7fucELk()
                boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r5, r7)
                if (r7 == 0) goto L_0x0062
                r7 = r2
                goto L_0x006a
            L_0x0062:
                int r7 = r6.m37125getEnter7fucELk()
                boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r5, r7)
            L_0x006a:
                if (r7 == 0) goto L_0x006e
                r5 = r2
                goto L_0x0076
            L_0x006e:
                int r6 = r6.m37126getExit7fucELk()
                boolean r5 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r5, r6)
            L_0x0076:
                if (r5 == 0) goto L_0x00ad
                java.util.List r10 = r10.getChanges()
                java.lang.Object r10 = kotlin.collections.C12686e0.m28221Z(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
                long r5 = r10.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r5)
                long r5 = r10.m35432unboximpl()
                T r7 = r3.f20403b
                boolean r5 = androidx.compose.p002ui.geometry.Offset.m35418equalsimpl(r5, r7)
                if (r5 != 0) goto L_0x0097
                goto L_0x0098
            L_0x0097:
                r10 = 0
            L_0x0098:
                if (r10 == 0) goto L_0x00ad
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, ef.v> r5 = r5
                long r6 = r10.m35432unboximpl()
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r6)
                r3.f20403b = r10
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r6)
                r5.invoke(r10)
            L_0x00ad:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x0031
            L_0x00b3:
                ef.v r10 = p336ef.C11921v.f18618a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.C06241.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, C11921v> function1, C12074d<? super PointerMoveDetectorKt$detectMoves$2> dVar) {
        super(2, dVar);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C12079g context = getContext();
            PointerInputScope pointerInputScope = this.$this_detectMoves;
            final PointerEventPass pointerEventPass = this.$pointerEventPass;
            final Function1<Offset, C11921v> function1 = this.$onMove;
            C06241 r3 = new C06241((C12074d<? super C06241>) null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(r3, this) == c) {
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
        return ((PointerMoveDetectorKt$detectMoves$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
