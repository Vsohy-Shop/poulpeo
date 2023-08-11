package androidx.compose.p002ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy */
/* compiled from: InfiniteAnimationPolicy.kt */
public interface InfiniteAnimationPolicy extends C12079g.C12082b {
    public static final Key Key = Key.$$INSTANCE;

    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$DefaultImpls */
    /* compiled from: InfiniteAnimationPolicy.kt */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return C12079g.C12082b.C12083a.m26262a(infiniteAnimationPolicy, r, oVar);
        }

        public static <E extends C12079g.C12082b> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, C12079g.C12084c<E> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26263b(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        public static C12079g.C12084c<?> getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        public static C12079g minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, C12079g.C12084c<?> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26264c(infiniteAnimationPolicy, cVar);
        }

        public static C12079g plus(InfiniteAnimationPolicy infiniteAnimationPolicy, C12079g gVar) {
            C12775o.m28639i(gVar, "context");
            return C12079g.C12082b.C12083a.m26265d(infiniteAnimationPolicy, gVar);
        }
    }

    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$Key */
    /* compiled from: InfiniteAnimationPolicy.kt */
    public static final class Key implements C12079g.C12084c<InfiniteAnimationPolicy> {
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

    <R> Object onInfiniteOperation(Function1<? super C12074d<? super R>, ? extends Object> function1, C12074d<? super R> dVar);

    /* synthetic */ C12079g plus(C12079g gVar);
}
