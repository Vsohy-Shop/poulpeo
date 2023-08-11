package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@Stable
/* compiled from: Transition.kt */
public final class Transition<S> {
    /* access modifiers changed from: private */
    public final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    /* access modifiers changed from: private */
    public final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final MutableState playTimeNanos$delegate;
    private final MutableState segment$delegate;
    private final MutableState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final MutableTransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    @InternalAnimationApi
    /* compiled from: Transition.kt */
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private Transition<S>.DeferredAnimation<T, V>.DeferredAnimationData<T, V> data;
        private final String label;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;

        /* compiled from: Transition.kt */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private Function1<? super S, ? extends T> targetValueByState;
            final /* synthetic */ Transition<S>.DeferredAnimation<T, V> this$0;
            private Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(DeferredAnimation deferredAnimation, Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1, Function1<? super S, ? extends T> function12) {
                C12775o.m28639i(transitionAnimationState, "animation");
                C12775o.m28639i(function1, "transitionSpec");
                C12775o.m28639i(function12, "targetValueByState");
                this.this$0 = deferredAnimation;
                this.animation = transitionAnimationState;
                this.transitionSpec = function1;
                this.targetValueByState = function12;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final Function1<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            public final Function1<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            public T getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(Function1<? super S, ? extends T> function1) {
                C12775o.m28639i(function1, "<set-?>");
                this.targetValueByState = function1;
            }

            public final void setTransitionSpec(Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1) {
                C12775o.m28639i(function1, "<set-?>");
                this.transitionSpec = function1;
            }

            public final void updateAnimationStates(Segment<S> segment) {
                C12775o.m28639i(segment, "segment");
                Object invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (this.this$0.this$0.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                    return;
                }
                this.animation.updateTargetValue$animation_core_release(invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
            }
        }

        public DeferredAnimation(Transition transition, TwoWayConverter<T, V> twoWayConverter, String str) {
            C12775o.m28639i(twoWayConverter, "typeConverter");
            C12775o.m28639i(str, "label");
            this.this$0 = transition;
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        public final State<T> animate(Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1, Function1<? super S, ? extends T> function12) {
            C12775o.m28639i(function1, "transitionSpec");
            C12775o.m28639i(function12, "targetValueByState");
            Transition<S>.DeferredAnimation<T, V>.DeferredAnimationData<T, V> deferredAnimationData = this.data;
            if (deferredAnimationData == null) {
                Transition<S> transition = this.this$0;
                deferredAnimationData = new DeferredAnimationData<>(this, new TransitionAnimationState(transition, function12.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, function12.invoke(this.this$0.getCurrentState())), this.typeConverter, this.label), function1, function12);
                Transition<S> transition2 = this.this$0;
                this.data = deferredAnimationData;
                transition2.addAnimation$animation_core_release(deferredAnimationData.getAnimation());
            }
            Transition<S> transition3 = this.this$0;
            deferredAnimationData.setTargetValueByState(function12);
            deferredAnimationData.setTransitionSpec(function1);
            deferredAnimationData.updateAnimationStates(transition3.getSegment());
            return deferredAnimationData;
        }

        public final Transition<S>.DeferredAnimation<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return this.data;
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimation<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data = deferredAnimationData;
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimation<T, V>.DeferredAnimationData<T, V> deferredAnimationData = this.data;
            if (deferredAnimationData != null) {
                Transition<S> transition = this.this$0;
                deferredAnimationData.getAnimation().updateInitialAndTargetValue$animation_core_release(deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getInitialState()), deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getTargetState()), deferredAnimationData.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* compiled from: Transition.kt */
    public interface Segment<S> {

        /* compiled from: Transition.kt */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s, S s2) {
                return Segment.super.isTransitioningTo(s, s2);
            }
        }

        S getInitialState();

        S getTargetState();

