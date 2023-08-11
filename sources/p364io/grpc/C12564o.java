package p364io.grpc;

import androidx.autofill.HintConstants;
import com.google.common.p056io.BaseEncoding;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import p111h6.C7994c;
import p111h6.C8012n;
import p122i6.C8186a;

/* renamed from: io.grpc.o */
/* compiled from: Metadata */
public final class C12564o {

    /* renamed from: c */
    public static final C12569e<byte[]> f20134c = new C12565a();

    /* renamed from: d */
    public static final C12568d<String> f20135d = new C12566b();

    /* renamed from: e */
    static final BaseEncoding f20136e = BaseEncoding.m11900b().mo39704l();

    /* renamed from: a */
    private Object[] f20137a;

    /* renamed from: b */
    private int f20138b;

    /* renamed from: io.grpc.o$a */
    /* compiled from: Metadata */
    class C12565a implements C12569e<byte[]> {
        C12565a() {
        }
    }

    /* renamed from: io.grpc.o$c */
    /* compiled from: Metadata */
    private static class C12567c<T> extends C12571g<T> {

        /* renamed from: f */
        private final C12568d<T> f20139f;

        /* synthetic */ C12567c(String str, boolean z, C12568d dVar, C12565a aVar) {
            this(str, z, dVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public T mo50249h(byte[] bArr) {
            return this.f20139f.mo50060b(new String(bArr, C7994c.f11227a));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public byte[] mo50250j(T t) {
            return this.f20139f.mo50059a(t).getBytes(C7994c.f11227a);
        }

        private C12567c(String str, boolean z, C12568d<T> dVar) {
            super(str, z, dVar, (C12565a) null);
            C8012n.m15752k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f20139f = (C12568d) C8012n.m15756o(dVar, "marshaller");
        }
    }

    /* renamed from: io.grpc.o$d */
    /* compiled from: Metadata */
    public interface C12568d<T> {
        /* renamed from: a */
        String mo50059a(T t);

        /* renamed from: b */
        T mo50060b(String str);
    }

    /* renamed from: io.grpc.o$e */
    /* compiled from: Metadata */
    public interface C12569e<T> {
    }

    /* renamed from: io.grpc.o$f */
    /* compiled from: Metadata */
    public interface C12570f<T> {
        /* renamed from: a */
        InputStream mo50251a(T t);

        /* renamed from: b */
        T mo50252b(InputStream inputStream);
    }

    /* renamed from: io.grpc.o$g */
    /* compiled from: Metadata */
    public static abstract class C12571g<T> {

        /* renamed from: e */
        private static final BitSet f20140e = m27835b();

        /* renamed from: a */
        private final String f20141a;

        /* renamed from: b */
        private final String f20142b;

        /* renamed from: c */
        private final byte[] f20143c;

        /* renamed from: d */
        private final Object f20144d;

        /* synthetic */ C12571g(String str, boolean z, Object obj, C12565a aVar) {
            this(str, z, obj);
        }

        /* renamed from: b */
        private static BitSet m27835b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* renamed from: e */
        public static <T> C12571g<T> m27836e(String str, C12568d<T> dVar) {
            return m27837f(str, false, dVar);
        }

        /* renamed from: f */
        static <T> C12571g<T> m27837f(String str, boolean z, C12568d<T> dVar) {
            return new C12567c(str, z, dVar, (C12565a) null);
        }

        /* renamed from: g */
        static <T> C12571g<T> m27838g(String str, boolean z, C12574j<T> jVar) {
            return new C12573i(str, z, jVar, (C12565a) null);
        }

        /* renamed from: k */
        private static String m27839k(String str, boolean z) {
            C8012n.m15756o(str, HintConstants.AUTOFILL_HINT_NAME);
            C8012n.m15746e(!str.isEmpty(), "token must have at least 1 tchar");
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    C8012n.m15748g(f20140e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo50253a() {
            return this.f20143c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final <M> M mo50254c(Class<M> cls) {
            if (cls.isInstance(this.f20144d)) {
                return cls.cast(this.f20144d);
            }
            return null;
        }

        /* renamed from: d */
        public final String mo50255d() {
            return this.f20142b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f20142b.equals(((C12571g) obj).f20142b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract T mo50249h(byte[] bArr);

        public final int hashCode() {
            return this.f20142b.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo50258i() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract byte[] mo50250j(T t);

        public String toString() {
            return "Key{name='" + this.f20142b + "'}";
        }

        private C12571g(String str, boolean z, Object obj) {
            String str2 = (String) C8012n.m15756o(str, HintConstants.AUTOFILL_HINT_NAME);
            this.f20141a = str2;
            String k = m27839k(str2.toLowerCase(Locale.ROOT), z);
            this.f20142b = k;
            this.f20143c = k.getBytes(C7994c.f11227a);
            this.f20144d = obj;
        }
    }

    /* renamed from: io.grpc.o$h */
    /* compiled from: Metadata */
    static final class C12572h<T> {

        /* renamed from: a */
        private final C12570f<T> f20145a;

        /* renamed from: b */
        private final T f20146b;

        /* renamed from: c */
        private volatile byte[] f20147c;

        C12572h(C12570f<T> fVar, T t) {
            this.f20145a = fVar;
            this.f20146b = t;
        }

        /* renamed from: a */
        static <T> C12572h<T> m27846a(C12571g<T> gVar, T t) {
            return new C12572h<>((C12570f) C8012n.m15755n(m27847b(gVar)), t);
        }

        /* renamed from: b */
        private static <T> C12570f<T> m27847b(C12571g<T> gVar) {
            return (C12570f) gVar.mo50254c(C12570f.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public byte[] mo50260c() {
            if (this.f20147c == null) {
                synchronized (this) {
                    if (this.f20147c == null) {
                        this.f20147c = C12564o.m27813p(mo50262e());
                    }
                }
            }
            return this.f20147c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T2> T2 mo50261d(C12571g<T2> gVar) {
            C12570f<T2> b;
            if (!gVar.mo50258i() || (b = m27847b(gVar)) == null) {
                return gVar.mo50249h(mo50260c());
            }
            return b.mo50252b(mo50262e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public InputStream mo50262e() {
            return this.f20145a.mo50251a(this.f20146b);
        }
    }

    /* renamed from: io.grpc.o$i */
    /* compiled from: Metadata */
    private static final class C12573i<T> extends C12571g<T> {

        /* renamed from: f */
        private final C12574j<T> f20148f;

        /* synthetic */ C12573i(String str, boolean z, C12574j jVar, C12565a aVar) {
            this(str, z, jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public T mo50249h(byte[] bArr) {
            return this.f20148f.mo50054b(bArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public byte[] mo50250j(T t) {
            return this.f20148f.mo50053a(t);
        }

        private C12573i(String str, boolean z, C12574j<T> jVar) {
            super(str, z, jVar, (C12565a) null);
            C8012n.m15752k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f20148f = (C12574j) C8012n.m15756o(jVar, "marshaller");
        }
    }

    /* renamed from: io.grpc.o$j */
    /* compiled from: Metadata */
    interface C12574j<T> {
        /* renamed from: a */
        byte[] mo50053a(T t);

        /* renamed from: b */
        T mo50054b(byte[] bArr);
    }

    public C12564o() {
    }

    C12564o(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: b */
    private boolean m27805b(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: c */
    private int m27806c() {
        Object[] objArr = this.f20137a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: e */
    private void m27807e(int i) {
        Object[] objArr = new Object[i];
        if (!m27808h()) {
            System.arraycopy(this.f20137a, 0, objArr, 0, m27809i());
        }
        this.f20137a = objArr;
    }

    /* renamed from: h */
    private boolean m27808h() {
        if (this.f20138b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private int m27809i() {
        return this.f20138b * 2;
    }

    /* renamed from: j */
    private void m27810j() {
        if (m27809i() == 0 || m27809i() == m27806c()) {
            m27807e(Math.max(m27809i() * 2, 8));
        }
    }

    /* renamed from: l */
    private void m27811l(int i, byte[] bArr) {
        this.f20137a[i * 2] = bArr;
    }

    /* renamed from: m */
    private byte[] m27812m(int i) {
        return (byte[]) this.f20137a[i * 2];
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static byte[] m27813p(InputStream inputStream) {
        try {
            return C8186a.m16201d(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    /* renamed from: q */
    private Object m27814q(int i) {
        return this.f20137a[(i * 2) + 1];
    }

    /* renamed from: r */
    private void m27815r(int i, Object obj) {
        if (this.f20137a instanceof byte[][]) {
            m27807e(m27806c());
        }
        this.f20137a[(i * 2) + 1] = obj;
    }

    /* renamed from: s */
    private void m27816s(int i, byte[] bArr) {
        this.f20137a[(i * 2) + 1] = bArr;
    }

    /* renamed from: t */
    private byte[] m27817t(int i) {
        Object q = m27814q(i);
        if (q instanceof byte[]) {
            return (byte[]) q;
        }
        return ((C12572h) q).mo50260c();
    }

    /* renamed from: u */
    private <T> T m27818u(int i, C12571g<T> gVar) {
        Object q = m27814q(i);
        if (q instanceof byte[]) {
            return gVar.mo50249h((byte[]) q);
        }
        return ((C12572h) q).mo50261d(gVar);
    }

    /* renamed from: d */
    public <T> void mo50240d(C12571g<T> gVar) {
        if (!m27808h()) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20138b; i2++) {
                if (!m27805b(gVar.mo50253a(), m27812m(i2))) {
                    m27811l(i, m27812m(i2));
                    m27815r(i, m27814q(i2));
                    i++;
                }
            }
            Arrays.fill(this.f20137a, i * 2, m27809i(), (Object) null);
            this.f20138b = i;
        }
    }

    /* renamed from: f */
    public <T> T mo50241f(C12571g<T> gVar) {
        for (int i = this.f20138b - 1; i >= 0; i--) {
            if (m27805b(gVar.mo50253a(), m27812m(i))) {
                return m27818u(i, gVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo50242g() {
        return this.f20138b;
    }

    /* renamed from: k */
    public void mo50243k(C12564o oVar) {
        if (!oVar.m27808h()) {
            int c = m27806c() - m27809i();
            if (m27808h() || c < oVar.m27809i()) {
                m27807e(m27809i() + oVar.m27809i());
            }
            System.arraycopy(oVar.f20137a, 0, this.f20137a, m27809i(), oVar.m27809i());
            this.f20138b += oVar.f20138b;
        }
    }

    /* renamed from: n */
    public <T> void mo50244n(C12571g<T> gVar, T t) {
        C8012n.m15756o(gVar, "key");
        C8012n.m15756o(t, "value");
        m27810j();
        m27811l(this.f20138b, gVar.mo50253a());
        if (gVar.mo50258i()) {
            m27815r(this.f20138b, C12572h.m27846a(gVar, t));
        } else {
            m27816s(this.f20138b, gVar.mo50250j(t));
        }
        this.f20138b++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public byte[][] mo50245o() {
        byte[][] bArr = new byte[m27809i()][];
        Object[] objArr = this.f20137a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m27809i());
        } else {
            for (int i = 0; i < this.f20138b; i++) {
                int i2 = i * 2;
                bArr[i2] = m27812m(i);
                bArr[i2 + 1] = m27817t(i);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f20138b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] m = m27812m(i);
            Charset charset = C7994c.f11227a;
            String str = new String(m, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f20136e.mo39699f(m27817t(i)));
            } else {
                sb.append(new String(m27817t(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    C12564o(int i, byte[]... bArr) {
        this(i, (Object[]) bArr);
    }

    C12564o(int i, Object[] objArr) {
        this.f20138b = i;
        this.f20137a = objArr;
    }

    /* renamed from: io.grpc.o$b */
    /* compiled from: Metadata */
    class C12566b implements C12568d<String> {
        C12566b() {
        }

        /* renamed from: c */
        public String mo50060b(String str) {
            return str;
        }

        /* renamed from: d */
        public String mo50059a(String str) {
            return str;
        }
    }
}
