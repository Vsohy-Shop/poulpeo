package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.l0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5002l0 {
    /* renamed from: a */
    public static String m7142a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m7143b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m7143b(c)) {
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

    /* renamed from: b */
    public static boolean m7143b(char c) {
        if (c < 'a' || c > 'z') {
            return false;
        }
        return true;
    }
}
