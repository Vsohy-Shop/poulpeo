package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
final class SnapshotKt$mergedWriteObserver$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ Function1<Object, C11921v> $parentObserver;
    final /* synthetic */ Function1<Object, C11921v> $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotKt$mergedWriteObserver$1(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        super(1);
        this.$writeObserver = function1;
        this.$parentObserver = function12;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "state");
        this.$writeObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
    }
}
