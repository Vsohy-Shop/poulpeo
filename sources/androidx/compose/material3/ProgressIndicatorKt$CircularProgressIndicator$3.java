package androidx.compose.material3;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$3 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Float> $baseRotation;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation;
    final /* synthetic */ State<Float> $endAngle;
    final /* synthetic */ State<Float> $startAngle;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$CircularProgressIndicator$3(State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4, float f, long j, Stroke stroke) {
        super(1);
        this.$currentRotation = state;
        this.$endAngle = state2;
        this.$startAngle = state3;
        this.$baseRotation = state4;
        this.$strokeWidth = f;
        this.$color = j;
        this.$stroke = stroke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        DrawScope drawScope2 = drawScope;
        ProgressIndicatorKt.m34551drawIndeterminateCircularIndicatorhrjfTZI(drawScope2, this.$startAngle.getValue().floatValue() + (((this.$currentRotation.getValue().floatValue() * 216.0f) % 360.0f) - 0.049804688f) + this.$baseRotation.getValue().floatValue(), this.$strokeWidth, Math.abs(this.$endAngle.getValue().floatValue() - this.$startAngle.getValue().floatValue()), this.$color, this.$stroke);
    }
}
