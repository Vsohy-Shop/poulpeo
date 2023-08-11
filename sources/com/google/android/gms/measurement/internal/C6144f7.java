package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6144f7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7769b;

    /* renamed from: c */
    final /* synthetic */ C6289s9 f7770c;

    /* renamed from: d */
    final /* synthetic */ boolean f7771d;

    /* renamed from: e */
    final /* synthetic */ C6123d8 f7772e;

    C6144f7(C6123d8 d8Var, AtomicReference atomicReference, C6289s9 s9Var, boolean z) {
        this.f7772e = d8Var;
        this.f7769b = atomicReference;
        this.f7770c = s9Var;
        this.f7771d = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f7769b) {
            try {
                C9257d H = this.f7772e.f7724d;
                if (H == null) {
                    this.f7772e.f7899a.mo34920b().mo35075r().mo35037a("Failed to get all user properties; not connected to service");
                    this.f7769b.notify();
                    return;
                }
                C9713p.m20275j(this.f7770c);
                this.f7769b.set(H.mo34765x2(this.f7770c, this.f7771d));
                this.f7772e.m10532E();
                atomicReference = this.f7769b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f7772e.f7899a.mo34920b().mo35075r().mo35038b("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f7769b;
                } catch (Throwable th) {
                    this.f7769b.notify();
                    throw th;
                }
            }
        }
    }
}
