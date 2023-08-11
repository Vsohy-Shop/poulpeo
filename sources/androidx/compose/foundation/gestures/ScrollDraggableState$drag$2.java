package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", mo50610f = "Scrollable.kt", mo50611l = {476}, mo50612m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollDraggableState$drag$2 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<DragScope, C12074d<? super C11921v>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollDraggableState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, C13088o<? super DragScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super ScrollDraggableState$drag$2> dVar) {
        super(2, dVar);
        this.this$0 = scrollDraggableState;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, dVar);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
        return ((ScrollDraggableState$drag$2) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.this$0.setLatestScrollScope((ScrollScope) this.L$0);
            C13088o<DragScope, C12074d<? super C11921v>, Object> oVar = this.$block;
            ScrollDraggableState scrollDraggableState = this.this$0;
            this.label = 1;
            if (oVar.invoke(scrollDraggableState, this) == c) {
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
