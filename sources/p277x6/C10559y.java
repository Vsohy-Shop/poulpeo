package p277x6;

import p277x6.C10498c0;

/* renamed from: x6.y */
/* compiled from: AutoValue_StaticSessionData_DeviceData */
final class C10559y extends C10498c0.C10500b {

    /* renamed from: a */
    private final int f16060a;

    /* renamed from: b */
    private final String f16061b;

    /* renamed from: c */
    private final int f16062c;

    /* renamed from: d */
    private final long f16063d;

    /* renamed from: e */
    private final long f16064e;

    /* renamed from: f */
    private final boolean f16065f;

    /* renamed from: g */
    private final int f16066g;

    /* renamed from: h */
    private final String f16067h;

    /* renamed from: i */
    private final String f16068i;

    C10559y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f16060a = i;
        if (str != null) {
            this.f16061b = str;
            this.f16062c = i2;
            this.f16063d = j;
            this.f16064e = j2;
            this.f16065f = z;
            this.f16066g = i3;
            if (str2 != null) {
                this.f16067h = str2;
                if (str3 != null) {
                    this.f16068i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    /* renamed from: a */
    public int mo45401a() {
        return this.f16060a;
    }

    /* renamed from: b */
    public int mo45402b() {
        return this.f16062c;
    }

    /* renamed from: d */
    public long mo45403d() {
        return this.f16064e;
    }

    /* renamed from: e */
    public boolean mo45404e() {
        return this.f16065f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10498c0.C10500b)) {
            return false;
        }
        C10498c0.C10500b bVar = (C10498c0.C10500b) obj;
        if (this.f16060a == bVar.mo45401a() && this.f16061b.equals(bVar.mo45406g()) && this.f16062c == bVar.mo45402b() && this.f16063d == bVar.mo45409j() && this.f16064e == bVar.mo45403d() && this.f16065f == bVar.mo45404e() && this.f16066g == bVar.mo45408i() && this.f16067h.equals(bVar.mo45405f()) && this.f16068i.equals(bVar.mo45407h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo45405f() {
        return this.f16067h;
    }

    /* renamed from: g */
    public String mo45406g() {
        return this.f16061b;
    }

    /* renamed from: h */
    public String mo45407h() {
        return this.f16068i;
    }

    public int hashCode() {
        int i;
        long j = this.f16063d;
        long j2 = this.f16064e;
        int hashCode = (((((((((this.f16060a ^ 1000003) * 1000003) ^ this.f16061b.hashCode()) * 1000003) ^ this.f16062c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f16065f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f16066g) * 1000003) ^ this.f16067h.hashCode()) * 1000003) ^ this.f16068i.hashCode();
    }

    /* renamed from: i */
    public int mo45408i() {
        return this.f16066g;
    }

    /* renamed from: j */
    public long mo45409j() {
        return this.f16063d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f16060a + ", model=" + this.f16061b + ", availableProcessors=" + this.f16062c + ", totalRam=" + this.f16063d + ", diskSpace=" + this.f16064e + ", isEmulator=" + this.f16065f + ", state=" + this.f16066g + ", manufacturer=" + this.f16067h + ", modelClass=" + this.f16068i + "}";
    }
}
