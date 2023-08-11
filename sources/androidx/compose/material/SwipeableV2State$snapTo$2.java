package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.material.SwipeableV2State$snapTo$2", mo50610f = "SwipeableV2.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$snapTo$2 extends C12746l implements C13088o<DragScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Float $targetOffset;
    final /* synthetic */ T $targetValue;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$snapTo$2(SwipeableV2State<T> swipeableV2State, T t, Float f, C12074d<? super SwipeableV2State$snapTo$2> dVar) {
        super(2, dVar);
        this.this$0 = swipeableV2State;
        this.$targetValue = t;
        this.$targetOffset = f;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SwipeableV2State$snapTo$2 swipeableV2State$snapTo$2 = new SwipeableV2State$snapTo$2(this.this$0, this.$targetValue, this.$targetOffset, dVar);
        swipeableV2State$snapTo$2.L$0 = obj;
        return swipeableV2State$snapTo$2;
    }

    public final Object invoke(DragScope dragScope, C12074d<? super C11921v> dVar) {
        return ((SwipeableV2State$snapTo$2) create(dragScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.this$0.setAnimationTarget(this.$targetValue);
            ((DragScope) this.L$0).dragBy(this.$targetOffset.floatValue() - this.this$0.requireOffset());
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
