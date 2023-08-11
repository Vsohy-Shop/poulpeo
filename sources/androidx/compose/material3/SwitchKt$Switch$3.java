package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Switch.kt */
final class SwitchKt$Switch$3 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ float $targetValue;

    @C12739f(mo50609c = "androidx.compose.material3.SwitchKt$Switch$3$1", mo50610f = "Switch.kt", mo50611l = {125}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1 */
    /* compiled from: Switch.kt */
    static final class C09221 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C09221(animatable, f, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                Animatable<Float, AnimationVector1D> animatable = animatable;
                Float b = C12735b.m28559b(f);
                TweenSpec access$getAnimationSpec$p = SwitchKt.AnimationSpec;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, b, access$getAnimationSpec$p, (Object) null, (Function1) null, this, 12, (Object) null) == c) {
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
            return ((C09221) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$3(Animatable<Float, AnimationVector1D> animatable, float f, C13995l0 l0Var) {
        super(1);
        this.$offset = animatable;
        this.$targetValue = f;
        this.$scope = l0Var;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        float floatValue = this.$offset.getTargetValue().floatValue();
        final float f = this.$targetValue;
        if (!(floatValue == f)) {
            C13995l0 l0Var = this.$scope;
            final Animatable<Float, AnimationVector1D> animatable = this.$offset;
            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C09221((C12074d<? super C09221>) null), 3, (Object) null);
        }
        return new SwitchKt$Switch$3$invoke$$inlined$onDispose$1();
    }
}
