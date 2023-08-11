package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Checkbox.kt */
final class CheckboxKt$CheckboxImpl$1$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Color> $borderColor$delegate;
    final /* synthetic */ State<Color> $boxColor$delegate;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ State<Color> $checkColor$delegate;
    final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckboxKt$CheckboxImpl$1$1(CheckDrawingCache checkDrawingCache, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = checkDrawingCache;
        this.$boxColor$delegate = state;
        this.$borderColor$delegate = state2;
        this.$checkColor$delegate = state3;
        this.$checkDrawFraction$delegate = state4;
        this.$checkCenterGravitationShiftFraction$delegate = state5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        float floor = (float) Math.floor((double) drawScope.m38449toPx0680j_4(CheckboxKt.StrokeWidth));
        DrawScope drawScope2 = drawScope;
        CheckboxKt.m33933drawBox1wkBAMs(drawScope2, CheckboxKt.CheckboxImpl$lambda$9(this.$boxColor$delegate), CheckboxKt.CheckboxImpl$lambda$10(this.$borderColor$delegate), drawScope.m38449toPx0680j_4(CheckboxKt.RadiusSize), floor);
        CheckboxKt.m33934drawCheck3IgeMak(drawScope2, CheckboxKt.CheckboxImpl$lambda$8(this.$checkColor$delegate), CheckboxKt.CheckboxImpl$lambda$4(this.$checkDrawFraction$delegate), CheckboxKt.CheckboxImpl$lambda$6(this.$checkCenterGravitationShiftFraction$delegate), floor, this.$checkCache);
    }
}
