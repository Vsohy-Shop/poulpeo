package androidx.compose.foundation.gestures.snapping;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehavior$longSnap$3 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ Function1<Float, C11921v> $onAnimationStep;
    final /* synthetic */ C12757e0 $remainingScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$longSnap$3(C12757e0 e0Var, Function1<? super Float, C11921v> function1) {
        super(1);
        this.$remainingScrollOffset = e0Var;
        this.$onAnimationStep = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        C12757e0 e0Var = this.$remainingScrollOffset;
        float f2 = e0Var.f20408b - f;
        e0Var.f20408b = f2;
        this.$onAnimationStep.invoke(Float.valueOf(f2));
    }
}
