package p471ze;

import java.util.concurrent.atomic.AtomicInteger;
import p307af.C10885a;
import p386lg.C12860b;

/* renamed from: ze.h */
/* compiled from: HalfSerializer */
public final class C14114h {
    /* renamed from: a */
    public static void m32760a(C12860b<?> bVar, AtomicInteger atomicInteger, C14108c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = cVar.mo53885b();
            if (b != null) {
                bVar.onError(b);
            } else {
                bVar.mo50772b();
            }
        }
    }

    /* renamed from: b */
    public static void m32761b(C12860b<?> bVar, Throwable th, AtomicInteger atomicInteger, C14108c cVar) {
        if (!cVar.mo53884a(th)) {
            C10885a.m23270q(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(cVar.mo53885b());
        }
    }

    /* renamed from: c */
    public static <T> void m32762c(C12860b<? super T> bVar, T t, AtomicInteger atomicInteger, C14108c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.mo50773d(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = cVar.mo53885b();
                if (b != null) {
                    bVar.onError(b);
                } else {
                    bVar.mo50772b();
                }
            }
        }
    }
}
