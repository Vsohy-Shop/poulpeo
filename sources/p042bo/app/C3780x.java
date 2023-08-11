package p042bo.app;

/* renamed from: bo.app.x */
public final class C3780x {

    /* renamed from: a */
    private final long f2755a;

    /* renamed from: b */
    private final int f2756b;

    public C3780x(long j, int i) {
        this.f2755a = j;
        this.f2756b = i;
    }

    /* renamed from: a */
    public final long mo29780a() {
        return this.f2755a;
    }

    /* renamed from: b */
    public final int mo29781b() {
        return this.f2756b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3780x)) {
            return false;
        }
        C3780x xVar = (C3780x) obj;
        if (this.f2755a == xVar.f2755a && this.f2756b == xVar.f2756b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f2755a) * 31) + Integer.hashCode(this.f2756b);
    }

    public String toString() {
        return "ContentCardRetryEvent(timeInMs=" + this.f2755a + ", retryCount=" + this.f2756b + ')';
    }
}
