package p364io.grpc.internal;

import p111h6.C8007k;
import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12546k;
import p364io.grpc.C12564o;
import p458xd.C13783d0;

/* renamed from: io.grpc.internal.t1 */
/* compiled from: PickSubchannelArgsImpl */
public final class C12432t1 extends C12546k.C12553f {

    /* renamed from: a */
    private final C12159b f19835a;

    /* renamed from: b */
    private final C12564o f19836b;

    /* renamed from: c */
    private final C13783d0<?, ?> f19837c;

    public C12432t1(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar) {
        this.f19837c = (C13783d0) C8012n.m15756o(d0Var, "method");
        this.f19836b = (C12564o) C8012n.m15756o(oVar, "headers");
        this.f19835a = (C12159b) C8012n.m15756o(bVar, "callOptions");
    }

    /* renamed from: a */
    public C12159b mo50085a() {
        return this.f19835a;
    }

    /* renamed from: b */
    public C12564o mo50086b() {
        return this.f19836b;
    }

    /* renamed from: c */
    public C13783d0<?, ?> mo50087c() {
        return this.f19837c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12432t1.class != obj.getClass()) {
            return false;
        }
        C12432t1 t1Var = (C12432t1) obj;
        if (!C8007k.m15735a(this.f19835a, t1Var.f19835a) || !C8007k.m15735a(this.f19836b, t1Var.f19836b) || !C8007k.m15735a(this.f19837c, t1Var.f19837c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8007k.m15736b(this.f19835a, this.f19836b, this.f19837c);
    }

    public final String toString() {
        return "[method=" + this.f19837c + " headers=" + this.f19836b + " callOptions=" + this.f19835a + "]";
    }
}
