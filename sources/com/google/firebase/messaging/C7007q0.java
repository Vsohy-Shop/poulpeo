package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p276x5.C10406g;
import p276x5.C10410i;
import p286y4.C10680n;

/* renamed from: com.google.firebase.messaging.q0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C7007q0 {
    /* renamed from: a */
    private static boolean m12404a(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: b */
    static void m12405b(Context context) {
        if (!C7009r0.m12411b(context)) {
            m12408e(C7005p0.f9346b, context, m12409f(context));
        }
    }

    /* renamed from: c */
    static boolean m12406c(Context context) {
        String str;
        if (!C10680n.m22706j()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        } else if (!m12404a(context)) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "error retrieving notification delegate for package ".concat(valueOf);
            } else {
                str = new String("error retrieving notification delegate for package ");
            }
            Log.e("FirebaseMessaging", str);
            return false;
        } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        } else {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
            return true;
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m12407d(Context context, boolean z, C10406g gVar) {
        String str;
        try {
            if (!m12404a(context)) {
                String valueOf = String.valueOf(context.getPackageName());
                if (valueOf.length() != 0) {
                    str = "error configuring notification delegate for package ".concat(valueOf);
                } else {
                    str = new String("error configuring notification delegate for package ");
                }
                Log.e("FirebaseMessaging", str);
                return;
            }
            C7009r0.m12412c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            gVar.mo45100e(null);
        } finally {
            gVar.mo45100e(null);
        }
    }

    /* renamed from: e */
    static Task<Void> m12408e(Executor executor, Context context, boolean z) {
        if (!C10680n.m22706j()) {
            return C10410i.m21831e(null);
        }
        C10406g gVar = new C10406g();
        executor.execute(new C7003o0(context, z, gVar));
        return gVar.mo45096a();
    }

    /* renamed from: f */
    private static boolean m12409f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
