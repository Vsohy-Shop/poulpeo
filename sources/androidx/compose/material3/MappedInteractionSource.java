package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Offset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p314bg.C10962f;

/* compiled from: MappedInteractionSource.kt */
public final class MappedInteractionSource implements InteractionSource {
    private final long delta;
    private final C10962f<Interaction> interactions;
    /* access modifiers changed from: private */
    public final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, j);
    }

    /* access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m35426minusMKHz9U(press.m33158getPressPositionF1C5BW0(), this.delta), (DefaultConstructorMarker) null);
    }

    public C10962f<Interaction> getInteractions() {
        return this.interactions;
    }

    private MappedInteractionSource(InteractionSource interactionSource, long j) {
        this.delta = j;
        this.mappedPresses = new LinkedHashMap();
        this.interactions = new MappedInteractionSource$special$$inlined$map$1(interactionSource.getInteractions(), this);
    }
}
