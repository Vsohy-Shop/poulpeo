package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Switch.kt */
final class SwitchKt$SwitchImpl$2$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Color> $trackColor$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$SwitchImpl$2$1(State<Color> state) {
        super(1);
        this.$trackColor$delegate = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        SwitchKt.m34153drawTrackRPmYEkk(drawScope, SwitchKt.SwitchImpl$lambda$5(this.$trackColor$delegate), drawScope.m38449toPx0680j_4(SwitchKt.getTrackWidth()), drawScope.m38449toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
    }
}
