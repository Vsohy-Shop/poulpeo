package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", mo50610f = "SnackbarHost.kt", mo50611l = {363}, mo50612m = "invokeSuspend")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$animatedScale$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedScale$1(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, C12074d<? super SnackbarHostKt$animatedScale$1> dVar) {
        super(2, dVar);
        this.$scale = animatable;
        this.$visible = z;
        this.$animation = animationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SnackbarHostKt$animatedScale$1(this.$scale, this.$visible, this.$animation, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$scale;
            if (this.$visible) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            Float b = C12735b.m28559b(f);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, b, animationSpec, (Object) null, (Function1) null, this, 12, (Object) null) == c) {
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
        return ((SnackbarHostKt$animatedScale$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
