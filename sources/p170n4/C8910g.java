package p170n4;

import android.util.Log;

/* renamed from: n4.g */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C8910g extends ClassLoader {
    /* access modifiers changed from: protected */
    public final Class<?> loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C8911h.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C8911h.class;
    }
}
