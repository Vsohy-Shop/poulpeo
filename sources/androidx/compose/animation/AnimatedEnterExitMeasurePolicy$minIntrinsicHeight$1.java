package androidx.compose.animation;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1 extends C12777p implements Function1<IntrinsicMeasurable, Integer> {
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(int i) {
        super(1);
        this.$width = i;
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
        C12775o.m28639i(intrinsicMeasurable, "it");
        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(this.$width));
    }
}
