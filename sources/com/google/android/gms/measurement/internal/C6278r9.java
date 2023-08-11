package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5836l1;
import p201q5.C9271r;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6278r9 implements C9271r {

    /* renamed from: a */
    public final C5836l1 f8182a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8183b;

    C6278r9(AppMeasurementDynamiteService appMeasurementDynamiteService, C5836l1 l1Var) {
        this.f8183b = appMeasurementDynamiteService;
        this.f8182a = l1Var;
    }

    /* renamed from: s */
    public final void mo35286s(String str, String str2, Bundle bundle, long j) {
        try {
            this.f8182a.mo34102P(str, str2, bundle, j);
        } catch (RemoteException e) {
            C6251p4 p4Var = this.f8183b.f7527a;
            if (p4Var != null) {
                p4Var.mo34920b().mo35080w().mo35038b("Event listener threw exception", e);
            }
        }
    }
}
