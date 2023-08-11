package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,767:1\n76#2:768\n102#2,2:769\n76#2:771\n102#2,2:772\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n58#1:768\n58#1:769,2\n64#1:771\n64#1:772,2\n*E\n"})
@Stable
/* compiled from: WindowInsets.android.kt */
public final class AndroidWindowInsets implements WindowInsets {
    private final MutableState insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final MutableState isVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i, String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.type = i;
        this.name = str;
    }

    private final void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidWindowInsets)) {
            return false;
        }
        if (this.type == ((AndroidWindowInsets) obj).type) {
            return true;
        }
        return false;
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return getInsets$foundation_layout_release().bottom;
    }

    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets$delegate.getValue();
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().left;
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().right;
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return getInsets$foundation_layout_release().top;
    }

    public final int getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(Insets insets) {
        C12775o.m28639i(insets, "<set-?>");
        this.insets$delegate.setValue(insets);
    }

    public String toString() {
        return this.name + '(' + getInsets$foundation_layout_release().left + ", " + getInsets$foundation_layout_release().top + ", " + getInsets$foundation_layout_release().right + ", " + getInsets$foundation_layout_release().bottom + ')';
    }

    public final void update$foundation_layout_release(WindowInsetsCompat windowInsetsCompat, int i) {
        C12775o.m28639i(windowInsetsCompat, "windowInsetsCompat");
        if (i == 0 || (i & this.type) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }
}
