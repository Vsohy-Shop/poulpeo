package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.C5884o1;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6230n5 {

    /* renamed from: a */
    final Context f8008a;
    @Nullable

    /* renamed from: b */
    String f8009b;
    @Nullable

    /* renamed from: c */
    String f8010c;
    @Nullable

    /* renamed from: d */
    String f8011d;
    @Nullable

    /* renamed from: e */
    Boolean f8012e;

    /* renamed from: f */
    long f8013f;
    @Nullable

    /* renamed from: g */
    C5884o1 f8014g;

    /* renamed from: h */
    boolean f8015h = true;
    @Nullable

    /* renamed from: i */
    final Long f8016i;
    @Nullable

    /* renamed from: j */
    String f8017j;

    public C6230n5(Context context, @Nullable C5884o1 o1Var, @Nullable Long l) {
        C9713p.m20275j(context);
        Context applicationContext = context.getApplicationContext();
        C9713p.m20275j(applicationContext);
        this.f8008a = applicationContext;
        this.f8016i = l;
        if (o1Var != null) {
            this.f8014g = o1Var;
            this.f8009b = o1Var.f7185g;
            this.f8010c = o1Var.f7184f;
            this.f8011d = o1Var.f7183e;
            this.f8015h = o1Var.f7182d;
            this.f8013f = o1Var.f7181c;
            this.f8017j = o1Var.f7187i;
            Bundle bundle = o1Var.f7186h;
            if (bundle != null) {
                this.f8012e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
