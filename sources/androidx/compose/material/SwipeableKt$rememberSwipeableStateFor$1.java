package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", mo50610f = "Swipeable.kt", mo50611l = {512}, mo50612m = "invokeSuspend")
/* compiled from: Swipeable.kt */
final class SwipeableKt$rememberSwipeableStateFor$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$rememberSwipeableStateFor$1(T t, SwipeableState<T> swipeableState, C12074d<? super SwipeableKt$rememberSwipeableStateFor$1> dVar) {
        super(2, dVar);
        this.$value = t;
        this.$swipeableState = swipeableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SwipeableKt$rememberSwipeableStateFor$1(this.$value, this.$swipeableState, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (!C12775o.m28634d(this.$value, this.$swipeableState.getCurrentValue())) {
                SwipeableState<T> swipeableState = this.$swipeableState;
                T t = this.$value;
                this.label = 1;
                if (SwipeableState.animateTo$default(swipeableState, t, (AnimationSpec) null, this, 2, (Object) null) == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((SwipeableKt$rememberSwipeableStateFor$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
