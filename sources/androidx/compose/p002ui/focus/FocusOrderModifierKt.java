package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusOrderModifierKt */
/* compiled from: FocusOrderModifier.kt */
public final class FocusOrderModifierKt {
    public static final Modifier focusOrder(Modifier modifier, Function1<? super FocusOrder, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderToProperties(function1));
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(focusRequester, "focusRequester");
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, Function1<? super FocusOrder, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(focusRequester, "focusRequester");
        C12775o.m28639i(function1, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderToProperties(function1));
    }
}
