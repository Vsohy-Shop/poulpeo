package androidx.compose.material3;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$DismissibleNavigationDrawer$1 extends C12777p implements C13088o<DrawerValue, DrawerValue, ThresholdConfig> {
    public static final NavigationDrawerKt$DismissibleNavigationDrawer$1 INSTANCE = new NavigationDrawerKt$DismissibleNavigationDrawer$1();

    NavigationDrawerKt$DismissibleNavigationDrawer$1() {
        super(2);
    }

    public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
        C12775o.m28639i(drawerValue, "<anonymous parameter 0>");
        C12775o.m28639i(drawerValue2, "<anonymous parameter 1>");
        return new FractionalThreshold(0.5f);
    }
}
