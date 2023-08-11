package androidx.compose.material.pullrefresh;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,242:1\n136#2,5:243\n261#2,11:248\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n*L\n142#1:243,5\n142#1:248,11\n*E\n"})
/* compiled from: PullRefreshIndicator.kt */
final class PullRefreshIndicatorKt$CircularArrowIndicator$2 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ State<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ Path $path;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshIndicatorKt$CircularArrowIndicator$2(PullRefreshState pullRefreshState, State<Float> state, long j, Path path) {
        super(1);
        this.$state = pullRefreshState;
        this.$alphaState = state;
        this.$color = j;
        this.$path = path;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$Canvas");
        ArrowValues access$ArrowValues = PullRefreshIndicatorKt.ArrowValues(this.$state.getProgress());
        float floatValue = this.$alphaState.getValue().floatValue();
        float rotation = access$ArrowValues.getRotation();
        long j = this.$color;
        Path path = this.$path;
        long r2 = drawScope.m36273getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long r9 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36332rotateUv8p0NA(rotation, r2);
        float r1 = drawScope2.m38449toPx0680j_4(PullRefreshIndicatorKt.ArcRadius) + (drawScope2.m38449toPx0680j_4(PullRefreshIndicatorKt.StrokeWidth) / 2.0f);
        Rect rect = new Rect(Offset.m35422getXimpl(SizeKt.m35501getCenteruvyYCjk(drawScope.m36274getSizeNHjbRc())) - r1, Offset.m35423getYimpl(SizeKt.m35501getCenteruvyYCjk(drawScope.m36274getSizeNHjbRc())) - r1, Offset.m35422getXimpl(SizeKt.m35501getCenteruvyYCjk(drawScope.m36274getSizeNHjbRc())) + r1, Offset.m35423getYimpl(SizeKt.m35501getCenteruvyYCjk(drawScope.m36274getSizeNHjbRc())) + r1);
        DrawScope drawScope3 = drawScope;
        DrawContext drawContext2 = drawContext;
        Path path2 = path;
        DrawScope.m36235drawArcyD3GUKo$default(drawScope3, j, access$ArrowValues.getStartAngle(), access$ArrowValues.getEndAngle() - access$ArrowValues.getStartAngle(), false, rect.m35457getTopLeftF1C5BW0(), rect.m35455getSizeNHjbRc(), floatValue, new Stroke(drawScope2.m38449toPx0680j_4(PullRefreshIndicatorKt.StrokeWidth), 0.0f, StrokeCap.Companion.m36056getSquareKaPHkGw(), 0, (PathEffect) null, 26, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 768, (Object) null);
        PullRefreshIndicatorKt.m34219drawArrowBx497Mc(drawScope3, path2, rect, j, floatValue, access$ArrowValues);
        drawContext2.getCanvas().restore();
        drawContext2.m36218setSizeuvyYCjk(r9);
    }
}
