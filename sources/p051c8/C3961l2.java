package p051c8;

import android.util.Log;

/* renamed from: c8.l2 */
/* compiled from: Logging */
public class C3961l2 {
    /* renamed from: a */
    public static void m4602a(String str) {
        if (Log.isLoggable("FIAM.Headless", 3)) {
            Log.d("FIAM.Headless", str);
        }
    }

    /* renamed from: b */
    public static void m4603b(String str) {
        Log.e("FIAM.Headless", str);
    }

    /* renamed from: c */
    public static void m4604c(String str) {
        if (Log.isLoggable("FIAM.Headless", 4)) {
            Log.i("FIAM.Headless", str);
        }
    }

    /* renamed from: d */
    public static void m4605d(String str) {
        Log.w("FIAM.Headless", str);
    }
}
