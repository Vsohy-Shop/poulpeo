package androidx.compose.p002ui.text;

import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n76#2:53\n76#2:54\n76#2:55\n83#3,3:56\n1114#4,6:59\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n45#1:53\n46#1:54\n47#1:55\n49#1:56,3\n49#1:59,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.TextMeasurerHelperKt */
/* compiled from: TextMeasurerHelper.kt */
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 8;

    @ExperimentalTextApi
    @Composable
    public static final TextMeasurer rememberTextMeasurer(int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1538166871);
        if ((i3 & 1) != 0) {
            i = DefaultCacheSize;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Object[] objArr = {resolver, density, layoutDirection, Integer.valueOf(i)};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i4 = 0; i4 < 4; i4++) {
            z |= composer.changed(objArr[i4]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextMeasurer(resolver, density, layoutDirection, i);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextMeasurer textMeasurer = (TextMeasurer) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textMeasurer;
    }
}
