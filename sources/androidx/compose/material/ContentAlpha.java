package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,132:1\n76#2:133\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n77#1:133\n*E\n"})
/* compiled from: ContentAlpha.kt */
public final class ContentAlpha {
    public static final int $stable = 0;
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    @Composable
    private final float contentAlpha(float f, float f2, Composer composer, int i) {
        composer.startReplaceableGroup(-1528360391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, i, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)");
        }
        long r0 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ((double) ColorKt.m35723luminance8_81llA(r0)) >= 0.5d : ((double) ColorKt.m35723luminance8_81llA(r0)) <= 0.5d) {
            f = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f;
    }

    @Composable
    public final float getDisabled(Composer composer, int i) {
        composer.startReplaceableGroup(621183615);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(621183615, i, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)");
        }
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @Composable
    public final float getHigh(Composer composer, int i) {
        composer.startReplaceableGroup(629162431);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629162431, i, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)");
        }
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @Composable
    public final float getMedium(Composer composer, int i) {
        composer.startReplaceableGroup(1999054879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1999054879, i, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)");
        }
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }
}
