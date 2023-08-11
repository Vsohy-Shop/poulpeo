package p286y4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import p023a5.C2207e;
import p180o4.C8976e;

/* renamed from: y4.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10683q {
    /* renamed from: a */
    public static boolean m22710a(@NonNull Context context, int i) {
        if (!m22711b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C8976e.m18220a(context).mo43152b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m22711b(@NonNull Context context, int i, @NonNull String str) {
        return C2207e.m1805a(context).mo23532g(i, str);
    }
}
