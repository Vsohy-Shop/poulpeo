package p037b6;

import java.io.InputStream;

/* renamed from: b6.t */
public final class C2930t extends C2928s {

    /* renamed from: b */
    private final C2928s f1328b;

    /* renamed from: c */
    private final long f1329c;

    /* renamed from: d */
    private final long f1330d;

    public C2930t(C2928s sVar, long j, long j2) {
        this.f1328b = sVar;
        long k = m2404k(j);
        this.f1329c = k;
        this.f1330d = m2404k(k + j2);
    }

    /* renamed from: k */
    private final long m2404k(long j) {
        if (j < 0) {
            return 0;
        }
        if (j > this.f1328b.mo28468a()) {
            return this.f1328b.mo28468a();
        }
        return j;
    }

    /* renamed from: a */
    public final long mo28468a() {
        return this.f1330d - this.f1329c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo28469b(long j, long j2) {
        long k = m2404k(this.f1329c);
        return this.f1328b.mo28469b(k, m2404k(j2 + k) - k);
    }

    public final void close() {
    }
}
