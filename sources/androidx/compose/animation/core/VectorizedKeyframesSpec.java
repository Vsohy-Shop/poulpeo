package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11906l;

@StabilityInferred(parameters = 0)
/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final Map<Integer, C11906l<V, Easing>> keyframes;
    private V valueVector;
    private V velocityVector;

    public VectorizedKeyframesSpec(Map<Integer, ? extends C11906l<? extends V, ? extends Easing>> map, int i, int i2) {
        C12775o.m28639i(map, "keyframes");
        this.keyframes = map;
        this.durationMillis = i;
        this.delayMillis = i2;
    }

    private final void init(V v) {
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.newInstance(v);
            this.velocityVector = AnimationVectorsKt.newInstance(v);
        }
    }

    public int getDelayMillis() {
        return this.delayMillis;
    }

    public int getDurationMillis() {
        return this.durationMillis;
    }

    public V getValueFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        int access$clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j / AnimationKt.MillisToNanos);
        if (this.keyframes.containsKey(Integer.valueOf(access$clampPlayTime))) {
            return (AnimationVector) ((C11906l) C12716r0.m28417h(this.keyframes, Integer.valueOf(access$clampPlayTime))).mo49111c();
        }
        if (access$clampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (access$clampPlayTime <= 0) {
            return v;
        }
        int durationMillis2 = getDurationMillis();
        Easing linearEasing = EasingKt.getLinearEasing();
        int i = 0;
        V v4 = v;
        int i2 = 0;
        for (Map.Entry next : this.keyframes.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            C11906l lVar = (C11906l) next.getValue();
            if (access$clampPlayTime > intValue && intValue >= i2) {
                v4 = (AnimationVector) lVar.mo49111c();
                linearEasing = (Easing) lVar.mo49112d();
                i2 = intValue;
            } else if (access$clampPlayTime < intValue && intValue <= durationMillis2) {
                v2 = (AnimationVector) lVar.mo49111c();
                durationMillis2 = intValue;
            }
        }
        float transform = linearEasing.transform(((float) (access$clampPlayTime - i2)) / ((float) (durationMillis2 - i2)));
        init(v);
        int size$animation_core_release = v4.getSize$animation_core_release();
        while (true) {
            V v5 = null;
            if (i >= size$animation_core_release) {
                break;
            }
            V v6 = this.valueVector;
            if (v6 == null) {
                C12775o.m28656z("valueVector");
            } else {
                v5 = v6;
            }
            v5.set$animation_core_release(i, VectorConvertersKt.lerp(v4.get$animation_core_release(i), v2.get$animation_core_release(i), transform));
            i++;
        }
        V v7 = this.valueVector;
        if (v7 != null) {
            return v7;
        }
        C12775o.m28656z("valueVector");
        return null;
    }

    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        long access$clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j / AnimationKt.MillisToNanos);
        if (access$clampPlayTime <= 0) {
            return v3;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, access$clampPlayTime - 1, v, v2, v3);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, access$clampPlayTime, v, v2, v3);
        init(v);
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        int i = 0;
        while (true) {
            V v4 = null;
            if (i >= size$animation_core_release) {
                break;
            }
            V v5 = this.velocityVector;
            if (v5 == null) {
                C12775o.m28656z("velocityVector");
            } else {
                v4 = v5;
            }
            v4.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
            i++;
        }
        V v6 = this.velocityVector;
        if (v6 != null) {
            return v6;
        }
        C12775o.m28656z("velocityVector");
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
