package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p200q4.C9247t;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C4745c0<T> extends C9247t {

    /* renamed from: b */
    protected final C10406g<T> f4967b;

    public C4745c0(int i, C10406g<T> gVar) {
        super(i);
        this.f4967b = gVar;
    }

    /* renamed from: a */
    public final void mo32491a(@NonNull Status status) {
        this.f4967b.mo45099d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo32492b(@NonNull Exception exc) {
        this.f4967b.mo45099d(exc);
    }

    /* renamed from: c */
    public final void mo32493c(C4777t<?> tVar) {
        try {
            mo32494h(tVar);
        } catch (DeadObjectException e) {
            mo32491a(C4760i0.m6593e(e));
            throw e;
        } catch (RemoteException e2) {
            mo32491a(C4760i0.m6593e(e2));
        } catch (RuntimeException e3) {
            this.f4967b.mo45099d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo32494h(C4777t<?> tVar);
}
