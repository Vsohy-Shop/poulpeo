package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p036b5.C2888a;
import p036b5.C2890b;
import p120i4.C8127d1;

/* renamed from: com.google.android.gms.internal.cast.d */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4864d extends C8127d1 {

    /* renamed from: a */
    public final Set f5184a = Collections.synchronizedSet(new HashSet());

    /* renamed from: G */
    public final void mo32716G(C4846c cVar) {
        this.f5184a.add(cVar);
    }

    /* renamed from: c */
    public final void mo32717c() {
        for (C4846c zzb : this.f5184a) {
            zzb.zzb();
        }
    }

    /* renamed from: x */
    public final void mo32718x() {
        for (C4846c zza : this.f5184a) {
            zza.zza();
        }
    }

    public final C2888a zzb() {
        return C2890b.m2297b3(this);
    }
}
