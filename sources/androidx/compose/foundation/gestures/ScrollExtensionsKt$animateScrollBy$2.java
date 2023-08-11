package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12757e0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", mo50610f = "ScrollExtensions.kt", mo50611l = {41}, mo50612m = "invokeSuspend")
/* compiled from: ScrollExtensions.kt */
final class ScrollExtensionsKt$animateScrollBy$2 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ C12757e0 $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f, AnimationSpec<Float> animationSpec, C12757e0 e0Var, C12074d<? super ScrollExtensionsKt$animateScrollBy$2> dVar) {
        super(2, dVar);
        this.$value = f;
        this.$animationSpec = animationSpec;
        this.$previousValue = e0Var;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, dVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            float f = this.$value;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final C12757e0 e0Var = this.$previousValue;
            C04131 r7 = new C13088o<Float, Float, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C11921v.f18618a;
                }

                public final void invoke(float f, float f2) {
                    C12757e0 e0Var = e0Var;
                    float f3 = e0Var.f20408b;
                    e0Var.f20408b = f3 + scrollScope.scrollBy(f - f3);
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, f, 0.0f, animationSpec, r7, this, 4, (Object) null) == c) {
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
