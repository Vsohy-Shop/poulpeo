package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SnapshotStateList.kt */
final class SnapshotStateList$retainAll$1 extends C12777p implements Function1<List<T>, Boolean> {
    final /* synthetic */ Collection<T> $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateList$retainAll$1(Collection<? extends T> collection) {
        super(1);
        this.$elements = collection;
    }

    public final Boolean invoke(List<T> list) {
        C12775o.m28639i(list, "it");
        return Boolean.valueOf(list.retainAll(this.$elements));
    }
}
