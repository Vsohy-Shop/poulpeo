package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        C12775o.m28639i(animations, "anims");
        this.anims = animations;
    }

    public long getDurationNanos(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        Iterator it = C13537l.m30893t(0, v.getSize$animation_core_release()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((C12703l0) it).nextInt();
            j = Math.max(j, this.anims.get(nextInt).getDurationNanos(v.get$animation_core_release(nextInt), v2.get$animation_core_release(nextInt), v3.get$animation_core_release(nextInt)));
        }
        return j;
    }

    public V getEndVelocity(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = AnimationVectorsKt.newInstance(v3);
        }
        V v4 = this.endVelocityVector;
        if (v4 == null) {
            C12775o.m28656z("endVelocityVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v5 = this.endVelocityVector;
            if (v5 == null) {
                C12775o.m28656z("endVelocityVector");
                v5 = null;
            }
            v5.set$animation_core_release(i, this.anims.get(i).getEndVelocity(v.get$animation_core_release(i), v2.get$animation_core_release(i), v3.get$animation_core_release(i)));
        }
        V v6 = this.endVelocityVector;
        if (v6 != null) {
            return v6;
        }
        C12775o.m28656z("endVelocityVector");
        return null;
    }

    public V getValueFromNanos(long j, V v, V v2, V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        C12775o.m28639i(v4, "initialValue");
        C12775o.m28639i(v5, "targetValue");
        C12775o.m28639i(v6, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.newInstance(v);
        }
        V v7 = this.valueVector;
        if (v7 == null) {
            C12775o.m28656z("valueVector");
            v7 = null;
        }
        int size$animation_core_release = v7.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v8 = this.valueVector;
            if (v8 == null) {
                C12775o.m28656z("valueVector");
                v8 = null;
            }
            v8.set$animation_core_release(i, this.anims.get(i).getValueFromNanos(j, v4.get$animation_core_release(i), v5.get$animation_core_release(i), v6.get$animation_core_release(i)));
        }
        V v9 = this.valueVector;
        if (v9 != null) {
            return v9;
        }
        C12775o.m28656z("valueVector");
        return null;
    }

    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        C12775o.m28639i(v4, "initialValue");
        C12775o.m28639i(v5, "targetValue");
        C12775o.m28639i(v6, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.newInstance(v3);
        }
        V v7 = this.velocityVector;
        if (v7 == null) {
            C12775o.m28656z("velocityVector");
            v7 = null;
        }
        int size$animation_core_release = v7.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v8 = this.velocityVector;
            if (v8 == null) {
                C12775o.m28656z("velocityVector");
                v8 = null;
            }
            v8.set$animation_core_release(i, this.anims.get(i).getVelocityFromNanos(j, v4.get$animation_core_release(i), v5.get$animation_core_release(i), v6.get$animation_core_release(i)));
        }
        V v9 = this.velocityVector;
        if (v9 != null) {
            return v9;
        }
        C12775o.m28656z("velocityVector");
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this((Animations) new Animations() {
            public FloatAnimationSpec get(int i) {
                return floatAnimationSpec;
            }
        });
        C12775o.m28639i(floatAnimationSpec, "anim");
    }
}
