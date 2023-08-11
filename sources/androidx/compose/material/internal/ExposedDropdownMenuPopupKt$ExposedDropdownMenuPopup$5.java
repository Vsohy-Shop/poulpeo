package androidx.compose.material.internal;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntRectKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ExposedDropdownMenuPopup.kt */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "childCoordinates");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        C12775o.m28636f(parentLayoutCoordinates);
        long r0 = parentLayoutCoordinates.m37341getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        this.$popupLayout.setParentBounds(IntRectKt.m38618IntRectVbeCjmY(IntOffsetKt.IntOffset(C13265c.m30134c(Offset.m35422getXimpl(positionInWindow)), C13265c.m30134c(Offset.m35423getYimpl(positionInWindow))), r0));
        this.$popupLayout.updatePosition();
    }
}
