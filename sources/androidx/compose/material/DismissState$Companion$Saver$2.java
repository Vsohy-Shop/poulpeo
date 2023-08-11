package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SwipeToDismiss.kt */
final class DismissState$Companion$Saver$2 extends C12777p implements Function1<DismissValue, DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DismissState$Companion$Saver$2(Function1<? super DismissValue, Boolean> function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    public final DismissState invoke(DismissValue dismissValue) {
        C12775o.m28639i(dismissValue, "it");
        return new DismissState(dismissValue, this.$confirmStateChange);
    }
}
