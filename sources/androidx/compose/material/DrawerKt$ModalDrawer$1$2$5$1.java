package androidx.compose.material;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$5$1 extends C12777p implements Function1<Density, IntOffset> {
    final /* synthetic */ DrawerState $drawerState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$5$1(DrawerState drawerState) {
        super(1);
        this.$drawerState = drawerState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m38577boximpl(m34002invokeBjo55l4((Density) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34002invokeBjo55l4(Density density) {
        C12775o.m28639i(density, "$this$offset");
        return IntOffsetKt.IntOffset(C13265c.m30134c(this.$drawerState.requireOffset$material_release()), 0);
    }
}
