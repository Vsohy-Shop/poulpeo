package p290y8;

import kotlin.jvm.internal.C12775o;

/* renamed from: y8.e */
/* compiled from: StringTranslator.kt */
public abstract class C10716e {
    /* renamed from: c */
    private final void m22832c(String str, StringBuilder sb) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int a = mo45638a(str, i, sb);
            if (a == 0) {
                char charAt = str.charAt(i);
                sb.append(charAt);
                i++;
                if (Character.isHighSurrogate(charAt) && i < length) {
                    char charAt2 = str.charAt(i);
                    if (Character.isLowSurrogate(charAt2)) {
                        sb.append(charAt2);
                        i++;
                    }
                }
            } else {
                for (int i2 = 0; i2 < a; i2++) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract int mo45638a(String str, int i, StringBuilder sb);

    /* renamed from: b */
    public final String mo45647b(String str) {
        C12775o.m28639i(str, "input");
        StringBuilder sb = new StringBuilder(str.length() * 2);
        m22832c(str, sb);
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "stringBuilder.toString()");
        return sb2;
    }
}
