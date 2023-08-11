package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.material3.SwipeableState$snapInternalToOffset$2", mo50610f = "Swipeable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Swipeable.kt */
final class SwipeableState$snapInternalToOffset$2 extends C12746l implements C13088o<DragScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$snapInternalToOffset$2(float f, SwipeableState<T> swipeableState, C12074d<? super SwipeableState$snapInternalToOffset$2> dVar) {
        super(2, dVar);
        this.$target = f;
        this.this$0 = swipeableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, dVar);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    public final Object invoke(DragScope dragScope, C12074d<? super C11921v> dVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(dragScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            ((DragScope) this.L$0).dragBy(this.$target - ((Number) this.this$0.absoluteOffset.getValue()).floatValue());
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
