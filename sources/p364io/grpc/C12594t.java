package p364io.grpc;

import com.appboy.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p111h6.C7994c;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;
import p111h6.C8020s;
import p364io.grpc.C12564o;

/* renamed from: io.grpc.t */
/* compiled from: Status */
public final class C12594t {

    /* renamed from: d */
    private static final boolean f20181d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final List<C12594t> f20182e = m27921g();

    /* renamed from: f */
    public static final C12594t f20183f = C12596b.OK.mo50312b();

    /* renamed from: g */
    public static final C12594t f20184g = C12596b.CANCELLED.mo50312b();

    /* renamed from: h */
    public static final C12594t f20185h = C12596b.UNKNOWN.mo50312b();

    /* renamed from: i */
    public static final C12594t f20186i = C12596b.INVALID_ARGUMENT.mo50312b();

    /* renamed from: j */
    public static final C12594t f20187j = C12596b.DEADLINE_EXCEEDED.mo50312b();

    /* renamed from: k */
    public static final C12594t f20188k = C12596b.NOT_FOUND.mo50312b();

    /* renamed from: l */
    public static final C12594t f20189l = C12596b.ALREADY_EXISTS.mo50312b();

    /* renamed from: m */
    public static final C12594t f20190m = C12596b.PERMISSION_DENIED.mo50312b();

    /* renamed from: n */
    public static final C12594t f20191n = C12596b.UNAUTHENTICATED.mo50312b();

    /* renamed from: o */
    public static final C12594t f20192o = C12596b.RESOURCE_EXHAUSTED.mo50312b();

    /* renamed from: p */
    public static final C12594t f20193p = C12596b.FAILED_PRECONDITION.mo50312b();

    /* renamed from: q */
    public static final C12594t f20194q = C12596b.ABORTED.mo50312b();

    /* renamed from: r */
    public static final C12594t f20195r = C12596b.OUT_OF_RANGE.mo50312b();

    /* renamed from: s */
    public static final C12594t f20196s = C12596b.UNIMPLEMENTED.mo50312b();

    /* renamed from: t */
    public static final C12594t f20197t = C12596b.INTERNAL.mo50312b();

    /* renamed from: u */
    public static final C12594t f20198u = C12596b.UNAVAILABLE.mo50312b();

    /* renamed from: v */
    public static final C12594t f20199v = C12596b.DATA_LOSS.mo50312b();

    /* renamed from: w */
    static final C12564o.C12571g<C12594t> f20200w = C12564o.C12571g.m27838g("grpc-status", false, new C12597c());

    /* renamed from: x */
    private static final C12564o.C12574j<String> f20201x;

    /* renamed from: y */
    static final C12564o.C12571g<String> f20202y;

    /* renamed from: a */
    private final C12596b f20203a;

    /* renamed from: b */
    private final String f20204b;

    /* renamed from: c */
    private final Throwable f20205c;

    /* renamed from: io.grpc.t$b */
    /* compiled from: Status */
    public enum C12596b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: b */
        private final int f20224b;

        /* renamed from: c */
        private final byte[] f20225c;

        private C12596b(int i) {
            this.f20224b = i;
            this.f20225c = Integer.toString(i).getBytes(C7994c.f11227a);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public byte[] m27938d() {
            return this.f20225c;
        }

        /* renamed from: b */
        public C12594t mo50312b() {
            return (C12594t) C12594t.f20182e.get(this.f20224b);
        }

        /* renamed from: c */
        public int mo50313c() {
            return this.f20224b;
        }
    }

    /* renamed from: io.grpc.t$c */
    /* compiled from: Status */
    private static final class C12597c implements C12564o.C12574j<C12594t> {
        private C12597c() {
        }

        /* renamed from: c */
        public C12594t mo50054b(byte[] bArr) {
            return C12594t.m27924j(bArr);
        }

        /* renamed from: d */
        public byte[] mo50053a(C12594t tVar) {
            return tVar.mo50306n().m27938d();
        }
    }

    /* renamed from: io.grpc.t$d */
    /* compiled from: Status */
    private static final class C12598d implements C12564o.C12574j<String> {

        /* renamed from: a */
        private static final byte[] f20226a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private C12598d() {
        }

