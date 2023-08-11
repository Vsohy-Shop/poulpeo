package androidx.compose.foundation;

import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.C12775o;

/* compiled from: Indication.kt */
final class IndicationModifier implements DrawModifier {
    private final IndicationInstance indicationInstance;

    public IndicationModifier(IndicationInstance indicationInstance2) {
        C12775o.m28639i(indicationInstance2, "indicationInstance");
        this.indicationInstance = indicationInstance2;
    }

    public void draw(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        this.indicationInstance.drawIndication(contentDrawScope);
    }

    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }
}
