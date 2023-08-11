package com.google.android.gms.internal.gtm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.gtm.id */
final class C5391id {

    /* renamed from: a */
    private final ConcurrentHashMap<C5406jd, List<Throwable>> f6053a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f6054b = new ReferenceQueue<>();

    C5391id() {
    }

    /* renamed from: a */
    public final List<Throwable> mo33256a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f6054b.poll();
        while (poll != null) {
            this.f6053a.remove(poll);
            poll = this.f6054b.poll();
        }
        return this.f6053a.get(new C5406jd(th, (ReferenceQueue<Throwable>) null));
    }
}
