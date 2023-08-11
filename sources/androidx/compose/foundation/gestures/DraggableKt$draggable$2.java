package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", mo50610f = "Draggable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class DraggableKt$draggable$2 extends C12746l implements C13089p<C13995l0, Float, C12074d<? super C11921v>, Object> {
    int label;

    DraggableKt$draggable$2(C12074d<? super DraggableKt$draggable$2> dVar) {
        super(3, dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C13995l0) obj, ((Number) obj2).floatValue(), (C12074d<? super C11921v>) (C12074d) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, float f, C12074d<? super C11921v> dVar) {
        return new DraggableKt$draggable$2(dVar).invokeSuspend(C11921v.f18618a);
    }
}
