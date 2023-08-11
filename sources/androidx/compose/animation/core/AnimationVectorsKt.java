package androidx.compose.animation.core;

import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;

/* compiled from: AnimationVectors.kt */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    public static final <T extends AnimationVector> T copy(T t) {
        C12775o.m28639i(t, "<this>");
        T newInstance = newInstance(t);
        int size$animation_core_release = newInstance.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            newInstance.set$animation_core_release(i, t.get$animation_core_release(i));
        }
        return newInstance;
    }

    public static final <T extends AnimationVector> void copyFrom(T t, T t2) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(t2, APIParams.SOURCE);
        int size$animation_core_release = t.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t.set$animation_core_release(i, t2.get$animation_core_release(i));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t) {
        C12775o.m28639i(t, "<this>");
        return t.newVector$animation_core_release();
    }

    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }
}
