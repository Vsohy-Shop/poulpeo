package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import p201q5.C9257d;
import p231t4.C9665c;
import p231t4.C9713p;
import p275x4.C10393b;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6112c8 implements ServiceConnection, C9665c.C9666a, C9665c.C9667b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f7688b;

    /* renamed from: c */
    private volatile C6162h3 f7689c;

    /* renamed from: d */
    final /* synthetic */ C6123d8 f7690d;

    protected C6112c8(C6123d8 d8Var) {
        this.f7690d = d8Var;
    }

    @MainThread
    /* renamed from: E */
    public final void mo34794E(int i) {
        C9713p.m20270e("MeasurementServiceConnection.onConnectionSuspended");
        this.f7690d.f7899a.mo34920b().mo35074q().mo35037a("Service connection suspended");
        this.f7690d.f7899a.mo34919a().mo35110z(new C6089a8(this));
    }

    @MainThread
    /* renamed from: G */
    public final void mo34795G(@NonNull ConnectionResult connectionResult) {
        C9713p.m20270e("MeasurementServiceConnection.onConnectionFailed");
        C6206l3 E = this.f7690d.f7899a.mo35183E();
        if (E != null) {
            E.mo35080w().mo35038b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f7688b = false;
            this.f7689c = null;
        }
        this.f7690d.f7899a.mo34919a().mo35110z(new C6101b8(this));
    }

    @MainThread
    /* renamed from: J */
    public final void mo34796J(Bundle bundle) {
        C9713p.m20270e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C9713p.m20275j(this.f7689c);
                this.f7690d.f7899a.mo34919a().mo35110z(new C6364z7(this, (C9257d) this.f7689c.mo44125E()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7689c = null;
                this.f7688b = false;
            }
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo34797b(Intent intent) {
        this.f7690d.mo34778h();
        Context f = this.f7690d.f7899a.mo34927f();
        C10393b b = C10393b.m21775b();
        synchronized (this) {
            if (this.f7688b) {
                this.f7690d.f7899a.mo34920b().mo35079v().mo35037a("Connection attempt already in progress");
                return;
            }
            this.f7690d.f7899a.mo34920b().mo35079v().mo35037a("Using local app measurement service");
            this.f7688b = true;
            b.mo45087a(f, intent, this.f7690d.f7723c, 129);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo34798c() {
        this.f7690d.mo34778h();
        Context f = this.f7690d.f7899a.mo34927f();
        synchronized (this) {
            if (this.f7688b) {
                this.f7690d.f7899a.mo34920b().mo35079v().mo35037a("Connection attempt already in progress");
            } else if (this.f7689c == null || (!this.f7689c.mo44138d() && !this.f7689c.mo44141g())) {
                this.f7689c = new C6162h3(f, Looper.getMainLooper(), this, this);
                this.f7690d.f7899a.mo34920b().mo35079v().mo35037a("Connecting to remote service");
                this.f7688b = true;
                C9713p.m20275j(this.f7689c);
                this.f7689c.mo44148q();
            } else {
                this.f7690d.f7899a.mo34920b().mo35079v().mo35037a("Already awaiting connection attempt");
            }
        }
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo34799d() {
        if (this.f7689c != null && (this.f7689c.mo44141g() || this.f7689c.mo44138d())) {
            this.f7689c.mo32396c();
        }
        this.f7689c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f7690d.f7899a.mo34920b().mo35075r().mo35037a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p231t4.C9713p.m20270e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f7688b = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d8 r4 = r3.f7690d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo35037a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof p201q5.C9257d     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            q5.d r1 = (p201q5.C9257d) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.b3 r1 = new com.google.android.gms.measurement.internal.b3     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.d8 r5 = r3.f7690d     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35079v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo35037a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.d8 r5 = r3.f7690d     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo35038b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.d8 r5 = r3.f7690d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo35037a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f7688b = r4     // Catch:{ all -> 0x0063 }
            x4.b r4 = p275x4.C10393b.m21775b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.d8 r5 = r3.f7690d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.p4 r5 = r5.f7899a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo34927f()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.d8 r0 = r3.f7690d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.c8 r0 = r0.f7723c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo45088c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.d8 r4 = r3.f7690d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n4 r4 = r4.mo34919a()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.x7 r5 = new com.google.android.gms.measurement.internal.x7     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo35110z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6112c8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        C9713p.m20270e("MeasurementServiceConnection.onServiceDisconnected");
        this.f7690d.f7899a.mo34920b().mo35074q().mo35037a("Service disconnected");
        this.f7690d.f7899a.mo34919a().mo35110z(new C6353y7(this, componentName));
    }
}
