package androidx.compose.runtime;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ Set<Object> $readSet;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(Set<Object> set) {
        super(1);
        this.$readSet = set;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        this.$readSet.add(obj);
    }
}
