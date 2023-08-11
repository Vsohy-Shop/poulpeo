package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: LazyGridItemScopeImpl.kt */
final class AnimateItemPlacementModifier extends InspectorValueInfo implements ParentDataModifier {
    private final FiniteAnimationSpec<IntOffset> animationSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateItemPlacementModifier(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "inspectorInfo");
        this.animationSpec = finiteAnimationSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemPlacementModifier)) {
            return false;
        }
        return !C12775o.m28634d(this.animationSpec, ((AnimateItemPlacementModifier) obj).animationSpec);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return this.animationSpec.hashCode();
    }

    public Object modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        return this.animationSpec;
    }
}
