package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead;
    final /* synthetic */ State<Float> $firstLineTail;
    final /* synthetic */ State<Float> $secondLineHead;
    final /* synthetic */ State<Float> $secondLineTail;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, State<Float> state, State<Float> state2, long j2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$trackColor = j;
        this.$firstLineHead = state;
        this.$firstLineTail = state2;
        this.$color = j2;
        this.$secondLineHead = state3;
        this.$secondLineTail = state4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        float r0 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc());
        ProgressIndicatorKt.m34553drawLinearIndicatorTrackbw27NRU(drawScope, this.$trackColor, r0);
        if (this.$firstLineHead.getValue().floatValue() - this.$firstLineTail.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.m34552drawLinearIndicator42QJj7c(drawScope, this.$firstLineHead.getValue().floatValue(), this.$firstLineTail.getValue().floatValue(), this.$color, r0);
        }
        if (this.$secondLineHead.getValue().floatValue() - this.$secondLineTail.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.m34552drawLinearIndicator42QJj7c(drawScope, this.$secondLineHead.getValue().floatValue(), this.$secondLineTail.getValue().floatValue(), this.$color, r0);
        }
    }
}
