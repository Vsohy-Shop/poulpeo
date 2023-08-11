package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n154#2:235\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshDefaults\n*L\n218#1:234\n223#1:235\n*E\n"})
/* compiled from: PullRefreshState.kt */
public final class PullRefreshDefaults {
    public static final int $stable = 0;
    public static final PullRefreshDefaults INSTANCE = new PullRefreshDefaults();
    private static final float RefreshThreshold = C1232Dp.m38468constructorimpl((float) 80);
    private static final float RefreshingOffset = C1232Dp.m38468constructorimpl((float) 56);

    private PullRefreshDefaults() {
    }

    /* renamed from: getRefreshThreshold-D9Ej5fM  reason: not valid java name */
    public final float m34213getRefreshThresholdD9Ej5fM() {
        return RefreshThreshold;
    }

    /* renamed from: getRefreshingOffset-D9Ej5fM  reason: not valid java name */
    public final float m34214getRefreshingOffsetD9Ej5fM() {
        return RefreshingOffset;
    }
}
