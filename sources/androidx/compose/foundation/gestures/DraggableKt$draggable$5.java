package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", mo50610f = "Draggable.kt", mo50611l = {193}, mo50612m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class DraggableKt$draggable$5 extends C12746l implements C13089p<C13995l0, Velocity, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13089p<C13995l0, Float, C12074d<? super C11921v>, Object> $onDragStopped;
    final /* synthetic */ Orientation $orientation;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$draggable$5(C13089p<? super C13995l0, ? super Float, ? super C12074d<? super C11921v>, ? extends Object> pVar, Orientation orientation, C12074d<? super DraggableKt$draggable$5> dVar) {
        super(3, dVar);
        this.$onDragStopped = pVar;
        this.$orientation = orientation;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m33087invokeLuvzFrg((C13995l0) obj, ((Velocity) obj2).m38702unboximpl(), (C12074d) obj3);
    }

    /* renamed from: invoke-LuvzFrg  reason: not valid java name */
    public final Object m33087invokeLuvzFrg(C13995l0 l0Var, long j, C12074d<? super C11921v> dVar) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.$onDragStopped, this.$orientation, dVar);
        draggableKt$draggable$5.L$0 = l0Var;
        draggableKt$draggable$5.J$0 = j;
        return draggableKt$draggable$5.invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            long j = this.J$0;
            C13089p<C13995l0, Float, C12074d<? super C11921v>, Object> pVar = this.$onDragStopped;
            Float b = C12735b.m28559b(DraggableKt.m33084toFloatsFctU(j, this.$orientation));
            this.label = 1;
            if (pVar.invoke((C13995l0) this.L$0, b, this) == c) {
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
