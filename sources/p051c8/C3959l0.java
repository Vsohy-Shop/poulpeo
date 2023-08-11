package p051c8;

import java.util.concurrent.TimeUnit;
import p268w8.C10143d;
import p268w8.C10146e;
import p268w8.C10150g;

/* renamed from: c8.l0 */
/* compiled from: GrpcClient */
public class C3959l0 {

    /* renamed from: a */
    private final C10150g.C10152b f3104a;

    C3959l0(C10150g.C10152b bVar) {
        this.f3104a = bVar;
    }

    /* renamed from: a */
    public C10146e mo29990a(C10143d dVar) {
        return ((C10150g.C10152b) this.f3104a.mo46130d(30000, TimeUnit.MILLISECONDS)).mo44749h(dVar);
    }
}
