package p458xd;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.concurrent.atomic.AtomicLong;
import p111h6.C8012n;

/* renamed from: xd.z */
/* compiled from: InternalLogId */
public final class C13841z {

    /* renamed from: d */
    private static final AtomicLong f22331d = new AtomicLong();

    /* renamed from: a */
    private final String f22332a;

    /* renamed from: b */
    private final String f22333b;

    /* renamed from: c */
    private final long f22334c;

    C13841z(String str, String str2, long j) {
        C8012n.m15756o(str, "typeName");
        C8012n.m15746e(!str.isEmpty(), "empty type");
        this.f22332a = str;
        this.f22333b = str2;
        this.f22334c = j;
    }

    /* renamed from: a */
    public static C13841z m31797a(Class<?> cls, String str) {
        return m31798b(m31799c(cls), str);
    }

    /* renamed from: b */
    public static C13841z m31798b(String str, String str2) {
        return new C13841z(str, str2, m31800e());
    }

    /* renamed from: c */
    private static String m31799c(Class<?> cls) {
        String simpleName = ((Class) C8012n.m15756o(cls, JSONAPIResourceIdSerializer.FIELD_TYPE)).getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* renamed from: e */
    static long m31800e() {
        return f22331d.incrementAndGet();
    }

    /* renamed from: d */
    public long mo53522d() {
        return this.f22334c;
    }

    /* renamed from: f */
    public String mo53523f() {
        return this.f22332a + "<" + this.f22334c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo53523f());
        if (this.f22333b != null) {
            sb.append(": (");
            sb.append(this.f22333b);
            sb.append(')');
        }
        return sb.toString();
    }
}
