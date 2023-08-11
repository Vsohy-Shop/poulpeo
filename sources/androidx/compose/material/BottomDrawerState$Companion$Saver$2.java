package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Drawer.kt */
final class BottomDrawerState$Companion$Saver$2 extends C12777p implements Function1<BottomDrawerValue, BottomDrawerState> {
    final /* synthetic */ Function1<BottomDrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomDrawerState$Companion$Saver$2(Function1<? super BottomDrawerValue, Boolean> function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    public final BottomDrawerState invoke(BottomDrawerValue bottomDrawerValue) {
        C12775o.m28639i(bottomDrawerValue, "it");
        return new BottomDrawerState(bottomDrawerValue, this.$confirmStateChange);
    }
}
