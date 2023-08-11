package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialRippleTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,139:1\n76#2:140\n76#2:141\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialRippleTheme\n*L\n129#1:140\n135#1:141\n*E\n"})
/* compiled from: MaterialTheme.kt */
final class MaterialRippleTheme implements RippleTheme {
    public static final MaterialRippleTheme INSTANCE = new MaterialRippleTheme();

    private MaterialRippleTheme() {
    }

    @Composable
    /* renamed from: defaultColor-WaAFU9c  reason: not valid java name */
    public long m34041defaultColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(550536719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(550536719, i, -1, "androidx.compose.material.MaterialRippleTheme.defaultColor (MaterialTheme.kt:127)");
        }
        long r0 = RippleTheme.Companion.m34238defaultRippleColor5vOe2sY(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    public RippleAlpha rippleAlpha(Composer composer, int i) {
        composer.startReplaceableGroup(-1419762518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1419762518, i, -1, "androidx.compose.material.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:133)");
        }
        RippleAlpha r6 = RippleTheme.Companion.m34237defaultRippleAlphaDxMtmZc(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), MaterialTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r6;
    }
}
