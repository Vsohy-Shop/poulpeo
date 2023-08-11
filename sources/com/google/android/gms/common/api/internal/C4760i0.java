package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4760i0 {

    /* renamed from: a */
    public final int f5001a;

    public C4760i0(int i) {
        this.f5001a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m6593e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo32491a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo32492b(@NonNull Exception exc);

    /* renamed from: c */
    public abstract void mo32493c(C4777t<?> tVar);

    /* renamed from: d */
    public abstract void mo32499d(@NonNull C4765l lVar, boolean z);
}
