package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", mo50610f = "ExposedDropdownMenu.kt", mo50611l = {515}, mo50612m = "invokeSuspend")
/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$expandable$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13074a<C11921v> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", mo50610f = "ExposedDropdownMenu.kt", mo50611l = {518, 519}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1 */
    /* compiled from: ExposedDropdownMenu.kt */
    static final class C07341 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C07341 r0 = new C07341(aVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C07341) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                p336ef.C11910n.m25701b(r11)
                goto L_0x004a
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                p336ef.C11910n.m25701b(r11)
                goto L_0x003c
            L_0x0022:
                p336ef.C11910n.m25701b(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                r5 = 0
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
                r8 = 1
                r9 = 0
                r10.L$0 = r1
                r10.label = r3
                r4 = r1
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L_0x003c
                return r0
            L_0x003c:
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
                r3 = 0
                r10.L$0 = r3
                r10.label = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r10)
                if (r11 != r0) goto L_0x004a
                return r0
            L_0x004a:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
                if (r11 == 0) goto L_0x0053
                of.a<ef.v> r11 = r3
                r11.invoke()
            L_0x0053:
                ef.v r11 = p336ef.C11921v.f18618a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt$expandable$1.C07341.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$expandable$1(C13074a<C11921v> aVar, C12074d<? super ExposedDropdownMenuKt$expandable$1> dVar) {
        super(2, dVar);
        this.$onExpandedChange = aVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ExposedDropdownMenuKt$expandable$1 exposedDropdownMenuKt$expandable$1 = new ExposedDropdownMenuKt$expandable$1(this.$onExpandedChange, dVar);
        exposedDropdownMenuKt$expandable$1.L$0 = obj;
        return exposedDropdownMenuKt$expandable$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((ExposedDropdownMenuKt$expandable$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13074a<C11921v> aVar = this.$onExpandedChange;
            C07341 r1 = new C07341((C12074d<? super C07341>) null);
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
