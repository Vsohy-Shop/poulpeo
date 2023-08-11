package androidx.compose.foundation;

import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: AndroidOverscroll.kt */
final class DrawOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(androidEdgeEffectOverscrollEffect, "overscrollEffect");
        C12775o.m28639i(function1, "inspectorInfo");
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
    }

    public void draw(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        contentDrawScope.drawContent();
        this.overscrollEffect.drawOverscroll(contentDrawScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawOverscrollModifier)) {
            return false;
        }
        return C12775o.m28634d(this.overscrollEffect, ((DrawOverscrollModifier) obj).overscrollEffect);
    }

    public int hashCode() {
        return this.overscrollEffect.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.overscrollEffect + ')';
    }
}
