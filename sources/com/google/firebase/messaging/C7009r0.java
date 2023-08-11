package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;

/* renamed from: com.google.firebase.messaging.r0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C7009r0 {
    /* renamed from: a */
    private static SharedPreferences m12410a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @WorkerThread
    /* renamed from: b */
    static boolean m12411b(Context context) {
        return m12410a(context).getBoolean("proxy_notification_initialized", false);
    }

    @WorkerThread
    /* renamed from: c */
    static void m12412c(Context context, boolean z) {
        SharedPreferences.Editor edit = m12410a(context).edit();
        edit.putBoolean("proxy_notification_initialized", true);
        edit.apply();
    }
}
