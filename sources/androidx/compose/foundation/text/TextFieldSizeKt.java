package androidx.compose.foundation.text;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSize.kt */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier modifier, TextStyle textStyle) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textStyle, "style");
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new TextFieldSizeKt$textFieldMinSize$1(textStyle), 1, (Object) null);
    }
}
