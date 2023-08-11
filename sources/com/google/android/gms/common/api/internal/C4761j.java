package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import p190p4.C9052b;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4761j implements C9052b.C9053a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f5002a;

    /* renamed from: b */
    final /* synthetic */ C4765l f5003b;

    C4761j(C4765l lVar, BasePendingResult basePendingResult) {
        this.f5003b = lVar;
        this.f5002a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo32523a(Status status) {
        this.f5003b.f5010a.remove(this.f5002a);
    }
}
