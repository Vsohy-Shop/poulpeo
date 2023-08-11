package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6132e6 implements C6223m9 {

    /* renamed from: a */
    final /* synthetic */ C6264q6 f7744a;

    C6132e6(C6264q6 q6Var) {
        this.f7744a = q6Var;
    }

    /* renamed from: a */
    public final void mo34852a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f7744a.mo35256t("auto", "_err", bundle, str);
        } else {
            this.f7744a.mo35254r("auto", "_err", bundle);
        }
    }
}
