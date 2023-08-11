package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13088o;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$Companion$Saver$2 extends C12777p implements Function1<T, SwipeableV2State<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmValueChange;
    final /* synthetic */ C13088o<Density, Float, Float> $positionalThreshold;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, C13088o<? super Density, ? super Float, Float> oVar, float f) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$positionalThreshold = oVar;
        this.$velocityThreshold = f;
    }

    public final SwipeableV2State<T> invoke(T t) {
        C12775o.m28639i(t, "it");
        return new SwipeableV2State(t, this.$animationSpec, this.$confirmValueChange, this.$positionalThreshold, this.$velocityThreshold, (DefaultConstructorMarker) null);
    }
}
