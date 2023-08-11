package p278x7;

import android.util.Log;

/* renamed from: x7.m */
/* compiled from: Logging */
public class C10584m {
    /* renamed from: a */
    public static void m22515a(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    /* renamed from: b */
    public static void m22516b(String str) {
        m22515a("============ " + str + " ============");
    }

    /* renamed from: c */
    public static void m22517c(String str, float f) {
        m22515a(str + ": " + f);
    }

    /* renamed from: d */
    public static void m22518d(String str, float f, float f2) {
        m22515a(str + ": (" + f + ", " + f2 + ")");
    }

    /* renamed from: e */
    public static void m22519e(String str) {
        Log.e("FIAM.Display", str);
    }

    /* renamed from: f */
    public static void m22520f(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }
}
