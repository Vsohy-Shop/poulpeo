package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12775o;

/* compiled from: Clickable.kt */
public final class ClickableKt$clickable$4$1$1 implements ModifierLocalConsumer {
    final /* synthetic */ MutableState<Boolean> $isClickableInScrollableContainer;

    ClickableKt$clickable$4$1$1(MutableState<Boolean> mutableState) {
        this.$isClickableInScrollableContainer = mutableState;
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        this.$isClickableInScrollableContainer.setValue(modifierLocalReadScope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
    }
}
