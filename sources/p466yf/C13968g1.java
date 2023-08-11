package p466yf;

/* renamed from: yf.g1 */
/* compiled from: JobSupport.kt */
final class C13968g1 implements C14028s1 {

    /* renamed from: b */
    private final boolean f22894b;

    public C13968g1(boolean z) {
        this.f22894b = z;
    }

    /* renamed from: a */
    public boolean mo53693a() {
        return this.f22894b;
    }

    /* renamed from: c */
    public C13993k2 mo53694c() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (mo53693a()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
