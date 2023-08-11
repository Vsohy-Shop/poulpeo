package androidx.compose.material.pullrefresh;

import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,75:1\n214#2,8:76\n261#2,11:84\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1\n*L\n55#1:76,8\n55#1:84,11\n*E\n"})
/* renamed from: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 */
/* compiled from: PullRefreshIndicatorTransform.kt */
final class C0825xe053f546 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    public static final C0825xe053f546 INSTANCE = new C0825xe053f546();

    C0825xe053f546() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$drawWithContent");
        int r6 = ClipOp.Companion.m35660getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long r7 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36329clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, r6);
        contentDrawScope.drawContent();
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r7);
    }
}
