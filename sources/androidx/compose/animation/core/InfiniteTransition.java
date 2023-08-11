package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@StabilityInferred(parameters = 0)
/* compiled from: InfiniteTransition.kt */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final MutableVector<TransitionAnimationState<?, ?>> animations = new MutableVector<>(new TransitionAnimationState[16], 0);
    private final MutableState isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final MutableState refreshChildNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    /* access modifiers changed from: private */
    public long startTimeNanos = Long.MIN_VALUE;

    /* compiled from: InfiniteTransition.kt */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        final /* synthetic */ InfiniteTransition this$0;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, T t, T t2, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec2) {
            C12775o.m28639i(twoWayConverter, "typeConverter");
            C12775o.m28639i(animationSpec2, "animationSpec");
            this.this$0 = infiniteTransition;
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = twoWayConverter;
            this.animationSpec = animationSpec2;
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.animation = new TargetBasedAnimation((AnimationSpec) this.animationSpec, (TwoWayConverter) twoWayConverter, (Object) this.initialValue, (Object) this.targetValue, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue() {
            return this.initialValue;
        }

        public final long getPlayTimeNanosOffset() {
            return this.playTimeNanosOffset;
        }

        public final boolean getStartOnTheNextFrame() {
            return this.startOnTheNextFrame;
        }

        public final T getTargetValue() {
            return this.targetValue;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged(long j) {
            this.this$0.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j;
            }
            long j2 = j - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j2));
            this.isFinished = this.animation.isFinishedFromNanos(j2);
        }

        public final void reset() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            C12775o.m28639i(targetBasedAnimation, "<set-?>");
            this.animation = targetBasedAnimation;
        }

        public final void setAnimationSpec(AnimationSpec<T> animationSpec2) {
            C12775o.m28639i(animationSpec2, "<set-?>");
            this.animationSpec = animationSpec2;
        }

        public final void setFinished(boolean z) {
            this.isFinished = z;
        }

        public final void setInitialValue(T t) {
            this.initialValue = t;
        }

        public final void setPlayTimeNanosOffset(long j) {
            this.playTimeNanosOffset = j;
        }

        public final void setStartOnTheNextFrame(boolean z) {
            this.startOnTheNextFrame = z;
        }

        public final void setTargetValue(T t) {
            this.targetValue = t;
        }

        public void setValue$animation_core_release(T t) {
            this.value$delegate.setValue(t);
        }

        public final void skipToEnd() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues(T t, T t2, AnimationSpec<T> animationSpec2) {
            C12775o.m28639i(animationSpec2, "animationSpec");
            this.initialValue = t;
            this.targetValue = t2;
            this.animationSpec = animationSpec2;
            this.animation = new TargetBasedAnimation((AnimationSpec) animationSpec2, (TwoWayConverter) this.typeConverter, (Object) t, (Object) t2, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
            this.this$0.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void onFrame(long j) {
        boolean z;
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this.animations;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            z = true;
            int i = 0;
            do {
                TransitionAnimationState transitionAnimationState = (TransitionAnimationState) content[i];
                if (!transitionAnimationState.isFinished()) {
                    transitionAnimationState.onPlayTimeChanged(j);
                }
                if (!transitionAnimationState.isFinished()) {
                    z = false;
                }
                i++;
            } while (i < size);
        } else {
            z = true;
        }
        setRunning(!z);
    }

    /* access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        C12775o.m28639i(transitionAnimationState, "animation");
        this.animations.add(transitionAnimationState);
        setRefreshChildNeeded(true);
    }

    public final MutableVector<TransitionAnimationState<?, ?>> getAnimations$animation_core_release() {
        return this.animations;
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        C12775o.m28639i(transitionAnimationState, "animation");
        this.animations.remove(transitionAnimationState);
    }

    @Composable
    public final void run$animation_core_release(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if (isRunning() || getRefreshChildNeeded()) {
            EffectsKt.LaunchedEffect((Object) this, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new InfiniteTransition$run$1(this, (C12074d<? super InfiniteTransition$run$1>) null), startRestartGroup, 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new InfiniteTransition$run$2(this, i));
        }
    }
}
