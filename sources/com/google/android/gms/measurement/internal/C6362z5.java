package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6362z5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bundle f8456b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f8457c;

    C6362z5(C6264q6 q6Var, Bundle bundle) {
        this.f8457c = q6Var;
        this.f8456b = bundle;
    }

    public final void run() {
        C6264q6 q6Var = this.f8457c;
        Bundle bundle = this.f8456b;
        q6Var.mo34778h();
        q6Var.mo35413i();
        C9713p.m20275j(bundle);
        String string = bundle.getString(HintConstants.AUTOFILL_HINT_NAME);
        String string2 = bundle.getString("origin");
        C9713p.m20271f(string);
        C9713p.m20271f(string2);
        C9713p.m20275j(bundle.get("value"));
        if (!q6Var.f7899a.mo35204o()) {
            q6Var.f7899a.mo34920b().mo35079v().mo35037a("Conditional property not set since app measurement is disabled");
            return;
        }
        C6190j9 j9Var = new C6190j9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C6290t w0 = q6Var.f7899a.mo35191N().mo35157w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            C6290t w02 = q6Var.f7899a.mo35191N().mo35157w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            C6290t w03 = q6Var.f7899a.mo35191N().mo35157w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            q6Var.f7899a.mo35189L().mo34835s(new C6103c(bundle.getString("app_id"), string2, j9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
