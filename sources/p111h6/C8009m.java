package p111h6;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: h6.m */
/* compiled from: Platform */
final class C8009m {

    /* renamed from: a */
    private static final Logger f11244a = Logger.getLogger(C8009m.class.getName());

    /* renamed from: b */
    private static final C8008l f11245b = m15739c();

    /* renamed from: h6.m$b */
    /* compiled from: Platform */
    private static final class C8011b implements C8008l {
        private C8011b() {
        }
    }

    private C8009m() {
    }

    /* renamed from: a */
    static String m15737a(String str) {
        if (m15740d(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    static String m15738b(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: c */
    private static C8008l m15739c() {
        return new C8011b();
    }

    /* renamed from: d */
    static boolean m15740d(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    static long m15741e() {
        return System.nanoTime();
    }
}
