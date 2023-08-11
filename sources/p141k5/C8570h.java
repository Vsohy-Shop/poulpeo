package p141k5;

/* renamed from: k5.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C8570h extends C8569g {

    /* renamed from: a */
    private final char f12240a;

    C8570h(char c) {
        this.f12240a = c;
    }

    /* renamed from: a */
    public final boolean mo42636a(char c) {
        if (c == this.f12240a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        int i = this.f12240a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
