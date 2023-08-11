package androidx.compose.material3;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $progress;
    final /* synthetic */ Stroke $stroke;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$CircularProgressIndicator$1(float f, long j, Stroke stroke) {
        super(1);
        this.$progress = f;
        this.$color = j;
        this.$stroke = stroke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        ProgressIndicatorKt.m34550drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, this.$progress * 360.0f, this.$color, this.$stroke);
    }
}
