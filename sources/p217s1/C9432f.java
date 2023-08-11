package p217s1;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import p217s1.C9427c;

/* renamed from: s1.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C9432f implements C9429d {
    @NonNull
    /* renamed from: a */
    public C9427c mo43849a(@NonNull Context context, @NonNull C9427c.C9428a aVar) {
        boolean z;
        String str;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            return new C9430e(context, aVar);
        }
        return new C9436j();
    }
}
