package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p297z4.C10822b;

/* renamed from: com.google.firebase.messaging.a1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6957a1 implements Runnable {

    /* renamed from: b */
    private final long f9240b;

    /* renamed from: c */
    private final PowerManager.WakeLock f9241c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final FirebaseMessaging f9242d;

    /* renamed from: e */
    ExecutorService f9243e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C10822b("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.a1$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    static class C6958a extends BroadcastReceiver {

        /* renamed from: a */
        private C6957a1 f9244a;

        public C6958a(C6957a1 a1Var) {
            this.f9244a = a1Var;
        }

        /* renamed from: a */
        public void mo39887a() {
            if (C6957a1.m12218c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f9244a.mo39883b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C6957a1 a1Var = this.f9244a;
            if (a1Var != null && a1Var.mo39884d()) {
                if (C6957a1.m12218c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f9244a.f9242d.enqueueTaskWithDelaySeconds(this.f9244a, 0);
                this.f9244a.mo39883b().unregisterReceiver(this);
                this.f9244a = null;
            }
        }
    }

    public C6957a1(FirebaseMessaging firebaseMessaging, long j) {
        this.f9242d = firebaseMessaging;
        this.f9240b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo39883b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f9241c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m12218c() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo39883b() {
        return this.f9242d.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo39884d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo39883b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo39885e() {
        try {
            if (this.f9242d.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (C6973f0.m12269g(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (C7020w0.m12426b().mo39996e(mo39883b())) {
            this.f9241c.acquire();
        }
        try {
            this.f9242d.setSyncScheduledOrRunning(true);
            if (!this.f9242d.isGmsCorePresent()) {
                this.f9242d.setSyncScheduledOrRunning(false);
                if (!C7020w0.m12426b().mo39996e(mo39883b())) {
                    return;
                }
            } else if (!C7020w0.m12426b().mo39995d(mo39883b()) || mo39884d()) {
                if (mo39885e()) {
                    this.f9242d.setSyncScheduledOrRunning(false);
                } else {
                    this.f9242d.syncWithDelaySecondsInternal(this.f9240b);
                }
                if (!C7020w0.m12426b().mo39996e(mo39883b())) {
                    return;
                }
            } else {
                new C6958a(this).mo39887a();
                if (!C7020w0.m12426b().mo39996e(mo39883b())) {
                    return;
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseMessaging", sb.toString());
            this.f9242d.setSyncScheduledOrRunning(false);
            if (!C7020w0.m12426b().mo39996e(mo39883b())) {
                return;
            }
        } catch (Throwable th) {
            if (C7020w0.m12426b().mo39996e(mo39883b())) {
                this.f9241c.release();
            }
            throw th;
        }
        this.f9241c.release();
    }
}
