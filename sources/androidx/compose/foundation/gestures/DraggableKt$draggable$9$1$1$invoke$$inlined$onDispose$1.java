package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n*L\n1#1,484:1\n225#2,5:485\n*E\n"})
/* compiled from: Effects.kt */
public final class DraggableKt$draggable$9$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ MutableState $draggedInteraction$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;

    public DraggableKt$draggable$9$1$1$invoke$$inlined$onDispose$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.$draggedInteraction$inlined = mutableState;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    public void dispose() {
        DragInteraction.Start start = (DragInteraction.Start) this.$draggedInteraction$inlined.getValue();
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.$interactionSource$inlined;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.$draggedInteraction$inlined.setValue(null);
        }
    }
}
