package androidx.compose.material;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$3$1 extends C12777p implements C13074a<Float> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$3$1(float f, float f2, DrawerState drawerState) {
        super(0);
        this.$minValue = f;
        this.$maxValue = f2;
        this.$drawerState = drawerState;
    }

    public final Float invoke() {
        return Float.valueOf(DrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.requireOffset$material_release()));
    }
}
