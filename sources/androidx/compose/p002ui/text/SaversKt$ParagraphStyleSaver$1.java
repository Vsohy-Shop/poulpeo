package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$ParagraphStyleSaver$1 extends C12777p implements C13088o<SaverScope, ParagraphStyle, Object> {
    public static final SaversKt$ParagraphStyleSaver$1 INSTANCE = new SaversKt$ParagraphStyleSaver$1();

    SaversKt$ParagraphStyleSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(paragraphStyle, "it");
        return C12726w.m28518e(SaversKt.save(paragraphStyle.m37892getTextAlignbuA522U()), SaversKt.save(paragraphStyle.m37894getTextDirectionmmuk1to()), SaversKt.save(TextUnit.m38639boximpl(paragraphStyle.m37891getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope));
    }
}
