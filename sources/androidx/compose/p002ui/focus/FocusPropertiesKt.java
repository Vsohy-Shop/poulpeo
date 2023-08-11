package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesKt */
/* compiled from: FocusProperties.kt */
public final class FocusPropertiesKt {
    public static final Modifier focusProperties(Modifier modifier, Function1<? super FocusProperties, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "scope");
        return modifier.then(new FocusPropertiesElement(function1));
    }
}
