package androidx.compose.p002ui.graphics.painter;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.graphics.painter.Painter$drawLambda$1 */
/* compiled from: Painter.kt */
final class Painter$drawLambda$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ Painter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Painter$drawLambda$1(Painter painter) {
        super(1);
        this.this$0 = painter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$null");
        this.this$0.onDraw(drawScope);
    }
}
