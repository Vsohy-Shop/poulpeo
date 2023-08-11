package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4$1$1\n*L\n1#1,484:1\n320#2,6:485\n*E\n"})
/* compiled from: Effects.kt */
public final class ClickableKt$combinedClickable$4$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ MutableState $pressedInteraction$inlined;

    public ClickableKt$combinedClickable$4$1$1$invoke$$inlined$onDispose$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.$pressedInteraction$inlined = mutableState;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    public void dispose() {
        PressInteraction.Press press = (PressInteraction.Press) this.$pressedInteraction$inlined.getValue();
        if (press != null) {
            this.$interactionSource$inlined.tryEmit(new PressInteraction.Cancel(press));
            this.$pressedInteraction$inlined.setValue(null);
        }
    }
}
