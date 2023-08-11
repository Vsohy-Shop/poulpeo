package p074e5;

import android.content.Context;
import android.content.SharedPreferences;
import p161m5.C8827d;

/* renamed from: e5.b */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public final class C7478b {

    /* renamed from: a */
    private static SharedPreferences f10361a;

    /* renamed from: a */
    public static SharedPreferences m14654a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f10361a == null) {
                f10361a = (SharedPreferences) C8827d.m17890a(new C7477a(context));
            }
            sharedPreferences = f10361a;
        }
        return sharedPreferences;
    }
}
