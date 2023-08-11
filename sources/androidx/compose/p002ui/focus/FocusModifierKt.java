package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.focus.FocusModifierKt */
/* compiled from: FocusModifier.kt */
public final class FocusModifierKt {
    public static final Modifier focusModifier(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return modifier.then(FocusTargetModifierNode.FocusTargetModifierElement.INSTANCE);
    }
}
