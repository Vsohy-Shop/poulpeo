package p277x6;

import androidx.annotation.Nullable;
import p277x6.C10450a0;

/* renamed from: x6.s */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
final class C10545s extends C10450a0.C10460e.C10467d.C10483c {

    /* renamed from: a */
    private final Double f16027a;

    /* renamed from: b */
    private final int f16028b;

    /* renamed from: c */
    private final boolean f16029c;

    /* renamed from: d */
    private final int f16030d;

    /* renamed from: e */
    private final long f16031e;

    /* renamed from: f */
    private final long f16032f;

    /* renamed from: x6.s$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
    static final class C10547b extends C10450a0.C10460e.C10467d.C10483c.C10484a {

        /* renamed from: a */
        private Double f16033a;

        /* renamed from: b */
        private Integer f16034b;

        /* renamed from: c */
        private Boolean f16035c;

        /* renamed from: d */
        private Integer f16036d;

        /* renamed from: e */
        private Long f16037e;

        /* renamed from: f */
        private Long f16038f;

        C10547b() {
        }

        /* renamed from: a */
        public C10450a0.C10460e.C10467d.C10483c mo45339a() {
            String str = "";
            if (this.f16034b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f16035c == null) {
                str = str + " proximityOn";
            }
            if (this.f16036d == null) {
                str = str + " orientation";
            }
            if (this.f16037e == null) {
                str = str + " ramUsed";
            }
            if (this.f16038f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C10545s(this.f16033a, this.f16034b.intValue(), this.f16035c.booleanValue(), this.f16036d.intValue(), this.f16037e.longValue(), this.f16038f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10460e.C10467d.C10483c.C10484a mo45340b(Double d) {
            this.f16033a = d;
            return this;
        }

        /* renamed from: c */
        public C10450a0.C10460e.C10467d.C10483c.C10484a mo45341c(int i) {
            this.f16034b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C10450a0.C10460e.C10467d.C10483c.C10484a mo45342d(long j) {
            this.f16038f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C10450a0.C10460e.C10467d.C10483c.C10484a mo45343e(int i) {
            this.f16036d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public C10450a0.C10460e.C10467d.C10483c.C10484a mo45344f(boolean z) {
            this.f16035c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public C10450a0.C10460e.C10467d.C10483c.C10484a mo45345g(long j) {
            this.f16037e = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public Double mo45333b() {
        return this.f16027a;
    }

    /* renamed from: c */
    public int mo45334c() {
        return this.f16028b;
    }

    /* renamed from: d */
    public long mo45335d() {
        return this.f16032f;
    }

    /* renamed from: e */
    public int mo45336e() {
        return this.f16030d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10460e.C10467d.C10483c)) {
            return false;
        }
        C10450a0.C10460e.C10467d.C10483c cVar = (C10450a0.C10460e.C10467d.C10483c) obj;
        Double d = this.f16027a;
        if (d != null ? d.equals(cVar.mo45333b()) : cVar.mo45333b() == null) {
            if (this.f16028b == cVar.mo45334c() && this.f16029c == cVar.mo45338g() && this.f16030d == cVar.mo45336e() && this.f16031e == cVar.mo45337f() && this.f16032f == cVar.mo45335d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo45337f() {
        return this.f16031e;
    }

    /* renamed from: g */
    public boolean mo45338g() {
        return this.f16029c;
    }

    public int hashCode() {
        int i;
        int i2;
        Double d = this.f16027a;
        if (d == null) {
            i = 0;
        } else {
            i = d.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.f16028b) * 1000003;
        if (this.f16029c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.f16031e;
        long j2 = this.f16032f;
        return ((((((i3 ^ i2) * 1000003) ^ this.f16030d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f16027a + ", batteryVelocity=" + this.f16028b + ", proximityOn=" + this.f16029c + ", orientation=" + this.f16030d + ", ramUsed=" + this.f16031e + ", diskUsed=" + this.f16032f + "}";
    }

    private C10545s(@Nullable Double d, int i, boolean z, int i2, long j, long j2) {
        this.f16027a = d;
        this.f16028b = i;
        this.f16029c = z;
        this.f16030d = i2;
        this.f16031e = j;
        this.f16032f = j2;
    }
}
