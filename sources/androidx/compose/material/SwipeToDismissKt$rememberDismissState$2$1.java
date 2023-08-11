package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: SwipeToDismiss.kt */
final class SwipeToDismissKt$rememberDismissState$2$1 extends C12777p implements C13074a<DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmStateChange;
    final /* synthetic */ DismissValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeToDismissKt$rememberDismissState$2$1(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = function1;
    }

    public final DismissState invoke() {
        return new DismissState(this.$initialValue, this.$confirmStateChange);
    }
}
