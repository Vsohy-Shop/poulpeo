package p277x6;

import p277x6.C10498c0;

/* renamed from: x6.z */
/* compiled from: AutoValue_StaticSessionData_OsData */
final class C10560z extends C10498c0.C10501c {

    /* renamed from: a */
    private final String f16069a;

    /* renamed from: b */
    private final String f16070b;

    /* renamed from: c */
    private final boolean f16071c;

    C10560z(String str, String str2, boolean z) {
        if (str != null) {
            this.f16069a = str;
            if (str2 != null) {
                this.f16070b = str2;
                this.f16071c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    /* renamed from: b */
    public boolean mo45410b() {
        return this.f16071c;
    }

    /* renamed from: c */
    public String mo45411c() {
        return this.f16070b;
    }

    /* renamed from: d */
    public String mo45412d() {
        return this.f16069a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10498c0.C10501c)) {
            return false;
        }
        C10498c0.C10501c cVar = (C10498c0.C10501c) obj;
        if (!this.f16069a.equals(cVar.mo45412d()) || !this.f16070b.equals(cVar.mo45411c()) || this.f16071c != cVar.mo45410b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f16069a.hashCode() ^ 1000003) * 1000003) ^ this.f16070b.hashCode()) * 1000003;
        if (this.f16071c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f16069a + ", osCodeName=" + this.f16070b + ", isRooted=" + this.f16071c + "}";
    }
}
