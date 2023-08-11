package androidx.compose.p002ui.input.pointer;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", mo50610f = "SuspendingPointerInputFilter.kt", mo50611l = {292}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilterKt$pointerInput$4$2$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<PointerInputScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ SuspendingPointerInputFilter $filter;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilterKt$pointerInput$4$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super SuspendingPointerInputFilterKt$pointerInput$4$2$1> dVar) {
        super(2, dVar);
        this.$filter = suspendingPointerInputFilter;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SuspendingPointerInputFilterKt$pointerInput$4$2$1 suspendingPointerInputFilterKt$pointerInput$4$2$1 = new SuspendingPointerInputFilterKt$pointerInput$4$2$1(this.$filter, this.$block, dVar);
        suspendingPointerInputFilterKt$pointerInput$4$2$1.L$0 = obj;
        return suspendingPointerInputFilterKt$pointerInput$4$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.$filter.setCoroutineScope((C13995l0) this.L$0);
            C13088o<PointerInputScope, C12074d<? super C11921v>, Object> oVar = this.$block;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.$filter;
            this.label = 1;
            if (oVar.invoke(suspendingPointerInputFilter, this) == c) {
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
        return ((SuspendingPointerInputFilterKt$pointerInput$4$2$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
