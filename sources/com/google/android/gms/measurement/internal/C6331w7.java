package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6331w7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f8368b;

    /* renamed from: c */
    final /* synthetic */ String f8369c;

    /* renamed from: d */
    final /* synthetic */ String f8370d;

    /* renamed from: e */
    final /* synthetic */ C6289s9 f8371e;

    /* renamed from: f */
    final /* synthetic */ boolean f8372f;

    /* renamed from: g */
    final /* synthetic */ C6123d8 f8373g;

    C6331w7(C6123d8 d8Var, AtomicReference atomicReference, String str, String str2, String str3, C6289s9 s9Var, boolean z) {
        this.f8373g = d8Var;
        this.f8368b = atomicReference;
        this.f8369c = str2;
        this.f8370d = str3;
        this.f8371e = s9Var;
        this.f8372f = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f8368b) {
            try {
                C9257d H = this.f8373g.f7724d;
                if (H == null) {
                    this.f8373g.f7899a.mo34920b().mo35075r().mo35040d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f8369c, this.f8370d);
                    this.f8368b.set(Collections.emptyList());
                    this.f8368b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C9713p.m20275j(this.f8371e);
                    this.f8368b.set(H.mo34755J1(this.f8369c, this.f8370d, this.f8372f, this.f8371e));
                } else {
                    this.f8368b.set(H.mo34760f0((String) null, this.f8369c, this.f8370d, this.f8372f));
                }
                this.f8373g.m10532E();
                atomicReference = this.f8368b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f8373g.f7899a.mo34920b().mo35075r().mo35040d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f8369c, e);
                    this.f8368b.set(Collections.emptyList());
                    atomicReference = this.f8368b;
                } catch (Throwable th) {
                    this.f8368b.notify();
                    throw th;
                }
            }
        }
    }
}
