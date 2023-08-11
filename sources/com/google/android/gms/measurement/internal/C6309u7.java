package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p201q5.C9257d;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6309u7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f8294b;

    /* renamed from: c */
    final /* synthetic */ String f8295c;

    /* renamed from: d */
    final /* synthetic */ String f8296d;

    /* renamed from: e */
    final /* synthetic */ C6289s9 f8297e;

    /* renamed from: f */
    final /* synthetic */ C6123d8 f8298f;

    C6309u7(C6123d8 d8Var, AtomicReference atomicReference, String str, String str2, String str3, C6289s9 s9Var) {
        this.f8298f = d8Var;
        this.f8294b = atomicReference;
        this.f8295c = str2;
        this.f8296d = str3;
        this.f8297e = s9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f8294b) {
            try {
                C9257d H = this.f8298f.f7724d;
                if (H == null) {
                    this.f8298f.f7899a.mo34920b().mo35075r().mo35040d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f8295c, this.f8296d);
                    this.f8294b.set(Collections.emptyList());
                    this.f8294b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C9713p.m20275j(this.f8297e);
                    this.f8294b.set(H.mo34761g1(this.f8295c, this.f8296d, this.f8297e));
                } else {
                    this.f8294b.set(H.mo34753F0((String) null, this.f8295c, this.f8296d));
                }
                this.f8298f.m10532E();
                atomicReference = this.f8294b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f8298f.f7899a.mo34920b().mo35075r().mo35040d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f8295c, e);
                    this.f8294b.set(Collections.emptyList());
                    atomicReference = this.f8294b;
                } catch (Throwable th) {
                    this.f8294b.notify();
                    throw th;
                }
            }
        }
    }
}
