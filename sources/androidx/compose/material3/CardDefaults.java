package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Card.kt */
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @Composable
    /* renamed from: cardColors-ro_MJ88  reason: not valid java name */
    public final CardColors m34279cardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(-1589582123);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledCardTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m34359contentColorForek8zF_U(j5, composer2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
            j7 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(filledCardTokens.getDisabledContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.m34364surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), filledCardTokens.m34955getDisabledContainerElevationD9Ej5fM()));
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.m34359contentColorForek8zF_U(j5, composer2, i3 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i3, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:455)");
        }
        CardColors cardColors = new CardColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* renamed from: cardElevation-aqJV_2Y  reason: not valid java name */
    public final CardElevation m34280cardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(-574898487);
        if ((i2 & 1) != 0) {
            f7 = FilledCardTokens.INSTANCE.m34954getContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = FilledCardTokens.INSTANCE.m34960getPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = FilledCardTokens.INSTANCE.m34957getFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = FilledCardTokens.INSTANCE.m34958getHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = FilledCardTokens.INSTANCE.m34956getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = FilledCardTokens.INSTANCE.m34955getDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:373)");
        }
        CardElevation cardElevation = new CardElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @Composable
    /* renamed from: elevatedCardColors-ro_MJ88  reason: not valid java name */
    public final CardColors m34281elevatedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(139558303);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(ElevatedCardTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m34359contentColorForek8zF_U(j5, composer2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
            j7 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(elevatedCardTokens.getDisabledContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.m34364surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), elevatedCardTokens.m34871getDisabledContainerElevationD9Ej5fM()));
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i3, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:484)");
        }
        CardColors cardColors = new CardColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* renamed from: elevatedCardElevation-aqJV_2Y  reason: not valid java name */
    public final CardElevation m34282elevatedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(1154241939);
        if ((i2 & 1) != 0) {
            f7 = ElevatedCardTokens.INSTANCE.m34870getContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = ElevatedCardTokens.INSTANCE.m34876getPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = ElevatedCardTokens.INSTANCE.m34873getFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = ElevatedCardTokens.INSTANCE.m34874getHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = ElevatedCardTokens.INSTANCE.m34872getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = ElevatedCardTokens.INSTANCE.m34871getDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:401)");
        }
        CardElevation cardElevation = new CardElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @Composable
    public final Shape getElevatedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-133496185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:357)");
        }
        Shape shape = ShapesKt.toShape(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(1095404023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:360)");
        }
        Shape shape = ShapesKt.toShape(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(1266660211);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:354)");
        }
        Shape shape = ShapesKt.toShape(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final BorderStroke outlinedCardBorder(boolean z, Composer composer, int i, int i2) {
        long j;
        composer.startReplaceableGroup(-392936593);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:533)");
        }
        if (z) {
            composer.startReplaceableGroup(-31428837);
            j = ColorSchemeKt.toColor(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-31428766);
            OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            j = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(outlinedCardTokens.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.m34364surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), outlinedCardTokens.m35055getDisabledContainerElevationD9Ej5fM()));
            composer.endReplaceableGroup();
        }
        Color r9 = Color.m35661boximpl(j);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) r9);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m32976BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m35060getOutlineWidthD9Ej5fM(), j);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }

    @Composable
    /* renamed from: outlinedCardColors-ro_MJ88  reason: not valid java name */
    public final CardColors m34283outlinedCardColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(-1112362409);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(OutlinedCardTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m34359contentColorForek8zF_U(j5, composer2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = j5;
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i3, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:514)");
        }
        CardColors cardColors = new CardColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardColors;
    }

    @Composable
    /* renamed from: outlinedCardElevation-aqJV_2Y  reason: not valid java name */
    public final CardElevation m34284outlinedCardElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(-97678773);
        if ((i2 & 1) != 0) {
            f7 = OutlinedCardTokens.INSTANCE.m35054getContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = f7;
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = f7;
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = f7;
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = OutlinedCardTokens.INSTANCE.m35056getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = OutlinedCardTokens.INSTANCE.m35055getDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:429)");
        }
        CardElevation cardElevation = new CardElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }
}
