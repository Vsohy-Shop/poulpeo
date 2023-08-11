package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6087a6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bundle f7625b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f7626c;

    C6087a6(C6264q6 q6Var, Bundle bundle) {
        this.f7626c = q6Var;
        this.f7625b = bundle;
    }

    public final void run() {
        C6264q6 q6Var = this.f7626c;
        Bundle bundle = this.f7625b;
        q6Var.mo34778h();
        q6Var.mo35413i();
        C9713p.m20275j(bundle);
        String f = C9713p.m20271f(bundle.getString(HintConstants.AUTOFILL_HINT_NAME));
        if (!q6Var.f7899a.mo35204o()) {
            q6Var.f7899a.mo34920b().mo35079v().mo35037a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C6190j9 j9Var = new C6190j9(f, 0, (Object) null, "");
        try {
            C6103c cVar = r4;
            C6103c cVar2 = new C6103c(bundle.getString("app_id"), "", j9Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (C6290t) null, bundle.getLong("trigger_timeout"), (C6290t) null, bundle.getLong("time_to_live"), q6Var.f7899a.mo35191N().mo35157w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            q6Var.f7899a.mo35189L().mo34835s(cVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
