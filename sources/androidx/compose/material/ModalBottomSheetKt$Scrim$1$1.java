package androidx.compose.material;

import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetKt$Scrim$1$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheetKt$Scrim$1$1(long j, State<Float> state) {
        super(1);
        this.$color = j;
        this.$alpha$delegate = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        DrawScope.m36250drawRectnJ9OG0$default(drawScope, this.$color, 0, 0, ModalBottomSheetKt.Scrim_3J_VO9M$lambda$1(this.$alpha$delegate), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
    }
}
