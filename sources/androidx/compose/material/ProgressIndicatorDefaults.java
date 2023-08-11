package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,587:1\n154#2:588\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n*L\n471#1:588\n*E\n"})
/* compiled from: ProgressIndicator.kt */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    public static final float IndicatorBackgroundOpacity = 0.24f;
    private static final SpringSpec<Float> ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    private static final float StrokeWidth = C1232Dp.m38468constructorimpl((float) 4);

    private ProgressIndicatorDefaults() {
    }

    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m34075getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }
}
