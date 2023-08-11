package androidx.compose.p002ui.input.key;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.key.KeyInputModifierKt */
/* compiled from: KeyInputModifier.kt */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onKeyEvent");
        return modifier.then(new OnKeyEventElement(function1));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onPreviewKeyEvent");
        return modifier.then(new OnPreviewKeyEvent(function1));
    }
}
