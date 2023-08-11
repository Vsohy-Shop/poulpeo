package p296z3;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.gtm.C5333f1;

/* renamed from: z3.i */
public final class C10805i {
    /* renamed from: a */
    private static String m23025a(String str, int i) {
        if (i <= 0) {
            C5333f1.m7925d("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m23026b(int i) {
        return m23025a("cd", i);
    }

    /* renamed from: c */
    public static String m23027c(int i) {
        return m23025a("cm", i);
    }

    /* renamed from: d */
    public static String m23028d(int i) {
        return m23025a("&pr", i);
    }

    /* renamed from: e */
    public static String m23029e(int i) {
        return m23025a("pr", i);
    }

    /* renamed from: f */
    public static String m23030f(int i) {
        return m23025a("&promo", i);
    }

    /* renamed from: g */
    public static String m23031g(int i) {
        return m23025a(NotificationCompat.CATEGORY_PROMO, i);
    }

    /* renamed from: h */
    public static String m23032h(int i) {
        return m23025a("pi", i);
    }

    /* renamed from: i */
    public static String m23033i(int i) {
        return m23025a("&il", i);
    }

    /* renamed from: j */
    public static String m23034j(int i) {
        return m23025a("il", i);
    }

    /* renamed from: k */
    public static String m23035k(int i) {
        return m23025a("cd", i);
    }

    /* renamed from: l */
    public static String m23036l(int i) {
        return m23025a("cm", i);
    }
}
