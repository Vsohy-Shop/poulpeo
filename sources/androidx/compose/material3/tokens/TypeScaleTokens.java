package androidx.compose.material3.tokens;

import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.GenericFontFamily;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;

/* compiled from: TypeScaleTokens.kt */
public final class TypeScaleTokens {
    private static final GenericFontFamily BodyLargeFont;
    private static final long BodyLargeLineHeight = TextUnitKt.getSp(24.0d);
    private static final long BodyLargeSize = TextUnitKt.getSp(16);
    private static final long BodyLargeTracking = TextUnitKt.getSp(0.5d);
    private static final FontWeight BodyLargeWeight;
    private static final GenericFontFamily BodyMediumFont;
    private static final long BodyMediumLineHeight = TextUnitKt.getSp(20.0d);
    private static final long BodyMediumSize = TextUnitKt.getSp(14);
    private static final long BodyMediumTracking = TextUnitKt.getSp(0.2d);
    private static final FontWeight BodyMediumWeight;
    private static final GenericFontFamily BodySmallFont;
    private static final long BodySmallLineHeight = TextUnitKt.getSp(16.0d);
    private static final long BodySmallSize = TextUnitKt.getSp(12);
    private static final long BodySmallTracking = TextUnitKt.getSp(0.4d);
    private static final FontWeight BodySmallWeight;
    private static final GenericFontFamily DisplayLargeFont;
    private static final long DisplayLargeLineHeight = TextUnitKt.getSp(64.0d);
    private static final long DisplayLargeSize = TextUnitKt.getSp(57);
    private static final long DisplayLargeTracking;
    private static final FontWeight DisplayLargeWeight;
    private static final GenericFontFamily DisplayMediumFont;
    private static final long DisplayMediumLineHeight = TextUnitKt.getSp(52.0d);
    private static final long DisplayMediumSize = TextUnitKt.getSp(45);
    private static final long DisplayMediumTracking = TextUnitKt.getSp(0.0d);
    private static final FontWeight DisplayMediumWeight;
    private static final GenericFontFamily DisplaySmallFont;
    private static final long DisplaySmallLineHeight = TextUnitKt.getSp(44.0d);
    private static final long DisplaySmallSize = TextUnitKt.getSp(36);
    private static final long DisplaySmallTracking = TextUnitKt.getSp(0.0d);
    private static final FontWeight DisplaySmallWeight;
    private static final GenericFontFamily HeadlineLargeFont;
    private static final long HeadlineLargeLineHeight = TextUnitKt.getSp(40.0d);
    private static final long HeadlineLargeSize = TextUnitKt.getSp(32);
    private static final long HeadlineLargeTracking = TextUnitKt.getSp(0.0d);
    private static final FontWeight HeadlineLargeWeight;
    private static final GenericFontFamily HeadlineMediumFont;
    private static final long HeadlineMediumLineHeight = TextUnitKt.getSp(36.0d);
    private static final long HeadlineMediumSize = TextUnitKt.getSp(28);
    private static final long HeadlineMediumTracking = TextUnitKt.getSp(0.0d);
    private static final FontWeight HeadlineMediumWeight;
    private static final GenericFontFamily HeadlineSmallFont;
    private static final long HeadlineSmallLineHeight = TextUnitKt.getSp(32.0d);
    private static final long HeadlineSmallSize = TextUnitKt.getSp(24);
    private static final long HeadlineSmallTracking = TextUnitKt.getSp(0.0d);
    private static final FontWeight HeadlineSmallWeight;
    public static final TypeScaleTokens INSTANCE = new TypeScaleTokens();
    private static final GenericFontFamily LabelLargeFont;
    private static final long LabelLargeLineHeight = TextUnitKt.getSp(20.0d);
    private static final long LabelLargeSize = TextUnitKt.getSp(14);
    private static final long LabelLargeTracking = TextUnitKt.getSp(0.1d);
    private static final FontWeight LabelLargeWeight;
    private static final GenericFontFamily LabelMediumFont;
    private static final long LabelMediumLineHeight = TextUnitKt.getSp(16.0d);
    private static final long LabelMediumSize = TextUnitKt.getSp(12);
    private static final long LabelMediumTracking = TextUnitKt.getSp(0.5d);
    private static final FontWeight LabelMediumWeight;
    private static final GenericFontFamily LabelSmallFont;
    private static final long LabelSmallLineHeight = TextUnitKt.getSp(16.0d);
    private static final long LabelSmallSize = TextUnitKt.getSp(11);
    private static final long LabelSmallTracking = TextUnitKt.getSp(0.5d);
    private static final FontWeight LabelSmallWeight;
    private static final GenericFontFamily TitleLargeFont;
    private static final long TitleLargeLineHeight = TextUnitKt.getSp(28.0d);
    private static final long TitleLargeSize = TextUnitKt.getSp(22);
    private static final long TitleLargeTracking = TextUnitKt.getSp(0.0d);
    private static final FontWeight TitleLargeWeight;
    private static final GenericFontFamily TitleMediumFont;
    private static final long TitleMediumLineHeight = TextUnitKt.getSp(24.0d);
    private static final long TitleMediumSize = TextUnitKt.getSp(16);
    private static final long TitleMediumTracking = TextUnitKt.getSp(0.2d);
    private static final FontWeight TitleMediumWeight;
    private static final GenericFontFamily TitleSmallFont;
    private static final long TitleSmallLineHeight = TextUnitKt.getSp(20.0d);
    private static final long TitleSmallSize = TextUnitKt.getSp(14);
    private static final long TitleSmallTracking = TextUnitKt.getSp(0.1d);
    private static final FontWeight TitleSmallWeight;

