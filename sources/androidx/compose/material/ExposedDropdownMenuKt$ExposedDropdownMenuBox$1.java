package androidx.compose.material;

import android.view.View;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.node.Ref;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(Ref<LayoutCoordinates> ref, View view, int i, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(1);
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "it");
        ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$2(this.$width$delegate, IntSize.m38628getWidthimpl(layoutCoordinates.m37341getSizeYbymL2g()));
        this.$coordinates.setValue(layoutCoordinates);
        View rootView = this.$view.getRootView();
        C12775o.m28638h(rootView, "view.rootView");
        int i = this.$verticalMarginInPx;
        final MutableState<Integer> mutableState = this.$menuHeight$delegate;
        ExposedDropdownMenuKt.updateHeight(rootView, this.$coordinates.getValue(), i, new Function1<Integer, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return C11921v.f18618a;
            }

            public final void invoke(int i) {
                ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$5(mutableState, i);
            }
        });
    }
}
