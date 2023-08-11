package p458xd;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p111h6.C8002i;
import p111h6.C8012n;
import p458xd.C13799i;

/* renamed from: xd.r */
/* compiled from: DecompressorRegistry */
public final class C13824r {

    /* renamed from: c */
    static final C8002i f22290c = C8002i.m15715e(',');

    /* renamed from: d */
    private static final C13824r f22291d = m31753a().mo53495f(new C13799i.C13800a(), true).mo53495f(C13799i.C13801b.f22244a, false);

    /* renamed from: a */
    private final Map<String, C13825a> f22292a;

    /* renamed from: b */
    private final byte[] f22293b;

    /* renamed from: xd.r$a */
    /* compiled from: DecompressorRegistry */
    private static final class C13825a {

        /* renamed from: a */
        final C13823q f22294a;

        /* renamed from: b */
        final boolean f22295b;

        C13825a(C13823q qVar, boolean z) {
            this.f22294a = (C13823q) C8012n.m15756o(qVar, "decompressor");
            this.f22295b = z;
        }
    }

    private C13824r(C13823q qVar, boolean z, C13824r rVar) {
        String a = qVar.mo53452a();
        C8012n.m15746e(!a.contains(","), "Comma is currently not allowed in message encoding");
        int size = rVar.f22292a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!rVar.f22292a.containsKey(qVar.mo53452a()) ? size + 1 : size);
        for (C13825a next : rVar.f22292a.values()) {
            String a2 = next.f22294a.mo53452a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new C13825a(next.f22294a, next.f22295b));
            }
        }
        linkedHashMap.put(a, new C13825a(qVar, z));
        this.f22292a = Collections.unmodifiableMap(linkedHashMap);
        this.f22293b = f22290c.mo41834c(mo53492b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: a */
    public static C13824r m31753a() {
        return new C13824r();
    }

    /* renamed from: c */
    public static C13824r m31754c() {
        return f22291d;
    }

    /* renamed from: b */
    public Set<String> mo53492b() {
        HashSet hashSet = new HashSet(this.f22292a.size());
        for (Map.Entry next : this.f22292a.entrySet()) {
            if (((C13825a) next.getValue()).f22295b) {
                hashSet.add(next.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte[] mo53493d() {
        return this.f22293b;
    }

    /* renamed from: e */
    public C13823q mo53494e(String str) {
        C13825a aVar = this.f22292a.get(str);
        if (aVar != null) {
            return aVar.f22294a;
        }
        return null;
    }

    /* renamed from: f */
    public C13824r mo53495f(C13823q qVar, boolean z) {
        return new C13824r(qVar, z, this);
    }

    private C13824r() {
        this.f22292a = new LinkedHashMap(0);
        this.f22293b = new byte[0];
    }
}
