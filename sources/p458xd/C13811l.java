package p458xd;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p458xd.C13799i;

/* renamed from: xd.l */
/* compiled from: CompressorRegistry */
public final class C13811l {

    /* renamed from: b */
    private static final C13811l f22265b = new C13811l(new C13799i.C13800a(), C13799i.C13801b.f22244a);

    /* renamed from: a */
    private final ConcurrentMap<String, C13809k> f22266a = new ConcurrentHashMap();

    C13811l(C13809k... kVarArr) {
        for (C13809k kVar : kVarArr) {
            this.f22266a.put(kVar.mo53452a(), kVar);
        }
    }

    /* renamed from: a */
    public static C13811l m31718a() {
        return f22265b;
    }

    /* renamed from: b */
    public C13809k mo53468b(String str) {
        return this.f22266a.get(str);
    }
}
