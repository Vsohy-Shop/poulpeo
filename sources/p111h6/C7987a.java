package p111h6;

/* renamed from: h6.a */
/* compiled from: Ascii */
public final class C7987a {
    /* renamed from: a */
    public static boolean m15693a(char c) {
        if (c < 'a' || c > 'z') {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m15694b(char c) {
        if (c < 'A' || c > 'Z') {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m15695c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m15694b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m15694b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: d */
    public static char m15696d(char c) {
        if (m15693a(c)) {
            return (char) (c ^ ' ');
        }
        return c;
    }
}
