package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,522:1\n154#2:523\n154#2:524\n154#2:525\n154#2:526\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n507#1:523\n494#1:524\n499#1:525\n512#1:526\n*E\n"})
/* compiled from: BackdropScaffold.kt */
public final class BackdropScaffoldDefaults {
    public static final int $stable = 0;
    private static final float FrontLayerElevation = C1232Dp.m38468constructorimpl((float) 1);
    private static final float HeaderHeight = C1232Dp.m38468constructorimpl((float) 48);
    public static final BackdropScaffoldDefaults INSTANCE = new BackdropScaffoldDefaults();
    private static final float PeekHeight = C1232Dp.m38468constructorimpl((float) 56);

    private BackdropScaffoldDefaults() {
    }

    /* renamed from: getFrontLayerElevation-D9Ej5fM  reason: not valid java name */
    public final float m33880getFrontLayerElevationD9Ej5fM() {
        return FrontLayerElevation;
    }

    @Composable
    public final long getFrontLayerScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(1806270648);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806270648, i, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:517)");
        }
        long r0 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m33956getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    public final Shape getFrontLayerShape(Composer composer, int i) {
        composer.startReplaceableGroup(1580588700);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580588700, i, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:505)");
        }
        float f = (float) 16;
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge(), CornerSizeKt.m33611CornerSize0680j_4(C1232Dp.m38468constructorimpl(f)), CornerSizeKt.m33611CornerSize0680j_4(C1232Dp.m38468constructorimpl(f)), (CornerSize) null, (CornerSize) null, 12, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return copy$default;
    }

    /* renamed from: getHeaderHeight-D9Ej5fM  reason: not valid java name */
    public final float m33881getHeaderHeightD9Ej5fM() {
        return HeaderHeight;
    }

    /* renamed from: getPeekHeight-D9Ej5fM  reason: not valid java name */
    public final float m33882getPeekHeightD9Ej5fM() {
        return PeekHeight;
    }
}
