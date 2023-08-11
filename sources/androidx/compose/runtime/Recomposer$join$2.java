package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.runtime.Recomposer$join$2", mo50610f = "Recomposer.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$join$2 extends C12746l implements C13088o<Recomposer.State, C12074d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    Recomposer$join$2(C12074d<? super Recomposer$join$2> dVar) {
        super(2, dVar);
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(dVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    public final Object invoke(Recomposer.State state, C12074d<? super Boolean> dVar) {
        return ((Recomposer$join$2) create(state, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            if (((Recomposer.State) this.L$0) == Recomposer.State.ShutDown) {
                z = true;
            } else {
                z = false;
            }
            return C12735b.m28558a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
