package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import p466yf.C13995l0;

/* compiled from: Ripple.kt */
public abstract class RippleIndicationInstance implements IndicationInstance {
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z, State<RippleAlpha> state) {
        C12775o.m28639i(state, "rippleAlpha");
        this.stateLayer = new StateLayer(z, state);
    }

    public abstract void addRipple(PressInteraction.Press press, C13995l0 l0Var);

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m34234drawStateLayerH2RKhps(DrawScope drawScope, float f, long j) {
        C12775o.m28639i(drawScope, "$this$drawStateLayer");
        this.stateLayer.m34239drawStateLayerH2RKhps(drawScope, f, j);
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void updateStateLayer$material_ripple_release(Interaction interaction, C13995l0 l0Var) {
        C12775o.m28639i(interaction, "interaction");
        C12775o.m28639i(l0Var, "scope");
        this.stateLayer.handleInteraction(interaction, l0Var);
    }
}
