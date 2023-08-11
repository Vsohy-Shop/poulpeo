package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n1#3:424\n1#3:427\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n295#1:422,2\n296#1:425,2\n295#1:424\n296#1:427\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$TextIndentSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$TextIndentSaver$2 extends C12777p implements Function1<Object, TextIndent> {
    public static final SaversKt$TextIndentSaver$2 INSTANCE = new SaversKt$TextIndentSaver$2();

    SaversKt$TextIndentSaver$2() {
        super(1);
    }

    public final TextIndent invoke(Object obj) {
        TextUnit textUnit;
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnit.Companion companion = TextUnit.Companion;
        Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit2 = null;
        if (!C12775o.m28634d(obj2, bool) && obj2 != null) {
            textUnit = saver.restore(obj2);
        } else {
            textUnit = null;
        }
        C12775o.m28636f(textUnit);
        long r7 = textUnit.m38658unboximpl();
        Object obj3 = list.get(1);
        Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
        if (!C12775o.m28634d(obj3, bool) && obj3 != null) {
            textUnit2 = saver2.restore(obj3);
        }
        C12775o.m28636f(textUnit2);
        return new TextIndent(r7, textUnit2.m38658unboximpl(), (DefaultConstructorMarker) null);
    }
}
