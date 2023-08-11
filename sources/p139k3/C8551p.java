package p139k3;

import java.util.Set;
import p119i3.C8109b;
import p119i3.C8112e;
import p119i3.C8113f;
import p119i3.C8114g;

/* renamed from: k3.p */
/* compiled from: TransportFactoryImpl */
final class C8551p implements C8114g {

    /* renamed from: a */
    private final Set<C8109b> f12206a;

    /* renamed from: b */
    private final C8549o f12207b;

    /* renamed from: c */
    private final C8554s f12208c;

    C8551p(Set<C8109b> set, C8549o oVar, C8554s sVar) {
        this.f12206a = set;
        this.f12207b = oVar;
        this.f12208c = sVar;
    }

    /* renamed from: a */
    public <T> C8113f<T> mo41969a(String str, Class<T> cls, C8109b bVar, C8112e<T, byte[]> eVar) {
        if (this.f12206a.contains(bVar)) {
            return new C8553r(this.f12207b, str, bVar, eVar, this.f12208c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f12206a}));
    }

    /* renamed from: b */
    public <T> C8113f<T> mo41970b(String str, Class<T> cls, C8112e<T, byte[]> eVar) {
        return mo41969a(str, cls, C8109b.m15970b("proto"), eVar);
    }
}
