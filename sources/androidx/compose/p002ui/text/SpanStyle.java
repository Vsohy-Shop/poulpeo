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
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextForegroundStyle;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyle\n*L\n442#1:857\n442#1:858\n*E\n"})
/* renamed from: androidx.compose.ui.text.SpanStyle */
/* compiled from: SpanStyle.kt */
public final class SpanStyle {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    @ExperimentalTextApi
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformSpanStyle, drawStyle2);
    }

    /* renamed from: copy-2BkPm_w$default  reason: not valid java name */
    public static /* synthetic */ SpanStyle m37925copy2BkPm_w$default(SpanStyle spanStyle, long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, int i, Object obj) {
        long j5;
        long j6;
        FontWeight fontWeight3;
        FontStyle fontStyle3;
        FontSynthesis fontSynthesis3;
        FontFamily fontFamily3;
        String str2;
        long j7;
        BaselineShift baselineShift3;
        TextGeometricTransform textGeometricTransform3;
        LocaleList localeList3;
        long j8;
        TextDecoration textDecoration3;
        Shadow shadow3;
        PlatformSpanStyle platformSpanStyle2;
        SpanStyle spanStyle2 = spanStyle;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j5 = spanStyle.m37935getColor0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = spanStyle2.fontSize;
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            fontWeight3 = spanStyle2.fontWeight;
        } else {
            fontWeight3 = fontWeight2;
        }
        if ((i2 & 8) != 0) {
            fontStyle3 = spanStyle2.fontStyle;
        } else {
            fontStyle3 = fontStyle2;
        }
        if ((i2 & 16) != 0) {
            fontSynthesis3 = spanStyle2.fontSynthesis;
        } else {
            fontSynthesis3 = fontSynthesis2;
        }
        if ((i2 & 32) != 0) {
            fontFamily3 = spanStyle2.fontFamily;
        } else {
            fontFamily3 = fontFamily2;
        }
        if ((i2 & 64) != 0) {
            str2 = spanStyle2.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i2 & 128) != 0) {
            j7 = spanStyle2.letterSpacing;
        } else {
            j7 = j3;
        }
        if ((i2 & 256) != 0) {
            baselineShift3 = spanStyle2.baselineShift;
        } else {
            baselineShift3 = baselineShift2;
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform3 = spanStyle2.textGeometricTransform;
        } else {
            textGeometricTransform3 = textGeometricTransform2;
        }
        if ((i2 & 1024) != 0) {
            localeList3 = spanStyle2.localeList;
        } else {
            localeList3 = localeList2;
        }
        LocaleList localeList4 = localeList3;
        TextGeometricTransform textGeometricTransform4 = textGeometricTransform3;
        if ((i2 & 2048) != 0) {
            j8 = spanStyle2.background;
        } else {
            j8 = j4;
        }
        long j9 = j8;
        if ((i2 & 4096) != 0) {
            textDecoration3 = spanStyle2.textDecoration;
        } else {
            textDecoration3 = textDecoration2;
        }
        if ((i2 & 8192) != 0) {
            shadow3 = spanStyle2.shadow;
        } else {
            shadow3 = shadow2;
        }
        if ((i2 & 16384) != 0) {
            platformSpanStyle2 = spanStyle2.platformStyle;
        } else {
            platformSpanStyle2 = platformSpanStyle;
        }
        return spanStyle.m37929copy2BkPm_w(j5, j6, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str2, j7, baselineShift3, textGeometricTransform4, localeList4, j9, textDecoration3, shadow3, platformSpanStyle2);
    }

    /* renamed from: copy-GSF8kmg$default  reason: not valid java name */
    public static /* synthetic */ SpanStyle m37926copyGSF8kmg$default(SpanStyle spanStyle, long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2, int i, Object obj) {
        long j5;
        long j6;
        FontWeight fontWeight3;
        FontStyle fontStyle3;
        FontSynthesis fontSynthesis3;
        FontFamily fontFamily3;
        String str2;
        long j7;
        BaselineShift baselineShift3;
        TextGeometricTransform textGeometricTransform3;
        LocaleList localeList3;
        long j8;
        TextDecoration textDecoration3;
        Shadow shadow3;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle3;
        SpanStyle spanStyle2 = spanStyle;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j5 = spanStyle.m37935getColor0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = spanStyle2.fontSize;
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            fontWeight3 = spanStyle2.fontWeight;
        } else {
            fontWeight3 = fontWeight2;
        }
        if ((i2 & 8) != 0) {
            fontStyle3 = spanStyle2.fontStyle;
        } else {
            fontStyle3 = fontStyle2;
        }
        if ((i2 & 16) != 0) {
            fontSynthesis3 = spanStyle2.fontSynthesis;
        } else {
            fontSynthesis3 = fontSynthesis2;
        }
        if ((i2 & 32) != 0) {
            fontFamily3 = spanStyle2.fontFamily;
        } else {
            fontFamily3 = fontFamily2;
        }
        if ((i2 & 64) != 0) {
            str2 = spanStyle2.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i2 & 128) != 0) {
            j7 = spanStyle2.letterSpacing;
        } else {
            j7 = j3;
        }
        if ((i2 & 256) != 0) {
            baselineShift3 = spanStyle2.baselineShift;
        } else {
            baselineShift3 = baselineShift2;
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform3 = spanStyle2.textGeometricTransform;
        } else {
            textGeometricTransform3 = textGeometricTransform2;
        }
        if ((i2 & 1024) != 0) {
            localeList3 = spanStyle2.localeList;
        } else {
            localeList3 = localeList2;
        }
        LocaleList localeList4 = localeList3;
        TextGeometricTransform textGeometricTransform4 = textGeometricTransform3;
        if ((i2 & 2048) != 0) {
            j8 = spanStyle2.background;
        } else {
            j8 = j4;
        }
        long j9 = j8;
        if ((i2 & 4096) != 0) {
            textDecoration3 = spanStyle2.textDecoration;
        } else {
            textDecoration3 = textDecoration2;
        }
        if ((i2 & 8192) != 0) {
            shadow3 = spanStyle2.shadow;
        } else {
            shadow3 = shadow2;
        }
        Shadow shadow4 = shadow3;
        if ((i2 & 16384) != 0) {
            platformSpanStyle2 = spanStyle2.platformStyle;
        } else {
            platformSpanStyle2 = platformSpanStyle;
        }
        if ((i2 & 32768) != 0) {
            drawStyle3 = spanStyle2.drawStyle;
        } else {
            drawStyle3 = drawStyle2;
        }
        return spanStyle.m37930copyGSF8kmg(j5, j6, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str2, j7, baselineShift3, textGeometricTransform4, localeList4, j9, textDecoration3, shadow4, platformSpanStyle2, drawStyle3);
    }

    /* renamed from: copy-IuqyXdg$default  reason: not valid java name */
    public static /* synthetic */ SpanStyle m37927copyIuqyXdg$default(SpanStyle spanStyle, long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, int i, Object obj) {
        long j5;
        long j6;
        FontWeight fontWeight3;
        FontStyle fontStyle3;
        FontSynthesis fontSynthesis3;
        FontFamily fontFamily3;
        String str2;
        long j7;
        BaselineShift baselineShift3;
        TextGeometricTransform textGeometricTransform3;
        LocaleList localeList3;
        long j8;
        TextDecoration textDecoration3;
        Shadow shadow3;
        SpanStyle spanStyle2 = spanStyle;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j5 = spanStyle.m37935getColor0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = spanStyle2.fontSize;
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            fontWeight3 = spanStyle2.fontWeight;
        } else {
            fontWeight3 = fontWeight2;
        }
        if ((i2 & 8) != 0) {
            fontStyle3 = spanStyle2.fontStyle;
        } else {
            fontStyle3 = fontStyle2;
        }
        if ((i2 & 16) != 0) {
            fontSynthesis3 = spanStyle2.fontSynthesis;
        } else {
            fontSynthesis3 = fontSynthesis2;
        }
        if ((i2 & 32) != 0) {
            fontFamily3 = spanStyle2.fontFamily;
        } else {
            fontFamily3 = fontFamily2;
        }
        if ((i2 & 64) != 0) {
            str2 = spanStyle2.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i2 & 128) != 0) {
            j7 = spanStyle2.letterSpacing;
        } else {
            j7 = j3;
        }
        if ((i2 & 256) != 0) {
            baselineShift3 = spanStyle2.baselineShift;
        } else {
            baselineShift3 = baselineShift2;
        }
        if ((i2 & 512) != 0) {
            textGeometricTransform3 = spanStyle2.textGeometricTransform;
        } else {
            textGeometricTransform3 = textGeometricTransform2;
        }
        if ((i2 & 1024) != 0) {
            localeList3 = spanStyle2.localeList;
        } else {
            localeList3 = localeList2;
        }
        LocaleList localeList4 = localeList3;
        TextGeometricTransform textGeometricTransform4 = textGeometricTransform3;
        if ((i2 & 2048) != 0) {
            j8 = spanStyle2.background;
        } else {
            j8 = j4;
        }
        long j9 = j8;
        if ((i2 & 4096) != 0) {
            textDecoration3 = spanStyle2.textDecoration;
        } else {
            textDecoration3 = textDecoration2;
        }
        if ((i2 & 8192) != 0) {
            shadow3 = spanStyle2.shadow;
        } else {
            shadow3 = shadow2;
        }
        return spanStyle.m37931copyIuqyXdg(j5, j6, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str2, j7, baselineShift3, textGeometricTransform4, localeList4, j9, textDecoration3, shadow3);
    }

    /* renamed from: copy-NcG25M8$default  reason: not valid java name */
    public static /* synthetic */ SpanStyle m37928copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f, long j, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j2, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j3, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2, int i, Object obj) {
        float f2;
        long j4;
        FontWeight fontWeight3;
        FontStyle fontStyle3;
        FontSynthesis fontSynthesis3;
        FontFamily fontFamily3;
        String str2;
        long j5;
        BaselineShift baselineShift3;
        TextGeometricTransform textGeometricTransform3;
        LocaleList localeList3;
        long j6;
        TextDecoration textDecoration3;
        Shadow shadow3;
        Shadow shadow4;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle3;
        SpanStyle spanStyle2 = spanStyle;
        int i2 = i;
        if ((i2 & 2) != 0) {
            f2 = spanStyle.getAlpha();
        } else {
            f2 = f;
        }
        if ((i2 & 4) != 0) {
            j4 = spanStyle2.fontSize;
        } else {
            j4 = j;
        }
        if ((i2 & 8) != 0) {
            fontWeight3 = spanStyle2.fontWeight;
        } else {
            fontWeight3 = fontWeight2;
        }
        if ((i2 & 16) != 0) {
            fontStyle3 = spanStyle2.fontStyle;
        } else {
            fontStyle3 = fontStyle2;
        }
        if ((i2 & 32) != 0) {
            fontSynthesis3 = spanStyle2.fontSynthesis;
        } else {
            fontSynthesis3 = fontSynthesis2;
        }
        if ((i2 & 64) != 0) {
            fontFamily3 = spanStyle2.fontFamily;
        } else {
            fontFamily3 = fontFamily2;
        }
        if ((i2 & 128) != 0) {
            str2 = spanStyle2.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i2 & 256) != 0) {
            j5 = spanStyle2.letterSpacing;
        } else {
            j5 = j2;
        }
        if ((i2 & 512) != 0) {
            baselineShift3 = spanStyle2.baselineShift;
        } else {
            baselineShift3 = baselineShift2;
        }
        if ((i2 & 1024) != 0) {
            textGeometricTransform3 = spanStyle2.textGeometricTransform;
        } else {
            textGeometricTransform3 = textGeometricTransform2;
        }
        if ((i2 & 2048) != 0) {
            localeList3 = spanStyle2.localeList;
        } else {
            localeList3 = localeList2;
        }
        LocaleList localeList4 = localeList3;
        if ((i2 & 4096) != 0) {
            j6 = spanStyle2.background;
        } else {
            j6 = j3;
        }
        long j7 = j6;
        if ((i2 & 8192) != 0) {
            textDecoration3 = spanStyle2.textDecoration;
        } else {
            textDecoration3 = textDecoration2;
        }
        if ((i2 & 16384) != 0) {
            shadow3 = spanStyle2.shadow;
        } else {
            shadow3 = shadow2;
        }
        if ((i2 & 32768) != 0) {
            shadow4 = shadow3;
            platformSpanStyle2 = spanStyle2.platformStyle;
        } else {
            shadow4 = shadow3;
            platformSpanStyle2 = platformSpanStyle;
        }
        if ((i2 & 65536) != 0) {
            drawStyle3 = spanStyle2.drawStyle;
        } else {
            drawStyle3 = drawStyle2;
        }
        return spanStyle.m37932copyNcG25M8(brush, f2, j4, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str2, j5, baselineShift3, textGeometricTransform3, localeList4, j7, textDecoration3, shadow4, platformSpanStyle2, drawStyle3);
    }

    private final boolean hasSameNonLayoutAttributes(SpanStyle spanStyle) {
        if (C12775o.m28634d(this.textForegroundStyle, spanStyle.textForegroundStyle) && C12775o.m28634d(this.textDecoration, spanStyle.textDecoration) && C12775o.m28634d(this.shadow, spanStyle.shadow) && C12775o.m28634d(this.drawStyle, spanStyle.drawStyle)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    private final PlatformSpanStyle mergePlatformStyle(PlatformSpanStyle platformSpanStyle) {
        PlatformSpanStyle platformSpanStyle2 = this.platformStyle;
        if (platformSpanStyle2 == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return platformSpanStyle2;
        }
        return platformSpanStyle2.merge(platformSpanStyle);
    }

    /* renamed from: copy-2BkPm_w  reason: not valid java name */
    public final SpanStyle m37929copy2BkPm_w(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle) {
        TextForegroundStyle textForegroundStyle2;
        long j5 = j;
        if (Color.m35672equalsimpl0(j5, m37935getColor0d7_KjU())) {
            textForegroundStyle2 = this.textForegroundStyle;
        } else {
            textForegroundStyle2 = TextForegroundStyle.Companion.m38368from8_81llA(j5);
        }
        return new SpanStyle(textForegroundStyle2, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformSpanStyle, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    @ExperimentalTextApi
    /* renamed from: copy-GSF8kmg  reason: not valid java name */
    public final SpanStyle m37930copyGSF8kmg(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2) {
        TextForegroundStyle textForegroundStyle2;
        long j5 = j;
        if (Color.m35672equalsimpl0(j5, m37935getColor0d7_KjU())) {
            textForegroundStyle2 = this.textForegroundStyle;
        } else {
            textForegroundStyle2 = TextForegroundStyle.Companion.m38368from8_81llA(j5);
        }
        return new SpanStyle(textForegroundStyle2, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformSpanStyle, drawStyle2, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-IuqyXdg  reason: not valid java name */
    public final SpanStyle m37931copyIuqyXdg(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2) {
        TextForegroundStyle textForegroundStyle2;
        long j5 = j;
        if (Color.m35672equalsimpl0(j5, m37935getColor0d7_KjU())) {
            textForegroundStyle2 = this.textForegroundStyle;
        } else {
            textForegroundStyle2 = TextForegroundStyle.Companion.m38368from8_81llA(j5);
        }
        return new SpanStyle(textForegroundStyle2, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, this.platformStyle, this.drawStyle, (DefaultConstructorMarker) null);
    }

    @ExperimentalTextApi
    /* renamed from: copy-NcG25M8  reason: not valid java name */
    public final SpanStyle m37932copyNcG25M8(Brush brush, float f, long j, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j2, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j3, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f), j, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j2, baselineShift2, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, platformSpanStyle, drawStyle2, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        if (!hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) || !hasSameNonLayoutAttributes(spanStyle)) {
            return false;
        }
        return true;
    }

    @ExperimentalTextApi
    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m37933getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m37934getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    @ExperimentalTextApi
    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m37935getColor0d7_KjU() {
        return this.textForegroundStyle.m38367getColor0d7_KjU();
    }

    @ExperimentalTextApi
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m37936getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m37937getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m37938getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m37939getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(SpanStyle spanStyle) {
        C12775o.m28639i(spanStyle, "other");
        if (this == spanStyle) {
            return true;
        }
        if (TextUnit.m38646equalsimpl0(this.fontSize, spanStyle.fontSize) && C12775o.m28634d(this.fontWeight, spanStyle.fontWeight) && C12775o.m28634d(this.fontStyle, spanStyle.fontStyle) && C12775o.m28634d(this.fontSynthesis, spanStyle.fontSynthesis) && C12775o.m28634d(this.fontFamily, spanStyle.fontFamily) && C12775o.m28634d(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m38646equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && C12775o.m28634d(this.baselineShift, spanStyle.baselineShift) && C12775o.m28634d(this.textGeometricTransform, spanStyle.textGeometricTransform) && C12775o.m28634d(this.localeList, spanStyle.localeList) && Color.m35672equalsimpl0(this.background, spanStyle.background) && C12775o.m28634d(this.platformStyle, spanStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int r0 = Color.m35678hashCodeimpl(m37935getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int i13 = 0;
        if (brush != null) {
            i = brush.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (((((r0 + i) * 31) + Float.hashCode(getAlpha())) * 31) + TextUnit.m38650hashCodeimpl(this.fontSize)) * 31;
        FontWeight fontWeight2 = this.fontWeight;
        if (fontWeight2 != null) {
            i2 = fontWeight2.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 31;
        FontStyle fontStyle2 = this.fontStyle;
        if (fontStyle2 != null) {
            i3 = FontStyle.m38064hashCodeimpl(fontStyle2.m38066unboximpl());
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        FontSynthesis fontSynthesis2 = this.fontSynthesis;
        if (fontSynthesis2 != null) {
            i4 = FontSynthesis.m38073hashCodeimpl(fontSynthesis2.m38077unboximpl());
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        FontFamily fontFamily2 = this.fontFamily;
        if (fontFamily2 != null) {
            i5 = fontFamily2.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int r02 = (((i17 + i6) * 31) + TextUnit.m38650hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift2 = this.baselineShift;
        if (baselineShift2 != null) {
            i7 = BaselineShift.m38240hashCodeimpl(baselineShift2.m38242unboximpl());
        } else {
            i7 = 0;
        }
        int i18 = (r02 + i7) * 31;
        TextGeometricTransform textGeometricTransform2 = this.textGeometricTransform;
        if (textGeometricTransform2 != null) {
            i8 = textGeometricTransform2.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        LocaleList localeList2 = this.localeList;
        if (localeList2 != null) {
            i9 = localeList2.hashCode();
        } else {
            i9 = 0;
        }
        int r03 = (((i19 + i9) * 31) + Color.m35678hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration2 = this.textDecoration;
        if (textDecoration2 != null) {
            i10 = textDecoration2.hashCode();
        } else {
            i10 = 0;
        }
        int i20 = (r03 + i10) * 31;
        Shadow shadow2 = this.shadow;
        if (shadow2 != null) {
            i11 = shadow2.hashCode();
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            i12 = platformSpanStyle.hashCode();
        } else {
            i12 = 0;
        }
        int i22 = (i21 + i12) * 31;
        DrawStyle drawStyle2 = this.drawStyle;
        if (drawStyle2 != null) {
            i13 = drawStyle2.hashCode();
        }
        return i22 + i13;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int r0 = TextUnit.m38650hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight2 = this.fontWeight;
        int i9 = 0;
        if (fontWeight2 != null) {
            i = fontWeight2.hashCode();
        } else {
            i = 0;
        }
        int i10 = (r0 + i) * 31;
        FontStyle fontStyle2 = this.fontStyle;
        if (fontStyle2 != null) {
            i2 = FontStyle.m38064hashCodeimpl(fontStyle2.m38066unboximpl());
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        FontSynthesis fontSynthesis2 = this.fontSynthesis;
        if (fontSynthesis2 != null) {
            i3 = FontSynthesis.m38073hashCodeimpl(fontSynthesis2.m38077unboximpl());
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        FontFamily fontFamily2 = this.fontFamily;
        if (fontFamily2 != null) {
            i4 = fontFamily2.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int r02 = (((i13 + i5) * 31) + TextUnit.m38650hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift2 = this.baselineShift;
        if (baselineShift2 != null) {
            i6 = BaselineShift.m38240hashCodeimpl(baselineShift2.m38242unboximpl());
        } else {
            i6 = 0;
        }
        int i14 = (r02 + i6) * 31;
        TextGeometricTransform textGeometricTransform2 = this.textGeometricTransform;
        if (textGeometricTransform2 != null) {
            i7 = textGeometricTransform2.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        LocaleList localeList2 = this.localeList;
        if (localeList2 != null) {
            i8 = localeList2.hashCode();
        } else {
            i8 = 0;
        }
        int r03 = (((i15 + i8) * 31) + Color.m35678hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            i9 = platformSpanStyle.hashCode();
        }
        return r03 + i9;
    }

    @Stable
    public final SpanStyle merge(SpanStyle spanStyle) {
        long j;
        long j2;
        boolean z;
        SpanStyle spanStyle2 = spanStyle;
        if (spanStyle2 == null) {
            return this;
        }
        TextForegroundStyle merge = this.textForegroundStyle.merge(spanStyle2.textForegroundStyle);
        FontFamily fontFamily2 = spanStyle2.fontFamily;
        if (fontFamily2 == null) {
            fontFamily2 = this.fontFamily;
        }
        FontFamily fontFamily3 = fontFamily2;
        if (!TextUnitKt.m38667isUnspecifiedR2X_6o(spanStyle2.fontSize)) {
            j = spanStyle2.fontSize;
        } else {
            j = this.fontSize;
        }
        long j3 = j;
        FontWeight fontWeight2 = spanStyle2.fontWeight;
        if (fontWeight2 == null) {
            fontWeight2 = this.fontWeight;
        }
        FontWeight fontWeight3 = fontWeight2;
        FontStyle fontStyle2 = spanStyle2.fontStyle;
        if (fontStyle2 == null) {
            fontStyle2 = this.fontStyle;
        }
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis2 = spanStyle2.fontSynthesis;
        if (fontSynthesis2 == null) {
            fontSynthesis2 = this.fontSynthesis;
        }
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        String str = spanStyle2.fontFeatureSettings;
        if (str == null) {
            str = this.fontFeatureSettings;
        }
        String str2 = str;
        if (!TextUnitKt.m38667isUnspecifiedR2X_6o(spanStyle2.letterSpacing)) {
            j2 = spanStyle2.letterSpacing;
        } else {
            j2 = this.letterSpacing;
        }
        long j4 = j2;
        BaselineShift baselineShift2 = spanStyle2.baselineShift;
        if (baselineShift2 == null) {
            baselineShift2 = this.baselineShift;
        }
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform2 = spanStyle2.textGeometricTransform;
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = this.textGeometricTransform;
        }
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList2 = spanStyle2.localeList;
        if (localeList2 == null) {
            localeList2 = this.localeList;
        }
        LocaleList localeList3 = localeList2;
        long j5 = spanStyle2.background;
        if (j5 != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            j5 = this.background;
        }
        long j6 = j5;
        TextDecoration textDecoration2 = spanStyle2.textDecoration;
        if (textDecoration2 == null) {
            textDecoration2 = this.textDecoration;
        }
        TextDecoration textDecoration3 = textDecoration2;
        Shadow shadow2 = spanStyle2.shadow;
        if (shadow2 == null) {
            shadow2 = this.shadow;
        }
        Shadow shadow3 = shadow2;
        PlatformSpanStyle mergePlatformStyle = mergePlatformStyle(spanStyle2.platformStyle);
        DrawStyle drawStyle2 = spanStyle2.drawStyle;
        if (drawStyle2 == null) {
            drawStyle2 = this.drawStyle;
        }
        return new SpanStyle(merge, j3, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str2, j4, baselineShift3, textGeometricTransform3, localeList3, j6, textDecoration3, shadow3, mergePlatformStyle, drawStyle2, (DefaultConstructorMarker) null);
    }

    @Stable
    public final SpanStyle plus(SpanStyle spanStyle) {
        C12775o.m28639i(spanStyle, "other");
        return merge(spanStyle);
    }

    public String toString() {
        return "SpanStyle(color=" + Color.m35679toStringimpl(m37935getColor0d7_KjU()) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + TextUnit.m38656toStringimpl(this.fontSize) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + TextUnit.m38656toStringimpl(this.letterSpacing) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + Color.m35679toStringimpl(this.background) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformSpanStyle);
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2);
    }

    @ExperimentalTextApi
    public /* synthetic */ SpanStyle(Brush brush, float f, long j, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j2, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j3, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f, j, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j2, baselineShift2, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, platformSpanStyle, drawStyle2);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle2, long j, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j2, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j3, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle2, j, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j2, baselineShift2, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, platformSpanStyle, drawStyle2);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle2, long j, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j2, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j3, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2) {
        this.textForegroundStyle = textForegroundStyle2;
        this.fontSize = j;
        this.fontWeight = fontWeight2;
        this.fontStyle = fontStyle2;
        this.fontSynthesis = fontSynthesis2;
        this.fontFamily = fontFamily2;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift2;
        this.textGeometricTransform = textGeometricTransform2;
        this.localeList = localeList2;
        this.background = j3;
        this.textDecoration = textDecoration2;
        this.shadow = shadow2;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle2;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpanStyle(androidx.compose.p002ui.text.style.TextForegroundStyle r25, long r26, androidx.compose.p002ui.text.font.FontWeight r28, androidx.compose.p002ui.text.font.FontStyle r29, androidx.compose.p002ui.text.font.FontSynthesis r30, androidx.compose.p002ui.text.font.FontFamily r31, java.lang.String r32, long r33, androidx.compose.p002ui.text.style.BaselineShift r35, androidx.compose.p002ui.text.style.TextGeometricTransform r36, androidx.compose.p002ui.text.intl.LocaleList r37, long r38, androidx.compose.p002ui.text.style.TextDecoration r40, androidx.compose.p002ui.graphics.Shadow r41, androidx.compose.p002ui.text.PlatformSpanStyle r42, androidx.compose.p002ui.graphics.drawscope.DrawStyle r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r24 = this;
            r0 = r44
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000e
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r1 = r1.m38660getUnspecifiedXSAIIZE()
            r5 = r1
            goto L_0x0010
        L_0x000e:
            r5 = r26
        L_0x0010:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0017
            r7 = r2
            goto L_0x0019
        L_0x0017:
            r7 = r28
        L_0x0019:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001f
            r8 = r2
            goto L_0x0021
        L_0x001f:
            r8 = r29
        L_0x0021:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0027
            r9 = r2
            goto L_0x0029
        L_0x0027:
            r9 = r30
        L_0x0029:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002f
            r10 = r2
            goto L_0x0031
        L_0x002f:
            r10 = r31
        L_0x0031:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0037
            r11 = r2
            goto L_0x0039
        L_0x0037:
            r11 = r32
        L_0x0039:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0045
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r1.m38660getUnspecifiedXSAIIZE()
            r12 = r3
            goto L_0x0047
        L_0x0045:
            r12 = r33
        L_0x0047:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004d
            r14 = r2
            goto L_0x004f
        L_0x004d:
            r14 = r35
        L_0x004f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0055
            r15 = r2
            goto L_0x0057
        L_0x0055:
            r15 = r36
        L_0x0057:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005e
            r16 = r2
            goto L_0x0060
        L_0x005e:
            r16 = r37
        L_0x0060:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x006d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r3 = r1.m35707getUnspecified0d7_KjU()
            r17 = r3
            goto L_0x006f
        L_0x006d:
            r17 = r38
        L_0x006f:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0076
            r19 = r2
            goto L_0x0078
        L_0x0076:
            r19 = r40
        L_0x0078:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007f
            r20 = r2
            goto L_0x0081
        L_0x007f:
            r20 = r41
        L_0x0081:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0088
            r21 = r2
            goto L_0x008a
        L_0x0088:
            r21 = r42
        L_0x008a:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0093
            r22 = r2
            goto L_0x0095
        L_0x0093:
            r22 = r43
        L_0x0095:
            r23 = 0
            r3 = r24
            r4 = r25
            r3.<init>((androidx.compose.p002ui.text.style.TextForegroundStyle) r4, (long) r5, (androidx.compose.p002ui.text.font.FontWeight) r7, (androidx.compose.p002ui.text.font.FontStyle) r8, (androidx.compose.p002ui.text.font.FontSynthesis) r9, (androidx.compose.p002ui.text.font.FontFamily) r10, (java.lang.String) r11, (long) r12, (androidx.compose.p002ui.text.style.BaselineShift) r14, (androidx.compose.p002ui.text.style.TextGeometricTransform) r15, (androidx.compose.p002ui.text.intl.LocaleList) r16, (long) r17, (androidx.compose.p002ui.text.style.TextDecoration) r19, (androidx.compose.p002ui.graphics.Shadow) r20, (androidx.compose.p002ui.text.PlatformSpanStyle) r21, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r22, (kotlin.jvm.internal.DefaultConstructorMarker) r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SpanStyle.<init>(androidx.compose.ui.text.style.TextForegroundStyle, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpanStyle(long r20, long r22, androidx.compose.p002ui.text.font.FontWeight r24, androidx.compose.p002ui.text.font.FontStyle r25, androidx.compose.p002ui.text.font.FontSynthesis r26, androidx.compose.p002ui.text.font.FontFamily r27, java.lang.String r28, long r29, androidx.compose.p002ui.text.style.BaselineShift r31, androidx.compose.p002ui.text.style.TextGeometricTransform r32, androidx.compose.p002ui.text.intl.LocaleList r33, long r34, androidx.compose.p002ui.text.style.TextDecoration r36, androidx.compose.p002ui.graphics.Shadow r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>((long) r21, (long) r23, (androidx.compose.p002ui.text.font.FontWeight) r25, (androidx.compose.p002ui.text.font.FontStyle) r26, (androidx.compose.p002ui.text.font.FontSynthesis) r27, (androidx.compose.p002ui.text.font.FontFamily) r28, (java.lang.String) r29, (long) r30, (androidx.compose.p002ui.text.style.BaselineShift) r32, (androidx.compose.p002ui.text.style.TextGeometricTransform) r33, (androidx.compose.p002ui.text.intl.LocaleList) r34, (long) r35, (androidx.compose.p002ui.text.style.TextDecoration) r37, (androidx.compose.p002ui.graphics.Shadow) r38, (kotlin.jvm.internal.DefaultConstructorMarker) r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private SpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2) {
        this(TextForegroundStyle.Companion.m38368from8_81llA(j), j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
        long j5 = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpanStyle(long r21, long r23, androidx.compose.p002ui.text.font.FontWeight r25, androidx.compose.p002ui.text.font.FontStyle r26, androidx.compose.p002ui.text.font.FontSynthesis r27, androidx.compose.p002ui.text.font.FontFamily r28, java.lang.String r29, long r30, androidx.compose.p002ui.text.style.BaselineShift r32, androidx.compose.p002ui.text.style.TextGeometricTransform r33, androidx.compose.p002ui.text.intl.LocaleList r34, long r35, androidx.compose.p002ui.text.style.TextDecoration r37, androidx.compose.p002ui.graphics.Shadow r38, androidx.compose.p002ui.text.PlatformSpanStyle r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r21
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r23
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r25
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r26
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r27
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r28
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r29
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r30
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r32
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r33
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r34
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r35
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r37
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r38
        L_0x0088:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r39
        L_0x0090:
            r19 = 0
            r41 = r19
            r21 = r20
            r22 = r1
            r24 = r3
            r26 = r5
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r16
            r38 = r18
            r39 = r6
            r40 = r0
            r21.<init>((long) r22, (long) r24, (androidx.compose.p002ui.text.font.FontWeight) r26, (androidx.compose.p002ui.text.font.FontStyle) r27, (androidx.compose.p002ui.text.font.FontSynthesis) r28, (androidx.compose.p002ui.text.font.FontFamily) r29, (java.lang.String) r30, (long) r31, (androidx.compose.p002ui.text.style.BaselineShift) r33, (androidx.compose.p002ui.text.style.TextGeometricTransform) r34, (androidx.compose.p002ui.text.intl.LocaleList) r35, (long) r36, (androidx.compose.p002ui.text.style.TextDecoration) r38, (androidx.compose.p002ui.graphics.Shadow) r39, (androidx.compose.p002ui.text.PlatformSpanStyle) r40, (kotlin.jvm.internal.DefaultConstructorMarker) r41)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private SpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m38368from8_81llA(j), j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformSpanStyle, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
        long j5 = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpanStyle(long r22, long r24, androidx.compose.p002ui.text.font.FontWeight r26, androidx.compose.p002ui.text.font.FontStyle r27, androidx.compose.p002ui.text.font.FontSynthesis r28, androidx.compose.p002ui.text.font.FontFamily r29, java.lang.String r30, long r31, androidx.compose.p002ui.text.style.BaselineShift r33, androidx.compose.p002ui.text.style.TextGeometricTransform r34, androidx.compose.p002ui.text.intl.LocaleList r35, long r36, androidx.compose.p002ui.text.style.TextDecoration r38, androidx.compose.p002ui.graphics.Shadow r39, androidx.compose.p002ui.text.PlatformSpanStyle r40, androidx.compose.p002ui.graphics.drawscope.DrawStyle r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r22
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r24
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r26
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r27
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r28
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r29
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r30
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r31
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r33
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r34
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r35
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r36
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r38
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r39
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r40
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x009b
            r0 = 0
            goto L_0x009d
        L_0x009b:
            r0 = r41
        L_0x009d:
            r20 = 0
            r43 = r20
            r22 = r21
            r23 = r1
            r25 = r3
            r27 = r5
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r16
            r39 = r18
            r40 = r19
            r41 = r6
            r42 = r0
            r22.<init>((long) r23, (long) r25, (androidx.compose.p002ui.text.font.FontWeight) r27, (androidx.compose.p002ui.text.font.FontStyle) r28, (androidx.compose.p002ui.text.font.FontSynthesis) r29, (androidx.compose.p002ui.text.font.FontFamily) r30, (java.lang.String) r31, (long) r32, (androidx.compose.p002ui.text.style.BaselineShift) r34, (androidx.compose.p002ui.text.style.TextGeometricTransform) r35, (androidx.compose.p002ui.text.intl.LocaleList) r36, (long) r37, (androidx.compose.p002ui.text.style.TextDecoration) r39, (androidx.compose.p002ui.graphics.Shadow) r40, (androidx.compose.p002ui.text.PlatformSpanStyle) r41, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private SpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2) {
        this(TextForegroundStyle.Companion.m38368from8_81llA(j), j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformSpanStyle, drawStyle2, (DefaultConstructorMarker) null);
        long j5 = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpanStyle(androidx.compose.p002ui.graphics.Brush r25, float r26, long r27, androidx.compose.p002ui.text.font.FontWeight r29, androidx.compose.p002ui.text.font.FontStyle r30, androidx.compose.p002ui.text.font.FontSynthesis r31, androidx.compose.p002ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.p002ui.text.style.BaselineShift r36, androidx.compose.p002ui.text.style.TextGeometricTransform r37, androidx.compose.p002ui.text.intl.LocaleList r38, long r39, androidx.compose.p002ui.text.style.TextDecoration r41, androidx.compose.p002ui.graphics.Shadow r42, androidx.compose.p002ui.text.PlatformSpanStyle r43, androidx.compose.p002ui.graphics.drawscope.DrawStyle r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r26
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0018
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r1 = r1.m38660getUnspecifiedXSAIIZE()
            r5 = r1
            goto L_0x001a
        L_0x0018:
            r5 = r27
        L_0x001a:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r29
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r30
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r31
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0039
            r10 = r2
            goto L_0x003b
        L_0x0039:
            r10 = r32
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r33
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004e
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r12 = r1.m38660getUnspecifiedXSAIIZE()
            goto L_0x0050
        L_0x004e:
            r12 = r34
        L_0x0050:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0056
            r14 = r2
            goto L_0x0058
        L_0x0056:
            r14 = r36
        L_0x0058:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005e
            r15 = r2
            goto L_0x0060
        L_0x005e:
            r15 = r37
        L_0x0060:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0067
            r16 = r2
            goto L_0x0069
        L_0x0067:
            r16 = r38
        L_0x0069:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r17 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r17 = r39
        L_0x0076:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007d
            r19 = r2
            goto L_0x007f
        L_0x007d:
            r19 = r41
        L_0x007f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0086
            r20 = r2
            goto L_0x0088
        L_0x0086:
            r20 = r42
        L_0x0088:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0091
            r21 = r2
            goto L_0x0093
        L_0x0091:
            r21 = r43
        L_0x0093:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009b
            r22 = r2
            goto L_0x009d
        L_0x009b:
            r22 = r44
        L_0x009d:
            r23 = 0
            r2 = r24
            r3 = r25
            r2.<init>((androidx.compose.p002ui.graphics.Brush) r3, (float) r4, (long) r5, (androidx.compose.p002ui.text.font.FontWeight) r7, (androidx.compose.p002ui.text.font.FontStyle) r8, (androidx.compose.p002ui.text.font.FontSynthesis) r9, (androidx.compose.p002ui.text.font.FontFamily) r10, (java.lang.String) r11, (long) r12, (androidx.compose.p002ui.text.style.BaselineShift) r14, (androidx.compose.p002ui.text.style.TextGeometricTransform) r15, (androidx.compose.p002ui.text.intl.LocaleList) r16, (long) r17, (androidx.compose.p002ui.text.style.TextDecoration) r19, (androidx.compose.p002ui.graphics.Shadow) r20, (androidx.compose.p002ui.text.PlatformSpanStyle) r21, (androidx.compose.p002ui.graphics.drawscope.DrawStyle) r22, (kotlin.jvm.internal.DefaultConstructorMarker) r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.SpanStyle.<init>(androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private SpanStyle(Brush brush, float f, long j, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j2, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j3, TextDecoration textDecoration2, Shadow shadow2, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle2) {
        this(TextForegroundStyle.Companion.from(brush, f), j, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j2, baselineShift2, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, platformSpanStyle, drawStyle2, (DefaultConstructorMarker) null);
        long j4 = j;
    }
}
