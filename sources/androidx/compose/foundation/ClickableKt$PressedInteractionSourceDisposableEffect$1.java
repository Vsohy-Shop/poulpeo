package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.input.key.Key;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,565:1\n62#2,5:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n416#1:566,5\n*E\n"})
/* compiled from: Clickable.kt */
final class ClickableKt$PressedInteractionSourceDisposableEffect$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Map<Key, PressInteraction.Press> $currentKeyPressInteractions;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$PressedInteractionSourceDisposableEffect$1(MutableState<PressInteraction.Press> mutableState, Map<Key, PressInteraction.Press> map, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$pressedInteraction = mutableState;
        this.$currentKeyPressInteractions = map;
        this.$interactionSource = mutableInteractionSource;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        return new C0351xbb4f81a(this.$pressedInteraction, this.$currentKeyPressInteractions, this.$interactionSource);
    }
}
