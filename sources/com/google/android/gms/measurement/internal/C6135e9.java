package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6135e9 implements C6223m9 {

    /* renamed from: a */
    final /* synthetic */ C6157g9 f7757a;

    C6135e9(C6157g9 g9Var) {
        this.f7757a = g9Var;
    }

    /* renamed from: a */
    public final void mo34852a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f7757a.mo34919a().mo35110z(new C6124d9(this, str, "_err", bundle));
        } else if (this.f7757a.f7816l != null) {
            this.f7757a.f7816l.mo34920b().mo35075r().mo35038b("AppId not known when logging event", "_err");
        }
    }
}
