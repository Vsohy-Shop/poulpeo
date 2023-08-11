package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p131j5.C8419f;
import p170n4.C8913j;
import p231t4.C9713p;
import p275x4.C10393b;

/* renamed from: com.google.android.gms.cloudmessaging.g */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C4712g implements ServiceConnection {

    /* renamed from: b */
    int f4852b = 0;

    /* renamed from: c */
    final Messenger f4853c = new Messenger(new C8419f(Looper.getMainLooper(), new C4706a(this)));

    /* renamed from: d */
    C4713h f4854d;

    /* renamed from: e */
    final Queue<C4715j<?>> f4855e = new ArrayDeque();

    /* renamed from: f */
    final SparseArray<C4715j<?>> f4856f = new SparseArray<>();

    /* renamed from: g */
    final /* synthetic */ C4717l f4857g;

    /* synthetic */ C4712g(C4717l lVar, C8913j jVar) {
        this.f4857g = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo32317a(int i, @Nullable String str) {
        mo32318b(i, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo32318b(int i, @Nullable String str, @Nullable Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.f4852b;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f4852b = 4;
            C10393b.m21775b().mo45088c(this.f4857g.f4865a, this);
            zzq zzq = new zzq(i, str, th);
            for (C4715j<?> c : this.f4855e) {
                c.mo32329c(zzq);
            }
            this.f4855e.clear();
            for (int i3 = 0; i3 < this.f4856f.size(); i3++) {
                this.f4856f.valueAt(i3).mo32329c(zzq);
            }
            this.f4856f.clear();
        } else if (i2 == 3) {
            this.f4852b = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo32319c() {
        this.f4857g.f4866b.execute(new C4708c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo32320d() {
        if (this.f4852b == 1) {
            mo32317a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo32321e(int i) {
        C4715j jVar = this.f4856f.get(i);
        if (jVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f4856f.remove(i);
            jVar.mo32329c(new zzq(3, "Timed out waiting for response", (Throwable) null));
            mo32322f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo32322f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f4852b     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.Queue<com.google.android.gms.cloudmessaging.j<?>> r0 = r2.f4855e     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray<com.google.android.gms.cloudmessaging.j<?>> r0 = r2.f4856f     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.f4852b = r0     // Catch:{ all -> 0x0039 }
            x4.b r0 = p275x4.C10393b.m21775b()     // Catch:{ all -> 0x0039 }
            com.google.android.gms.cloudmessaging.l r1 = r2.f4857g     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r1.f4865a     // Catch:{ all -> 0x0039 }
            r0.mo45088c(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C4712g.mo32322f():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean mo32323g(C4715j<?> jVar) {
        boolean z;
        int i = this.f4852b;
        if (i == 0) {
            this.f4855e.add(jVar);
            if (this.f4852b == 0) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20278m(z);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f4852b = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!C10393b.m21775b().mo45087a(this.f4857g.f4865a, intent, this, 1)) {
                    mo32317a(0, "Unable to bind to service");
                } else {
                    this.f4857g.f4866b.schedule(new C4709d(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo32318b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f4855e.add(jVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f4855e.add(jVar);
            mo32319c();
            return true;
        }
        return true;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f4857g.f4866b.execute(new C4710e(this, iBinder));
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f4857g.f4866b.execute(new C4707b(this));
    }
}
