package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.node.Ref;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 implements ExposedDropdownMenuBoxScope {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ Density $density;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1<Boolean, C11921v> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(boolean z, Function1<? super Boolean, C11921v> function1, int i, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Density density) {
        this.$expanded = z;
        this.$onExpandedChange = function1;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
        this.$density = density;
    }

    public Modifier exposedDropdownSize(Modifier modifier, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        Density density = this.$density;
        MutableState<Integer> mutableState = this.$menuHeight$delegate;
        MutableState<Integer> mutableState2 = this.$width$delegate;
        Modifier r7 = SizeKt.m33326heightInVpY3zN4$default(modifier, 0.0f, density.m38446toDpu2uoSUM(ExposedDropdownMenuKt.m34421ExposedDropdownMenuBox$lambda4(mutableState)), 1, (Object) null);
        if (z) {
            return SizeKt.m33343width3ABfNKs(r7, density.m38446toDpu2uoSUM(ExposedDropdownMenuKt.m34419ExposedDropdownMenuBox$lambda1(mutableState2)));
        }
        return r7;
    }

    public Modifier menuAnchor(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0854xae1e15a0();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0856x44cc52d6(this.$expanded, this.$onExpandedChange, this.$$dirty, this.$focusRequester, this.$coordinates, this.$view, this.$verticalMarginInPx, this.$width$delegate, this.$menuHeight$delegate));
    }
}
