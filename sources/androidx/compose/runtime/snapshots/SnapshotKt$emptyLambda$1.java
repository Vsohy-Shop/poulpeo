package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Snapshot.kt */
final class SnapshotKt$emptyLambda$1 extends C12777p implements Function1<SnapshotIdSet, C11921v> {
    public static final SnapshotKt$emptyLambda$1 INSTANCE = new SnapshotKt$emptyLambda$1();

    SnapshotKt$emptyLambda$1() {
        super(1);
    }

    public final void invoke(SnapshotIdSet snapshotIdSet) {
        C12775o.m28639i(snapshotIdSet, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SnapshotIdSet) obj);
        return C11921v.f18618a;
    }
}
