package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p036b5.C2890b;
import p201q5.C9264k;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.w1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C6012w1 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ String f7438f;

    /* renamed from: g */
    final /* synthetic */ String f7439g;

    /* renamed from: h */
    final /* synthetic */ Context f7440h;

    /* renamed from: i */
    final /* synthetic */ Bundle f7441i;

    /* renamed from: j */
    final /* synthetic */ C6061z2 f7442j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6012w1(C6061z2 z2Var, String str, String str2, Context context, Bundle bundle) {
        super(z2Var, true);
        this.f7442j = z2Var;
        this.f7438f = str;
        this.f7439g = str2;
        this.f7440h = context;
        this.f7441i = bundle;
    }

    /* renamed from: a */
    public final void mo33644a() {
        String str;
        String str2;
        String str3;
        boolean z;
        try {
            if (C6061z2.m10344p(this.f7438f, this.f7439g)) {
                str = this.f7439g;
                str2 = this.f7438f;
                str3 = this.f7442j.f7505a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C9713p.m20275j(this.f7440h);
            C6061z2 z2Var = this.f7442j;
            z2Var.f7513i = z2Var.mo34671u(this.f7440h, true);
            if (this.f7442j.f7513i == null) {
                Log.w(this.f7442j.f7505a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m6736a(this.f7440h, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m6737c(this.f7440h, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a, c);
            if (c < a) {
                z = true;
            } else {
                z = false;
            }
            ((C5734f1) C9713p.m20275j(this.f7442j.f7513i)).initialize(C2890b.m2297b3(this.f7440h), new C5884o1(46000, (long) max, z, str3, str2, str, this.f7441i, C9264k.m19025a(this.f7440h)), this.f7144b);
        } catch (Exception e) {
            this.f7442j.m10341m(e, true, false);
        }
    }
}
