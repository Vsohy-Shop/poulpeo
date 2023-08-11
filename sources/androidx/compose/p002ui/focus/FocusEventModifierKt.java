package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusEventModifierKt */
/* compiled from: FocusEventModifier.kt */
public final class FocusEventModifierKt {
    public static final Modifier onFocusEvent(Modifier modifier, Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onFocusEvent");
        return modifier.then(new FocusEventElement(function1));
    }
}
