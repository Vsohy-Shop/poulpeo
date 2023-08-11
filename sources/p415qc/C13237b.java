package p415qc;

/* renamed from: qc.b */
/* compiled from: CTNameValuePair */
public class C13237b {

    /* renamed from: a */
    public final String f21061a;

    /* renamed from: b */
    public final String f21062b;

    public C13237b(String str, String str2) {
        if (str == null) {
            this.f21061a = "";
        } else {
            this.f21061a = str;
        }
        if (str2 == null) {
            this.f21062b = "";
        } else {
            this.f21062b = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13237b)) {
            return false;
        }
        C13237b bVar = (C13237b) obj;
        if (!this.f21061a.equals(bVar.f21061a)) {
            return false;
        }
        return this.f21062b.equals(bVar.f21062b);
    }

    public int hashCode() {
        return (this.f21061a.hashCode() * 31) + this.f21062b.hashCode();
    }
}
