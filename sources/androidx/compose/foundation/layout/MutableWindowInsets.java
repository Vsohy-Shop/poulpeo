package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n81#1:675\n81#1:676,2\n*E\n"})
@ExperimentalLayoutApi
/* compiled from: WindowInsets.kt */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate;

    public MutableWindowInsets() {
        this((WindowInsets) null, 1, (DefaultConstructorMarker) null);
    }

    public int getBottom(Density density) {
        C12775o.m28639i(density, "density");
        return getInsets().getBottom(density);
    }

    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    public int getLeft(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return getInsets().getLeft(density, layoutDirection);
    }

    public int getRight(Density density, LayoutDirection layoutDirection) {
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return getInsets().getRight(density, layoutDirection);
    }

    public int getTop(Density density) {
        C12775o.m28639i(density, "density");
        return getInsets().getTop(density);
    }

    public final void setInsets(WindowInsets windowInsets) {
        C12775o.m28639i(windowInsets, "<set-?>");
        this.insets$delegate.setValue(windowInsets);
    }

    public MutableWindowInsets(WindowInsets windowInsets) {
        C12775o.m28639i(windowInsets, "initialInsets");
        this.insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
