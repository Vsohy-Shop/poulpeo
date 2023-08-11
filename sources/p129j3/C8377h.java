package p129j3;

/* renamed from: j3.h */
/* compiled from: AutoValue_LogResponse */
final class C8377h extends C8389n {

    /* renamed from: a */
    private final long f11882a;

    C8377h(long j) {
        this.f11882a = j;
    }

    /* renamed from: c */
    public long mo42398c() {
        return this.f11882a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8389n)) {
            return false;
        }
        if (this.f11882a == ((C8389n) obj).mo42398c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f11882a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f11882a + "}";
    }
}
