package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import p085f4.C7592v;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class RevocationBoundService extends Service {
    @Nullable
    public final IBinder onBind(Intent intent) {
        String str;
        String str2;
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    str = "RevocationBoundService handling ".concat(valueOf);
                } else {
                    str = new String("RevocationBoundService handling ");
                }
                Log.v("RevocationService", str);
            }
            return new C7592v(this);
        }
        String valueOf2 = String.valueOf(intent.getAction());
        if (valueOf2.length() != 0) {
            str2 = "Unknown action sent to RevocationBoundService: ".concat(valueOf2);
        } else {
            str2 = new String("Unknown action sent to RevocationBoundService: ");
        }
        Log.w("RevocationService", str2);
        return null;
    }
}
