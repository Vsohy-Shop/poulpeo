package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5836l1;
import p201q5.C9270q;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6267q9 implements C9270q {

    /* renamed from: a */
    public final C5836l1 f8160a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8161b;

    C6267q9(AppMeasurementDynamiteService appMeasurementDynamiteService, C5836l1 l1Var) {
        this.f8161b = appMeasurementDynamiteService;
        this.f8160a = l1Var;
    }

    /* renamed from: w */
    public final void mo35268w(String str, String str2, Bundle bundle, long j) {
        try {
            this.f8160a.mo34102P(str, str2, bundle, j);
        } catch (RemoteException e) {
            C6251p4 p4Var = this.f8161b.f7527a;
            if (p4Var != null) {
                p4Var.mo34920b().mo35080w().mo35038b("Event interceptor threw exception", e);
            }
        }
    }
}
