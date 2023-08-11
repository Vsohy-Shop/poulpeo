package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: SnapshotStateObserver.kt */
final class SnapshotStateObserver$applyObserver$1 extends C12777p implements C13088o<Set<? extends Object>, Snapshot, C11921v> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (Snapshot) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        C12775o.m28639i(set, "applied");
        C12775o.m28639i(snapshot, "<anonymous parameter 1>");
        this.this$0.addChanges(set);
        if (this.this$0.drainChanges()) {
            this.this$0.sendNotifications();
        }
    }
}
