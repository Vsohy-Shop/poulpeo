package p454wf;

import java.util.Comparator;
import kotlin.collections.C12671c;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;

/* renamed from: wf.v */
/* compiled from: StringsJVM.kt */
class C13754v extends C13753u {
    /* renamed from: A */
    public static /* synthetic */ String m31521A(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m31537y(str, str2, str3, z);
    }

    /* renamed from: B */
    public static boolean m31522B(String str, String str2, int i, boolean z) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m31533u(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: C */
    public static boolean m31523C(String str, String str2, boolean z) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m31533u(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m31524D(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m31522B(str, str2, i, z);
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m31525E(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31523C(str, str2, z);
    }

    /* renamed from: n */
    public static String m31526n(char[] cArr) {
        C12775o.m28639i(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: o */
    public static String m31527o(char[] cArr, int i, int i2) {
        C12775o.m28639i(cArr, "<this>");
        C12671c.Companion.mo50422a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: p */
    public static boolean m31528p(String str, String str2, boolean z) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m31533u(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m31529q(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m31528p(str, str2, z);
    }

    /* renamed from: r */
    public static boolean m31530r(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: s */
    public static Comparator<String> m31531s(C12770k0 k0Var) {
        C12775o.m28639i(k0Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C12775o.m28638h(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m31532t(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            int r0 = r4.length()
            r1 = 1
            if (r0 == 0) goto L_0x0040
            tf.f r0 = p454wf.C13755w.m31564P(r4)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0020
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0020
        L_0x001e:
            r4 = r1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001e
            r2 = r0
            kotlin.collections.l0 r2 = (kotlin.collections.C12703l0) r2
            int r2 = r2.nextInt()
            char r2 = r4.charAt(r2)
            boolean r2 = p454wf.C13724b.m31417c(r2)
            if (r2 != 0) goto L_0x0024
            r4 = r3
        L_0x003c:
            if (r4 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p454wf.C13754v.m31532t(java.lang.CharSequence):boolean");
    }

    /* renamed from: u */
    public static final boolean m31533u(String str, int i, String str2, int i2, int i3, boolean z) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m31534v(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m31533u(str, i, str2, i2, i3, z);
    }

    /* renamed from: w */
    public static String m31535w(CharSequence charSequence, int i) {
        boolean z;
        C12775o.m28639i(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C12703l0 r = new C13528f(1, i).iterator();
                while (r.hasNext()) {
                    r.nextInt();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C12775o.m28638h(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: x */
    public static final String m31536x(String str, char c, char c2, boolean z) {
        C12775o.m28639i(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C12775o.m28638h(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C13725c.m31422h(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: y */
    public static final String m31537y(String str, String str2, String str3, boolean z) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(str2, "oldValue");
        C12775o.m28639i(str3, "newValue");
        int i = 0;
        int S = C13755w.m31567S(str, str2, 0, z);
        if (S < 0) {
            return str;
        }
        int length = str2.length();
        int d = C13537l.m30877d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, S);
                sb.append(str3);
                i = S + length;
                if (S >= str.length() || (S = C13755w.m31567S(str, str2, S + d, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C12775o.m28638h(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, S);
                sb.append(str3);
                i = S + length;
                break;
            } while ((S = C13755w.m31567S(str, str2, S + d, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C12775o.m28638h(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: z */
    public static /* synthetic */ String m31538z(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m31536x(str, c, c2, z);
    }
}
