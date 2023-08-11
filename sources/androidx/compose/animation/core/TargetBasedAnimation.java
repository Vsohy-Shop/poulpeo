package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Animation.kt */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final T targetValue;
    private final V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003b, code lost:
        r7 = androidx.compose.animation.core.AnimationVectorsKt.copy(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TargetBasedAnimation(androidx.compose.animation.core.VectorizedAnimationSpec<V> r3, androidx.compose.animation.core.TwoWayConverter<T, V> r4, T r5, T r6, V r7) {
        /*
            r2 = this;
            java.lang.String r0 = "animationSpec"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r2.<init>()
            r2.animationSpec = r3
            r2.typeConverter = r4
            r2.initialValue = r5
            r2.targetValue = r6
            androidx.compose.animation.core.TwoWayConverter r4 = r2.getTypeConverter()
            kotlin.jvm.functions.Function1 r4 = r4.getConvertToVector()
            java.lang.Object r4 = r4.invoke(r5)
            androidx.compose.animation.core.AnimationVector r4 = (androidx.compose.animation.core.AnimationVector) r4
            r2.initialValueVector = r4
            androidx.compose.animation.core.TwoWayConverter r6 = r2.getTypeConverter()
            kotlin.jvm.functions.Function1 r6 = r6.getConvertToVector()
            java.lang.Object r0 = r2.getTargetValue()
            java.lang.Object r6 = r6.invoke(r0)
            androidx.compose.animation.core.AnimationVector r6 = (androidx.compose.animation.core.AnimationVector) r6
            r2.targetValueVector = r6
            if (r7 == 0) goto L_0x0041
            androidx.compose.animation.core.AnimationVector r7 = androidx.compose.animation.core.AnimationVectorsKt.copy(r7)
            if (r7 != 0) goto L_0x0053
        L_0x0041:
            androidx.compose.animation.core.TwoWayConverter r7 = r2.getTypeConverter()
            kotlin.jvm.functions.Function1 r7 = r7.getConvertToVector()
            java.lang.Object r5 = r7.invoke(r5)
            androidx.compose.animation.core.AnimationVector r5 = (androidx.compose.animation.core.AnimationVector) r5
            androidx.compose.animation.core.AnimationVector r7 = androidx.compose.animation.core.AnimationVectorsKt.newInstance(r5)
        L_0x0053:
            r2.initialVelocityVector = r7
            long r0 = r3.getDurationNanos(r4, r6, r7)
            r2.durationNanos = r0
            androidx.compose.animation.core.AnimationVector r3 = r3.getEndVelocity(r4, r6, r7)
            r2.endVelocity = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TargetBasedAnimation.<init>(androidx.compose.animation.core.VectorizedAnimationSpec, androidx.compose.animation.core.TwoWayConverter, java.lang.Object, java.lang.Object, androidx.compose.animation.core.AnimationVector):void");
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public T getTargetValue() {
        return this.targetValue;
    }

    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public T getValueFromNanos(long j) {
        if (isFinishedFromNanos(j)) {
            return getTargetValue();
        }
        return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector));
    }

    public V getVelocityVectorFromNanos(long j) {
        if (isFinishedFromNanos(j)) {
            return this.endVelocity;
        }
        return this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
    }

    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedAnimationSpec, twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec2, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec2, twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TargetBasedAnimation(AnimationSpec<T> animationSpec2, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        this(animationSpec2.vectorize(twoWayConverter), twoWayConverter, t, t2, v);
        C12775o.m28639i(animationSpec2, "animationSpec");
        C12775o.m28639i(twoWayConverter, "typeConverter");
    }
}
