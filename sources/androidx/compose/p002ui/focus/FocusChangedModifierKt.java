package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusChangedModifierKt */
/* compiled from: FocusChangedModifier.kt */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onFocusChanged");
        return modifier.then(new FocusChangedElement(function1));
    }
}
