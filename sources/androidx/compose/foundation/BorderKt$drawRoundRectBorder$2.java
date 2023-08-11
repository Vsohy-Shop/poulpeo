package androidx.compose.foundation;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Border.kt */
final class BorderKt$drawRoundRectBorder$2 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ Path $roundedRectPath;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawRoundRectBorder$2(Path path, Brush brush) {
        super(1);
        this.$roundedRectPath = path;
        this.$brush = brush;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
        contentDrawScope.drawContent();
        DrawScope.m36245drawPathGBMwjPU$default(contentDrawScope, this.$roundedRectPath, this.$brush, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
    }
}
