package p454wf;

/* renamed from: wf.c */
/* compiled from: Char.kt */
class C13725c extends C13724b {
    /* renamed from: g */
    public static int m31421g(char c) {
        int b = C13724b.m31416b(c, 10);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    /* renamed from: h */
    public static final boolean m31422h(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
