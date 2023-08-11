package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* compiled from: MonotonicFrameClock.kt */
public interface MonotonicFrameClock extends C12079g.C12082b {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: MonotonicFrameClock.kt */
    public static final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return C12079g.C12082b.C12083a.m26262a(monotonicFrameClock, r, oVar);
        }

        public static <E extends C12079g.C12082b> E get(MonotonicFrameClock monotonicFrameClock, C12079g.C12084c<E> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26263b(monotonicFrameClock, cVar);
        }

        @Deprecated
        public static C12079g.C12084c<?> getKey(MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        public static C12079g minusKey(MonotonicFrameClock monotonicFrameClock, C12079g.C12084c<?> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26264c(monotonicFrameClock, cVar);
        }

        public static C12079g plus(MonotonicFrameClock monotonicFrameClock, C12079g gVar) {
            C12775o.m28639i(gVar, "context");
            return C12079g.C12082b.C12083a.m26265d(monotonicFrameClock, gVar);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    public static final class Key implements C12079g.C12084c<MonotonicFrameClock> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    /* synthetic */ <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar);

    /* synthetic */ <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar);

    C12079g.C12084c<?> getKey() {
        return Key;
    }

    /* synthetic */ C12079g minusKey(C12079g.C12084c<?> cVar);

    /* synthetic */ C12079g plus(C12079g gVar);

    <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar);
}
