package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,350:1\n76#2:351\n102#2,2:352\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n*L\n340#1:351\n340#1:352,2\n*E\n"})
/* compiled from: LazyListItemPlacementAnimator.kt */
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
    public final long m33429getTargetOffsetnOccac() {
        return this.targetOffset;
    }

    public final void setInProgress(boolean z) {
        this.inProgress$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setMainAxisSize(int i) {
        this.mainAxisSize = i;
    }

    /* renamed from: setTargetOffset--gyyYBs  reason: not valid java name */
    public final void m33430setTargetOffsetgyyYBs(long j) {
        this.targetOffset = j;
    }

    private PlaceableInfo(long j, int i) {
        this.mainAxisSize = i;
        this.animatedOffset = new Animatable(IntOffset.m38577boximpl(j), VectorConvertersKt.getVectorConverter(IntOffset.Companion), (Object) null, 4, (DefaultConstructorMarker) null);
        this.targetOffset = j;
        this.inProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
