package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $progress;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$LinearProgressIndicator$1$1(long j, float f, long j2) {
        super(1);
        this.$trackColor = j;
        this.$progress = f;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        float r7 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc());
        ProgressIndicatorKt.m34553drawLinearIndicatorTrackbw27NRU(drawScope, this.$trackColor, r7);
        ProgressIndicatorKt.m34552drawLinearIndicator42QJj7c(drawScope, 0.0f, this.$progress, this.$color, r7);
    }
}
