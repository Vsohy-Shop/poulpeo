package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.C4689g;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.cast.framework.media.u0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4680u0 extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C4639d f4774a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4680u0(C4639d dVar, int i) {
        super(i);
        this.f4774a = dVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        C4689g gVar = (C4689g) obj2;
        C4689g gVar2 = (C4689g) obj3;
        if (z) {
            C9713p.m20275j(this.f4774a.f4674g);
            this.f4774a.f4674g.add(num);
        }
    }
}
