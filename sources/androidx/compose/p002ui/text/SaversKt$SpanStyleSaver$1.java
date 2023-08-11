package androidx.compose.p002ui.text;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$SpanStyleSaver$1 extends C12777p implements C13088o<SaverScope, SpanStyle, Object> {
    public static final SaversKt$SpanStyleSaver$1 INSTANCE = new SaversKt$SpanStyleSaver$1();

    SaversKt$SpanStyleSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(spanStyle, "it");
        Color r1 = Color.m35661boximpl(spanStyle.m37935getColor0d7_KjU());
        Color.Companion companion = Color.Companion;
        TextUnit r12 = TextUnit.m38639boximpl(spanStyle.m37936getFontSizeXSAIIZE());
        TextUnit.Companion companion2 = TextUnit.Companion;
        return C12726w.m28518e(SaversKt.save(r1, SaversKt.getSaver(companion), saverScope), SaversKt.save(r12, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope), SaversKt.save(spanStyle.m37937getFontStyle4Lr2A7w()), SaversKt.save(spanStyle.m37938getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m38639boximpl(spanStyle.m37939getLetterSpacingXSAIIZE()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.m37934getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope), SaversKt.save(Color.m35661boximpl(spanStyle.m37933getBackground0d7_KjU()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope));
    }
}
