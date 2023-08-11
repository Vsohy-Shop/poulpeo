package androidx.compose.p002ui.window;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 */
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$7 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$7(PopupLayout popupLayout) {
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
        this.$popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
    }
}
