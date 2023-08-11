package com.google.protobuf;

import com.google.protobuf.C7186x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.o */
/* compiled from: ExtensionRegistryLite */
public class C7139o {

    /* renamed from: b */
    private static boolean f9663b = true;

    /* renamed from: c */
    private static volatile C7139o f9664c;

    /* renamed from: d */
    static final C7139o f9665d = new C7139o(true);

    /* renamed from: a */
    private final Map<C7140a, C7186x.C7191e<?, ?>> f9666a;

    /* renamed from: com.google.protobuf.o$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class C7140a {

        /* renamed from: a */
        private final Object f9667a;

        /* renamed from: b */
        private final int f9668b;

        C7140a(Object obj, int i) {
            this.f9667a = obj;
            this.f9668b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7140a)) {
                return false;
            }
            C7140a aVar = (C7140a) obj;
            if (this.f9667a == aVar.f9667a && this.f9668b == aVar.f9668b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9667a) * 65535) + this.f9668b;
        }
    }

    C7139o() {
        this.f9666a = new HashMap();
    }

    /* renamed from: b */
    public static C7139o m13502b() {
        C7139o oVar = f9664c;
        if (oVar == null) {
            synchronized (C7139o.class) {
                oVar = f9664c;
                if (oVar == null) {
                    if (f9663b) {
                        oVar = C7134n.m13485a();
                    } else {
                        oVar = f9665d;
                    }
                    f9664c = oVar;
                }
            }
        }
        return oVar;
    }

    /* renamed from: a */
    public <ContainingType extends C7149p0> C7186x.C7191e<ContainingType, ?> mo40591a(ContainingType containingtype, int i) {
        return this.f9666a.get(new C7140a(containingtype, i));
    }

    C7139o(boolean z) {
        this.f9666a = Collections.emptyMap();
    }
}
