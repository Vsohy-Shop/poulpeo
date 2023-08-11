package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12775o;

/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 implements ExposedDropdownMenuBoxScope {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(Density density, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        this.$density = density;
        this.$menuHeight$delegate = mutableState;
        this.$width$delegate = mutableState2;
    }

    public Modifier exposedDropdownSize(Modifier modifier, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        Density density = this.$density;
        MutableState<Integer> mutableState = this.$menuHeight$delegate;
        MutableState<Integer> mutableState2 = this.$width$delegate;
        Modifier r7 = SizeKt.m33326heightInVpY3zN4$default(modifier, 0.0f, density.m38446toDpu2uoSUM(ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$4(mutableState)), 1, (Object) null);
        if (z) {
            return SizeKt.m33343width3ABfNKs(r7, density.m38446toDpu2uoSUM(ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$1(mutableState2)));
        }
        return r7;
    }
}
