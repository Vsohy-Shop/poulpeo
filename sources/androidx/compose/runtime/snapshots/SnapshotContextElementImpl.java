package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C14043v2;

@ExperimentalComposeApi
/* compiled from: SnapshotContextElement.kt */
final class SnapshotContextElementImpl implements SnapshotContextElement, C14043v2<Snapshot> {
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot2) {
        C12775o.m28639i(snapshot2, "snapshot");
        this.snapshot = snapshot2;
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return SnapshotContextElement.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    public C12079g.C12084c<?> getKey() {
        return SnapshotContextElement.Key;
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, gVar);
    }

    public void restoreThreadContext(C12079g gVar, Snapshot snapshot2) {
        C12775o.m28639i(gVar, "context");
        this.snapshot.unsafeLeave(snapshot2);
    }

    public Snapshot updateThreadContext(C12079g gVar) {
        C12775o.m28639i(gVar, "context");
        return this.snapshot.unsafeEnter();
    }
}
