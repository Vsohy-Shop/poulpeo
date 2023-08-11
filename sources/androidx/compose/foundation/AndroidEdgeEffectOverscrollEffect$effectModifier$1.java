package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", mo50610f = "AndroidOverscroll.kt", mo50611l = {316}, mo50612m = "invokeSuspend")
/* compiled from: AndroidOverscroll.kt */
final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n36#2,3:590\n39#2,2:597\n41#2:600\n33#3,4:593\n38#3:599\n116#3,2:601\n33#3,6:603\n118#3:609\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n*L\n321#1:590,3\n321#1:597,2\n321#1:600\n321#1:593,4\n321#1:599\n325#1:601,2\n325#1:603,6\n325#1:609\n*E\n"})
    @C12739f(mo50609c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", mo50610f = "AndroidOverscroll.kt", mo50611l = {317, 321}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1 */
    /* compiled from: AndroidOverscroll.kt */
    static final class C03461 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C03461 r0 = new C03461(androidEdgeEffectOverscrollEffect, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C03461) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r14.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                p336ef.C11910n.m25701b(r15)
                r5 = r1
                r1 = r0
                r0 = r14
                goto L_0x0070
            L_0x001a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0022:
                java.lang.Object r1 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                p336ef.C11910n.m25701b(r15)
                goto L_0x0043
            L_0x002a:
                p336ef.C11910n.m25701b(r15)
                java.lang.Object r15 = r14.L$0
                r1 = r15
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r14.L$0 = r1
                r14.label = r4
                r5 = r1
                r8 = r14
                java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r15 != r0) goto L_0x0043
                return r0
            L_0x0043:
                androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r15
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r3
                long r6 = r15.m37168getIdJ3iCeTQ()
                androidx.compose.ui.input.pointer.PointerId r6 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r6)
                r5.pointerId = r6
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r3
                long r6 = r15.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r15 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r6)
                r5.pointerPosition = r15
                r15 = r14
            L_0x0060:
                r15.L$0 = r1
                r15.label = r2
                java.lang.Object r5 = androidx.compose.p002ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r3, r15, r4, r3)
                if (r5 != r0) goto L_0x006b
                return r0
            L_0x006b:
                r13 = r0
                r0 = r15
                r15 = r5
                r5 = r1
                r1 = r13
            L_0x0070:
                androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.p002ui.input.pointer.PointerEvent) r15
                java.util.List r15 = r15.getChanges()
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = r15.size()
                r6.<init>(r7)
                int r7 = r15.size()
                r8 = 0
                r9 = r8
            L_0x0085:
                if (r9 >= r7) goto L_0x009a
                java.lang.Object r10 = r15.get(r9)
                r11 = r10
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
                boolean r11 = r11.getPressed()
                if (r11 == 0) goto L_0x0097
                r6.add(r10)
            L_0x0097:
                int r9 = r9 + 1
                goto L_0x0085
            L_0x009a:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                int r7 = r6.size()
            L_0x00a0:
                if (r8 >= r7) goto L_0x00bb
                java.lang.Object r9 = r6.get(r8)
                r10 = r9
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r10
                long r10 = r10.m37168getIdJ3iCeTQ()
                androidx.compose.ui.input.pointer.PointerId r12 = r15.pointerId
                boolean r10 = androidx.compose.p002ui.input.pointer.PointerId.m37153equalsimpl(r10, r12)
                if (r10 == 0) goto L_0x00b8
                goto L_0x00bc
            L_0x00b8:
                int r8 = r8 + 1
                goto L_0x00a0
            L_0x00bb:
                r9 = r3
            L_0x00bc:
                androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
                if (r9 != 0) goto L_0x00c7
                java.lang.Object r15 = kotlin.collections.C12686e0.m28223b0(r6)
                r9 = r15
                androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            L_0x00c7:
                if (r9 == 0) goto L_0x00e3
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                long r7 = r9.m37168getIdJ3iCeTQ()
                androidx.compose.ui.input.pointer.PointerId r7 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r7)
                r15.pointerId = r7
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                long r7 = r9.m37169getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r7 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r7)
                r15.pointerPosition = r7
            L_0x00e3:
                boolean r15 = r6.isEmpty()
                r15 = r15 ^ r4
                if (r15 != 0) goto L_0x00f2
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                r15.pointerId = r3
                ef.v r15 = p336ef.C11921v.f18618a
                return r15
            L_0x00f2:
                r15 = r0
                r0 = r1
                r1 = r5
                goto L_0x0060
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.C03461.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C12074d<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1> dVar) {
        super(2, dVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, dVar);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
            C03461 r1 = new C03461((C12074d<? super C03461>) null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, r1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
