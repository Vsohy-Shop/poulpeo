package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;
import p254v5.C9945f;

/* renamed from: com.google.android.gms.tagmanager.d */
final class C6370d implements AppMeasurement.C6075b {

    /* renamed from: a */
    private final /* synthetic */ C9945f f8475a;

    C6370d(C6368b bVar, C9945f fVar) {
        this.f8475a = fVar;
    }

    /* renamed from: s */
    public final void mo35286s(String str, String str2, Bundle bundle, long j) {
        try {
            this.f8475a.mo33515s(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
