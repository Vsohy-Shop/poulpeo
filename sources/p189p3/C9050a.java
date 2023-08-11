package p189p3;

import android.util.Log;

/* renamed from: p3.a */
/* compiled from: Logging */
public final class C9050a {
    /* renamed from: a */
    public static void m18380a(String str, String str2, Object obj) {
        Log.d(m18383d(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: b */
    public static void m18381b(String str, String str2, Object... objArr) {
        Log.d(m18383d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m18382c(String str, String str2, Throwable th) {
        Log.e(m18383d(str), str2, th);
    }

    /* renamed from: d */
    private static String m18383d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m18384e(String str, String str2) {
        Log.i(m18383d(str), str2);
    }

    /* renamed from: f */
    public static void m18385f(String str, String str2, Object obj) {
        Log.w(m18383d(str), String.format(str2, new Object[]{obj}));
    }
}
