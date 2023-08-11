package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p404of.C13088o;

@ExperimentalComposeApi
/* compiled from: SnapshotContextElement.kt */
public interface SnapshotContextElement extends C12079g.C12082b {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: SnapshotContextElement.kt */
    public static final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return C12079g.C12082b.C12083a.m26262a(snapshotContextElement, r, oVar);
        }

        public static <E extends C12079g.C12082b> E get(SnapshotContextElement snapshotContextElement, C12079g.C12084c<E> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26263b(snapshotContextElement, cVar);
        }

        public static C12079g minusKey(SnapshotContextElement snapshotContextElement, C12079g.C12084c<?> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26264c(snapshotContextElement, cVar);
        }

        public static C12079g plus(SnapshotContextElement snapshotContextElement, C12079g gVar) {
            C12775o.m28639i(gVar, "context");
            return C12079g.C12082b.C12083a.m26265d(snapshotContextElement, gVar);
        }
    }

    /* compiled from: SnapshotContextElement.kt */
    public static final class Key implements C12079g.C12084c<SnapshotContextElement> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    /* synthetic */ <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar);

    /* synthetic */ <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar);

    /* synthetic */ C12079g.C12084c<?> getKey();

    /* synthetic */ C12079g minusKey(C12079g.C12084c<?> cVar);

    /* synthetic */ C12079g plus(C12079g gVar);
}
