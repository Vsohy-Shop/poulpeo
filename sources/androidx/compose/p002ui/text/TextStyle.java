package androidx.compose.p002ui.text;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextForegroundStyle;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.text.style.TextMotion;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.TextStyle */
/* compiled from: TextStyle.kt */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194303, (DefaultConstructorMarker) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    @ExperimentalTextApi
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* renamed from: copy-CXVQc50$default  reason: not valid java name */
    public static /* synthetic */ TextStyle m37983copyCXVQc50$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, Object obj) {
        TextStyle textStyle2 = textStyle;
        int i2 = i;
        return textStyle.m37988copyCXVQc50((i2 & 1) != 0 ? textStyle2.spanStyle.m37935getColor0d7_KjU() : j, (i2 & 2) != 0 ? textStyle2.spanStyle.m37936getFontSizeXSAIIZE() : j2, (i2 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : fontWeight, (i2 & 8) != 0 ? textStyle2.spanStyle.m37937getFontStyle4Lr2A7w() : fontStyle, (i2 & 16) != 0 ? textStyle2.spanStyle.m37938getFontSynthesisZQGJjVo() : fontSynthesis, (i2 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : fontFamily, (i2 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : str, (i2 & 128) != 0 ? textStyle2.spanStyle.m37939getLetterSpacingXSAIIZE() : j3, (i2 & 256) != 0 ? textStyle2.spanStyle.m37934getBaselineShift5SSeXJ0() : baselineShift, (i2 & 512) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i2 & 1024) != 0 ? textStyle2.spanStyle.getLocaleList() : localeList, (i2 & 2048) != 0 ? textStyle2.spanStyle.m37933getBackground0d7_KjU() : j4, (i2 & 4096) != 0 ? textStyle2.spanStyle.getTextDecoration() : textDecoration, (i2 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : shadow, (i2 & 16384) != 0 ? textStyle2.paragraphStyle.m37892getTextAlignbuA522U() : textAlign, (i2 & 32768) != 0 ? textStyle2.paragraphStyle.m37894getTextDirectionmmuk1to() : textDirection, (i2 & 65536) != 0 ? textStyle2.paragraphStyle.m37891getLineHeightXSAIIZE() : j5, (i2 & 131072) != 0 ? textStyle2.paragraphStyle.getTextIndent() : textIndent, (i2 & 262144) != 0 ? textStyle2.platformStyle : platformTextStyle, (i2 & 524288) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (i2 & 1048576) != 0 ? textStyle2.paragraphStyle.m37889getLineBreakLgCVezo() : lineBreak, (i2 & 2097152) != 0 ? textStyle2.paragraphStyle.m37887getHyphensEaSxIns() : hyphens);
    }

    /* renamed from: copy-HL5avdY$default  reason: not valid java name */
    public static /* synthetic */ TextStyle m37984copyHL5avdY$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, Object obj) {
        TextStyle textStyle2 = textStyle;
        int i2 = i;
        return textStyle.m37989copyHL5avdY((i2 & 1) != 0 ? textStyle2.spanStyle.m37935getColor0d7_KjU() : j, (i2 & 2) != 0 ? textStyle2.spanStyle.m37936getFontSizeXSAIIZE() : j2, (i2 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : fontWeight, (i2 & 8) != 0 ? textStyle2.spanStyle.m37937getFontStyle4Lr2A7w() : fontStyle, (i2 & 16) != 0 ? textStyle2.spanStyle.m37938getFontSynthesisZQGJjVo() : fontSynthesis, (i2 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : fontFamily, (i2 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : str, (i2 & 128) != 0 ? textStyle2.spanStyle.m37939getLetterSpacingXSAIIZE() : j3, (i2 & 256) != 0 ? textStyle2.spanStyle.m37934getBaselineShift5SSeXJ0() : baselineShift, (i2 & 512) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i2 & 1024) != 0 ? textStyle2.spanStyle.getLocaleList() : localeList, (i2 & 2048) != 0 ? textStyle2.spanStyle.m37933getBackground0d7_KjU() : j4, (i2 & 4096) != 0 ? textStyle2.spanStyle.getTextDecoration() : textDecoration, (i2 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : shadow, (i2 & 16384) != 0 ? textStyle2.paragraphStyle.m37892getTextAlignbuA522U() : textAlign, (i2 & 32768) != 0 ? textStyle2.paragraphStyle.m37894getTextDirectionmmuk1to() : textDirection, (i2 & 65536) != 0 ? textStyle2.paragraphStyle.m37891getLineHeightXSAIIZE() : j5, (i2 & 131072) != 0 ? textStyle2.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default  reason: not valid java name */
    public static /* synthetic */ TextStyle m37985copyNOaFTUo$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        TextStyle textStyle2 = textStyle;
        int i2 = i;
        return textStyle.m37990copyNOaFTUo((i2 & 1) != 0 ? textStyle2.spanStyle.m37935getColor0d7_KjU() : j, (i2 & 2) != 0 ? textStyle2.spanStyle.m37936getFontSizeXSAIIZE() : j2, (i2 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : fontWeight, (i2 & 8) != 0 ? textStyle2.spanStyle.m37937getFontStyle4Lr2A7w() : fontStyle, (i2 & 16) != 0 ? textStyle2.spanStyle.m37938getFontSynthesisZQGJjVo() : fontSynthesis, (i2 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : fontFamily, (i2 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : str, (i2 & 128) != 0 ? textStyle2.spanStyle.m37939getLetterSpacingXSAIIZE() : j3, (i2 & 256) != 0 ? textStyle2.spanStyle.m37934getBaselineShift5SSeXJ0() : baselineShift, (i2 & 512) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i2 & 1024) != 0 ? textStyle2.spanStyle.getLocaleList() : localeList, (i2 & 2048) != 0 ? textStyle2.spanStyle.m37933getBackground0d7_KjU() : j4, (i2 & 4096) != 0 ? textStyle2.spanStyle.getTextDecoration() : textDecoration, (i2 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : shadow, (i2 & 16384) != 0 ? textStyle2.paragraphStyle.m37892getTextAlignbuA522U() : textAlign, (i2 & 32768) != 0 ? textStyle2.paragraphStyle.m37894getTextDirectionmmuk1to() : textDirection, (i2 & 65536) != 0 ? textStyle2.paragraphStyle.m37891getLineHeightXSAIIZE() : j5, (i2 & 131072) != 0 ? textStyle2.paragraphStyle.getTextIndent() : textIndent, (i2 & 262144) != 0 ? textStyle2.platformStyle : platformTextStyle, (i2 & 524288) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : lineHeightStyle);
    }

    /* renamed from: copy-aIRg9q4$default  reason: not valid java name */
    public static /* synthetic */ TextStyle m37986copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        Shadow shadow2;
        DrawStyle drawStyle2;
        DrawStyle drawStyle3;
        TextAlign textAlign2;
        TextAlign textAlign3;
        TextDirection textDirection2;
        long j5;
        TextDirection textDirection3;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        PlatformTextStyle platformTextStyle3;
        LineHeightStyle lineHeightStyle2;
        LineHeightStyle lineHeightStyle3;
        LineBreak lineBreak2;
        LineBreak lineBreak3;
        Hyphens hyphens2;
        TextStyle textStyle2 = textStyle;
        int i2 = i;
        float alpha = (i2 & 2) != 0 ? textStyle2.spanStyle.getAlpha() : f;
        long r3 = (i2 & 4) != 0 ? textStyle2.spanStyle.m37936getFontSizeXSAIIZE() : j;
        FontWeight fontWeight2 = (i2 & 8) != 0 ? textStyle2.spanStyle.getFontWeight() : fontWeight;
        FontStyle r6 = (i2 & 16) != 0 ? textStyle2.spanStyle.m37937getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis r7 = (i2 & 32) != 0 ? textStyle2.spanStyle.m37938getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i2 & 64) != 0 ? textStyle2.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i2 & 128) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : str;
        long r10 = (i2 & 256) != 0 ? textStyle2.spanStyle.m37939getLetterSpacingXSAIIZE() : j2;
        BaselineShift r12 = (i2 & 512) != 0 ? textStyle2.spanStyle.m37934getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i2 & 1024) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i2 & 2048) != 0 ? textStyle2.spanStyle.getLocaleList() : localeList;
        long r17 = (i2 & 4096) != 0 ? textStyle2.spanStyle.m37933getBackground0d7_KjU() : j3;
        TextDecoration textDecoration2 = (i2 & 8192) != 0 ? textStyle2.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i2 & 16384) != 0 ? textStyle2.spanStyle.getShadow() : shadow;
        if ((i2 & 32768) != 0) {
            shadow2 = shadow3;
            drawStyle2 = textStyle2.spanStyle.getDrawStyle();
        } else {
            shadow2 = shadow3;
            drawStyle2 = drawStyle;
        }
        if ((i2 & 65536) != 0) {
            drawStyle3 = drawStyle2;
            textAlign2 = textStyle2.paragraphStyle.m37892getTextAlignbuA522U();
        } else {
            drawStyle3 = drawStyle2;
            textAlign2 = textAlign;
        }
        if ((i2 & 131072) != 0) {
            textAlign3 = textAlign2;
            textDirection2 = textStyle2.paragraphStyle.m37894getTextDirectionmmuk1to();
        } else {
            textAlign3 = textAlign2;
            textDirection2 = textDirection;
        }
        if ((i2 & 262144) != 0) {
            textDirection3 = textDirection2;
            j5 = textStyle2.paragraphStyle.m37891getLineHeightXSAIIZE();
        } else {
            textDirection3 = textDirection2;
            j5 = j4;
        }
        TextIndent textIndent3 = (524288 & i2) != 0 ? textStyle2.paragraphStyle.getTextIndent() : textIndent;
        if ((i2 & 1048576) != 0) {
            textIndent2 = textIndent3;
            platformTextStyle2 = textStyle2.platformStyle;
        } else {
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle;
        }
        if ((i2 & 2097152) != 0) {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = textStyle2.paragraphStyle.getLineHeightStyle();
        } else {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i2 & 4194304) != 0) {
            lineHeightStyle3 = lineHeightStyle2;
            lineBreak2 = textStyle2.paragraphStyle.m37889getLineBreakLgCVezo();
        } else {
            lineHeightStyle3 = lineHeightStyle2;
            lineBreak2 = lineBreak;
        }
        if ((i2 & 8388608) != 0) {
            lineBreak3 = lineBreak2;
            hyphens2 = textStyle2.paragraphStyle.m37887getHyphensEaSxIns();
        } else {
            lineBreak3 = lineBreak2;
            hyphens2 = hyphens;
        }
        return textStyle.m37991copyaIRg9q4(brush, alpha, r3, fontWeight2, r6, r7, fontFamily2, fontFeatureSettings, r10, r12, textGeometricTransform2, localeList2, r17, textDecoration2, shadow2, drawStyle3, textAlign3, textDirection3, j5, textIndent2, platformTextStyle3, lineHeightStyle3, lineBreak3, hyphens2, (i2 & 16777216) != 0 ? textStyle2.paragraphStyle.getTextMotion() : textMotion);
    }

    /* renamed from: copy-v2rsoow$default  reason: not valid java name */
    public static /* synthetic */ TextStyle m37987copyv2rsoow$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextStyle textStyle2 = textStyle;
        int i2 = i;
        return textStyle.m37992copyv2rsoow((i2 & 1) != 0 ? textStyle2.spanStyle.m37935getColor0d7_KjU() : j, (i2 & 2) != 0 ? textStyle2.spanStyle.m37936getFontSizeXSAIIZE() : j2, (i2 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : fontWeight, (i2 & 8) != 0 ? textStyle2.spanStyle.m37937getFontStyle4Lr2A7w() : fontStyle, (i2 & 16) != 0 ? textStyle2.spanStyle.m37938getFontSynthesisZQGJjVo() : fontSynthesis, (i2 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : fontFamily, (i2 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : str, (i2 & 128) != 0 ? textStyle2.spanStyle.m37939getLetterSpacingXSAIIZE() : j3, (i2 & 256) != 0 ? textStyle2.spanStyle.m37934getBaselineShift5SSeXJ0() : baselineShift, (i2 & 512) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i2 & 1024) != 0 ? textStyle2.spanStyle.getLocaleList() : localeList, (i2 & 2048) != 0 ? textStyle2.spanStyle.m37933getBackground0d7_KjU() : j4, (i2 & 4096) != 0 ? textStyle2.spanStyle.getTextDecoration() : textDecoration, (i2 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : shadow, (i2 & 16384) != 0 ? textStyle2.spanStyle.getDrawStyle() : drawStyle, (i2 & 32768) != 0 ? textStyle2.paragraphStyle.m37892getTextAlignbuA522U() : textAlign, (i2 & 65536) != 0 ? textStyle2.paragraphStyle.m37894getTextDirectionmmuk1to() : textDirection, (i2 & 131072) != 0 ? textStyle2.paragraphStyle.m37891getLineHeightXSAIIZE() : j5, (i2 & 262144) != 0 ? textStyle2.paragraphStyle.getTextIndent() : textIndent, (i2 & 524288) != 0 ? textStyle2.platformStyle : platformTextStyle, (i2 & 1048576) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (i2 & 2097152) != 0 ? textStyle2.paragraphStyle.m37889getLineBreakLgCVezo() : lineBreak, (i2 & 4194304) != 0 ? textStyle2.paragraphStyle.m37887getHyphensEaSxIns() : hyphens, (i2 & 8388608) != 0 ? textStyle2.paragraphStyle.getTextMotion() : textMotion);
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    /* renamed from: copy-CXVQc50  reason: not valid java name */
    public final TextStyle m37988copyCXVQc50(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        TextForegroundStyle textForegroundStyle;
        PlatformSpanStyle platformSpanStyle;
        long j6 = j;
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if (Color.m35672equalsimpl0(j6, this.spanStyle.m37935getColor0d7_KjU())) {
            textForegroundStyle = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyle = TextForegroundStyle.Companion.m38368from8_81llA(j6);
        }
        TextForegroundStyle textForegroundStyle2 = textForegroundStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle2 != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle2 = r5;
        SpanStyle spanStyle3 = new SpanStyle(textForegroundStyle2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, getDrawStyle(), (DefaultConstructorMarker) null);
        if (platformTextStyle2 != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, getTextMotion(), (DefaultConstructorMarker) null), platformTextStyle2);
    }

    /* renamed from: copy-HL5avdY  reason: not valid java name */
    public final /* synthetic */ TextStyle m37989copyHL5avdY(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        TextForegroundStyle textForegroundStyle;
        long j6 = j;
        if (Color.m35672equalsimpl0(j6, this.spanStyle.m37935getColor0d7_KjU())) {
            textForegroundStyle = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyle = TextForegroundStyle.Companion.m38368from8_81llA(j6);
        }
        SpanStyle spanStyle2 = r4;
        SpanStyle spanStyle3 = new SpanStyle(textForegroundStyle, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null);
        return new TextStyle(spanStyle2, new ParagraphStyle(textAlign, textDirection, j5, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m38001getLineBreakLgCVezo(), m37999getHyphensEaSxIns(), getTextMotion(), (DefaultConstructorMarker) null), this.platformStyle);
    }

    /* renamed from: copy-NOaFTUo  reason: not valid java name */
    public final /* synthetic */ TextStyle m37990copyNOaFTUo(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        TextForegroundStyle textForegroundStyle;
        PlatformSpanStyle platformSpanStyle;
        long j6 = j;
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if (Color.m35672equalsimpl0(j6, this.spanStyle.m37935getColor0d7_KjU())) {
            textForegroundStyle = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyle = TextForegroundStyle.Companion.m38368from8_81llA(j6);
        }
        TextForegroundStyle textForegroundStyle2 = textForegroundStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle2 != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle2 = r5;
        SpanStyle spanStyle3 = new SpanStyle(textForegroundStyle2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null);
        if (platformTextStyle2 != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle, m38001getLineBreakLgCVezo(), m37999getHyphensEaSxIns(), getTextMotion(), (DefaultConstructorMarker) null), platformTextStyle2);
    }

    @ExperimentalTextApi
    /* renamed from: copy-aIRg9q4  reason: not valid java name */
    public final TextStyle m37991copyaIRg9q4(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        SpanStyle spanStyle2 = r2;
        SpanStyle spanStyle3 = new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle2 != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null);
        if (platformTextStyle2 != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformTextStyle2);
    }

    @ExperimentalTextApi
    /* renamed from: copy-v2rsoow  reason: not valid java name */
    public final TextStyle m37992copyv2rsoow(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        TextForegroundStyle textForegroundStyle;
        long j6 = j;
        PlatformTextStyle platformTextStyle2 = platformTextStyle;
        if (Color.m35672equalsimpl0(j6, this.spanStyle.m37935getColor0d7_KjU())) {
            textForegroundStyle = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            textForegroundStyle = TextForegroundStyle.Companion.m38368from8_81llA(j6);
        }
        TextForegroundStyle textForegroundStyle2 = textForegroundStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        SpanStyle spanStyle2 = r5;
        SpanStyle spanStyle3 = new SpanStyle(textForegroundStyle2, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle2 != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null);
        if (platformTextStyle2 != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(textAlign, textDirection, j5, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformTextStyle2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        if (C12775o.m28634d(this.spanStyle, textStyle.spanStyle) && C12775o.m28634d(this.paragraphStyle, textStyle.paragraphStyle) && C12775o.m28634d(this.platformStyle, textStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    @ExperimentalTextApi
    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m37993getBackground0d7_KjU() {
        return this.spanStyle.m37933getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m37994getBaselineShift5SSeXJ0() {
        return this.spanStyle.m37934getBaselineShift5SSeXJ0();
    }

    @ExperimentalTextApi
    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m37995getColor0d7_KjU() {
        return this.spanStyle.m37935getColor0d7_KjU();
    }

    @ExperimentalTextApi
    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m37996getFontSizeXSAIIZE() {
        return this.spanStyle.m37936getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m37997getFontStyle4Lr2A7w() {
        return this.spanStyle.m37937getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m37998getFontSynthesisZQGJjVo() {
        return this.spanStyle.m37938getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getHyphens-EaSxIns  reason: not valid java name */
    public final Hyphens m37999getHyphensEaSxIns() {
        return this.paragraphStyle.m37887getHyphensEaSxIns();
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m38000getLetterSpacingXSAIIZE() {
        return this.spanStyle.m37939getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineBreak-LgCVezo  reason: not valid java name */
    public final LineBreak m38001getLineBreakLgCVezo() {
        return this.paragraphStyle.m37889getLineBreakLgCVezo();
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m38002getLineHeightXSAIIZE() {
        return this.paragraphStyle.m37891getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m38003getTextAlignbuA522U() {
        return this.paragraphStyle.m37892getTextAlignbuA522U();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m38004getTextDirectionmmuk1to() {
        return this.paragraphStyle.m37894getTextDirectionmmuk1to();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    @ExperimentalTextApi
    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        C12775o.m28639i(textStyle, "other");
        if (this == textStyle || (C12775o.m28634d(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i = platformTextStyle.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int i;
        int hashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i = platformTextStyle.hashCode();
        } else {
            i = 0;
        }
        return hashCodeLayoutAffectingAttributes$ui_text_release + i;
    }

    @Stable
    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || C12775o.m28634d(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    public final TextStyle plus(TextStyle textStyle) {
        C12775o.m28639i(textStyle, "other");
        return merge(textStyle);
    }

    @Stable
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        return "TextStyle(color=" + Color.m35679toStringimpl(m37995getColor0d7_KjU()) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + TextUnit.m38656toStringimpl(m37996getFontSizeXSAIIZE()) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m37997getFontStyle4Lr2A7w() + ", fontSynthesis=" + m37998getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + TextUnit.m38656toStringimpl(m38000getLetterSpacingXSAIIZE()) + ", baselineShift=" + m37994getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + Color.m35679toStringimpl(m37993getBackground0d7_KjU()) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + m38003getTextAlignbuA522U() + ", textDirection=" + m38004getTextDirectionmmuk1to() + ", lineHeight=" + TextUnit.m38656toStringimpl(m38002getLineHeightXSAIIZE()) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + m38001getLineBreakLgCVezo() + ", hyphens=" + m37999getHyphensEaSxIns() + ", textMotion=" + getTextMotion() + ')';
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    public final TextStyle plus(ParagraphStyle paragraphStyle2) {
        C12775o.m28639i(paragraphStyle2, "other");
        return merge(paragraphStyle2);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle);
    }

    @Stable
    public final TextStyle plus(SpanStyle spanStyle2) {
        C12775o.m28639i(spanStyle2, "other");
        return merge(spanStyle2);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    @ExperimentalTextApi
    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, textAlign, textDirection, j4, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle2, ParagraphStyle paragraphStyle2, PlatformTextStyle platformTextStyle) {
        C12775o.m28639i(spanStyle2, "spanStyle");
        C12775o.m28639i(paragraphStyle2, "paragraphStyle");
        this.spanStyle = spanStyle2;
        this.paragraphStyle = paragraphStyle2;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    public final TextStyle merge(SpanStyle spanStyle2) {
        C12775o.m28639i(spanStyle2, "other");
        return new TextStyle(toSpanStyle().merge(spanStyle2), toParagraphStyle());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStyle(SpanStyle spanStyle2, ParagraphStyle paragraphStyle2, PlatformTextStyle platformTextStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanStyle2, paragraphStyle2, (i & 4) != 0 ? null : platformTextStyle);
    }

    @Stable
    public final TextStyle merge(ParagraphStyle paragraphStyle2) {
        C12775o.m28639i(paragraphStyle2, "other");
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextStyle(SpanStyle spanStyle2, ParagraphStyle paragraphStyle2) {
        this(spanStyle2, paragraphStyle2, TextStyleKt.createPlatformTextStyleInternal(spanStyle2.getPlatformStyle(), paragraphStyle2.getPlatformStyle()));
        C12775o.m28639i(spanStyle2, "spanStyle");
        C12775o.m28639i(paragraphStyle2, "paragraphStyle");
    }

    /* renamed from: androidx.compose.ui.text.TextStyle$Companion */
    /* compiled from: TextStyle.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStyle(long r25, long r27, androidx.compose.p002ui.text.font.FontWeight r29, androidx.compose.p002ui.text.font.FontStyle r30, androidx.compose.p002ui.text.font.FontSynthesis r31, androidx.compose.p002ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.p002ui.text.style.BaselineShift r36, androidx.compose.p002ui.text.style.TextGeometricTransform r37, androidx.compose.p002ui.text.intl.LocaleList r38, long r39, androidx.compose.p002ui.text.style.TextDecoration r41, androidx.compose.p002ui.graphics.Shadow r42, androidx.compose.p002ui.text.style.TextAlign r43, androidx.compose.p002ui.text.style.TextDirection r44, long r45, androidx.compose.p002ui.text.style.TextIndent r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r25
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r27
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r29
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r30
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r31
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r32
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r33
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r34
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r36
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r37
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r38
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r39
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r41
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r42
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r43
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x009c
            r20 = 0
            goto L_0x009e
        L_0x009c:
            r20 = r44
        L_0x009e:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ab
            androidx.compose.ui.unit.TextUnit$Companion r21 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r21 = r21.m38660getUnspecifiedXSAIIZE()
            goto L_0x00ad
        L_0x00ab:
            r21 = r45
        L_0x00ad:
            r23 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            goto L_0x00b7
        L_0x00b5:
            r0 = r47
        L_0x00b7:
            r23 = 0
            r49 = r23
            r25 = r24
            r26 = r1
            r28 = r3
            r30 = r5
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r16
            r42 = r18
            r43 = r19
            r44 = r6
            r45 = r20
            r46 = r21
            r48 = r0
            r25.<init>(r26, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r42, r43, r44, r45, r46, r48, r49)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getAlpha$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getBrush$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getDrawStyle$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getTextMotion$annotations() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private TextStyle(long r23, long r25, androidx.compose.p002ui.text.font.FontWeight r27, androidx.compose.p002ui.text.font.FontStyle r28, androidx.compose.p002ui.text.font.FontSynthesis r29, androidx.compose.p002ui.text.font.FontFamily r30, java.lang.String r31, long r32, androidx.compose.p002ui.text.style.BaselineShift r34, androidx.compose.p002ui.text.style.TextGeometricTransform r35, androidx.compose.p002ui.text.intl.LocaleList r36, long r37, androidx.compose.p002ui.text.style.TextDecoration r39, androidx.compose.p002ui.graphics.Shadow r40, androidx.compose.p002ui.text.style.TextAlign r41, androidx.compose.p002ui.text.style.TextDirection r42, long r43, androidx.compose.p002ui.text.style.TextIndent r45) {
        /*
            r22 = this;
            r1 = r23
            r3 = r25
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r39
            r18 = r40
            androidx.compose.ui.text.SpanStyle r0 = new androidx.compose.ui.text.SpanStyle
            r23 = r0
            r19 = 0
            r20 = 0
            r21 = 0
            r0.<init>((long) r1, (long) r3, (androidx.compose.p002ui.text.font.FontWeight) r5, (androidx.compose.p002ui.text.font.FontStyle) r6, (androidx.compose.p002ui.text.font.FontSynthesis) r7, (androidx.compose.p002ui.text.font.FontFamily) r8, (java.lang.String) r9, (long) r10, (androidx.compose.p002ui.text.style.BaselineShift) r12, (androidx.compose.p002ui.text.style.TextGeometricTransform) r13, (androidx.compose.p002ui.text.intl.LocaleList) r14, (long) r15, (androidx.compose.p002ui.text.style.TextDecoration) r17, (androidx.compose.p002ui.graphics.Shadow) r18, (androidx.compose.p002ui.text.PlatformSpanStyle) r19, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r20, (kotlin.jvm.internal.DefaultConstructorMarker) r21)
            androidx.compose.ui.text.ParagraphStyle r0 = new androidx.compose.ui.text.ParagraphStyle
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r24 = r0
            r25 = r41
            r26 = r42
            r27 = r43
            r29 = r45
            r30 = r1
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r24.<init>((androidx.compose.p002ui.text.style.TextAlign) r25, (androidx.compose.p002ui.text.style.TextDirection) r26, (long) r27, (androidx.compose.p002ui.text.style.TextIndent) r29, (androidx.compose.p002ui.text.PlatformParagraphStyle) r30, (androidx.compose.p002ui.text.style.LineHeightStyle) r31, (androidx.compose.p002ui.text.style.LineBreak) r32, (androidx.compose.p002ui.text.style.Hyphens) r33, (androidx.compose.p002ui.text.style.TextMotion) r34, (kotlin.jvm.internal.DefaultConstructorMarker) r35)
            r2 = r22
            r3 = r23
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStyle(long r27, long r29, androidx.compose.p002ui.text.font.FontWeight r31, androidx.compose.p002ui.text.font.FontStyle r32, androidx.compose.p002ui.text.font.FontSynthesis r33, androidx.compose.p002ui.text.font.FontFamily r34, java.lang.String r35, long r36, androidx.compose.p002ui.text.style.BaselineShift r38, androidx.compose.p002ui.text.style.TextGeometricTransform r39, androidx.compose.p002ui.text.intl.LocaleList r40, long r41, androidx.compose.p002ui.text.style.TextDecoration r43, androidx.compose.p002ui.graphics.Shadow r44, androidx.compose.p002ui.text.style.TextAlign r45, androidx.compose.p002ui.text.style.TextDirection r46, long r47, androidx.compose.p002ui.text.style.TextIndent r49, androidx.compose.p002ui.text.PlatformTextStyle r50, androidx.compose.p002ui.text.style.LineHeightStyle r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            r26 = this;
            r0 = r52
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r27
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r29
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r31
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r32
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r33
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r34
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r35
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r36
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r38
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r39
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r40
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r41
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r43
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r44
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r45
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x009c
            r20 = 0
            goto L_0x009e
        L_0x009c:
            r20 = r46
        L_0x009e:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ab
            androidx.compose.ui.unit.TextUnit$Companion r21 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r21 = r21.m38660getUnspecifiedXSAIIZE()
            goto L_0x00ad
        L_0x00ab:
            r21 = r47
        L_0x00ad:
            r23 = 131072(0x20000, float:1.83671E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00b6
            r23 = 0
            goto L_0x00b8
        L_0x00b6:
            r23 = r49
        L_0x00b8:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c1
            r24 = 0
            goto L_0x00c3
        L_0x00c1:
            r24 = r50
        L_0x00c3:
            r25 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00cb
            r0 = 0
            goto L_0x00cd
        L_0x00cb:
            r0 = r51
        L_0x00cd:
            r25 = 0
            r53 = r25
            r27 = r26
            r28 = r1
            r30 = r3
            r32 = r5
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r37 = r11
            r39 = r13
            r40 = r14
            r41 = r15
            r42 = r16
            r44 = r18
            r45 = r19
            r46 = r6
            r47 = r20
            r48 = r21
            r50 = r23
            r51 = r24
            r52 = r0
            r27.<init>(r28, r30, r32, r33, r34, r35, r36, r37, r39, r40, r41, r42, r44, r45, r46, r47, r48, r50, r51, r52, r53)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private TextStyle(long r26, long r28, androidx.compose.p002ui.text.font.FontWeight r30, androidx.compose.p002ui.text.font.FontStyle r31, androidx.compose.p002ui.text.font.FontSynthesis r32, androidx.compose.p002ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.p002ui.text.style.BaselineShift r37, androidx.compose.p002ui.text.style.TextGeometricTransform r38, androidx.compose.p002ui.text.intl.LocaleList r39, long r40, androidx.compose.p002ui.text.style.TextDecoration r42, androidx.compose.p002ui.graphics.Shadow r43, androidx.compose.p002ui.text.style.TextAlign r44, androidx.compose.p002ui.text.style.TextDirection r45, long r46, androidx.compose.p002ui.text.style.TextIndent r48, androidx.compose.p002ui.text.PlatformTextStyle r49, androidx.compose.p002ui.text.style.LineHeightStyle r50) {
        /*
            r25 = this;
            r0 = r49
            androidx.compose.ui.text.SpanStyle r15 = new androidx.compose.ui.text.SpanStyle
            r23 = 0
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.text.PlatformSpanStyle r1 = r49.getSpanStyle()
            r20 = r1
            goto L_0x0011
        L_0x000f:
            r20 = r23
        L_0x0011:
            r21 = 0
            r22 = 0
            r1 = r15
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r1.<init>((long) r2, (long) r4, (androidx.compose.p002ui.text.font.FontWeight) r6, (androidx.compose.p002ui.text.font.FontStyle) r7, (androidx.compose.p002ui.text.font.FontSynthesis) r8, (androidx.compose.p002ui.text.font.FontFamily) r9, (java.lang.String) r10, (long) r11, (androidx.compose.p002ui.text.style.BaselineShift) r13, (androidx.compose.p002ui.text.style.TextGeometricTransform) r14, (androidx.compose.p002ui.text.intl.LocaleList) r15, (long) r16, (androidx.compose.p002ui.text.style.TextDecoration) r18, (androidx.compose.p002ui.graphics.Shadow) r19, (androidx.compose.p002ui.text.PlatformSpanStyle) r20, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.text.PlatformParagraphStyle r23 = r49.getParagraphStyle()
        L_0x003f:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r26 = r1
            r27 = r44
            r28 = r45
            r29 = r46
            r31 = r48
            r32 = r23
            r33 = r50
            r34 = r2
            r35 = r3
            r36 = r4
            r37 = r5
            r26.<init>((androidx.compose.p002ui.text.style.TextAlign) r27, (androidx.compose.p002ui.text.style.TextDirection) r28, (long) r29, (androidx.compose.p002ui.text.style.TextIndent) r31, (androidx.compose.p002ui.text.PlatformParagraphStyle) r32, (androidx.compose.p002ui.text.style.LineHeightStyle) r33, (androidx.compose.p002ui.text.style.LineBreak) r34, (androidx.compose.p002ui.text.style.Hyphens) r35, (androidx.compose.p002ui.text.style.TextMotion) r36, (kotlin.jvm.internal.DefaultConstructorMarker) r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStyle(long r29, long r31, androidx.compose.p002ui.text.font.FontWeight r33, androidx.compose.p002ui.text.font.FontStyle r34, androidx.compose.p002ui.text.font.FontSynthesis r35, androidx.compose.p002ui.text.font.FontFamily r36, java.lang.String r37, long r38, androidx.compose.p002ui.text.style.BaselineShift r40, androidx.compose.p002ui.text.style.TextGeometricTransform r41, androidx.compose.p002ui.text.intl.LocaleList r42, long r43, androidx.compose.p002ui.text.style.TextDecoration r45, androidx.compose.p002ui.graphics.Shadow r46, androidx.compose.p002ui.text.style.TextAlign r47, androidx.compose.p002ui.text.style.TextDirection r48, long r49, androidx.compose.p002ui.text.style.TextIndent r51, androidx.compose.p002ui.text.PlatformTextStyle r52, androidx.compose.p002ui.text.style.LineHeightStyle r53, androidx.compose.p002ui.text.style.LineBreak r54, androidx.compose.p002ui.text.style.Hyphens r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            r28 = this;
            r0 = r56
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r29
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r31
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r33
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r34
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r35
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r36
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r37
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r38
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r40
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r41
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r42
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r43
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r45
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r46
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r47
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x009c
            r20 = 0
            goto L_0x009e
        L_0x009c:
            r20 = r48
        L_0x009e:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ab
            androidx.compose.ui.unit.TextUnit$Companion r21 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r21 = r21.m38660getUnspecifiedXSAIIZE()
            goto L_0x00ad
        L_0x00ab:
            r21 = r49
        L_0x00ad:
            r23 = 131072(0x20000, float:1.83671E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00b6
            r23 = 0
            goto L_0x00b8
        L_0x00b6:
            r23 = r51
        L_0x00b8:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c1
            r24 = 0
            goto L_0x00c3
        L_0x00c1:
            r24 = r52
        L_0x00c3:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00cc
            r25 = 0
            goto L_0x00ce
        L_0x00cc:
            r25 = r53
        L_0x00ce:
            r26 = 1048576(0x100000, float:1.469368E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00d7
            r26 = 0
            goto L_0x00d9
        L_0x00d7:
            r26 = r54
        L_0x00d9:
            r27 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r27
            if (r0 == 0) goto L_0x00e1
            r0 = 0
            goto L_0x00e3
        L_0x00e1:
            r0 = r55
        L_0x00e3:
            r27 = 0
            r57 = r27
            r29 = r28
            r30 = r1
            r32 = r3
            r34 = r5
            r35 = r7
            r36 = r8
            r37 = r9
            r38 = r10
            r39 = r11
            r41 = r13
            r42 = r14
            r43 = r15
            r44 = r16
            r46 = r18
            r47 = r19
            r48 = r6
            r49 = r20
            r50 = r21
            r52 = r23
            r53 = r24
            r54 = r25
            r55 = r26
            r56 = r0
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r46, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private TextStyle(long r25, long r27, androidx.compose.p002ui.text.font.FontWeight r29, androidx.compose.p002ui.text.font.FontStyle r30, androidx.compose.p002ui.text.font.FontSynthesis r31, androidx.compose.p002ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.p002ui.text.style.BaselineShift r36, androidx.compose.p002ui.text.style.TextGeometricTransform r37, androidx.compose.p002ui.text.intl.LocaleList r38, long r39, androidx.compose.p002ui.text.style.TextDecoration r41, androidx.compose.p002ui.graphics.Shadow r42, androidx.compose.p002ui.text.style.TextAlign r43, androidx.compose.p002ui.text.style.TextDirection r44, long r45, androidx.compose.p002ui.text.style.TextIndent r47, androidx.compose.p002ui.text.PlatformTextStyle r48, androidx.compose.p002ui.text.style.LineHeightStyle r49, androidx.compose.p002ui.text.style.LineBreak r50, androidx.compose.p002ui.text.style.Hyphens r51) {
        /*
            r24 = this;
            r0 = r48
            androidx.compose.ui.text.SpanStyle r15 = new androidx.compose.ui.text.SpanStyle
            r22 = 0
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.text.PlatformSpanStyle r1 = r48.getSpanStyle()
            r20 = r1
            goto L_0x0011
        L_0x000f:
            r20 = r22
        L_0x0011:
            r21 = 0
            r1 = r15
            r2 = r25
            r4 = r27
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r13 = r36
            r14 = r37
            r23 = r15
            r15 = r38
            r16 = r39
            r18 = r41
            r19 = r42
            r1.<init>((long) r2, (long) r4, (androidx.compose.p002ui.text.font.FontWeight) r6, (androidx.compose.p002ui.text.font.FontStyle) r7, (androidx.compose.p002ui.text.font.FontSynthesis) r8, (androidx.compose.p002ui.text.font.FontFamily) r9, (java.lang.String) r10, (long) r11, (androidx.compose.p002ui.text.style.BaselineShift) r13, (androidx.compose.p002ui.text.style.TextGeometricTransform) r14, (androidx.compose.p002ui.text.intl.LocaleList) r15, (long) r16, (androidx.compose.p002ui.text.style.TextDecoration) r18, (androidx.compose.p002ui.graphics.Shadow) r19, (androidx.compose.p002ui.text.PlatformSpanStyle) r20, (kotlin.jvm.internal.DefaultConstructorMarker) r21)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r0 == 0) goto L_0x003d
            androidx.compose.ui.text.PlatformParagraphStyle r22 = r48.getParagraphStyle()
        L_0x003d:
            r2 = 0
            r25 = r1
            r26 = r43
            r27 = r44
            r28 = r45
            r30 = r47
            r31 = r22
            r32 = r49
            r33 = r50
            r34 = r51
            r35 = r2
            r25.<init>((androidx.compose.p002ui.text.style.TextAlign) r26, (androidx.compose.p002ui.text.style.TextDirection) r27, (long) r28, (androidx.compose.p002ui.text.style.TextIndent) r30, (androidx.compose.p002ui.text.PlatformParagraphStyle) r31, (androidx.compose.p002ui.text.style.LineHeightStyle) r32, (androidx.compose.p002ui.text.style.LineBreak) r33, (androidx.compose.p002ui.text.style.Hyphens) r34, (kotlin.jvm.internal.DefaultConstructorMarker) r35)
            r2 = r24
            r3 = r23
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStyle(long r31, long r33, androidx.compose.p002ui.text.font.FontWeight r35, androidx.compose.p002ui.text.font.FontStyle r36, androidx.compose.p002ui.text.font.FontSynthesis r37, androidx.compose.p002ui.text.font.FontFamily r38, java.lang.String r39, long r40, androidx.compose.p002ui.text.style.BaselineShift r42, androidx.compose.p002ui.text.style.TextGeometricTransform r43, androidx.compose.p002ui.text.intl.LocaleList r44, long r45, androidx.compose.p002ui.text.style.TextDecoration r47, androidx.compose.p002ui.graphics.Shadow r48, androidx.compose.p002ui.graphics.drawscope.DrawStyle r49, androidx.compose.p002ui.text.style.TextAlign r50, androidx.compose.p002ui.text.style.TextDirection r51, long r52, androidx.compose.p002ui.text.style.TextIndent r54, androidx.compose.p002ui.text.PlatformTextStyle r55, androidx.compose.p002ui.text.style.LineHeightStyle r56, androidx.compose.p002ui.text.style.LineBreak r57, androidx.compose.p002ui.text.style.Hyphens r58, androidx.compose.p002ui.text.style.TextMotion r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            r30 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r31
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r33
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r35
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r36
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r37
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r38
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r39
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r40
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r42
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r43
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r44
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r45
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r47
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r48
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r49
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x009c
            r20 = 0
            goto L_0x009e
        L_0x009c:
            r20 = r50
        L_0x009e:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00a7
            r21 = 0
            goto L_0x00a9
        L_0x00a7:
            r21 = r51
        L_0x00a9:
            r22 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00b6
            androidx.compose.ui.unit.TextUnit$Companion r22 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r22 = r22.m38660getUnspecifiedXSAIIZE()
            goto L_0x00b8
        L_0x00b6:
            r22 = r52
        L_0x00b8:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c1
            r24 = 0
            goto L_0x00c3
        L_0x00c1:
            r24 = r54
        L_0x00c3:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00cc
            r25 = 0
            goto L_0x00ce
        L_0x00cc:
            r25 = r55
        L_0x00ce:
            r26 = 1048576(0x100000, float:1.469368E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00d7
            r26 = 0
            goto L_0x00d9
        L_0x00d7:
            r26 = r56
        L_0x00d9:
            r27 = 2097152(0x200000, float:2.938736E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00e2
            r27 = 0
            goto L_0x00e4
        L_0x00e2:
            r27 = r57
        L_0x00e4:
            r28 = 4194304(0x400000, float:5.877472E-39)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00ed
            r28 = 0
            goto L_0x00ef
        L_0x00ed:
            r28 = r58
        L_0x00ef:
            r29 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r29
            if (r0 == 0) goto L_0x00f7
            r0 = 0
            goto L_0x00f9
        L_0x00f7:
            r0 = r59
        L_0x00f9:
            r29 = 0
            r61 = r29
            r31 = r30
            r32 = r1
            r34 = r3
            r36 = r5
            r37 = r7
            r38 = r8
            r39 = r9
            r40 = r10
            r41 = r11
            r43 = r13
            r44 = r14
            r45 = r15
            r46 = r16
            r48 = r18
            r49 = r19
            r50 = r6
            r51 = r20
            r52 = r21
            r53 = r22
            r55 = r24
            r56 = r25
            r57 = r26
            r58 = r27
            r59 = r28
            r60 = r0
            r31.<init>((long) r32, (long) r34, (androidx.compose.p002ui.text.font.FontWeight) r36, (androidx.compose.p002ui.text.font.FontStyle) r37, (androidx.compose.p002ui.text.font.FontSynthesis) r38, (androidx.compose.p002ui.text.font.FontFamily) r39, (java.lang.String) r40, (long) r41, (androidx.compose.p002ui.text.style.BaselineShift) r43, (androidx.compose.p002ui.text.style.TextGeometricTransform) r44, (androidx.compose.p002ui.text.intl.LocaleList) r45, (long) r46, (androidx.compose.p002ui.text.style.TextDecoration) r48, (androidx.compose.p002ui.graphics.Shadow) r49, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r50, (androidx.compose.p002ui.text.style.TextAlign) r51, (androidx.compose.p002ui.text.style.TextDirection) r52, (long) r53, (androidx.compose.p002ui.text.style.TextIndent) r55, (androidx.compose.p002ui.text.PlatformTextStyle) r56, (androidx.compose.p002ui.text.style.LineHeightStyle) r57, (androidx.compose.p002ui.text.style.LineBreak) r58, (androidx.compose.p002ui.text.style.Hyphens) r59, (androidx.compose.p002ui.text.style.TextMotion) r60, (kotlin.jvm.internal.DefaultConstructorMarker) r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private TextStyle(long r26, long r28, androidx.compose.p002ui.text.font.FontWeight r30, androidx.compose.p002ui.text.font.FontStyle r31, androidx.compose.p002ui.text.font.FontSynthesis r32, androidx.compose.p002ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.p002ui.text.style.BaselineShift r37, androidx.compose.p002ui.text.style.TextGeometricTransform r38, androidx.compose.p002ui.text.intl.LocaleList r39, long r40, androidx.compose.p002ui.text.style.TextDecoration r42, androidx.compose.p002ui.graphics.Shadow r43, androidx.compose.p002ui.graphics.drawscope.DrawStyle r44, androidx.compose.p002ui.text.style.TextAlign r45, androidx.compose.p002ui.text.style.TextDirection r46, long r47, androidx.compose.p002ui.text.style.TextIndent r49, androidx.compose.p002ui.text.PlatformTextStyle r50, androidx.compose.p002ui.text.style.LineHeightStyle r51, androidx.compose.p002ui.text.style.LineBreak r52, androidx.compose.p002ui.text.style.Hyphens r53, androidx.compose.p002ui.text.style.TextMotion r54) {
        /*
            r25 = this;
            r0 = r50
            androidx.compose.ui.text.SpanStyle r15 = new androidx.compose.ui.text.SpanStyle
            r23 = 0
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.text.PlatformSpanStyle r1 = r50.getSpanStyle()
            r20 = r1
            goto L_0x0011
        L_0x000f:
            r20 = r23
        L_0x0011:
            r22 = 0
            r1 = r15
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r21 = r44
            r1.<init>((long) r2, (long) r4, (androidx.compose.p002ui.text.font.FontWeight) r6, (androidx.compose.p002ui.text.font.FontStyle) r7, (androidx.compose.p002ui.text.font.FontSynthesis) r8, (androidx.compose.p002ui.text.font.FontFamily) r9, (java.lang.String) r10, (long) r11, (androidx.compose.p002ui.text.style.BaselineShift) r13, (androidx.compose.p002ui.text.style.TextGeometricTransform) r14, (androidx.compose.p002ui.text.intl.LocaleList) r15, (long) r16, (androidx.compose.p002ui.text.style.TextDecoration) r18, (androidx.compose.p002ui.graphics.Shadow) r19, (androidx.compose.p002ui.text.PlatformSpanStyle) r20, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.text.PlatformParagraphStyle r23 = r50.getParagraphStyle()
        L_0x003f:
            r2 = 0
            r26 = r1
            r27 = r45
            r28 = r46
            r29 = r47
            r31 = r49
            r32 = r23
            r33 = r51
            r34 = r52
            r35 = r53
            r36 = r54
            r37 = r2
            r26.<init>((androidx.compose.p002ui.text.style.TextAlign) r27, (androidx.compose.p002ui.text.style.TextDirection) r28, (long) r29, (androidx.compose.p002ui.text.style.TextIndent) r31, (androidx.compose.p002ui.text.PlatformParagraphStyle) r32, (androidx.compose.p002ui.text.style.LineHeightStyle) r33, (androidx.compose.p002ui.text.style.LineBreak) r34, (androidx.compose.p002ui.text.style.Hyphens) r35, (androidx.compose.p002ui.text.style.TextMotion) r36, (kotlin.jvm.internal.DefaultConstructorMarker) r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStyle(androidx.compose.p002ui.graphics.Brush r34, float r35, long r36, androidx.compose.p002ui.text.font.FontWeight r38, androidx.compose.p002ui.text.font.FontStyle r39, androidx.compose.p002ui.text.font.FontSynthesis r40, androidx.compose.p002ui.text.font.FontFamily r41, java.lang.String r42, long r43, androidx.compose.p002ui.text.style.BaselineShift r45, androidx.compose.p002ui.text.style.TextGeometricTransform r46, androidx.compose.p002ui.text.intl.LocaleList r47, long r48, androidx.compose.p002ui.text.style.TextDecoration r50, androidx.compose.p002ui.graphics.Shadow r51, androidx.compose.p002ui.graphics.drawscope.DrawStyle r52, androidx.compose.p002ui.text.style.TextAlign r53, androidx.compose.p002ui.text.style.TextDirection r54, long r55, androidx.compose.p002ui.text.style.TextIndent r57, androidx.compose.p002ui.text.PlatformTextStyle r58, androidx.compose.p002ui.text.style.LineHeightStyle r59, androidx.compose.p002ui.text.style.LineBreak r60, androidx.compose.p002ui.text.style.Hyphens r61, androidx.compose.p002ui.text.style.TextMotion r62, int r63, kotlin.jvm.internal.DefaultConstructorMarker r64) {
        /*
            r33 = this;
            r0 = r63
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r35
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0018
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r1 = r1.m38660getUnspecifiedXSAIIZE()
            r5 = r1
            goto L_0x001a
        L_0x0018:
            r5 = r36
        L_0x001a:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r38
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r39
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r40
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0039
            r10 = r2
            goto L_0x003b
        L_0x0039:
            r10 = r41
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r42
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004e
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r12 = r1.m38660getUnspecifiedXSAIIZE()
            goto L_0x0050
        L_0x004e:
            r12 = r43
        L_0x0050:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0056
            r14 = r2
            goto L_0x0058
        L_0x0056:
            r14 = r45
        L_0x0058:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005e
            r15 = r2
            goto L_0x0060
        L_0x005e:
            r15 = r46
        L_0x0060:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0067
            r16 = r2
            goto L_0x0069
        L_0x0067:
            r16 = r47
        L_0x0069:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r17 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r17 = r48
        L_0x0076:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007d
            r19 = r2
            goto L_0x007f
        L_0x007d:
            r19 = r50
        L_0x007f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0086
            r20 = r2
            goto L_0x0088
        L_0x0086:
            r20 = r51
        L_0x0088:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0091
            r21 = r2
            goto L_0x0093
        L_0x0091:
            r21 = r52
        L_0x0093:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009b
            r22 = r2
            goto L_0x009d
        L_0x009b:
            r22 = r53
        L_0x009d:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a5
            r23 = r2
            goto L_0x00a7
        L_0x00a5:
            r23 = r54
        L_0x00a7:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b3
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r24 = r1.m38660getUnspecifiedXSAIIZE()
            goto L_0x00b5
        L_0x00b3:
            r24 = r55
        L_0x00b5:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bd
            r26 = r2
            goto L_0x00bf
        L_0x00bd:
            r26 = r57
        L_0x00bf:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c7
            r27 = r2
            goto L_0x00c9
        L_0x00c7:
            r27 = r58
        L_0x00c9:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d1
            r28 = r2
            goto L_0x00d3
        L_0x00d1:
            r28 = r59
        L_0x00d3:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00db
            r29 = r2
            goto L_0x00dd
        L_0x00db:
            r29 = r60
        L_0x00dd:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e5
            r30 = r2
            goto L_0x00e7
        L_0x00e5:
            r30 = r61
        L_0x00e7:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00ef
            r31 = r2
            goto L_0x00f1
        L_0x00ef:
            r31 = r62
        L_0x00f1:
            r32 = 0
            r2 = r33
            r3 = r34
            r2.<init>((androidx.compose.p002ui.graphics.Brush) r3, (float) r4, (long) r5, (androidx.compose.p002ui.text.font.FontWeight) r7, (androidx.compose.p002ui.text.font.FontStyle) r8, (androidx.compose.p002ui.text.font.FontSynthesis) r9, (androidx.compose.p002ui.text.font.FontFamily) r10, (java.lang.String) r11, (long) r12, (androidx.compose.p002ui.text.style.BaselineShift) r14, (androidx.compose.p002ui.text.style.TextGeometricTransform) r15, (androidx.compose.p002ui.text.intl.LocaleList) r16, (long) r17, (androidx.compose.p002ui.text.style.TextDecoration) r19, (androidx.compose.p002ui.graphics.Shadow) r20, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r21, (androidx.compose.p002ui.text.style.TextAlign) r22, (androidx.compose.p002ui.text.style.TextDirection) r23, (long) r24, (androidx.compose.p002ui.text.style.TextIndent) r26, (androidx.compose.p002ui.text.PlatformTextStyle) r27, (androidx.compose.p002ui.text.style.LineHeightStyle) r28, (androidx.compose.p002ui.text.style.LineBreak) r29, (androidx.compose.p002ui.text.style.Hyphens) r30, (androidx.compose.p002ui.text.style.TextMotion) r31, (kotlin.jvm.internal.DefaultConstructorMarker) r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private TextStyle(androidx.compose.p002ui.graphics.Brush r26, float r27, long r28, androidx.compose.p002ui.text.font.FontWeight r30, androidx.compose.p002ui.text.font.FontStyle r31, androidx.compose.p002ui.text.font.FontSynthesis r32, androidx.compose.p002ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.p002ui.text.style.BaselineShift r37, androidx.compose.p002ui.text.style.TextGeometricTransform r38, androidx.compose.p002ui.text.intl.LocaleList r39, long r40, androidx.compose.p002ui.text.style.TextDecoration r42, androidx.compose.p002ui.graphics.Shadow r43, androidx.compose.p002ui.graphics.drawscope.DrawStyle r44, androidx.compose.p002ui.text.style.TextAlign r45, androidx.compose.p002ui.text.style.TextDirection r46, long r47, androidx.compose.p002ui.text.style.TextIndent r49, androidx.compose.p002ui.text.PlatformTextStyle r50, androidx.compose.p002ui.text.style.LineHeightStyle r51, androidx.compose.p002ui.text.style.LineBreak r52, androidx.compose.p002ui.text.style.Hyphens r53, androidx.compose.p002ui.text.style.TextMotion r54) {
        /*
            r25 = this;
            r0 = r50
            androidx.compose.ui.text.SpanStyle r15 = new androidx.compose.ui.text.SpanStyle
            r23 = 0
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.text.PlatformSpanStyle r1 = r50.getSpanStyle()
            r20 = r1
            goto L_0x0011
        L_0x000f:
            r20 = r23
        L_0x0011:
            r22 = 0
            r1 = r15
            r2 = r26
            r3 = r27
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r21 = r44
            r1.<init>((androidx.compose.p002ui.graphics.Brush) r2, (float) r3, (long) r4, (androidx.compose.p002ui.text.font.FontWeight) r6, (androidx.compose.p002ui.text.font.FontStyle) r7, (androidx.compose.p002ui.text.font.FontSynthesis) r8, (androidx.compose.p002ui.text.font.FontFamily) r9, (java.lang.String) r10, (long) r11, (androidx.compose.p002ui.text.style.BaselineShift) r13, (androidx.compose.p002ui.text.style.TextGeometricTransform) r14, (androidx.compose.p002ui.text.intl.LocaleList) r15, (long) r16, (androidx.compose.p002ui.text.style.TextDecoration) r18, (androidx.compose.p002ui.graphics.Shadow) r19, (androidx.compose.p002ui.text.PlatformSpanStyle) r20, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r0 == 0) goto L_0x0041
            androidx.compose.ui.text.PlatformParagraphStyle r23 = r50.getParagraphStyle()
        L_0x0041:
            r2 = 0
            r26 = r1
            r27 = r45
            r28 = r46
            r29 = r47
            r31 = r49
            r32 = r23
            r33 = r51
            r34 = r52
            r35 = r53
            r36 = r54
            r37 = r2
            r26.<init>((androidx.compose.p002ui.text.style.TextAlign) r27, (androidx.compose.p002ui.text.style.TextDirection) r28, (long) r29, (androidx.compose.p002ui.text.style.TextIndent) r31, (androidx.compose.p002ui.text.PlatformParagraphStyle) r32, (androidx.compose.p002ui.text.style.LineHeightStyle) r33, (androidx.compose.p002ui.text.style.LineBreak) r34, (androidx.compose.p002ui.text.style.Hyphens) r35, (androidx.compose.p002ui.text.style.TextMotion) r36, (kotlin.jvm.internal.DefaultConstructorMarker) r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyle.<init>(androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion):void");
    }
}
