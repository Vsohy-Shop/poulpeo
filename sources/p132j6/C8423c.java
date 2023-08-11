package p132j6;

/* renamed from: j6.c */
/* compiled from: MathPreconditions */
final class C8423c {
    /* renamed from: a */
    static void m16844a(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    /* renamed from: b */
    static int m16845b(String str, int i) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    static void m16846c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
