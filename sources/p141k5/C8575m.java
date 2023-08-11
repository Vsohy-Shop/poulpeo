package p141k5;

/* renamed from: k5.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8575m {
    /* renamed from: a */
    public static int m17212a(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m17213b(i, i2, "index"));
    }

    /* renamed from: b */
    private static String m17213b(int i, int i2, String str) {
        if (i < 0) {
            return C8581s.m17227a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C8581s.m17227a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
