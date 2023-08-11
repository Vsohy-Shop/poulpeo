package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SnapshotState.kt */
final class SnapshotMutableStateImpl$component2$1 extends C12777p implements Function1<T, C11921v> {
    final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotMutableStateImpl$component2$1(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
        super(1);
        this.this$0 = snapshotMutableStateImpl;
    }

    public final void invoke(T t) {
        this.this$0.setValue(t);
    }
}
