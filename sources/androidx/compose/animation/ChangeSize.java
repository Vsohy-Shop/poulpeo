package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: EnterExitTransition.kt */
public final class ChangeSize {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final Function1<IntSize, IntSize> size;

    public ChangeSize(Alignment alignment2, Function1<? super IntSize, IntSize> function1, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        C12775o.m28639i(alignment2, "alignment");
        C12775o.m28639i(function1, "size");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        this.alignment = alignment2;
        this.size = function1;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z;
    }

    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment2, Function1<IntSize, IntSize> function1, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment2 = changeSize.alignment;
        }
        if ((i & 2) != 0) {
            function1 = changeSize.size;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i & 8) != 0) {
            z = changeSize.clip;
        }
        return changeSize.copy(alignment2, function1, finiteAnimationSpec, z);
    }

    public final Alignment component1() {
        return this.alignment;
    }

    public final Function1<IntSize, IntSize> component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment2, Function1<? super IntSize, IntSize> function1, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        C12775o.m28639i(alignment2, "alignment");
        C12775o.m28639i(function1, "size");
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        return new ChangeSize(alignment2, function1, finiteAnimationSpec, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        if (C12775o.m28634d(this.alignment, changeSize.alignment) && C12775o.m28634d(this.size, changeSize.size) && C12775o.m28634d(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip) {
            return true;
        }
        return false;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final Function1<IntSize, IntSize> getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = ((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31;
        boolean z = this.clip;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeSize(Alignment alignment2, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment2, (i & 2) != 0 ? C03281.INSTANCE : function1, finiteAnimationSpec, (i & 8) != 0 ? true : z);
    }
}
