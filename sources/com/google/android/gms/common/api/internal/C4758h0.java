package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.C4746d;
import p180o4.C8974c;
import p200q4.C9251x;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4758h0 extends C4745c0<Boolean> {

    /* renamed from: c */
    public final C4746d.C4747a<?> f4999c;

    public C4758h0(C4746d.C4747a<?> aVar, C10406g<Boolean> gVar) {
        super(4, gVar);
        this.f4999c = aVar;
    }

    /* renamed from: f */
    public final boolean mo32506f(C4777t<?> tVar) {
        C9251x xVar = tVar.mo32566u().get(this.f4999c);
        if (xVar == null || !xVar.f13596a.mo32505f()) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: g */
    public final C8974c[] mo32507g(C4777t<?> tVar) {
        C9251x xVar = tVar.mo32566u().get(this.f4999c);
        if (xVar == null) {
            return null;
        }
        return xVar.f13596a.mo32502c();
    }

    /* renamed from: h */
    public final void mo32494h(C4777t<?> tVar) {
        C9251x remove = tVar.mo32566u().remove(this.f4999c);
        if (remove != null) {
            remove.f13597b.mo32469b(tVar.mo32565s(), this.f4967b);
            remove.f13596a.mo32500a();
            return;
        }
        this.f4967b.mo45100e(Boolean.FALSE);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo32499d(@NonNull C4765l lVar, boolean z) {
    }
}
