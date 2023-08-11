package p331dg;

import kotlin.jvm.internal.C12775o;
import p331dg.C11822d0;

/* renamed from: dg.e0 */
/* compiled from: ConcurrentLinkedList.kt */
public final class C11824e0<S extends C11822d0<S>> {
    /* renamed from: b */
    public static final S m25454b(Object obj) {
        if (obj != C11821d.f18465a) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C11822d0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: c */
    public static final boolean m25455c(Object obj) {
        if (obj == C11821d.f18465a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <S extends C11822d0<S>> Object m25453a(Object obj) {
        return obj;
    }
}
