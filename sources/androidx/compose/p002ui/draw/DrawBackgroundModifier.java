package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.node.DrawModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.draw.DrawBackgroundModifier */
/* compiled from: DrawModifier.kt */
final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {
    private Function1<? super DrawScope, C11921v> onDraw;

    public DrawBackgroundModifier(Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "onDraw");
        this.onDraw = function1;
    }

    public void draw(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    public final Function1<DrawScope, C11921v> getOnDraw() {
        return this.onDraw;
    }

    public final void setOnDraw(Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onDraw = function1;
    }
}
