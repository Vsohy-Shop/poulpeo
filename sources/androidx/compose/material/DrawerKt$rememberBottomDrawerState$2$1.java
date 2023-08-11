package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Drawer.kt */
final class DrawerKt$rememberBottomDrawerState$2$1 extends C12777p implements C13074a<BottomDrawerState> {
    final /* synthetic */ Function1<BottomDrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ BottomDrawerValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$rememberBottomDrawerState$2$1(BottomDrawerValue bottomDrawerValue, Function1<? super BottomDrawerValue, Boolean> function1) {
        super(0);
        this.$initialValue = bottomDrawerValue;
        this.$confirmStateChange = function1;
    }

    public final BottomDrawerState invoke() {
        return new BottomDrawerState(this.$initialValue, this.$confirmStateChange);
    }
}
