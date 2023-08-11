package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.animation.core.Animatable$snapTo$2", mo50610f = "Animatable.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Animatable.kt */
final class Animatable$snapTo$2 extends C12746l implements Function1<C12074d<? super C11921v>, Object> {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Animatable$snapTo$2(Animatable<T, V> animatable, T t, C12074d<? super Animatable$snapTo$2> dVar) {
        super(1, dVar);
        this.this$0 = animatable;
        this.$targetValue = t;
    }

    public final C12074d<C11921v> create(C12074d<?> dVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, dVar);
    }

    public final Object invoke(C12074d<? super C11921v> dVar) {
        return ((Animatable$snapTo$2) create(dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.this$0.endAnimation();
            Object access$clampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(access$clampToBounds);
            this.this$0.setTargetValue(access$clampToBounds);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
