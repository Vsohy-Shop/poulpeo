package p364io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.internal.i */
/* compiled from: AtomicLongCounter */
final class C12320i implements C12244e1 {

    /* renamed from: a */
    private final AtomicLong f19538a = new AtomicLong();

    C12320i() {
    }

    public void add(long j) {
        this.f19538a.getAndAdd(j);
    }
}
