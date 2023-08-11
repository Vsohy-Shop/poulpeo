package androidx.compose.material;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Drawer.kt */
final class DrawerKt$BottomDrawer$1$1$3$1 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ MutableState<Float> $drawerHeight$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$BottomDrawer$1$1$3$1(MutableState<Float> mutableState) {
        super(1);
        this.$drawerHeight$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "position");
        DrawerKt$BottomDrawer$1.invoke$lambda$2(this.$drawerHeight$delegate, (float) IntSize.m38627getHeightimpl(layoutCoordinates.m37341getSizeYbymL2g()));
    }
}
