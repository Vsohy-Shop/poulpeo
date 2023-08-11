package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.text.style.TextIndentKt;
import androidx.compose.p002ui.text.style.TextMotion;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.ParagraphStyleKt */
/* compiled from: ParagraphStyle.kt */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m38660getUnspecifiedXSAIIZE();

    @Stable
    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        C12775o.m28639i(paragraphStyle, "start");
        C12775o.m28639i(paragraphStyle2, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(paragraphStyle.m37892getTextAlignbuA522U(), paragraphStyle2.m37892getTextAlignbuA522U(), f);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(paragraphStyle.m37894getTextDirectionmmuk1to(), paragraphStyle2.m37894getTextDirectionmmuk1to(), f);
        long r4 = SpanStyleKt.m37940lerpTextUnitInheritableC3pnCVY(paragraphStyle.m37891getLineHeightXSAIIZE(), paragraphStyle2.m37891getLineHeightXSAIIZE(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(textAlign, textDirection, r4, TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), (LineBreak) SpanStyleKt.lerpDiscrete(paragraphStyle.m37889getLineBreakLgCVezo(), paragraphStyle2.m37889getLineBreakLgCVezo(), f), (Hyphens) SpanStyleKt.lerpDiscrete(paragraphStyle.m37887getHyphensEaSxIns(), paragraphStyle2.m37887getHyphensEaSxIns(), f), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        long j;
        C12775o.m28639i(paragraphStyle, "style");
        C12775o.m28639i(layoutDirection, "direction");
        TextAlign r2 = TextAlign.m38341boximpl(paragraphStyle.m37893getTextAlignOrDefaulte0LSkKk$ui_text_release());
        TextDirection r3 = TextDirection.m38354boximpl(TextStyleKt.m38005resolveTextDirectionYj3eThk(layoutDirection, paragraphStyle.m37894getTextDirectionmmuk1to()));
        if (TextUnitKt.m38667isUnspecifiedR2X_6o(paragraphStyle.m37891getLineHeightXSAIIZE())) {
            j = DefaultLineHeight;
        } else {
            j = paragraphStyle.m37891getLineHeightXSAIIZE();
        }
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        LineBreak r9 = LineBreak.m38265boximpl(paragraphStyle.m37890getLineBreakOrDefaultrAG3T2k$ui_text_release());
        Hyphens r10 = Hyphens.m38256boximpl(paragraphStyle.m37888getHyphensOrDefaultvmbZdU8$ui_text_release());
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(r2, r3, j, textIndent2, platformStyle, lineHeightStyle, r9, r10, textMotion, (DefaultConstructorMarker) null);
    }
}
