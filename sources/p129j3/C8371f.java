package p129j3;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p129j3.C8385l;

/* renamed from: j3.f */
/* compiled from: AutoValue_LogEvent */
final class C8371f extends C8385l {

    /* renamed from: a */
    private final long f11854a;

    /* renamed from: b */
    private final Integer f11855b;

    /* renamed from: c */
    private final long f11856c;

    /* renamed from: d */
    private final byte[] f11857d;

    /* renamed from: e */
    private final String f11858e;

    /* renamed from: f */
    private final long f11859f;

    /* renamed from: g */
    private final C8390o f11860g;

    /* renamed from: j3.f$b */
    /* compiled from: AutoValue_LogEvent */
    static final class C8373b extends C8385l.C8386a {

        /* renamed from: a */
        private Long f11861a;

        /* renamed from: b */
        private Integer f11862b;

        /* renamed from: c */
        private Long f11863c;

        /* renamed from: d */
        private byte[] f11864d;

        /* renamed from: e */
        private String f11865e;

        /* renamed from: f */
        private Long f11866f;

        /* renamed from: g */
        private C8390o f11867g;

        C8373b() {
        }

        /* renamed from: a */
        public C8385l mo42372a() {
            String str = "";
            if (this.f11861a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f11863c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f11866f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C8371f(this.f11861a.longValue(), this.f11862b, this.f11863c.longValue(), this.f11864d, this.f11865e, this.f11866f.longValue(), this.f11867g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8385l.C8386a mo42373b(@Nullable Integer num) {
            this.f11862b = num;
            return this;
        }

        /* renamed from: c */
        public C8385l.C8386a mo42374c(long j) {
            this.f11861a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C8385l.C8386a mo42375d(long j) {
            this.f11863c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C8385l.C8386a mo42376e(@Nullable C8390o oVar) {
            this.f11867g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C8385l.C8386a mo42377f(@Nullable byte[] bArr) {
            this.f11864d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C8385l.C8386a mo42378g(@Nullable String str) {
            this.f11865e = str;
            return this;
        }

        /* renamed from: h */
        public C8385l.C8386a mo42379h(long j) {
            this.f11866f = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public Integer mo42362b() {
        return this.f11855b;
    }

    /* renamed from: c */
    public long mo42363c() {
        return this.f11854a;
    }

    /* renamed from: d */
    public long mo42364d() {
        return this.f11856c;
    }

    @Nullable
    /* renamed from: e */
    public C8390o mo42365e() {
        return this.f11860g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8385l)) {
            return false;
        }
        C8385l lVar = (C8385l) obj;
        if (this.f11854a == lVar.mo42363c() && ((num = this.f11855b) != null ? num.equals(lVar.mo42362b()) : lVar.mo42362b() == null) && this.f11856c == lVar.mo42364d()) {
            byte[] bArr2 = this.f11857d;
            if (lVar instanceof C8371f) {
                bArr = ((C8371f) lVar).f11857d;
            } else {
                bArr = lVar.mo42367f();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f11858e) != null ? str.equals(lVar.mo42368g()) : lVar.mo42368g() == null) && this.f11859f == lVar.mo42369h()) {
                C8390o oVar = this.f11860g;
                if (oVar == null) {
                    if (lVar.mo42365e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.mo42365e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public byte[] mo42367f() {
        return this.f11857d;
    }

    @Nullable
    /* renamed from: g */
    public String mo42368g() {
        return this.f11858e;
    }

    /* renamed from: h */
    public long mo42369h() {
        return this.f11859f;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.f11854a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11855b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j2 = this.f11856c;
        int hashCode = (((((i3 ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f11857d)) * 1000003;
        String str = this.f11858e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j3 = this.f11859f;
        int i5 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C8390o oVar = this.f11860g;
        if (oVar != null) {
            i4 = oVar.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f11854a + ", eventCode=" + this.f11855b + ", eventUptimeMs=" + this.f11856c + ", sourceExtension=" + Arrays.toString(this.f11857d) + ", sourceExtensionJsonProto3=" + this.f11858e + ", timezoneOffsetSeconds=" + this.f11859f + ", networkConnectionInfo=" + this.f11860g + "}";
    }

    private C8371f(long j, @Nullable Integer num, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable C8390o oVar) {
        this.f11854a = j;
        this.f11855b = num;
        this.f11856c = j2;
        this.f11857d = bArr;
        this.f11858e = str;
        this.f11859f = j3;
        this.f11860g = oVar;
    }
}
