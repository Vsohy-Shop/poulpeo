package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

@StabilityInferred(parameters = 0)
/* compiled from: Animatable.kt */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    public Animatable(T t, TwoWayConverter<T, V> twoWayConverter, T t2) {
        C12775o.m28639i(twoWayConverter, "typeConverter");
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t2;
        this.internalState = new AnimationState(twoWayConverter, t, (AnimationVector) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec(0.0f, 0.0f, t2, 3, (DefaultConstructorMarker) null);
        V createVector = createVector(t, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = createVector;
        V createVector2 = createVector(t, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = createVector2;
        this.lowerBoundVector = createVector;
        this.upperBoundVector = createVector2;
    }

    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, C12074d dVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, dVar);
    }

    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, C12074d dVar, int i, Object obj3) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            obj2 = animatable.getVelocity();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj4, function1, dVar);
    }

    /* access modifiers changed from: private */
    public final T clampToBounds(T t) {
        if (C12775o.m28634d(this.lowerBoundVector, this.negativeInfinityBounds) && C12775o.m28634d(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t);
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        boolean z = false;
        for (int i = 0; i < size$animation_core_release; i++) {
            if (animationVector.get$animation_core_release(i) < this.lowerBoundVector.get$animation_core_release(i) || animationVector.get$animation_core_release(i) > this.upperBoundVector.get$animation_core_release(i)) {
                animationVector.set$animation_core_release(i, C13537l.m30885l(animationVector.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i)));
                z = true;
            }
        }
        if (z) {
            return this.typeConverter.getConvertFromVector().invoke(animationVector);
        }
        return t;
    }

    private final V createVector(T t, float f) {
        V v = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t);
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            v.set$animation_core_release(i, f);
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t, Function1<? super Animatable<T, V>, C11921v> function1, C12074d<? super AnimationResult<T, V>> dVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, (MutatePriority) null, new Animatable$runAnimation$2(this, t, animation, this.internalState.getLastFrameTimeNanos(), function1, (C12074d<? super Animatable$runAnimation$2>) null), dVar, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue$delegate.setValue(t);
    }

    public static /* synthetic */ void updateBounds$default(Animatable animatable, T t, T t2, int i, Object obj) {
        if ((i & 1) != 0) {
            t = animatable.lowerBound;
        }
        if ((i & 2) != 0) {
            t2 = animatable.upperBound;
        }
        animatable.updateBounds(t, t2);
    }

    public final Object animateDecay(T t, DecayAnimationSpec<T> decayAnimationSpec, Function1<? super Animatable<T, V>, C11921v> function1, C12074d<? super AnimationResult<T, V>> dVar) {
        return runAnimation(new DecayAnimation(decayAnimationSpec, this.typeConverter, getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t)), t, function1, dVar);
    }

    public final Object animateTo(T t, AnimationSpec<T> animationSpec, T t2, Function1<? super Animatable<T, V>, C11921v> function1, C12074d<? super AnimationResult<T, V>> dVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, function1, dVar);
    }

    public final State<T> asState() {
        return this.internalState;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final Object snapTo(T t, C12074d<? super C11921v> dVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, (MutatePriority) null, new Animatable$snapTo$2(this, t, (C12074d<? super Animatable$snapTo$2>) null), dVar, 1, (Object) null);
        if (mutate$default == C12150d.m26492c()) {
            return mutate$default;
        }
        return C11921v.f18618a;
    }

    public final Object stop(C12074d<? super C11921v> dVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, (MutatePriority) null, new Animatable$stop$2(this, (C12074d<? super Animatable$stop$2>) null), dVar, 1, (Object) null);
        if (mutate$default == C12150d.m26492c()) {
            return mutate$default;
        }
        return C11921v.f18618a;
    }

    public final void updateBounds(T t, T t2) {
        V v;
        V v2;
        boolean z;
        if (t == null || (v = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t)) == null) {
            v = this.negativeInfinityBounds;
        }
        if (t2 == null || (v2 = (AnimationVector) this.typeConverter.getConvertToVector().invoke(t2)) == null) {
            v2 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        int i = 0;
        while (i < size$animation_core_release) {
            if (v.get$animation_core_release(i) <= v2.get$animation_core_release(i)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i++;
            } else {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v + " is greater than upper bound " + v2 + " on index " + i).toString());
            }
        }
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
        this.upperBound = t2;
        this.lowerBound = t;
        if (!isRunning()) {
            Object clampToBounds = clampToBounds(getValue());
            if (!C12775o.m28634d(clampToBounds, getValue())) {
                this.internalState.setValue$animation_core_release(clampToBounds);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2);
    }
}
