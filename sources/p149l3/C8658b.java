package p149l3;

import p149l3.C8664g;

/* renamed from: l3.b */
/* compiled from: AutoValue_BackendResponse */
final class C8658b extends C8664g {

    /* renamed from: a */
    private final C8664g.C8665a f12380a;

    /* renamed from: b */
    private final long f12381b;

    C8658b(C8664g.C8665a aVar, long j) {
        if (aVar != null) {
            this.f12380a = aVar;
            this.f12381b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: b */
    public long mo42737b() {
        return this.f12381b;
    }

    /* renamed from: c */
    public C8664g.C8665a mo42738c() {
        return this.f12380a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8664g)) {
            return false;
        }
        C8664g gVar = (C8664g) obj;
        if (!this.f12380a.equals(gVar.mo42738c()) || this.f12381b != gVar.mo42737b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f12381b;
        return ((this.f12380a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f12380a + ", nextRequestWaitMillis=" + this.f12381b + "}";
    }
}