    static {
        TypefaceTokens typefaceTokens = TypefaceTokens.INSTANCE;
        BodyLargeFont = typefaceTokens.getPlain();
        BodyLargeWeight = typefaceTokens.getWeightRegular();
        BodyMediumFont = typefaceTokens.getPlain();
        BodyMediumWeight = typefaceTokens.getWeightRegular();
        BodySmallFont = typefaceTokens.getPlain();
        BodySmallWeight = typefaceTokens.getWeightRegular();
        DisplayLargeFont = typefaceTokens.getBrand();
        long sp = TextUnitKt.getSp(0.2d);
        TextUnitKt.m38662checkArithmeticR2X_6o(sp);
        DisplayLargeTracking = TextUnitKt.pack(TextUnit.m38647getRawTypeimpl(sp), -TextUnit.m38649getValueimpl(sp));
        DisplayLargeWeight = typefaceTokens.getWeightRegular();
        DisplayMediumFont = typefaceTokens.getBrand();
        DisplayMediumWeight = typefaceTokens.getWeightRegular();
        DisplaySmallFont = typefaceTokens.getBrand();
        DisplaySmallWeight = typefaceTokens.getWeightRegular();
        HeadlineLargeFont = typefaceTokens.getBrand();
        HeadlineLargeWeight = typefaceTokens.getWeightRegular();
        HeadlineMediumFont = typefaceTokens.getBrand();
        HeadlineMediumWeight = typefaceTokens.getWeightRegular();
        HeadlineSmallFont = typefaceTokens.getBrand();
        HeadlineSmallWeight = typefaceTokens.getWeightRegular();
        LabelLargeFont = typefaceTokens.getPlain();
        LabelLargeWeight = typefaceTokens.getWeightMedium();
        LabelMediumFont = typefaceTokens.getPlain();
        LabelMediumWeight = typefaceTokens.getWeightMedium();
        LabelSmallFont = typefaceTokens.getPlain();
        LabelSmallWeight = typefaceTokens.getWeightMedium();
        TitleLargeFont = typefaceTokens.getBrand();
        TitleLargeWeight = typefaceTokens.getWeightRegular();
        TitleMediumFont = typefaceTokens.getPlain();
        TitleMediumWeight = typefaceTokens.getWeightMedium();
        TitleSmallFont = typefaceTokens.getPlain();
        TitleSmallWeight = typefaceTokens.getWeightMedium();
    }

    private TypeScaleTokens() {
    }

    public final GenericFontFamily getBodyLargeFont() {
        return BodyLargeFont;
    }

    /* renamed from: getBodyLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35221getBodyLargeLineHeightXSAIIZE() {
        return BodyLargeLineHeight;
    }

    /* renamed from: getBodyLargeSize-XSAIIZE  reason: not valid java name */
    public final long m35222getBodyLargeSizeXSAIIZE() {
        return BodyLargeSize;
    }

    /* renamed from: getBodyLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m35223getBodyLargeTrackingXSAIIZE() {
        return BodyLargeTracking;
    }

    public final FontWeight getBodyLargeWeight() {
        return BodyLargeWeight;
    }

    public final GenericFontFamily getBodyMediumFont() {
        return BodyMediumFont;
    }

    /* renamed from: getBodyMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35224getBodyMediumLineHeightXSAIIZE() {
        return BodyMediumLineHeight;
    }

    /* renamed from: getBodyMediumSize-XSAIIZE  reason: not valid java name */
    public final long m35225getBodyMediumSizeXSAIIZE() {
        return BodyMediumSize;
    }

