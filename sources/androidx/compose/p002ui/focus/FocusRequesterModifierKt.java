package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.focus.FocusRequesterModifierKt */
/* compiled from: FocusRequesterModifier.kt */
public final class FocusRequesterModifierKt {
    public static final Modifier focusRequester(Modifier modifier, FocusRequester focusRequester) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(focusRequester, "focusRequester");
        return modifier.then(new FocusRequesterElement(focusRequester));
    }
}
