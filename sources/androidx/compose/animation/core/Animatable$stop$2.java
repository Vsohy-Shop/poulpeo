package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.animation.core.Animatable$stop$2", mo50610f = "Animatable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Animatable.kt */
final class Animatable$stop$2 extends C12746l implements Function1<C12074d<? super C11921v>, Object> {
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Animatable$stop$2(Animatable<T, V> animatable, C12074d<? super Animatable$stop$2> dVar) {
        super(1, dVar);
        this.this$0 = animatable;
    }

    public final C12074d<C11921v> create(C12074d<?> dVar) {
        return new Animatable$stop$2(this.this$0, dVar);
    }

    public final Object invoke(C12074d<? super C11921v> dVar) {
        return ((Animatable$stop$2) create(dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.this$0.endAnimation();
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
