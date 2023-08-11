package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n221#2:460\n261#2,11:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n*L\n353#1:460\n353#1:461,11\n*E\n"})
/* compiled from: Border.kt */
final class BorderKt$drawRoundRectBorder$1 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawRoundRectBorder$1(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, Stroke stroke) {
        super(1);
        this.$fillArea = z;
        this.$brush = brush;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = stroke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$onDrawWithContent");
        contentDrawScope.drawContent();
        if (this.$fillArea) {
            DrawScope.m36251drawRoundRectZuiqVtQ$default(contentDrawScope, this.$brush, 0, 0, this.$cornerRadius, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 246, (Object) null);
            return;
        }
        float r1 = CornerRadius.m35397getXimpl(this.$cornerRadius);
        float f = this.$halfStroke;
        if (r1 < f) {
            float f2 = this.$strokeWidth;
            float r7 = Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc()) - this.$strokeWidth;
            float r8 = Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc()) - this.$strokeWidth;
            int r9 = ClipOp.Companion.m35659getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j = this.$cornerRadius;
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long r14 = drawContext.m36217getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().m36329clipRectN_I0leg(f2, f2, r7, r8, r9);
            DrawScope.m36251drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0, 0, j, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 246, (Object) null);
            drawContext.getCanvas().restore();
            drawContext.m36218setSizeuvyYCjk(r14);
            return;
        }
        DrawScope.m36251drawRoundRectZuiqVtQ$default(contentDrawScope, this.$brush, this.$topLeft, this.$borderSize, BorderKt.m32972shrinkKibmq7A(this.$cornerRadius, f), 0.0f, this.$borderStroke, (ColorFilter) null, 0, 208, (Object) null);
    }
}
