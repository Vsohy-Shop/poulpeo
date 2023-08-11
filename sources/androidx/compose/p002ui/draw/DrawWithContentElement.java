package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.draw.DrawWithContentElement */
/* compiled from: DrawModifier.kt */
final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {
    private final Function1<ContentDrawScope, C11921v> onDraw;

    public DrawWithContentElement(Function1<? super ContentDrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "onDraw");
        this.onDraw = function1;
    }

    public static /* synthetic */ DrawWithContentElement copy$default(DrawWithContentElement drawWithContentElement, Function1<ContentDrawScope, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = drawWithContentElement.onDraw;
        }
        return drawWithContentElement.copy(function1);
    }

    public final Function1<ContentDrawScope, C11921v> component1() {
        return this.onDraw;
    }

    public final DrawWithContentElement copy(Function1<? super ContentDrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "onDraw");
        return new DrawWithContentElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithContentElement) && C12775o.m28634d(this.onDraw, ((DrawWithContentElement) obj).onDraw)) {
            return true;
        }
        return false;
    }

    public final Function1<ContentDrawScope, C11921v> getOnDraw() {
        return this.onDraw;
    }

    public int hashCode() {
        return this.onDraw.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + ')';
    }

    public DrawWithContentModifier create() {
        return new DrawWithContentModifier(this.onDraw);
    }

    public DrawWithContentModifier update(DrawWithContentModifier drawWithContentModifier) {
        C12775o.m28639i(drawWithContentModifier, "node");
        drawWithContentModifier.setOnDraw(this.onDraw);
        return drawWithContentModifier;
    }
}
