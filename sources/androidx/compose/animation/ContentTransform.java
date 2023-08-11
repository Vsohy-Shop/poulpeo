package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
@ExperimentalAnimationApi
/* compiled from: AnimatedContent.kt */
public final class ContentTransform {
    public static final int $stable = 8;
    private final ExitTransition initialContentExit;
    private SizeTransform sizeTransform;
    private final EnterTransition targetContentEnter;
    private final MutableState targetContentZIndex$delegate;

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform2) {
        C12775o.m28639i(enterTransition, "targetContentEnter");
        C12775o.m28639i(exitTransition, "initialContentExit");
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.sizeTransform = sizeTransform2;
    }

    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float getTargetContentZIndex() {
        return ((Number) this.targetContentZIndex$delegate.getValue()).floatValue();
    }

    public final void setSizeTransform$animation_release(SizeTransform sizeTransform2) {
        this.sizeTransform = sizeTransform2;
    }

    public final void setTargetContentZIndex(float f) {
        this.targetContentZIndex$delegate.setValue(Float.valueOf(f));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enterTransition, exitTransition, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, (C13088o) null, 3, (Object) null) : sizeTransform2);
    }
}
