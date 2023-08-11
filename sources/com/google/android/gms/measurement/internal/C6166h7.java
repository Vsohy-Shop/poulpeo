package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6166h7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7847b;

    /* renamed from: c */
    final /* synthetic */ C6289s9 f7848c;

    /* renamed from: d */
    final /* synthetic */ C6123d8 f7849d;

    C6166h7(C6123d8 d8Var, AtomicReference atomicReference, C6289s9 s9Var) {
        this.f7849d = d8Var;
        this.f7847b = atomicReference;
        this.f7848c = s9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f7847b) {
            try {
                if (!this.f7849d.f7899a.mo35184F().mo35425q().mo43554k()) {
                    this.f7849d.f7899a.mo34920b().mo35081x().mo35037a("Analytics storage consent denied; will not get app instance id");
                    this.f7849d.f7899a.mo35186I().mo35224C((String) null);
                    this.f7849d.f7899a.mo35184F().f8437g.mo35401b((String) null);
                    this.f7847b.set((Object) null);
                    this.f7847b.notify();
                    return;
                }
                C9257d H = this.f7849d.f7724d;
                if (H == null) {
                    this.f7849d.f7899a.mo34920b().mo35075r().mo35037a("Failed to get app instance id");
                    this.f7847b.notify();
                    return;
                }
                C9713p.m20275j(this.f7848c);
                this.f7847b.set(H.mo34764v0(this.f7848c));
                String str = (String) this.f7847b.get();
                if (str != null) {
                    this.f7849d.f7899a.mo35186I().mo35224C(str);
                    this.f7849d.f7899a.mo35184F().f8437g.mo35401b(str);
                }
                this.f7849d.m10532E();
                atomicReference = this.f7847b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f7849d.f7899a.mo34920b().mo35075r().mo35038b("Failed to get app instance id", e);
                    atomicReference = this.f7847b;
                } catch (Throwable th) {
                    this.f7847b.notify();
                    throw th;
                }
            }
        }
    }
}
