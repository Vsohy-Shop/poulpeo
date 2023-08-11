package androidx.compose.material3.internal;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ExposedDropdownMenuPopup.kt */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        int m = C12726w.m28526m(this.$placeables);
        if (m >= 0) {
            int i = 0;
            while (true) {
                Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeables.get(i), 0, 0, 0.0f, 4, (Object) null);
                if (i != m) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
