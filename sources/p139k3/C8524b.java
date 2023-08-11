package p139k3;

import androidx.annotation.Nullable;
import java.util.Map;
import p139k3.C8539i;

/* renamed from: k3.b */
/* compiled from: AutoValue_EventInternal */
final class C8524b extends C8539i {

    /* renamed from: a */
    private final String f12158a;

    /* renamed from: b */
    private final Integer f12159b;

    /* renamed from: c */
    private final C8538h f12160c;

    /* renamed from: d */
    private final long f12161d;

    /* renamed from: e */
    private final long f12162e;

    /* renamed from: f */
    private final Map<String, String> f12163f;

    /* renamed from: k3.b$b */
    /* compiled from: AutoValue_EventInternal */
    static final class C8526b extends C8539i.C8540a {

        /* renamed from: a */
        private String f12164a;

        /* renamed from: b */
        private Integer f12165b;

        /* renamed from: c */
        private C8538h f12166c;

        /* renamed from: d */
        private Long f12167d;

        /* renamed from: e */
        private Long f12168e;

        /* renamed from: f */
        private Map<String, String> f12169f;

        C8526b() {
        }

        /* renamed from: d */
        public C8539i mo42558d() {
            String str = "";
            if (this.f12164a == null) {
                str = str + " transportName";
            }
            if (this.f12166c == null) {
                str = str + " encodedPayload";
            }
            if (this.f12167d == null) {
                str = str + " eventMillis";
            }
            if (this.f12168e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f12169f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C8524b(this.f12164a, this.f12165b, this.f12166c, this.f12167d.longValue(), this.f12168e.longValue(), this.f12169f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo42559e() {
            Map<String, String> map = this.f12169f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C8539i.C8540a mo42560f(Map<String, String> map) {
            if (map != null) {
                this.f12169f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public C8539i.C8540a mo42561g(Integer num) {
            this.f12165b = num;
            return this;
        }

        /* renamed from: h */
        public C8539i.C8540a mo42562h(C8538h hVar) {
            if (hVar != null) {
                this.f12166c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public C8539i.C8540a mo42563i(long j) {
            this.f12167d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C8539i.C8540a mo42564j(String str) {
            if (str != null) {
                this.f12164a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public C8539i.C8540a mo42565k(long j) {
            this.f12168e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo42549c() {
        return this.f12163f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo42550d() {
        return this.f12159b;
    }

    /* renamed from: e */
    public C8538h mo42551e() {
        return this.f12160c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8539i)) {
            return false;
        }
        C8539i iVar = (C8539i) obj;
        if (!this.f12158a.equals(iVar.mo42555j()) || ((num = this.f12159b) != null ? !num.equals(iVar.mo42550d()) : iVar.mo42550d() != null) || !this.f12160c.equals(iVar.mo42551e()) || this.f12161d != iVar.mo42553f() || this.f12162e != iVar.mo42556k() || !this.f12163f.equals(iVar.mo42549c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo42553f() {
        return this.f12161d;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f12158a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12159b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f12161d;
        long j2 = this.f12162e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f12160c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f12163f.hashCode();
    }

    /* renamed from: j */
    public String mo42555j() {
        return this.f12158a;
    }

    /* renamed from: k */
    public long mo42556k() {
        return this.f12162e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f12158a + ", code=" + this.f12159b + ", encodedPayload=" + this.f12160c + ", eventMillis=" + this.f12161d + ", uptimeMillis=" + this.f12162e + ", autoMetadata=" + this.f12163f + "}";
    }

    private C8524b(String str, @Nullable Integer num, C8538h hVar, long j, long j2, Map<String, String> map) {
        this.f12158a = str;
        this.f12159b = num;
        this.f12160c = hVar;
        this.f12161d = j;
        this.f12162e = j2;
        this.f12163f = map;
    }
}
