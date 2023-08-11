package androidx.compose.material.internal;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2\n*L\n1#1,475:1\n*E\n"})
/* compiled from: ExposedDropdownMenuPopup.kt */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {

    /* renamed from: $p */
    final /* synthetic */ Placeable f253$p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2(Placeable placeable) {
        super(1);
        this.f253$p = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(placementScope, this.f253$p, 0, 0, 0.0f, 4, (Object) null);
    }
}
