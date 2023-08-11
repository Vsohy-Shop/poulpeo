package androidx.compose.material;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead$delegate;
    final /* synthetic */ State<Float> $firstLineTail$delegate;
    final /* synthetic */ State<Float> $secondLineHead$delegate;
    final /* synthetic */ State<Float> $secondLineTail$delegate;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, int i, long j2, State<Float> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j;
        this.$strokeCap = i;
        this.$color = j2;
        this.$firstLineHead$delegate = state;
        this.$firstLineTail$delegate = state2;
        this.$secondLineHead$delegate = state3;
        this.$secondLineTail$delegate = state4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        float r0 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc());
        ProgressIndicatorKt.m34094drawLinearIndicatorBackgroundAZGd3zU(drawScope, this.$backgroundColor, r0, this.$strokeCap);
        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate) > 0.0f) {
            ProgressIndicatorKt.m34093drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate), this.$color, r0, this.$strokeCap);
        }
        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate) > 0.0f) {
            ProgressIndicatorKt.m34093drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate), this.$color, r0, this.$strokeCap);
        }
    }
}