    /* renamed from: getBodyMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m35226getBodyMediumTrackingXSAIIZE() {
        return BodyMediumTracking;
    }

    public final FontWeight getBodyMediumWeight() {
        return BodyMediumWeight;
    }

    public final GenericFontFamily getBodySmallFont() {
        return BodySmallFont;
    }

    /* renamed from: getBodySmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35227getBodySmallLineHeightXSAIIZE() {
        return BodySmallLineHeight;
    }

    /* renamed from: getBodySmallSize-XSAIIZE  reason: not valid java name */
    public final long m35228getBodySmallSizeXSAIIZE() {
        return BodySmallSize;
    }

    /* renamed from: getBodySmallTracking-XSAIIZE  reason: not valid java name */
    public final long m35229getBodySmallTrackingXSAIIZE() {
        return BodySmallTracking;
    }

    public final FontWeight getBodySmallWeight() {
        return BodySmallWeight;
    }

    public final GenericFontFamily getDisplayLargeFont() {
        return DisplayLargeFont;
    }

    /* renamed from: getDisplayLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35230getDisplayLargeLineHeightXSAIIZE() {
        return DisplayLargeLineHeight;
    }

    /* renamed from: getDisplayLargeSize-XSAIIZE  reason: not valid java name */
    public final long m35231getDisplayLargeSizeXSAIIZE() {
        return DisplayLargeSize;
    }

    /* renamed from: getDisplayLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m35232getDisplayLargeTrackingXSAIIZE() {
        return DisplayLargeTracking;
    }

    public final FontWeight getDisplayLargeWeight() {
        return DisplayLargeWeight;
    }

    public final GenericFontFamily getDisplayMediumFont() {
        return DisplayMediumFont;
    }

    /* renamed from: getDisplayMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35233getDisplayMediumLineHeightXSAIIZE() {
        return DisplayMediumLineHeight;
    }

    /* renamed from: getDisplayMediumSize-XSAIIZE  reason: not valid java name */
    public final long m35234getDisplayMediumSizeXSAIIZE() {
        return DisplayMediumSize;
    }

    /* renamed from: getDisplayMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m35235getDisplayMediumTrackingXSAIIZE() {
        return DisplayMediumTracking;
    }

    public final FontWeight getDisplayMediumWeight() {
        return DisplayMediumWeight;
    }

    public final GenericFontFamily getDisplaySmallFont() {
        return DisplaySmallFont;
    }

    /* renamed from: getDisplaySmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35236getDisplaySmallLineHeightXSAIIZE() {
        return DisplaySmallLineHeight;
    }

    /* renamed from: getDisplaySmallSize-XSAIIZE  reason: not valid java name */
    public final long m35237getDisplaySmallSizeXSAIIZE() {
        return DisplaySmallSize;
    }

    /* renamed from: getDisplaySmallTracking-XSAIIZE  reason: not valid java name */
    public final long m35238getDisplaySmallTrackingXSAIIZE() {
        return DisplaySmallTracking;
    }

    public final FontWeight getDisplaySmallWeight() {
        return DisplaySmallWeight;
    }

    public final GenericFontFamily getHeadlineLargeFont() {
        return HeadlineLargeFont;
    }

    /* renamed from: getHeadlineLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35239getHeadlineLargeLineHeightXSAIIZE() {
        return HeadlineLargeLineHeight;
    }

    /* renamed from: getHeadlineLargeSize-XSAIIZE  reason: not valid java name */
    public final long m35240getHeadlineLargeSizeXSAIIZE() {
        return HeadlineLargeSize;
    }

    /* renamed from: getHeadlineLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m35241getHeadlineLargeTrackingXSAIIZE() {
        return HeadlineLargeTracking;
    }

    public final FontWeight getHeadlineLargeWeight() {
        return HeadlineLargeWeight;
    }

    public final GenericFontFamily getHeadlineMediumFont() {
        return HeadlineMediumFont;
    }

    /* renamed from: getHeadlineMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35242getHeadlineMediumLineHeightXSAIIZE() {
        return HeadlineMediumLineHeight;
    }

    /* renamed from: getHeadlineMediumSize-XSAIIZE  reason: not valid java name */
    public final long m35243getHeadlineMediumSizeXSAIIZE() {
        return HeadlineMediumSize;
    }

