package p432tb;

/* renamed from: tb.e */
/* compiled from: ReviewMerchantListHeader */
public class C13485e {

    /* renamed from: a */
    private String f21654a;

    /* renamed from: b */
    private double f21655b;

    /* renamed from: c */
    private int f21656c;

    public C13485e(String str, double d, int i) {
        this.f21654a = str;
        this.f21655b = d;
        this.f21656c = i;
    }

    /* renamed from: a */
    public String mo53084a() {
        return this.f21654a;
    }

    /* renamed from: b */
    public int mo53085b() {
        return this.f21656c;
    }

    /* renamed from: c */
    public double mo53086c() {
        return this.f21655b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13485e)) {
            return false;
        }
        C13485e eVar = (C13485e) obj;
        if (Double.compare(eVar.f21655b, this.f21655b) != 0 || this.f21656c != eVar.f21656c) {
            return false;
        }
        String str = this.f21654a;
        String str2 = eVar.f21654a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f21654a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f21655b);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f21656c;
    }
}
