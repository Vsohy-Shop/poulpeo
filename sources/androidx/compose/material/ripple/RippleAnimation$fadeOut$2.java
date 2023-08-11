package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", mo50610f = "RippleAnimation.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: RippleAnimation.kt */
final class RippleAnimation$fadeOut$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C14054y1>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleAnimation this$0;

    @C12739f(mo50609c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", mo50610f = "RippleAnimation.kt", mo50611l = {112}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1 */
    /* compiled from: RippleAnimation.kt */
    static final class C08341 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C08341(rippleAnimation, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                Animatable access$getAnimatedAlpha$p = rippleAnimation.animatedAlpha;
                Float b = C12735b.m28559b(0.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, (Object) null);
                this.label = 1;
                if (Animatable.animateTo$default(access$getAnimatedAlpha$p, b, tween$default, (Object) null, (Function1) null, this, 12, (Object) null) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C08341) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, C12074d<? super RippleAnimation$fadeOut$2> dVar) {
        super(2, dVar);
        this.this$0 = rippleAnimation;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.this$0, dVar);
        rippleAnimation$fadeOut$2.L$0 = obj;
        return rippleAnimation$fadeOut$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            final RippleAnimation rippleAnimation = this.this$0;
            return C13985j.m32422d((C13995l0) this.L$0, (C12079g) null, (C14004n0) null, new C08341((C12074d<? super C08341>) null), 3, (Object) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C14054y1> dVar) {
        return ((RippleAnimation$fadeOut$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
