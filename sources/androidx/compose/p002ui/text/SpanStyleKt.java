package androidx.compose.p002ui.text;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.ShadowKt;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.FontWeightKt;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.BaselineShiftKt;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDrawStyleKt;
import androidx.compose.p002ui.text.style.TextForegroundStyle;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextGeometricTransformKt;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n851#1:857\n851#1:858\n*E\n"})
/* renamed from: androidx.compose.ui.text.SpanStyleKt */
/* compiled from: SpanStyle.kt */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    /* access modifiers changed from: private */
    public static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m35706getTransparent0d7_KjU();
        DefaultColor = companion.m35697getBlack0d7_KjU();
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        float f2;
        float f3;
        float f4 = f;
        C12775o.m28639i(spanStyle, "start");
        C12775o.m28639i(spanStyle2, "stop");
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f4);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f4);
        long r7 = m37940lerpTextUnitInheritableC3pnCVY(spanStyle.m37936getFontSizeXSAIIZE(), spanStyle2.m37936getFontSizeXSAIIZE(), f4);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f4);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m37937getFontStyle4Lr2A7w(), spanStyle2.m37937getFontStyle4Lr2A7w(), f4);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m37938getFontSynthesisZQGJjVo(), spanStyle2.m37938getFontSynthesisZQGJjVo(), f4);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f4);
        long r14 = m37940lerpTextUnitInheritableC3pnCVY(spanStyle.m37939getLetterSpacingXSAIIZE(), spanStyle2.m37939getLetterSpacingXSAIIZE(), f4);
        BaselineShift r1 = spanStyle.m37934getBaselineShift5SSeXJ0();
        if (r1 != null) {
            f2 = r1.m38242unboximpl();
        } else {
            f2 = BaselineShift.m38237constructorimpl(0.0f);
        }
        BaselineShift r5 = spanStyle2.m37934getBaselineShift5SSeXJ0();
        if (r5 != null) {
            f3 = r5.m38242unboximpl();
        } else {
            f3 = BaselineShift.m38237constructorimpl(0.0f);
        }
        float r12 = BaselineShiftKt.m38249lerpjWV1Mfo(f2, f3, f4);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f4);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f4);
        long r19 = ColorKt.m35722lerpjxsXWHM(spanStyle.m37933getBackground0d7_KjU(), spanStyle2.m37933getBackground0d7_KjU(), f4);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f4);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        return new SpanStyle(lerp, r7, lerp2, fontStyle, fontSynthesis, fontFamily, str, r14, BaselineShift.m38236boximpl(r12), lerp3, localeList, r19, textDecoration, ShadowKt.lerp(shadow, shadow2, f4), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f4), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f4), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        if (((double) f) < 0.5d) {
            return t;
        }
        return t2;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m37940lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        if (TextUnitKt.m38667isUnspecifiedR2X_6o(j) || TextUnitKt.m38667isUnspecifiedR2X_6o(j2)) {
            return ((TextUnit) lerpDiscrete(TextUnit.m38639boximpl(j), TextUnit.m38639boximpl(j2), f)).m38658unboximpl();
        }
        return TextUnitKt.m38669lerpC3pnCVY(j, j2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        long j;
        int i;
        int i2;
        long j2;
        float f;
        boolean z;
        C12775o.m28639i(spanStyle, "style");
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        if (TextUnitKt.m38667isUnspecifiedR2X_6o(spanStyle.m37936getFontSizeXSAIIZE())) {
            j = DefaultFontSize;
        } else {
            j = spanStyle.m37936getFontSizeXSAIIZE();
        }
        long j3 = j;
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle r0 = spanStyle.m37937getFontStyle4Lr2A7w();
        if (r0 != null) {
            i = r0.m38066unboximpl();
        } else {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        FontStyle r8 = FontStyle.m38060boximpl(i);
        FontSynthesis r02 = spanStyle.m37938getFontSynthesisZQGJjVo();
        if (r02 != null) {
            i2 = r02.m38077unboximpl();
        } else {
            i2 = FontSynthesis.Companion.m38078getAllGVVA2EU();
        }
        FontSynthesis r9 = FontSynthesis.m38069boximpl(i2);
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m38667isUnspecifiedR2X_6o(spanStyle.m37939getLetterSpacingXSAIIZE())) {
            j2 = DefaultLetterSpacing;
        } else {
            j2 = spanStyle.m37939getLetterSpacingXSAIIZE();
        }
        long j4 = j2;
        BaselineShift r03 = spanStyle.m37934getBaselineShift5SSeXJ0();
        if (r03 != null) {
            f = r03.m38242unboximpl();
        } else {
            f = BaselineShift.Companion.m38246getNoney9eOQZs();
        }
        BaselineShift r14 = BaselineShift.m38236boximpl(f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long r2 = spanStyle.m37933getBackground0d7_KjU();
        if (r2 != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r2 = DefaultBackgroundColor;
        }
        long j5 = r2;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, j3, fontWeight2, r8, r9, fontFamily2, str, j4, r14, textGeometricTransform2, localeList2, j5, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
