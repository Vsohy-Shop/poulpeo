package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.graphics.TransformOrigin;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: EnterExitTransition.kt */
public final class Scale {
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    public /* synthetic */ Scale(float f, long j, FiniteAnimationSpec finiteAnimationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, finiteAnimationSpec);
    }

    /* renamed from: copy-bnNdC4k$default  reason: not valid java name */
    public static /* synthetic */ Scale m32867copybnNdC4k$default(Scale scale2, float f, long j, FiniteAnimationSpec<Float> finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            f = scale2.scale;
        }
        if ((i & 2) != 0) {
            j = scale2.transformOrigin;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = scale2.animationSpec;
        }
        return scale2.m32869copybnNdC4k(f, j, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* renamed from: component2-SzJe1aQ  reason: not valid java name */
    public final long m32868component2SzJe1aQ() {
        return this.transformOrigin;
    }

    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    /* renamed from: copy-bnNdC4k  reason: not valid java name */
    public final Scale m32869copybnNdC4k(float f, long j, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new Scale(f, j, finiteAnimationSpec, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale2 = (Scale) obj;
        if (C12775o.m28634d(Float.valueOf(this.scale), Float.valueOf(scale2.scale)) && TransformOrigin.m36087equalsimpl0(this.transformOrigin, scale2.transformOrigin) && C12775o.m28634d(this.animationSpec, scale2.animationSpec)) {
            return true;
        }
        return false;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public final long m32870getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + TransformOrigin.m36090hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + TransformOrigin.m36091toStringimpl(this.transformOrigin) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f, long j, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f;
        this.transformOrigin = j;
        this.animationSpec = finiteAnimationSpec;
    }
}
