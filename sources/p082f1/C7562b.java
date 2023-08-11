package p082f1;

import android.net.Uri;

/* renamed from: f1.b */
/* compiled from: MediaStoreUtil */
public final class C7562b {
    /* renamed from: a */
    public static boolean m14870a(Uri uri) {
        if (!m14871b(uri) || m14874e(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m14871b(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m14872c(Uri uri) {
        if (!m14871b(uri) || !m14874e(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m14873d(int i, int i2) {
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m14874e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
