package p214r8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: r8.d */
/* compiled from: GlobalLibraryVersionRegistrar */
public class C9397d {

    /* renamed from: b */
    private static volatile C9397d f13977b;

    /* renamed from: a */
    private final Set<C9399f> f13978a = new HashSet();

    C9397d() {
    }

    /* renamed from: a */
    public static C9397d m19444a() {
        C9397d dVar = f13977b;
        if (dVar == null) {
            synchronized (C9397d.class) {
                dVar = f13977b;
                if (dVar == null) {
                    dVar = new C9397d();
                    f13977b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C9399f> mo43821b() {
        Set<C9399f> unmodifiableSet;
        synchronized (this.f13978a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f13978a);
        }
        return unmodifiableSet;
    }
}