    /* renamed from: getHeadlineMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m35244getHeadlineMediumTrackingXSAIIZE() {
        return HeadlineMediumTracking;
    }

    public final FontWeight getHeadlineMediumWeight() {
        return HeadlineMediumWeight;
    }

    public final GenericFontFamily getHeadlineSmallFont() {
        return HeadlineSmallFont;
    }

    /* renamed from: getHeadlineSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35245getHeadlineSmallLineHeightXSAIIZE() {
        return HeadlineSmallLineHeight;
    }

    /* renamed from: getHeadlineSmallSize-XSAIIZE  reason: not valid java name */
    public final long m35246getHeadlineSmallSizeXSAIIZE() {
        return HeadlineSmallSize;
    }

    /* renamed from: getHeadlineSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m35247getHeadlineSmallTrackingXSAIIZE() {
        return HeadlineSmallTracking;
    }

    public final FontWeight getHeadlineSmallWeight() {
        return HeadlineSmallWeight;
    }

    public final GenericFontFamily getLabelLargeFont() {
        return LabelLargeFont;
    }

    /* renamed from: getLabelLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35248getLabelLargeLineHeightXSAIIZE() {
        return LabelLargeLineHeight;
    }

    /* renamed from: getLabelLargeSize-XSAIIZE  reason: not valid java name */
    public final long m35249getLabelLargeSizeXSAIIZE() {
        return LabelLargeSize;
    }

    /* renamed from: getLabelLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m35250getLabelLargeTrackingXSAIIZE() {
        return LabelLargeTracking;
    }

    public final FontWeight getLabelLargeWeight() {
        return LabelLargeWeight;
    }

    public final GenericFontFamily getLabelMediumFont() {
        return LabelMediumFont;
    }

    /* renamed from: getLabelMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35251getLabelMediumLineHeightXSAIIZE() {
        return LabelMediumLineHeight;
    }

    /* renamed from: getLabelMediumSize-XSAIIZE  reason: not valid java name */
    public final long m35252getLabelMediumSizeXSAIIZE() {
        return LabelMediumSize;
    }

    /* renamed from: getLabelMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m35253getLabelMediumTrackingXSAIIZE() {
        return LabelMediumTracking;
    }

    public final FontWeight getLabelMediumWeight() {
        return LabelMediumWeight;
    }

    public final GenericFontFamily getLabelSmallFont() {
        return LabelSmallFont;
    }

    /* renamed from: getLabelSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35254getLabelSmallLineHeightXSAIIZE() {
        return LabelSmallLineHeight;
    }

    /* renamed from: getLabelSmallSize-XSAIIZE  reason: not valid java name */
    public final long m35255getLabelSmallSizeXSAIIZE() {
        return LabelSmallSize;
    }

    /* renamed from: getLabelSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m35256getLabelSmallTrackingXSAIIZE() {
        return LabelSmallTracking;
    }

    public final FontWeight getLabelSmallWeight() {
        return LabelSmallWeight;
    }

    public final GenericFontFamily getTitleLargeFont() {
        return TitleLargeFont;
    }

    /* renamed from: getTitleLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35257getTitleLargeLineHeightXSAIIZE() {
        return TitleLargeLineHeight;
    }

    /* renamed from: getTitleLargeSize-XSAIIZE  reason: not valid java name */
    public final long m35258getTitleLargeSizeXSAIIZE() {
        return TitleLargeSize;
    }

    /* renamed from: getTitleLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m35259getTitleLargeTrackingXSAIIZE() {
        return TitleLargeTracking;
    }

    public final FontWeight getTitleLargeWeight() {
        return TitleLargeWeight;
    }

    public final GenericFontFamily getTitleMediumFont() {
        return TitleMediumFont;
    }

    /* renamed from: getTitleMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35260getTitleMediumLineHeightXSAIIZE() {
        return TitleMediumLineHeight;
    }

    /* renamed from: getTitleMediumSize-XSAIIZE  reason: not valid java name */
    public final long m35261getTitleMediumSizeXSAIIZE() {
        return TitleMediumSize;
    }

    /* renamed from: getTitleMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m35262getTitleMediumTrackingXSAIIZE() {
        return TitleMediumTracking;
    }

    public final FontWeight getTitleMediumWeight() {
        return TitleMediumWeight;
    }

    public final GenericFontFamily getTitleSmallFont() {
        return TitleSmallFont;
    }

    /* renamed from: getTitleSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m35263getTitleSmallLineHeightXSAIIZE() {
        return TitleSmallLineHeight;
    }

    /* renamed from: getTitleSmallSize-XSAIIZE  reason: not valid java name */
    public final long m35264getTitleSmallSizeXSAIIZE() {
        return TitleSmallSize;
    }

    /* renamed from: getTitleSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m35265getTitleSmallTrackingXSAIIZE() {
        return TitleSmallTracking;
    }

    public final FontWeight getTitleSmallWeight() {
        return TitleSmallWeight;
    }
}
