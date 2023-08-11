package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Crossfade.kt */
final class CrossfadeKt$Crossfade$3$1 extends C12777p implements Function1<T, Boolean> {
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossfadeKt$Crossfade$3$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    public final Boolean invoke(T t) {
        return Boolean.valueOf(!C12775o.m28634d(t, this.$this_Crossfade.getTargetState()));
    }
}