        boolean isTransitioningTo(S s, S s2) {
            if (!C12775o.m28634d(s, getInitialState()) || !C12775o.m28634d(s2, getTargetState())) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Transition.kt */
    private static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (!C12775o.m28634d(getInitialState(), segment.getInitialState()) || !C12775o.m28634d(getTargetState(), segment.getTargetState())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public S getInitialState() {
            return this.initialState;
        }

        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            int i;
            Object initialState2 = getInitialState();
            int i2 = 0;
            if (initialState2 != null) {
                i = initialState2.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            Object targetState2 = getTargetState();
            if (targetState2 != null) {
                i2 = targetState2.hashCode();
            }
            return i3 + i2;
        }
    }

    @Stable
    /* compiled from: Transition.kt */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null), (SnapshotMutationPolicy) null, 2, (Object) null);
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private final String label;
        private final MutableState needsReset$delegate;
        private final MutableState offsetTimeNanos$delegate;
        private final MutableState targetValue$delegate;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(Transition transition, T t, V v, TwoWayConverter<T, V> twoWayConverter, String str) {
            Object obj;
            C12775o.m28639i(v, "initialVelocityVector");
            C12775o.m28639i(twoWayConverter, "typeConverter");
            C12775o.m28639i(str, "label");
            this.this$0 = transition;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t, getTargetValue(), v), (SnapshotMutationPolicy) null, 2, (Object) null);
            this.isFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.offsetTimeNanos$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.needsReset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.velocityVector = v;
            Float f = (Float) VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                AnimationVector animationVector = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t);
                int size$animation_core_release = animationVector.getSize$animation_core_release();
                for (int i = 0; i < size$animation_core_release; i++) {
                    animationVector.set$animation_core_release(i, floatValue);
                }
                obj = this.typeConverter.getConvertFromVector().invoke(animationVector);
            } else {
                obj = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, obj, 3, (Object) null);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset$delegate.getValue()).booleanValue();
        }

        private final long getOffsetTimeNanos() {
            return ((Number) this.offsetTimeNanos$delegate.getValue()).longValue();
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setNeedsReset(boolean z) {
            this.needsReset$delegate.setValue(Boolean.valueOf(z));
        }

        private final void setOffsetTimeNanos(long j) {
            this.offsetTimeNanos$delegate.setValue(Long.valueOf(j));
        }

        private final void setTargetValue(T t) {
            this.targetValue$delegate.setValue(t);
        }

        private final void updateAnimation(T t, boolean z) {
            FiniteAnimationSpec<T> finiteAnimationSpec;
            if (!z) {
                finiteAnimationSpec = getAnimationSpec();
            } else if (getAnimationSpec() instanceof SpringSpec) {
                finiteAnimationSpec = getAnimationSpec();
            } else {
                finiteAnimationSpec = this.interruptionSpec;
            }
            setAnimation(new TargetBasedAnimation(finiteAnimationSpec, this.typeConverter, t, getTargetValue(), this.velocityVector));
            this.this$0.onChildAnimationUpdated();
        }

        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            transitionAnimationState.updateAnimation(obj, z);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j, float f) {
            boolean z;
            long j2;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j2 = getAnimation().getDurationNanos();
            } else {
                j2 = (long) (((float) (j - getOffsetTimeNanos())) / f);
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(j2));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j2);
            if (getAnimation().isFinishedFromNanos(j2)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void seekTo$animation_core_release(long j) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j);
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z));
        }

        public void setValue$animation_core_release(T t) {
            this.value$delegate.setValue(t);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec) {
            C12775o.m28639i(finiteAnimationSpec, "animationSpec");
            setTargetValue(t2);
            setAnimationSpec(finiteAnimationSpec);
            if (!C12775o.m28634d(getAnimation().getInitialValue(), t) || !C12775o.m28634d(getAnimation().getTargetValue(), t2)) {
                updateAnimation$default(this, t, false, 2, (Object) null);
            }
        }

        public final void updateTargetValue$animation_core_release(T t, FiniteAnimationSpec<T> finiteAnimationSpec) {
            C12775o.m28639i(finiteAnimationSpec, "animationSpec");
            if (!C12775o.m28634d(getTargetValue(), t) || getNeedsReset()) {
                setTargetValue(t);
                setAnimationSpec(finiteAnimationSpec);
                updateAnimation$default(this, (Object) null, !isFinished$animation_core_release(), 1, (Object) null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(this.this$0.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }
    }

    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        C12775o.m28639i(mutableTransitionState, "transitionState");
        this.transitionState = mutableTransitionState;
        this.label = str;
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.segment$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.playTimeNanos$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.startTimeNanos$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.updateChildrenNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2(this));
    }

    private final long getStartTimeNanos() {
        return ((Number) this.startTimeNanos$delegate.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long j = 0;
            for (TransitionAnimationState next : this._animations) {
                j = Math.max(j, next.getDurationNanos$animation_core_release());
                next.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setStartTimeNanos(long j) {
        this.startTimeNanos$delegate.setValue(Long.valueOf(j));
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        C12775o.m28639i(transitionAnimationState, "animation");
        return this._animations.add(transitionAnimationState);
    }

    public final boolean addTransition$animation_core_release(Transition<?> transition) {
        C12775o.m28639i(transition, "transition");
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(S s, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (!isSeeking()) {
            updateTarget$animation_core_release(s, startRestartGroup, (i2 & 14) | (i2 & 112));
            if (!C12775o.m28634d(s, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                int i5 = (i2 >> 3) & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed((Object) this);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new Transition$animateTo$1$1(this, (C12074d<? super Transition$animateTo$1$1>) null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect((Object) this, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue, startRestartGroup, i5);
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$animateTo$2(this, s, i));
        }
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public final long getPlayTimeNanos() {
        return ((Number) this.playTimeNanos$delegate.getValue()).longValue();
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final S getTargetState() {
        return this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        if (getStartTimeNanos() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long j, float f) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j - getStartTimeNanos());
        boolean z = true;
        for (TransitionAnimationState next : this._animations) {
            if (!next.isFinished$animation_core_release()) {
                next.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!next.isFinished$animation_core_release()) {
                z = false;
            }
        }
        for (Transition next2 : this._transitions) {
            if (!C12775o.m28634d(next2.getTargetState(), next2.getCurrentState())) {
                next2.onFrame$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!C12775o.m28634d(next2.getTargetState(), next2.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long j) {
        setStartTimeNanos(j);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        C12775o.m28639i(transitionAnimationState, "animation");
        this._animations.remove((Object) transitionAnimationState);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> transition) {
        C12775o.m28639i(transition, "transition");
        return this._transitions.remove((Object) transition);
    }

    public final void seek(S s, S s2, long j) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !C12775o.m28634d(getCurrentState(), s) || !C12775o.m28634d(getTargetState(), s2)) {
            setCurrentState$animation_core_release(s);
            setTargetState$animation_core_release(s2);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s, s2));
        }
        for (Transition next : this._transitions) {
            if (next.isSeeking()) {
                next.seek(next.getCurrentState(), next.getTargetState(), j);
            }
        }
        for (Transition<S>.TransitionAnimationState<?, ?> seekTo$animation_core_release : this._animations) {
            seekTo$animation_core_release.seekTo$animation_core_release(j);
        }
        this.lastSeekedTimeNanos = j;
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.transitionState.setCurrentState$animation_core_release(s);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j) {
        this.lastSeekedTimeNanos = j;
    }

    public final void setPlayTimeNanos(long j) {
        this.playTimeNanos$delegate.setValue(Long.valueOf(j));
    }

    public final void setSeeking$animation_core_release(boolean z) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState$animation_core_release(S s) {
        this.targetState$delegate.setValue(s);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    @Composable
    public final void updateTarget$animation_core_release(S s, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (!isSeeking() && !C12775o.m28634d(getTargetState(), s)) {
            setSegment(new SegmentImpl(getTargetState(), s));
            setCurrentState$animation_core_release(getTargetState());
            setTargetState$animation_core_release(s);
            if (!isRunning()) {
                setUpdateChildrenNeeded$animation_core_release(true);
            }
            for (Transition<S>.TransitionAnimationState<?, ?> resetAnimation$animation_core_release : this._animations) {
                resetAnimation$animation_core_release.resetAnimation$animation_core_release();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$updateTarget$2(this, s, i));
        }
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        TransitionAnimationState<?, ?> animation;
        C12775o.m28639i(deferredAnimation, "deferredAnimation");
        DeferredAnimation.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release != null && (animation = data$animation_core_release.getAnimation()) != null) {
            removeAnimation$animation_core_release((Transition<S>.TransitionAnimationState<?, ?>) animation);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i & 2) != 0 ? null : str);
    }

    public Transition(S s, String str) {
        this(new MutableTransitionState(s), str);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }
}
