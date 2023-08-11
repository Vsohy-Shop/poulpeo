package androidx.compose.animation;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentMeasurePolicy$maxIntrinsicWidth$1 extends C12777p implements Function1<IntrinsicMeasurable, Integer> {
    final /* synthetic */ int $height;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(int i) {
        super(1);
        this.$height = i;
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable) {
        C12775o.m28639i(intrinsicMeasurable, "it");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(this.$height));
    }
}
