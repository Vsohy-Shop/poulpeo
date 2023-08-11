package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p308ag.C10894d;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 */
/* compiled from: SnapshotFlow.kt */
final class C0948x2a9856a3 extends C12777p implements C13088o<Set<? extends Object>, Snapshot, C11921v> {
    final /* synthetic */ C10894d<Set<Object>> $appliedChanges;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0948x2a9856a3(C10894d<Set<Object>> dVar) {
        super(2);
        this.$appliedChanges = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (Snapshot) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        C12775o.m28639i(set, "changed");
        C12775o.m28639i(snapshot, "<anonymous parameter 1>");
        this.$appliedChanges.mo45894m(set);
    }
}
