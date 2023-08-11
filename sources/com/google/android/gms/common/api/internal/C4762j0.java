package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4762j0 {

    /* renamed from: a */
    private final int f5004a;

    /* renamed from: b */
    private final ConnectionResult f5005b;

    C4762j0(ConnectionResult connectionResult, int i) {
        C9713p.m20275j(connectionResult);
        this.f5005b = connectionResult;
        this.f5004a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo32524a() {
        return this.f5004a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult mo32525b() {
        return this.f5005b;
    }
}
