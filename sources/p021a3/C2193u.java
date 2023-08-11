package p021a3;

/* renamed from: a3.u */
/* compiled from: NonceUtil.kt */
public final class C2193u {

    /* renamed from: a */
    public static final C2193u f966a = new C2193u();

    private C2193u() {
    }

    /* renamed from: a */
    public static final boolean m1738a(String str) {
        boolean z;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (C13755w.m31570V(str, ' ', 0, false, 6, (Object) null) >= 0) {
            z2 = true;
        }
        return !z2;
    }
}
