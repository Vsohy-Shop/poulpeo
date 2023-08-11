package p219s3;

import java.util.Map;
import p119i3.C8111d;
import p219s3.C9470f;
import p252v3.C9927a;

/* renamed from: s3.b */
/* compiled from: AutoValue_SchedulerConfig */
final class C9464b extends C9470f {

    /* renamed from: a */
    private final C9927a f14076a;

    /* renamed from: b */
    private final Map<C8111d, C9470f.C9472b> f14077b;

    C9464b(C9927a aVar, Map<C8111d, C9470f.C9472b> map) {
        if (aVar != null) {
            this.f14076a = aVar;
            if (map != null) {
                this.f14077b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C9927a mo43904e() {
        return this.f14076a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9470f)) {
            return false;
        }
        C9470f fVar = (C9470f) obj;
        if (!this.f14076a.equals(fVar.mo43904e()) || !this.f14077b.equals(fVar.mo43906h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<C8111d, C9470f.C9472b> mo43906h() {
        return this.f14077b;
    }

    public int hashCode() {
        return ((this.f14076a.hashCode() ^ 1000003) * 1000003) ^ this.f14077b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f14076a + ", values=" + this.f14077b + "}";
    }
}
