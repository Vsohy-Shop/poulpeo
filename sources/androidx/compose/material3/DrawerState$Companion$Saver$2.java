package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: NavigationDrawer.kt */
final class DrawerState$Companion$Saver$2 extends C12777p implements Function1<DrawerValue, DrawerState> {
    final /* synthetic */ Function1<DrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerState$Companion$Saver$2(Function1<? super DrawerValue, Boolean> function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    public final DrawerState invoke(DrawerValue drawerValue) {
        C12775o.m28639i(drawerValue, "it");
        return new DrawerState(drawerValue, this.$confirmStateChange);
    }
}
