package androidx.compose.material;

import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Drawer.kt */
final class DrawerKt$Scrim$1$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ long $color;
    final /* synthetic */ C13074a<Float> $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$Scrim$1$1(long j, C13074a<Float> aVar) {
        super(1);
        this.$color = j;
        this.$fraction = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$Canvas");
        DrawScope.m36250drawRectnJ9OG0$default(drawScope, this.$color, 0, 0, this.$fraction.invoke().floatValue(), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
    }
}
