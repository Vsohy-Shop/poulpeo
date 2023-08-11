package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.ApiException;
import p276x5.C10400d;

/* renamed from: com.google.android.gms.cast.framework.media.v */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C4681v implements C10400d {

    /* renamed from: a */
    public final /* synthetic */ C4683w f4775a;

    /* renamed from: b */
    public final /* synthetic */ long f4776b;

    public /* synthetic */ C4681v(C4683w wVar, long j) {
        this.f4775a = wVar;
        this.f4776b = j;
    }

    /* renamed from: b */
    public final void mo29406b(Exception exc) {
        int i;
        C4683w wVar = this.f4775a;
        long j = this.f4776b;
        if (exc instanceof ApiException) {
            i = ((ApiException) exc).mo32366b();
        } else {
            i = 13;
        }
        wVar.f4780c.f4731c.mo42828s(j, i);
    }
}
