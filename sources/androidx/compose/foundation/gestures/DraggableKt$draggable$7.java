package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", mo50610f = "Draggable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class DraggableKt$draggable$7 extends C12746l implements C13089p<C13995l0, Velocity, C12074d<? super C11921v>, Object> {
    int label;

    DraggableKt$draggable$7(C12074d<? super DraggableKt$draggable$7> dVar) {
        super(3, dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m33089invokeLuvzFrg((C13995l0) obj, ((Velocity) obj2).m38702unboximpl(), (C12074d) obj3);
    }

    /* renamed from: invoke-LuvzFrg  reason: not valid java name */
    public final Object m33089invokeLuvzFrg(C13995l0 l0Var, long j, C12074d<? super C11921v> dVar) {
        return new DraggableKt$draggable$7(dVar).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
