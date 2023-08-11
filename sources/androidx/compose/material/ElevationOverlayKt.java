package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.SnapshotMutationPolicy;

/* compiled from: ElevationOverlay.kt */
public final class ElevationOverlayKt {
    private static final ProvidableCompositionLocal<C1232Dp> LocalAbsoluteElevation = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, ElevationOverlayKt$LocalAbsoluteElevation$1.INSTANCE, 1, (Object) null);
    private static final ProvidableCompositionLocal<ElevationOverlay> LocalElevationOverlay = CompositionLocalKt.staticCompositionLocalOf(ElevationOverlayKt$LocalElevationOverlay$1.INSTANCE);

    /* access modifiers changed from: private */
    @ReadOnlyComposable
    @Composable
    /* renamed from: calculateForegroundColor-CLU3JFs  reason: not valid java name */
    public static final long m34013calculateForegroundColorCLU3JFs(long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long r9 = Color.m35670copywmQWz5c$default(ColorsKt.m33970contentColorForek8zF_U(j, composer, i & 14), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return r9;
    }

    public static final ProvidableCompositionLocal<C1232Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }

    public static final ProvidableCompositionLocal<ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }
}
