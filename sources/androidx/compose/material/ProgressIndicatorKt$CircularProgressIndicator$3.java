package androidx.compose.material;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$3 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ State<Float> $baseRotation$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation$delegate;
    final /* synthetic */ State<Float> $endAngle$delegate;
    final /* synthetic */ State<Float> $startAngle$delegate;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$CircularProgressIndicator$3(long j, Stroke stroke, float f, long j2, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j;
        this.$stroke = stroke;
        this.$strokeWidth = f;
        this.$color = j2;
        this.$currentRotation$delegate = state;
        this.$endAngle$delegate = state2;
        this.$startAngle$delegate = state3;
        this.$baseRotation$delegate = state4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        ProgressIndicatorKt.m34090drawCircularIndicatorBackgroundbw27NRU(drawScope, this.$backgroundColor, this.$stroke);
        DrawScope drawScope2 = drawScope;
        ProgressIndicatorKt.m34092drawIndeterminateCircularIndicatorhrjfTZI(drawScope2, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate) + (((((float) ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(this.$currentRotation$delegate)) * 216.0f) % 360.0f) - 0.049804688f) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(this.$baseRotation$delegate), this.$strokeWidth, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(this.$endAngle$delegate) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate)), this.$color, this.$stroke);
    }
}
