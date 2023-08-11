package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import p191p5.C9061a;

/* renamed from: com.google.firebase.analytics.connector.internal.f */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
final class C6919f implements C9061a.C9062a {

    /* renamed from: a */
    final /* synthetic */ C6920g f9126a;

    public C6919f(C6920g gVar) {
        this.f9126a = gVar;
    }

    /* renamed from: s */
    public final void mo35286s(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && C6916c.m12042k(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(HintConstants.AUTOFILL_HINT_NAME, str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f9126a.f9127a.mo29975a(3, bundle2);
        }
    }
}
