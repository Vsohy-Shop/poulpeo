package androidx.compose.p002ui;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p404of.C13088o;

@Stable
/* renamed from: androidx.compose.ui.MotionDurationScale */
/* compiled from: MotionDurationScale.kt */
public interface MotionDurationScale extends C12079g.C12082b {
    public static final Key Key = Key.$$INSTANCE;

    /* renamed from: androidx.compose.ui.MotionDurationScale$DefaultImpls */
    /* compiled from: MotionDurationScale.kt */
    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return C12079g.C12082b.C12083a.m26262a(motionDurationScale, r, oVar);
        }

        public static <E extends C12079g.C12082b> E get(MotionDurationScale motionDurationScale, C12079g.C12084c<E> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26263b(motionDurationScale, cVar);
        }

        public static C12079g minusKey(MotionDurationScale motionDurationScale, C12079g.C12084c<?> cVar) {
            C12775o.m28639i(cVar, "key");
            return C12079g.C12082b.C12083a.m26264c(motionDurationScale, cVar);
        }

        public static C12079g plus(MotionDurationScale motionDurationScale, C12079g gVar) {
            C12775o.m28639i(gVar, "context");
            return C12079g.C12082b.C12083a.m26265d(motionDurationScale, gVar);
        }
    }

    /* renamed from: androidx.compose.ui.MotionDurationScale$Key */
    /* compiled from: MotionDurationScale.kt */
    public static final class Key implements C12079g.C12084c<MotionDurationScale> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    /* synthetic */ <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar);

    /* synthetic */ <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar);

    C12079g.C12084c<?> getKey() {
        return Key;
    }

    float getScaleFactor();

    /* synthetic */ C12079g minusKey(C12079g.C12084c<?> cVar);

    /* synthetic */ C12079g plus(C12079g gVar);
}
