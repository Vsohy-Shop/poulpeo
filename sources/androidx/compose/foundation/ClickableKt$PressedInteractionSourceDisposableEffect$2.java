package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.input.key.Key;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.Map;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Clickable.kt */
final class ClickableKt$PressedInteractionSourceDisposableEffect$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Map<Key, PressInteraction.Press> $currentKeyPressInteractions;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$PressedInteractionSourceDisposableEffect$2(MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, Map<Key, PressInteraction.Press> map, int i) {
        super(2);
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
        this.$currentKeyPressInteractions = map;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        ClickableKt.PressedInteractionSourceDisposableEffect(this.$interactionSource, this.$pressedInteraction, this.$currentKeyPressInteractions, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
