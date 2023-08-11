package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p275x4.C10393b;
import p276x5.C10406g;
import p297z4.C10822b;

/* renamed from: com.google.firebase.messaging.m1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6998m1 implements ServiceConnection {

    /* renamed from: b */
    private final Context f9333b;

    /* renamed from: c */
    private final Intent f9334c;

    /* renamed from: d */
    private final ScheduledExecutorService f9335d;

    /* renamed from: e */
    private final Queue<C6999a> f9336e;
    @Nullable

    /* renamed from: f */
    private C6988j1 f9337f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f9338g;

    /* renamed from: com.google.firebase.messaging.m1$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    static class C6999a {

        /* renamed from: a */
        final Intent f9339a;

        /* renamed from: b */
        private final C10406g<Void> f9340b = new C10406g<>();

        C6999a(Intent intent) {
            this.f9339a = intent;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39968a(ScheduledExecutorService scheduledExecutorService) {
            mo39970c().mo35451b(scheduledExecutorService, new C6992k1(scheduledExecutorService.schedule(new C6995l1(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo39969b() {
            this.f9340b.mo45100e(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Task<Void> mo39970c() {
            return this.f9340b.mo45096a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public /* synthetic */ void mo39971d() {
            String action = this.f9339a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb.toString());
            mo39969b();
        }
    }

    C6998m1(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new C10822b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @GuardedBy("this")
    /* renamed from: a */
    private void m12388a() {
        while (!this.f9336e.isEmpty()) {
            this.f9336e.poll().mo39969b();
        }
    }

    /* renamed from: b */
    private synchronized void m12389b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f9336e.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            C6988j1 j1Var = this.f9337f;
            if (j1Var == null || !j1Var.isBinderAlive()) {
                m12390d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f9337f.mo39935b(this.f9336e.poll());
        }
    }

    @GuardedBy("this")
    /* renamed from: d */
    private void m12390d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f9338g;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f9338g) {
            this.f9338g = true;
            try {
                if (!C10393b.m21775b().mo45087a(this.f9333b, this.f9334c, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f9338g = false;
                    m12388a();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Task<Void> mo39965c(Intent intent) {
        C6999a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C6999a(intent);
        aVar.mo39968a(this.f9335d);
        this.f9336e.add(aVar);
        m12389b();
        return aVar.mo39970c();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.f9338g = false;
        if (!(iBinder instanceof C6988j1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
            m12388a();
            return;
        }
        this.f9337f = (C6988j1) iBinder;
        m12389b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        m12389b();
    }

    @VisibleForTesting
    C6998m1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f9336e = new ArrayDeque();
        this.f9338g = false;
        Context applicationContext = context.getApplicationContext();
        this.f9333b = applicationContext;
        this.f9334c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f9335d = scheduledExecutorService;
    }
}
