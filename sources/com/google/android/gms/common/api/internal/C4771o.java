package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4739a;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4771o implements C4739a.C4740a {

    /* renamed from: a */
    final /* synthetic */ C4744c f5022a;

    C4771o(C4744c cVar) {
        this.f5022a = cVar;
    }

    /* renamed from: a */
    public final void mo32468a(boolean z) {
        C4744c cVar = this.f5022a;
        cVar.f4965q.sendMessage(cVar.f4965q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
