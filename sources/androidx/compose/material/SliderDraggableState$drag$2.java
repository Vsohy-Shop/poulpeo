package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.SliderDraggableState$drag$2", mo50610f = "Slider.kt", mo50611l = {1182}, mo50612m = "invokeSuspend")
/* compiled from: Slider.kt */
final class SliderDraggableState$drag$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<DragScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ SliderDraggableState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderDraggableState$drag$2(SliderDraggableState sliderDraggableState, MutatePriority mutatePriority, C13088o<? super DragScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super SliderDraggableState$drag$2> dVar) {
        super(2, dVar);
        this.this$0 = sliderDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SliderDraggableState$drag$2(this.this$0, this.$dragPriority, this.$block, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.this$0.setDragging(true);
            MutatorMutex access$getScrollMutex$p = this.this$0.scrollMutex;
            DragScope access$getDragScope$p = this.this$0.dragScope;
            MutatePriority mutatePriority = this.$dragPriority;
            C13088o<DragScope, C12074d<? super C11921v>, Object> oVar = this.$block;
            this.label = 1;
            if (access$getScrollMutex$p.mutateWith(access$getDragScope$p, mutatePriority, oVar, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.setDragging(false);
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((SliderDraggableState$drag$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
