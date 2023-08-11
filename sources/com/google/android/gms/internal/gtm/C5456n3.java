package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.gtm.n3 */
class C5456n3 extends BroadcastReceiver {

    /* renamed from: b */
    private static final String f6141b = "com.google.android.gms.internal.gtm.n3";

    /* renamed from: a */
    private final C5306d4 f6142a;

    C5456n3(C5306d4 d4Var) {
        this.f6142a = d4Var;
    }

    /* renamed from: a */
    public static void m8217a(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f6141b, true);
        context.sendBroadcast(intent);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            Bundle extras = intent.getExtras();
            Boolean bool = Boolean.FALSE;
            if (extras != null) {
                bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            this.f6142a.mo33169a(!bool.booleanValue());
        } else if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(f6141b)) {
            this.f6142a.mo33170b();
        }
    }
}
