package p214r8;

/* renamed from: r8.a */
/* compiled from: AutoValue_LibraryVersion */
final class C9394a extends C9399f {

    /* renamed from: a */
    private final String f13973a;

    /* renamed from: b */
    private final String f13974b;

    C9394a(String str, String str2) {
        if (str != null) {
            this.f13973a = str;
            if (str2 != null) {
                this.f13974b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: b */
    public String mo43815b() {
        return this.f13973a;
    }

    /* renamed from: c */
    public String mo43816c() {
        return this.f13974b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9399f)) {
            return false;
        }
        C9399f fVar = (C9399f) obj;
        if (!this.f13973a.equals(fVar.mo43815b()) || !this.f13974b.equals(fVar.mo43816c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f13973a.hashCode() ^ 1000003) * 1000003) ^ this.f13974b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f13973a + ", version=" + this.f13974b + "}";
    }
}
