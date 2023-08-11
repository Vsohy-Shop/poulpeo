package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$rememberDrawerState$2$1 extends C12777p implements C13074a<DrawerState> {
    final /* synthetic */ Function1<DrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ DrawerValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$rememberDrawerState$2$1(DrawerValue drawerValue, Function1<? super DrawerValue, Boolean> function1) {
        super(0);
        this.$initialValue = drawerValue;
        this.$confirmStateChange = function1;
    }

    public final DrawerState invoke() {
        return new DrawerState(this.$initialValue, this.$confirmStateChange);
    }
}
