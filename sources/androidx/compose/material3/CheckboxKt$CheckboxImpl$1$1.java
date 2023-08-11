package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Checkbox.kt */
final class CheckboxKt$CheckboxImpl$1$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Color> $borderColor;
    final /* synthetic */ State<Color> $boxColor;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction;
    final /* synthetic */ State<Color> $checkColor;
    final /* synthetic */ State<Float> $checkDrawFraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckboxKt$CheckboxImpl$1$1(State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5, CheckDrawingCache checkDrawingCache) {
        super(1);
        this.$boxColor = state;
        this.$borderColor = state2;
        this.$checkColor = state3;
        this.$checkDrawFraction = state4;
        this.$checkCenterGravitationShiftFraction = state5;
        this.$checkCache = checkDrawingCache;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        float floor = (float) Math.floor((double) drawScope.m38449toPx0680j_4(CheckboxKt.StrokeWidth));
        DrawScope drawScope2 = drawScope;
        CheckboxKt.m34288drawBox1wkBAMs(drawScope2, this.$boxColor.getValue().m35681unboximpl(), this.$borderColor.getValue().m35681unboximpl(), drawScope.m38449toPx0680j_4(CheckboxKt.RadiusSize), floor);
        CheckboxKt.m34289drawCheck3IgeMak(drawScope2, this.$checkColor.getValue().m35681unboximpl(), this.$checkDrawFraction.getValue().floatValue(), this.$checkCenterGravitationShiftFraction.getValue().floatValue(), floor, this.$checkCache);
    }
}
