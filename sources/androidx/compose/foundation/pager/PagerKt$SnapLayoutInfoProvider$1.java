package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p436tf.C13522b;

@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n1#1,781:1\n33#2,6:782\n132#2,3:788\n33#2,4:791\n135#2,2:795\n38#2:797\n137#2:798\n116#2,2:799\n33#2,6:801\n118#2:807\n776#3,4:808\n776#3,4:812\n776#3,4:816\n776#3,4:820\n776#3,4:824\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n*L\n597#1:782,6\n620#1:788,3\n620#1:791,4\n620#1:795,2\n620#1:797\n620#1:798\n635#1:799,2\n635#1:801,6\n635#1:807\n637#1:808,4\n653#1:812,4\n663#1:816,4\n667#1:820,4\n677#1:824,4\n*E\n"})
/* compiled from: Pager.kt */
public final class PagerKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {
    final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
    final /* synthetic */ PagerSnapDistance $pagerSnapDistance;
    final /* synthetic */ PagerState $pagerState;

    PagerKt$SnapLayoutInfoProvider$1(PagerState pagerState, DecayAnimationSpec<Float> decayAnimationSpec, PagerSnapDistance pagerSnapDistance) {
        this.$pagerState = pagerState;
        this.$decayAnimationSpec = decayAnimationSpec;
        this.$pagerSnapDistance = pagerSnapDistance;
    }

    public float calculateApproachOffset(Density density, float f) {
        int i;
        LazyListItemInfo lazyListItemInfo;
        int i2;
        double d;
        boolean z;
        C12775o.m28639i(density, "<this>");
        int pageSize$foundation_release = this.$pagerState.getPageSize$foundation_release() + this.$pagerState.getPageSpacing$foundation_release();
        float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(this.$decayAnimationSpec, 0.0f, f);
        LazyListItemInfo firstVisiblePage$foundation_release = this.$pagerState.getFirstVisiblePage$foundation_release();
        if (firstVisiblePage$foundation_release != null) {
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            i = firstVisiblePage$foundation_release.getIndex();
            if (i3 < 0) {
                i++;
            }
        } else {
            i = this.$pagerState.getCurrentPage();
        }
        List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = visibleItemsInfo.get(i4);
            if (lazyListItemInfo.getIndex() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i4++;
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        if (lazyListItemInfo2 != null) {
            i2 = lazyListItemInfo2.getOffset();
        } else {
            i2 = 0;
        }
        float f2 = (((float) (i * pageSize$foundation_release)) + calculateTargetValue) / ((float) pageSize$foundation_release);
        if (f > 0.0f) {
            d = Math.ceil((double) f2);
        } else {
            d = Math.floor((double) f2);
        }
        int d2 = C13537l.m30877d(Math.abs((C13537l.m30886m(this.$pagerSnapDistance.calculateTargetPage(i, C13537l.m30886m((int) ((float) d), 0, this.$pagerState.getPageCount$foundation_release()), f, this.$pagerState.getPageSize$foundation_release(), this.$pagerState.getPageSpacing$foundation_release()), 0, this.$pagerState.getPageCount$foundation_release()) - i) * pageSize$foundation_release) - Math.abs(i2), 0);
        if (d2 == 0) {
            return (float) d2;
        }
        return ((float) d2) * Math.signum(f);
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
        int size = visibleItemsInfo.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float calculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i), PagerStateKt.getSnapAlignmentStartToStart());
            if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                f = calculateDistanceToDesiredSnapPosition;
            }
            if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                f2 = calculateDistanceToDesiredSnapPosition;
            }
        }
        return C13536k.m30875b(f, f2);
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.$pagerState.getLayoutInfo$foundation_release();
    }
}
