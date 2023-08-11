package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n154#2:685\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n*L\n588#1:685\n*E\n"})
/* compiled from: ModalBottomSheet.kt */
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    private static final float Elevation = C1232Dp.m38468constructorimpl((float) 16);
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();

    private ModalBottomSheetDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m34048getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(-112572414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112572414, i, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:594)");
        }
        long r0 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m33951getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }
}
