package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$TextIndentSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$TextIndentSaver$1 extends C12777p implements C13088o<SaverScope, TextIndent, Object> {
    public static final SaversKt$TextIndentSaver$1 INSTANCE = new SaversKt$TextIndentSaver$1();

    SaversKt$TextIndentSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(textIndent, "it");
        TextUnit r1 = TextUnit.m38639boximpl(textIndent.m38372getFirstLineXSAIIZE());
        TextUnit.Companion companion = TextUnit.Companion;
        return C12726w.m28518e(SaversKt.save(r1, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m38639boximpl(textIndent.m38373getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
    }
}
