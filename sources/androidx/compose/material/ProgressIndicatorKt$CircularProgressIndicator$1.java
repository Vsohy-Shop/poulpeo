package androidx.compose.material;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ Stroke $stroke;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$CircularProgressIndicator$1(float f, long j, Stroke stroke, long j2) {
        super(1);
        this.$coercedProgress = f;
        this.$backgroundColor = j;
        this.$stroke = stroke;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        float f = this.$coercedProgress * 360.0f;
        ProgressIndicatorKt.m34090drawCircularIndicatorBackgroundbw27NRU(drawScope, this.$backgroundColor, this.$stroke);
        ProgressIndicatorKt.m34091drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f, this.$color, this.$stroke);
    }
}