        /* renamed from: c */
        private static boolean m27945c(byte b) {
            if (b < 32 || b >= 126 || b == 37) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private static String m27946e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == 37 && i + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, C7994c.f11227a), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i]);
                i++;
            }
            return new String(allocate.array(), 0, allocate.position(), C7994c.f11229c);
        }

        /* renamed from: g */
        private static byte[] m27947g(byte[] bArr, int i) {
            byte[] bArr2 = new byte[(((bArr.length - i) * 3) + i)];
            if (i != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            int i2 = i;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (m27945c(b)) {
                    bArr2[i2] = 37;
                    byte[] bArr3 = f20226a;
                    bArr2[i2 + 1] = bArr3[(b >> 4) & 15];
                    bArr2[i2 + 2] = bArr3[b & 15];
                    i2 += 3;
                } else {
                    bArr2[i2] = b;
                    i2++;
                }
                i++;
            }
            return Arrays.copyOf(bArr2, i2);
        }

        /* renamed from: d */
        public String mo50054b(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    return m27946e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        /* renamed from: f */
        public byte[] mo50053a(String str) {
            byte[] bytes = str.getBytes(C7994c.f11229c);
            for (int i = 0; i < bytes.length; i++) {
                if (m27945c(bytes[i])) {
                    return m27947g(bytes, i);
                }
            }
            return bytes;
        }
    }

    static {
        C12598d dVar = new C12598d();
        f20201x = dVar;
        f20202y = C12564o.C12571g.m27838g("grpc-message", false, dVar);
    }

    private C12594t(C12596b bVar) {
        this(bVar, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    private static List<C12594t> m27921g() {
        TreeMap treeMap = new TreeMap();
        C12596b[] values = C12596b.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C12596b bVar = values[i];
            C12594t tVar = (C12594t) treeMap.put(Integer.valueOf(bVar.mo50313c()), new C12594t(bVar));
            if (tVar == null) {
                i++;
            } else {
                throw new IllegalStateException("Code value duplication between " + tVar.mo50306n().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* renamed from: h */
    static String m27922h(C12594t tVar) {
        if (tVar.f20204b == null) {
            return tVar.f20203a.toString();
        }
        return tVar.f20203a + ": " + tVar.f20204b;
    }

    /* renamed from: i */
    public static C12594t m27923i(int i) {
        if (i >= 0) {
            List<C12594t> list = f20182e;
            if (i <= list.size()) {
                return list.get(i);
            }
        }
        C12594t tVar = f20185h;
        return tVar.mo50310r("Unknown code " + i);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static C12594t m27924j(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f20183f;
        }
        return m27925k(bArr);
    }

    /* renamed from: k */
    private static C12594t m27925k(byte[] bArr) {
        byte b;
        int length = bArr.length;
        char c = 1;
        int i = 0;
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = 0 + ((b - 48) * 10);
            }
            return f20185h.mo50310r("Unknown code " + new String(bArr, C7994c.f11227a));
        }
        c = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List<C12594t> list = f20182e;
            if (i2 < list.size()) {
                return list.get(i2);
            }
        }
        return f20185h.mo50310r("Unknown code " + new String(bArr, C7994c.f11227a));
    }

    /* renamed from: l */
    public static C12594t m27926l(Throwable th) {
        for (Throwable th2 = (Throwable) C8012n.m15756o(th, Constants.APPBOY_PUSH_TITLE_KEY); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).mo49601a();
            }
            if (th2 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th2).mo49604a();
            }
        }
        return f20185h.mo50309q(th);
    }

    /* renamed from: c */
    public StatusException mo50299c() {
        return new StatusException(this);
    }

    /* renamed from: d */
    public StatusRuntimeException mo50300d() {
        return new StatusRuntimeException(this);
    }

    /* renamed from: e */
    public StatusRuntimeException mo50301e(C12564o oVar) {
        return new StatusRuntimeException(this, oVar);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public C12594t mo50303f(String str) {
        if (str == null) {
            return this;
        }
        if (this.f20204b == null) {
            return new C12594t(this.f20203a, str, this.f20205c);
        }
        C12596b bVar = this.f20203a;
        return new C12594t(bVar, this.f20204b + "\n" + str, this.f20205c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public Throwable mo50305m() {
        return this.f20205c;
    }

    /* renamed from: n */
    public C12596b mo50306n() {
        return this.f20203a;
    }

    /* renamed from: o */
    public String mo50307o() {
        return this.f20204b;
    }

    /* renamed from: p */
    public boolean mo50308p() {
        if (C12596b.OK == this.f20203a) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public C12594t mo50309q(Throwable th) {
        if (C8007k.m15735a(this.f20205c, th)) {
            return this;
        }
        return new C12594t(this.f20203a, this.f20204b, th);
    }

    /* renamed from: r */
    public C12594t mo50310r(String str) {
        if (C8007k.m15735a(this.f20204b, str)) {
            return this;
        }
        return new C12594t(this.f20203a, str, this.f20205c);
    }

    public String toString() {
        C8003j.C8005b d = C8003j.m15723c(this).mo41840d("code", this.f20203a.name()).mo41840d("description", this.f20204b);
        Throwable th = this.f20205c;
        Object obj = th;
        if (th != null) {
            obj = C8020s.m15784e(th);
        }
        return d.mo41840d("cause", obj).toString();
    }

    private C12594t(C12596b bVar, String str, Throwable th) {
        this.f20203a = (C12596b) C8012n.m15756o(bVar, "code");
        this.f20204b = str;
        this.f20205c = th;
    }
}
