package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: AnimationState.kt */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r5 = androidx.compose.animation.core.AnimationVectorsKt.copy(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnimationState(androidx.compose.animation.core.TwoWayConverter<T, V> r3, T r4, V r5, long r6, long r8, boolean r10) {
        /*
            r2 = this;
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r2.<init>()
            r2.typeConverter = r3
            r0 = 0
            r1 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r0, r1, r0)
            r2.value$delegate = r0
            if (r5 == 0) goto L_0x001a
            androidx.compose.animation.core.AnimationVector r5 = androidx.compose.animation.core.AnimationVectorsKt.copy(r5)
            if (r5 != 0) goto L_0x001e
        L_0x001a:
            androidx.compose.animation.core.AnimationVector r5 = androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(r3, r4)
        L_0x001e:
            r2.velocityVector = r5
            r2.lastFrameTimeNanos = r6
            r2.finishedTimeNanos = r8
            r2.isRunning = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimationState.<init>(androidx.compose.animation.core.TwoWayConverter, java.lang.Object, androidx.compose.animation.core.AnimationVector, long, long, boolean):void");
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.finishedTimeNanos = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning = z;
    }

    public void setValue$animation_core_release(T t) {
        this.value$delegate.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(V v) {
        C12775o.m28639i(v, "<set-?>");
        this.velocityVector = v;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
