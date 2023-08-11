package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p191p5.C9061a;

/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
final class C6917d implements C9061a.C9062a {

    /* renamed from: a */
    final /* synthetic */ C6918e f9121a;

    public C6917d(C6918e eVar) {
        this.f9121a = eVar;
    }

    /* renamed from: s */
    public final void mo35286s(String str, String str2, Bundle bundle, long j) {
        if (this.f9121a.f9122a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C6916c.m12034c(str2));
            this.f9121a.f9123b.mo29975a(2, bundle2);
        }
    }
}
