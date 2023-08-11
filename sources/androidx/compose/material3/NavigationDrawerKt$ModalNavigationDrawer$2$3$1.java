package androidx.compose.material3;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$ModalNavigationDrawer$2$3$1 extends C12777p implements C13074a<Float> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$ModalNavigationDrawer$2$3$1(float f, float f2, DrawerState drawerState) {
        super(0);
        this.$minValue = f;
        this.$maxValue = f2;
        this.$drawerState = drawerState;
    }

    public final Float invoke() {
        return Float.valueOf(NavigationDrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.getOffset().getValue().floatValue()));
    }
}
