package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
final class NestedReadonlySnapshot$readObserver$1$1$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ Function1<Object, C11921v> $it;
    final /* synthetic */ Function1<Object, C11921v> $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedReadonlySnapshot$readObserver$1$1$1(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        super(1);
        this.$readObserver = function1;
        this.$it = function12;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "state");
        this.$readObserver.invoke(obj);
        this.$it.invoke(obj);
    }
}
