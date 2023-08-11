package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n*L\n1#1,484:1\n84#2:485\n*E\n"})
/* compiled from: Effects.kt */
public final class HoverableKt$hoverable$2$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ MutableState $hoverInteraction$delegate$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;

    public HoverableKt$hoverable$2$1$1$invoke$$inlined$onDispose$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.$hoverInteraction$delegate$inlined = mutableState;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    public void dispose() {
        HoverableKt$hoverable$2.invoke$tryEmitExit(this.$hoverInteraction$delegate$inlined, this.$interactionSource$inlined);
    }
}
