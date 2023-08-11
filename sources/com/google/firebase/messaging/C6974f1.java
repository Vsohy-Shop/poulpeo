package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.f1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6974f1 implements Runnable {

    /* renamed from: g */
    private static final Object f9287g = new Object();
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: h */
    private static Boolean f9288h;
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: i */
    private static Boolean f9289i;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f9290b;

    /* renamed from: c */
    private final C6991k0 f9291c;

    /* renamed from: d */
    private final PowerManager.WakeLock f9292d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6971e1 f9293e;

    /* renamed from: f */
    private final long f9294f;

    @VisibleForTesting
    /* renamed from: com.google.firebase.messaging.f1$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    class C6975a extends BroadcastReceiver {
        @GuardedBy("this")
        @Nullable

        /* renamed from: a */
        private C6974f1 f9295a;

        public C6975a(C6974f1 f1Var) {
            this.f9295a = f1Var;
        }

        /* renamed from: a */
        public void mo39919a() {
            if (C6974f1.m12286j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            C6974f1.this.f9290b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            C6974f1 f1Var = this.f9295a;
            if (f1Var != null) {
                if (f1Var.m12285i()) {
                    if (C6974f1.m12286j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f9295a.f9293e.mo39904l(this.f9295a, 0);
                    context.unregisterReceiver(this);
                    this.f9295a = null;
                }
            }
        }
    }

    C6974f1(C6971e1 e1Var, Context context, C6991k0 k0Var, long j) {
        this.f9293e = e1Var;
        this.f9290b = context;
        this.f9294f = j;
        this.f9291c = k0Var;
        this.f9292d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m12281e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    /* renamed from: f */
    private static boolean m12282f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f9287g) {
            Boolean bool = f9289i;
            if (bool == null) {
                z = m12283g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f9289i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m12283g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", m12281e(str));
        return false;
    }

    /* renamed from: h */
    private static boolean m12284h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f9287g) {
            Boolean bool = f9288h;
            if (bool == null) {
                z = m12283g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f9288h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return false;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean m12285i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f9290b     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0021 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0012
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x0021 }
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x001e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6974f1.m12285i():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m12286j() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public void run() {
        String str;
        if (m12284h(this.f9290b)) {
            this.f9292d.acquire(C6959b.f9245a);
        }
        try {
            this.f9293e.mo39906n(true);
            if (!this.f9291c.mo39941g()) {
                this.f9293e.mo39906n(false);
                if (m12284h(this.f9290b)) {
                    try {
                        this.f9292d.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m12282f(this.f9290b) || m12285i()) {
                if (this.f9293e.mo39909r()) {
                    this.f9293e.mo39906n(false);
                } else {
                    this.f9293e.mo39910s(this.f9294f);
                }
                if (m12284h(this.f9290b)) {
                    try {
                        this.f9292d.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new C6975a(this).mo39919a();
                if (m12284h(this.f9290b)) {
                    try {
                        this.f9292d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                str = new String("Failed to sync topics. Won't retry sync. ");
            }
            Log.e("FirebaseMessaging", str);
            this.f9293e.mo39906n(false);
            if (m12284h(this.f9290b)) {
                try {
                    this.f9292d.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (m12284h(this.f9290b)) {
                try {
                    this.f9292d.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
