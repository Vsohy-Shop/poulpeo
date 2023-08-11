package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n417#2,6:485\n423#2,2:492\n425#2,2:495\n1855#3:491\n1856#3:494\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n422#1:491\n422#1:494\n*E\n"})
/* renamed from: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0351xbb4f81a implements DisposableEffectResult {
    final /* synthetic */ Map $currentKeyPressInteractions$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ MutableState $pressedInteraction$inlined;

    public C0351xbb4f81a(MutableState mutableState, Map map, MutableInteractionSource mutableInteractionSource) {
        this.$pressedInteraction$inlined = mutableState;
        this.$currentKeyPressInteractions$inlined = map;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    public void dispose() {
        PressInteraction.Press press = (PressInteraction.Press) this.$pressedInteraction$inlined.getValue();
        if (press != null) {
            this.$interactionSource$inlined.tryEmit(new PressInteraction.Cancel(press));
            this.$pressedInteraction$inlined.setValue(null);
        }
        for (PressInteraction.Press cancel : this.$currentKeyPressInteractions$inlined.values()) {
            this.$interactionSource$inlined.tryEmit(new PressInteraction.Cancel(cancel));
        }
        this.$currentKeyPressInteractions$inlined.clear();
    }
}
