package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.o0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5053o0 {
    /* renamed from: a */
    public static int m7294a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = C5070p0.m7346a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = C5070p0.m7346a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m7295b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m7297d(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m7296c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m7297d(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m7297d(i2, i3, "end index");
            } else {
                str = C5070p0.m7346a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: d */
    private static String m7297d(int i, int i2, String str) {
        if (i < 0) {
            return C5070p0.m7346a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C5070p0.m7346a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
