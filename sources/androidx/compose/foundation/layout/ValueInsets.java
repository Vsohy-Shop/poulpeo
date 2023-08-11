package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n365#1:675\n365#1:676,2\n*E\n"})
@Stable
/* compiled from: WindowInsets.kt */
public final class ValueInsets implements WindowInsets {
    private final String name;
    private final MutableState value$delegate;

    public ValueInsets(InsetsValues insetsValues, String str) {
        C12775o.m28639i(insetsValues, "insets");
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.name = str;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueInsets)) {
            return false;
        }
        return C12775o.m28634d(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return getValue$foundation_layout_release().getBottom();
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getLeft();
    }

    public final String getName() {
        return this.name;
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getRight();
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return getValue$foundation_layout_release().getTop();
    }

    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(InsetsValues insetsValues) {
        C12775o.m28639i(insetsValues, "<set-?>");
        this.value$delegate.setValue(insetsValues);
    }

    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
