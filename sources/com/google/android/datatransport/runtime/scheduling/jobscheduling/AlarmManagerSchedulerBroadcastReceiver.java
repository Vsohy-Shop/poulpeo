package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.facebook.applinks.AppLinkData;
import p139k3.C8549o;
import p139k3.C8555t;
import p219s3.C9463a;
import p263w3.C10111a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(AppLinkData.ARGUMENTS_EXTRAS_KEY);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C8555t.m17186f(context);
        C8549o.C8550a d = C8549o.m17165a().mo42586b(queryParameter).mo42588d(C10111a.m21241b(intValue));
        if (queryParameter2 != null) {
            d.mo42587c(Base64.decode(queryParameter2, 0));
        }
        C8555t.m17184c().mo42616e().mo43932v(d.mo42585a(), i, new C9463a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m5893b() {
    }
}
