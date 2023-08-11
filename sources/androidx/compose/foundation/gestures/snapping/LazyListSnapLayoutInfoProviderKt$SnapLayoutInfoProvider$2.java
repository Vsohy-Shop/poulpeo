package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;
import p436tf.C13522b;

@SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,130:1\n33#2,6:131\n132#2,3:137\n33#2,4:140\n135#2,2:144\n38#2:146\n137#2:147\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2\n*L\n73#1:131,6\n93#1:137,3\n93#1:140,4\n93#1:144,2\n93#1:146\n93#1:147\n*E\n"})
/* compiled from: LazyListSnapLayoutInfoProvider.kt */
public final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2 implements SnapLayoutInfoProvider {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ C13089p<Density, Float, Float, Float> $positionInLayout;

    LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2(LazyListState lazyListState, C13089p<? super Density, ? super Float, ? super Float, Float> pVar) {
        this.$lazyListState = lazyListState;
        this.$positionInLayout = pVar;
    }

    private final LazyListLayoutInfo getLayoutInfo() {
        return this.$lazyListState.getLayoutInfo();
    }

    public float calculateApproachOffset(Density density, float f) {
        boolean z;
        C12775o.m28639i(density, "<this>");
        float c = C13537l.m30876c(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f)) - calculateSnapStepSize(density), 0.0f);
        if (c == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c;
        }
        return c * Math.signum(f);
    }

    public float calculateSnapStepSize(Density density) {
        C12775o.m28639i(density, "<this>");
        LazyListLayoutInfo layoutInfo = getLayoutInfo();
        if (!(!layoutInfo.getVisibleItemsInfo().isEmpty())) {
            return 0.0f;
        }
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += visibleItemsInfo.get(i2).getSize();
        }
        return ((float) i) / ((float) layoutInfo.getVisibleItemsInfo().size());
    }

    public C13522b<Float> calculateSnappingOffsetBounds(Density density) {
        C12775o.m28639i(density, "<this>");
        List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        C13089p<Density, Float, Float, Float> pVar = this.$positionInLayout;
        int size = visibleItemsInfo.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float calculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i), pVar);
            if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                f = calculateDistanceToDesiredSnapPosition;
            }
            if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                f2 = calculateDistanceToDesiredSnapPosition;
            }
        }
        return C13536k.m30875b(f, f2);
    }
}
