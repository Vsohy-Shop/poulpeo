package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: FloatingActionButton.kt */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m34898getIconSizeD9Ej5fM();

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m34446bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return floatingActionButtonDefaults.m34447bottomAppBarFabElevationa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4  reason: not valid java name */
    public final FloatingActionButtonElevation m34447bottomAppBarFabElevationa9UjIt4(float f, float f2, float f3, float f4) {
        return new FloatingActionButtonElevation(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    @Composable
    /* renamed from: elevation-xZ9-QkE  reason: not valid java name */
    public final FloatingActionButtonElevation m34448elevationxZ9QkE(float f, float f2, float f3, float f4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-241106249);
        if ((i2 & 1) != 0) {
            f = FabPrimaryTokens.INSTANCE.m34915getContainerElevationD9Ej5fM();
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = FabPrimaryTokens.INSTANCE.m34925getPressedContainerElevationD9Ej5fM();
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = FabPrimaryTokens.INSTANCE.m34918getFocusContainerElevationD9Ej5fM();
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = FabPrimaryTokens.INSTANCE.m34919getHoverContainerElevationD9Ej5fM();
        }
        float f8 = f4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:421)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f5, f6, f7, f8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(1855656391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:407)");
        }
        long color = ColorSchemeKt.toColor(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final Shape getExtendedFabShape(Composer composer, int i) {
        composer.startReplaceableGroup(-536021915);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:403)");
        }
        Shape shape = ShapesKt.toShape(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34449getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    @Composable
    public final Shape getLargeShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1835912187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:400)");
        }
        Shape shape = ShapesKt.toShape(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-53247565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:394)");
        }
        Shape shape = ShapesKt.toShape(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getSmallShape(Composer composer, int i) {
        composer.startReplaceableGroup(394933381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:397)");
        }
        Shape shape = ShapesKt.toShape(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: loweredElevation-xZ9-QkE  reason: not valid java name */
    public final FloatingActionButtonElevation m34450loweredElevationxZ9QkE(float f, float f2, float f3, float f4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-285065125);
        if ((i2 & 1) != 0) {
            f = FabPrimaryTokens.INSTANCE.m34921getLoweredContainerElevationD9Ej5fM();
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = FabPrimaryTokens.INSTANCE.m34924getLoweredPressedContainerElevationD9Ej5fM();
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = FabPrimaryTokens.INSTANCE.m34922getLoweredFocusContainerElevationD9Ej5fM();
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = FabPrimaryTokens.INSTANCE.m34923getLoweredHoverContainerElevationD9Ej5fM();
        }
        float f8 = f4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:444)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f5, f6, f7, f8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }
}
