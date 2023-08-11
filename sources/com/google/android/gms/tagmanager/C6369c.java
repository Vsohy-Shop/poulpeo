package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;
import p254v5.C9948i;

/* renamed from: com.google.android.gms.tagmanager.c */
final class C6369c implements AppMeasurement.C6074a {

    /* renamed from: a */
    private final /* synthetic */ C9948i f8474a;

    C6369c(C6368b bVar, C9948i iVar) {
        this.f8474a = iVar;
    }

    /* renamed from: w */
    public final void mo35268w(String str, String str2, Bundle bundle, long j) {
        try {
            this.f8474a.mo33479w(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
