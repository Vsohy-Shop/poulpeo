package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Button.kt */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize = FilledButtonTokens.INSTANCE.m34952getIconSizeD9Ej5fM();
    private static final float IconSpacing;
    private static final float MinHeight = C1232Dp.m38468constructorimpl((float) 40);
    private static final float MinWidth = C1232Dp.m38468constructorimpl((float) 58);
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float r0 = C1232Dp.m38468constructorimpl((float) 24);
        ButtonHorizontalPadding = r0;
        float f = (float) 8;
        float r2 = C1232Dp.m38468constructorimpl(f);
        ButtonVerticalPadding = r2;
        PaddingValues r3 = PaddingKt.m33264PaddingValuesa9UjIt4(r0, r2, r0, r2);
        ContentPadding = r3;
        float r4 = C1232Dp.m38468constructorimpl((float) 16);
        ButtonWithIconHorizontalStartPadding = r4;
        ButtonWithIconContentPadding = PaddingKt.m33264PaddingValuesa9UjIt4(r4, r2, r0, r2);
        float r02 = C1232Dp.m38468constructorimpl((float) 12);
        TextButtonHorizontalPadding = r02;
        TextButtonContentPadding = PaddingKt.m33264PaddingValuesa9UjIt4(r02, r3.m33281calculateTopPaddingD9Ej5fM(), r02, r3.m33278calculateBottomPaddingD9Ej5fM());
        IconSpacing = C1232Dp.m38468constructorimpl(f);
    }

    private ButtonDefaults() {
    }

    @Composable
    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m34267buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-339300779);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:547)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: buttonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m34268buttonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(1827791191);
        if ((i2 & 1) != 0) {
            f6 = FilledButtonTokens.INSTANCE.m34947getContainerElevationD9Ej5fM();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = FilledButtonTokens.INSTANCE.m34953getPressedContainerElevationD9Ej5fM();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = FilledButtonTokens.INSTANCE.m34950getFocusContainerElevationD9Ej5fM();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = FilledButtonTokens.INSTANCE.m34951getHoverContainerElevationD9Ej5fM();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = FilledButtonTokens.INSTANCE.m34949getDisabledContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:674)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    /* renamed from: elevatedButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m34269elevatedButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1507908383);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:572)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: elevatedButtonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m34270elevatedButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(1065482445);
        if ((i2 & 1) != 0) {
            f6 = ElevatedButtonTokens.INSTANCE.m34863getContainerElevationD9Ej5fM();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = ElevatedButtonTokens.INSTANCE.m34869getPressedContainerElevationD9Ej5fM();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = ElevatedButtonTokens.INSTANCE.m34866getFocusContainerElevationD9Ej5fM();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = ElevatedButtonTokens.INSTANCE.m34867getHoverContainerElevationD9Ej5fM();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = ElevatedButtonTokens.INSTANCE.m34865getDisabledContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:700)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    /* renamed from: filledTonalButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m34271filledTonalButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1670757653);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:598)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: filledTonalButtonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m34272filledTonalButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(5982871);
        if ((i2 & 1) != 0) {
            f6 = FilledTonalButtonTokens.INSTANCE.m34970getContainerElevationD9Ej5fM();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = FilledTonalButtonTokens.INSTANCE.m34976getPressedContainerElevationD9Ej5fM();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = FilledTonalButtonTokens.INSTANCE.m34973getFocusContainerElevationD9Ej5fM();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = FilledTonalButtonTokens.INSTANCE.m34974getHoverContainerElevationD9Ej5fM();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = C1232Dp.m38468constructorimpl((float) 0);
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:727)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:526)");
        }
        Shape shape = ShapesKt.toShape(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getFilledTonalShape(Composer composer, int i) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:529)");
        }
        Shape shape = ShapesKt.toShape(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34273getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m34274getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m34275getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m34276getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:744)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke r5 = BorderStrokeKt.m32976BorderStrokecXLIe8U(outlinedButtonTokens.m35053getOutlineWidthD9Ej5fM(), ColorSchemeKt.toColor(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r5;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:532)");
        }
        Shape shape = ShapesKt.toShape(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:523)");
        }
        Shape shape = ShapesKt.toShape(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    public final Shape getTextShape(Composer composer, int i) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:535)");
        }
        Shape shape = ShapesKt.toShape(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: outlinedButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m34277outlinedButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1778526249);
        if ((i2 & 1) != 0) {
            j5 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:624)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    /* renamed from: textButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m34278textButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1402274782);
        if ((i2 & 1) != 0) {
            j5 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:648)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }
}
