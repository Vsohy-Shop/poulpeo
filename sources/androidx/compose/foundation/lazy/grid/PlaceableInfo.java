package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,412:1\n76#2:413\n102#2,2:414\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/PlaceableInfo\n*L\n402#1:413\n402#1:414,2\n*E\n"})
/* compiled from: LazyGridItemPlacementAnimator.kt */
final class PlaceableInfo {
    private final Animatable<IntOffset, AnimationVector2D> animatedOffset;
    private final MutableState inProgress$delegate;
    private int mainAxisSize;
    private long targetOffset;

    public /* synthetic */ PlaceableInfo(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    public final Animatable<IntOffset, AnimationVector2D> getAnimatedOffset() {
        return this.animatedOffset;
    }

    public final boolean getInProgress() {
        return ((Boolean) this.inProgress$delegate.getValue()).booleanValue();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: getTargetOffset-nOcc-ac  reason: not valid java name */
    public final long m33509getTargetOffsetnOccac() {
        return this.targetOffset;
    }

    public final void setInProgress(boolean z) {
        this.inProgress$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setMainAxisSize(int i) {
        this.mainAxisSize = i;
    }

    /* renamed from: setTargetOffset--gyyYBs  reason: not valid java name */
    public final void m33510setTargetOffsetgyyYBs(long j) {
        this.targetOffset = j;
    }

    private PlaceableInfo(long j, int i) {
        this.mainAxisSize = i;
        this.animatedOffset = new Animatable(IntOffset.m38577boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.Companion), (Object) null, 4, (DefaultConstructorMarker) null);
        this.targetOffset = j;
        this.inProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
