package androidx.compose.material;

import android.view.View;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.node.Ref;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1(View view, Ref<LayoutCoordinates> ref, int i, MutableState<Integer> mutableState) {
        super(0);
        this.$view = view;
        this.$coordinates = ref;
        this.$verticalMarginInPx = i;
        this.$menuHeight$delegate = mutableState;
    }

    public final void invoke() {
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
