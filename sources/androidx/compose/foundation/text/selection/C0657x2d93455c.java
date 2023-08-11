package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", mo50610f = "SelectionMagnifier.kt", mo50611l = {102}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 */
/* compiled from: SelectionMagnifier.kt */
final class C0657x2d93455c extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ long $targetValue;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0657x2d93455c(Animatable<Offset, AnimationVector2D> animatable, long j, C12074d<? super C0657x2d93455c> dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.$targetValue = j;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new C0657x2d93455c(this.$animatable, this.$targetValue, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            Offset r10 = Offset.m35411boximpl(this.$targetValue);
            SpringSpec access$getMagnifierSpringSpec$p = SelectionMagnifierKt.MagnifierSpringSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, r10, access$getMagnifierSpringSpec$p, (Object) null, (Function1) null, this, 12, (Object) null) == c) {
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
        return ((C0657x2d93455c) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
