package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n*L\n1#1,484:1\n87#2,6:485\n*E\n"})
/* compiled from: Effects.kt */
public final class FocusableKt$focusable$2$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ MutableState $focusedInteraction$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;

    public FocusableKt$focusable$2$1$1$invoke$$inlined$onDispose$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.$focusedInteraction$inlined = mutableState;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    public void dispose() {
        FocusInteraction.Focus focus = (FocusInteraction.Focus) this.$focusedInteraction$inlined.getValue();
        if (focus != null) {
            FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource$inlined;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(unfocus);
            }
            this.$focusedInteraction$inlined.setValue(null);
        }
    }
}
