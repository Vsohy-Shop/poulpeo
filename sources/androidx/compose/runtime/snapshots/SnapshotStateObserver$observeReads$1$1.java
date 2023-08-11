package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: SnapshotStateObserver.kt */
final class SnapshotStateObserver$observeReads$1$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C13074a<C11921v> $block;
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateObserver$observeReads$1$1(SnapshotStateObserver snapshotStateObserver, C13074a<C11921v> aVar) {
        super(0);
        this.this$0 = snapshotStateObserver;
        this.$block = aVar;
    }

    public final void invoke() {
        Snapshot.Companion.observe(this.this$0.readObserver, (Function1<Object, C11921v>) null, this.$block);
    }
}
