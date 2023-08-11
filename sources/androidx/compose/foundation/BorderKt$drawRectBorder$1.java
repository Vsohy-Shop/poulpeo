package androidx.compose.foundation;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Border.kt */
final class BorderKt$drawRectBorder$1 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $rectTopLeft;
    final /* synthetic */ long $size;
    final /* synthetic */ DrawStyle $style;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawRectBorder$1(Brush brush, long j, long j2, DrawStyle drawStyle) {
        super(1);
        this.$brush = brush;
        this.$rectTopLeft = j;
        this.$size = j2;
        this.$style = drawStyle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
        contentDrawScope.drawContent();
        DrawScope.m36249drawRectAsUm42w$default(contentDrawScope, this.$brush, this.$rectTopLeft, this.$size, 0.0f, this.$style, (ColorFilter) null, 0, 104, (Object) null);
    }
}
