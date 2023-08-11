package androidx.compose.p002ui.input.rotary;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierKt */
/* compiled from: RotaryInputModifier.kt */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, Function1<? super RotaryScrollEvent, Boolean> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onPreRotaryScrollEvent");
        return modifier.then(new OnPreRotaryScrollEventElement(function1));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, Function1<? super RotaryScrollEvent, Boolean> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onRotaryScrollEvent");
        return modifier.then(new OnRotaryScrollEventElement(function1));
    }
}
