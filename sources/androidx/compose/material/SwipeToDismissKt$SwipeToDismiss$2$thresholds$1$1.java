package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SwipeToDismiss.kt */
final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends C12777p implements C13088o<DismissValue, DismissValue, ThresholdConfig> {
    final /* synthetic */ Function1<DismissDirection, ThresholdConfig> $dismissThresholds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(Function1<? super DismissDirection, ? extends ThresholdConfig> function1) {
        super(2);
        this.$dismissThresholds = function1;
    }

    public final ThresholdConfig invoke(DismissValue dismissValue, DismissValue dismissValue2) {
        C12775o.m28639i(dismissValue, TypedValues.TransitionType.S_FROM);
        C12775o.m28639i(dismissValue2, TypedValues.TransitionType.S_TO);
        Function1<DismissDirection, ThresholdConfig> function1 = this.$dismissThresholds;
        DismissDirection access$getDismissDirection = SwipeToDismissKt.getDismissDirection(dismissValue, dismissValue2);
        C12775o.m28636f(access$getDismissDirection);
        return function1.invoke(access$getDismissDirection);
    }
}
