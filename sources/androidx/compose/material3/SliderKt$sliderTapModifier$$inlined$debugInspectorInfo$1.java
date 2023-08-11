package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: InspectableValue.kt */
public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ DraggableState $draggableState$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ State $gestureEndAction$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ boolean $isRtl$inlined;
    final /* synthetic */ int $maxPx$inlined;
    final /* synthetic */ MutableState $pressOffset$inlined;
    final /* synthetic */ State $rawOffset$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i, boolean z, State state, State state2, MutableState mutableState, boolean z2) {
        super(1);
        this.$draggableState$inlined = draggableState;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$maxPx$inlined = i;
        this.$isRtl$inlined = z;
        this.$rawOffset$inlined = state;
        this.$gestureEndAction$inlined = state2;
        this.$pressOffset$inlined = mutableState;
        this.$enabled$inlined = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("sliderTapModifier");
        inspectorInfo.getProperties().set("draggableState", this.$draggableState$inlined);
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("maxPx", Integer.valueOf(this.$maxPx$inlined));
        inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(this.$isRtl$inlined));
        inspectorInfo.getProperties().set("rawOffset", this.$rawOffset$inlined);
        inspectorInfo.getProperties().set("gestureEndAction", this.$gestureEndAction$inlined);
        inspectorInfo.getProperties().set("pressOffset", this.$pressOffset$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}
