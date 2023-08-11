package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: RadioButton.kt */
final class RadioButtonKt$RadioButton$2$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<C1232Dp> $dotRadius;
    final /* synthetic */ State<Color> $radioColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RadioButtonKt$RadioButton$2$1(State<Color> state, State<C1232Dp> state2) {
        super(1);
        this.$radioColor = state;
        this.$dotRadius = state2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$Canvas");
        float r3 = drawScope2.m38449toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
        float f = (float) 2;
        float f2 = r3 / f;
        DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, this.$radioColor.getValue().m35681unboximpl(), drawScope2.m38449toPx0680j_4(C1232Dp.m38468constructorimpl(RadioButtonTokens.INSTANCE.m35158getIconSizeD9Ej5fM() / f)) - f2, 0, 0.0f, new Stroke(r3, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 108, (Object) null);
        if (C1232Dp.m38467compareTo0680j_4(this.$dotRadius.getValue().m38482unboximpl(), C1232Dp.m38468constructorimpl((float) 0)) > 0) {
            DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, this.$radioColor.getValue().m35681unboximpl(), drawScope2.m38449toPx0680j_4(this.$dotRadius.getValue().m38482unboximpl()) - f2, 0, 0.0f, Fill.INSTANCE, (ColorFilter) null, 0, 108, (Object) null);
        }
    }
}
