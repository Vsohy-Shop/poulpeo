package androidx.compose.material;

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
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n*L\n124#1:234\n*E\n"})
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
        float f = r3 / ((float) 2);
        DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, this.$radioColor.getValue().m35681unboximpl(), drawScope2.m38449toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0, 0.0f, new Stroke(r3, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 108, (Object) null);
        if (C1232Dp.m38467compareTo0680j_4(this.$dotRadius.getValue().m38482unboximpl(), C1232Dp.m38468constructorimpl((float) 0)) > 0) {
            DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, this.$radioColor.getValue().m35681unboximpl(), drawScope2.m38449toPx0680j_4(this.$dotRadius.getValue().m38482unboximpl()) - f, 0, 0.0f, Fill.INSTANCE, (ColorFilter) null, 0, 108, (Object) null);
        }
    }
}
