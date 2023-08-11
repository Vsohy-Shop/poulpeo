package androidx.compose.material3.tokens;

import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.GenericFontFamily;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TypographyTokens.kt */
public final class TypographyTokens {
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodySmall;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplaySmall;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineSmall;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelSmall;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleSmall;

    static {
        TypeScaleTokens typeScaleTokens = TypeScaleTokens.INSTANCE;
        GenericFontFamily bodyLargeFont = typeScaleTokens.getBodyLargeFont();
        FontWeight bodyLargeWeight = typeScaleTokens.getBodyLargeWeight();
        BodyLarge = new TextStyle(0, typeScaleTokens.m35222getBodyLargeSizeXSAIIZE(), bodyLargeWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) bodyLargeFont, (String) null, typeScaleTokens.m35223getBodyLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35221getBodyLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        FontWeight bodyMediumWeight = typeScaleTokens.getBodyMediumWeight();
        BodyMedium = new TextStyle(0, typeScaleTokens.m35225getBodyMediumSizeXSAIIZE(), bodyMediumWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) bodyMediumFont, (String) null, typeScaleTokens.m35226getBodyMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35224getBodyMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        FontWeight bodySmallWeight = typeScaleTokens.getBodySmallWeight();
        BodySmall = new TextStyle(0, typeScaleTokens.m35228getBodySmallSizeXSAIIZE(), bodySmallWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) bodySmallFont, (String) null, typeScaleTokens.m35229getBodySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35227getBodySmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        FontWeight displayLargeWeight = typeScaleTokens.getDisplayLargeWeight();
        DisplayLarge = new TextStyle(0, typeScaleTokens.m35231getDisplayLargeSizeXSAIIZE(), displayLargeWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) displayLargeFont, (String) null, typeScaleTokens.m35232getDisplayLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35230getDisplayLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        FontWeight displayMediumWeight = typeScaleTokens.getDisplayMediumWeight();
        DisplayMedium = new TextStyle(0, typeScaleTokens.m35234getDisplayMediumSizeXSAIIZE(), displayMediumWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) displayMediumFont, (String) null, typeScaleTokens.m35235getDisplayMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35233getDisplayMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        FontWeight displaySmallWeight = typeScaleTokens.getDisplaySmallWeight();
        DisplaySmall = new TextStyle(0, typeScaleTokens.m35237getDisplaySmallSizeXSAIIZE(), displaySmallWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) displaySmallFont, (String) null, typeScaleTokens.m35238getDisplaySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35236getDisplaySmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        FontWeight headlineLargeWeight = typeScaleTokens.getHeadlineLargeWeight();
        HeadlineLarge = new TextStyle(0, typeScaleTokens.m35240getHeadlineLargeSizeXSAIIZE(), headlineLargeWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) headlineLargeFont, (String) null, typeScaleTokens.m35241getHeadlineLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35239getHeadlineLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        FontWeight headlineMediumWeight = typeScaleTokens.getHeadlineMediumWeight();
        HeadlineMedium = new TextStyle(0, typeScaleTokens.m35243getHeadlineMediumSizeXSAIIZE(), headlineMediumWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) headlineMediumFont, (String) null, typeScaleTokens.m35244getHeadlineMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35242getHeadlineMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        FontWeight headlineSmallWeight = typeScaleTokens.getHeadlineSmallWeight();
        HeadlineSmall = new TextStyle(0, typeScaleTokens.m35246getHeadlineSmallSizeXSAIIZE(), headlineSmallWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) headlineSmallFont, (String) null, typeScaleTokens.m35247getHeadlineSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35245getHeadlineSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        FontWeight labelLargeWeight = typeScaleTokens.getLabelLargeWeight();
        LabelLarge = new TextStyle(0, typeScaleTokens.m35249getLabelLargeSizeXSAIIZE(), labelLargeWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) labelLargeFont, (String) null, typeScaleTokens.m35250getLabelLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35248getLabelLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        FontWeight labelMediumWeight = typeScaleTokens.getLabelMediumWeight();
        LabelMedium = new TextStyle(0, typeScaleTokens.m35252getLabelMediumSizeXSAIIZE(), labelMediumWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) labelMediumFont, (String) null, typeScaleTokens.m35253getLabelMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35251getLabelMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        FontWeight labelSmallWeight = typeScaleTokens.getLabelSmallWeight();
        LabelSmall = new TextStyle(0, typeScaleTokens.m35255getLabelSmallSizeXSAIIZE(), labelSmallWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) labelSmallFont, (String) null, typeScaleTokens.m35256getLabelSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35254getLabelSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        FontWeight titleLargeWeight = typeScaleTokens.getTitleLargeWeight();
        TitleLarge = new TextStyle(0, typeScaleTokens.m35258getTitleLargeSizeXSAIIZE(), titleLargeWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) titleLargeFont, (String) null, typeScaleTokens.m35259getTitleLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35257getTitleLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        FontWeight titleMediumWeight = typeScaleTokens.getTitleMediumWeight();
        TitleMedium = new TextStyle(0, typeScaleTokens.m35261getTitleMediumSizeXSAIIZE(), titleMediumWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) titleMediumFont, (String) null, typeScaleTokens.m35262getTitleMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35260getTitleMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        FontWeight titleSmallWeight = typeScaleTokens.getTitleSmallWeight();
        TitleSmall = new TextStyle(0, typeScaleTokens.m35264getTitleSmallSizeXSAIIZE(), titleSmallWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) titleSmallFont, (String) null, typeScaleTokens.m35265getTitleSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m35263getTitleSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (DefaultConstructorMarker) null);
    }

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }
}
