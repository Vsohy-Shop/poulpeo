package p230t3;

import p139k3.C8539i;
import p139k3.C8549o;

/* renamed from: t3.b */
/* compiled from: AutoValue_PersistedEvent */
final class C9605b extends C9627k {

    /* renamed from: a */
    private final long f14303a;

    /* renamed from: b */
    private final C8549o f14304b;

    /* renamed from: c */
    private final C8539i f14305c;

    C9605b(long j, C8549o oVar, C8539i iVar) {
        this.f14303a = j;
        if (oVar != null) {
            this.f14304b = oVar;
            if (iVar != null) {
                this.f14305c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public C8539i mo44080b() {
        return this.f14305c;
    }

    /* renamed from: c */
    public long mo44081c() {
        return this.f14303a;
    }

    /* renamed from: d */
    public C8549o mo44082d() {
        return this.f14304b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9627k)) {
            return false;
        }
        C9627k kVar = (C9627k) obj;
        if (this.f14303a != kVar.mo44081c() || !this.f14304b.equals(kVar.mo44082d()) || !this.f14305c.equals(kVar.mo44080b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f14303a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f14304b.hashCode()) * 1000003) ^ this.f14305c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f14303a + ", transportContext=" + this.f14304b + ", event=" + this.f14305c + "}";
    }
}
