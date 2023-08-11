package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SnapshotStateObserver.kt */
final class SnapshotStateObserver$readObserver$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.this$0 = snapshotStateObserver;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "state");
        if (!this.this$0.isPaused) {
            MutableVector access$getObservedScopeMaps$p = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (access$getObservedScopeMaps$p) {
                SnapshotStateObserver.ObservedScopeMap access$getCurrentMap$p = snapshotStateObserver.currentMap;
                C12775o.m28636f(access$getCurrentMap$p);
                access$getCurrentMap$p.recordRead(obj);
                C11921v vVar = C11921v.f18618a;
            }
        }
    }
}
