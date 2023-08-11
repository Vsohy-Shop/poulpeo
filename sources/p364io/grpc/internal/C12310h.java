package p364io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;

/* renamed from: io.grpc.internal.h */
/* compiled from: AtomicBackoff */
public final class C12310h {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Logger f19493c = Logger.getLogger(C12310h.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f19494a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicLong f19495b;

    /* renamed from: io.grpc.internal.h$b */
    /* compiled from: AtomicBackoff */
    public final class C12312b {

        /* renamed from: a */
        private final long f19496a;

        /* renamed from: a */
        public void mo49925a() {
            long j = this.f19496a;
            long max = Math.max(2 * j, j);
            if (C12310h.this.f19495b.compareAndSet(this.f19496a, max)) {
                C12310h.f19493c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C12310h.this.f19494a, Long.valueOf(max)});
            }
        }

        /* renamed from: b */
        public long mo49926b() {
            return this.f19496a;
        }

        private C12312b(long j) {
            this.f19496a = j;
        }
    }

    public C12310h(String str, long j) {
        boolean z;
        AtomicLong atomicLong = new AtomicLong();
        this.f19495b = atomicLong;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15746e(z, "value must be positive");
        this.f19494a = str;
        atomicLong.set(j);
    }

    /* renamed from: d */
    public C12312b mo49924d() {
        return new C12312b(this.f19495b.get());
    }
}
