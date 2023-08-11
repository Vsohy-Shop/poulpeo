package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5917q2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Bundle f7300f;

    /* renamed from: g */
    final /* synthetic */ Activity f7301g;

    /* renamed from: h */
    final /* synthetic */ C6045y2 f7302h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5917q2(C6045y2 y2Var, Bundle bundle, Activity activity) {
        super(y2Var.f7476b, true);
        this.f7302h = y2Var;
        this.f7300f = bundle;
        this.f7301g = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        Bundle bundle;
        if (this.f7300f != null) {
            bundle = new Bundle();
            if (this.f7300f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f7300f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C5734f1) C9713p.m20275j(this.f7302h.f7476b.f7513i)).onActivityCreated(C2890b.m2297b3(this.f7301g), bundle, this.f7145c);
    }
}
