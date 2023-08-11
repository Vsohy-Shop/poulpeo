package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4721b;
import com.google.android.gms.common.api.internal.C4746d;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4759i<A extends C4719a.C4721b, L> {

    /* renamed from: a */
    private final C4746d.C4747a<L> f5000a;

    protected C4759i(@NonNull C4746d.C4747a<L> aVar) {
        this.f5000a = aVar;
    }

    @NonNull
    /* renamed from: a */
    public C4746d.C4747a<L> mo32522a() {
        return this.f5000a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo32469b(@NonNull A a, @NonNull C10406g<Boolean> gVar);
}
