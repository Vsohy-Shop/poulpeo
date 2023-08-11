package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.SaversKt;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1 */
/* compiled from: TextFieldValue.kt */
final class TextFieldValue$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, TextFieldValue, Object> {
    public static final TextFieldValue$Companion$Saver$1 INSTANCE = new TextFieldValue$Companion$Saver$1();

    TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(textFieldValue, "it");
        return C12726w.m28518e(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m37963boximpl(textFieldValue.m38194getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
    }
}
