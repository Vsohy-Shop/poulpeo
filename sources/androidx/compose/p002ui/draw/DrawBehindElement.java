package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.draw.DrawBehindElement */
/* compiled from: DrawModifier.kt */
final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {
    private final Function1<DrawScope, C11921v> onDraw;

    public DrawBehindElement(Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "onDraw");
        this.onDraw = function1;
    }

    public static /* synthetic */ DrawBehindElement copy$default(DrawBehindElement drawBehindElement, Function1<DrawScope, C11921v> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = drawBehindElement.onDraw;
        }
        return drawBehindElement.copy(function1);
    }

    public final Function1<DrawScope, C11921v> component1() {
        return this.onDraw;
    }

    public final DrawBehindElement copy(Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "onDraw");
        return new DrawBehindElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawBehindElement) && C12775o.m28634d(this.onDraw, ((DrawBehindElement) obj).onDraw)) {
            return true;
        }
        return false;
    }

    public final Function1<DrawScope, C11921v> getOnDraw() {
        return this.onDraw;
    }

    public int hashCode() {
        return this.onDraw.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set("onDraw", this.onDraw);
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    public DrawBackgroundModifier create() {
        return new DrawBackgroundModifier(this.onDraw);
    }

    public DrawBackgroundModifier update(DrawBackgroundModifier drawBackgroundModifier) {
        C12775o.m28639i(drawBackgroundModifier, "node");
        drawBackgroundModifier.setOnDraw(this.onDraw);
        return drawBackgroundModifier;
    }
}
