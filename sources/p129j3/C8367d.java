package p129j3;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: j3.d */
/* compiled from: AutoValue_BatchedLogRequest */
final class C8367d extends C8381j {

    /* renamed from: a */
    private final List<C8387m> f11849a;

    C8367d(List<C8387m> list) {
        if (list != null) {
            this.f11849a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @NonNull
    /* renamed from: c */
    public List<C8387m> mo42350c() {
        return this.f11849a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8381j) {
            return this.f11849a.equals(((C8381j) obj).mo42350c());
        }
        return false;
    }

    public int hashCode() {
        return this.f11849a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f11849a + "}";
    }
}
