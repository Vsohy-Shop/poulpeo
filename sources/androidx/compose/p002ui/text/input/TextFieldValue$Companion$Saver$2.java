package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.SaversKt;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n55#2,2:202\n55#2,2:205\n1#3:204\n1#3:207\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:202,2\n169#1:205,2\n168#1:204\n169#1:207\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2 */
/* compiled from: TextFieldValue.kt */
final class TextFieldValue$Companion$Saver$2 extends C12777p implements Function1<Object, TextFieldValue> {
    public static final TextFieldValue$Companion$Saver$2 INSTANCE = new TextFieldValue$Companion$Saver$2();

    TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    public final TextFieldValue invoke(Object obj) {
        AnnotatedString annotatedString;
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        TextRange textRange = null;
        if (!C12775o.m28634d(obj2, bool) && obj2 != null) {
            annotatedString = annotatedStringSaver.restore(obj2);
        } else {
            annotatedString = null;
        }
        C12775o.m28636f(annotatedString);
        Object obj3 = list.get(1);
        Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
        if (!C12775o.m28634d(obj3, bool) && obj3 != null) {
            textRange = saver.restore(obj3);
        }
        C12775o.m28636f(textRange);
        return new TextFieldValue(annotatedString, textRange.m37979unboximpl(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
