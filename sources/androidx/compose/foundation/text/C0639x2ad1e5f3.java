package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n1#1,484:1\n47#2,6:485\n*E\n"})
/* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0639x2ad1e5f3 implements DisposableEffectResult {
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ MutableState $pressedInteraction$inlined;

    public C0639x2ad1e5f3(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.$pressedInteraction$inlined = mutableState;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    public void dispose() {
        PressInteraction.Press press = (PressInteraction.Press) this.$pressedInteraction$inlined.getValue();
        if (press != null) {
            PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource$inlined;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(cancel);
            }
            this.$pressedInteraction$inlined.setValue(null);
        }
    }
}
