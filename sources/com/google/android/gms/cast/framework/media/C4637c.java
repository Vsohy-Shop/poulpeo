package com.google.android.gms.cast.framework.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p109h4.C7931g;
import p220s4.C9493a;

/* renamed from: com.google.android.gms.cast.framework.media.c */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4637c {

    /* renamed from: a */
    private final C4654h0 f4664a = new C4664m0(this, (C4662l0) null);

    @Deprecated
    @Nullable
    /* renamed from: a */
    public C9493a mo32079a(@Nullable C7931g gVar, int i) {
        if (gVar == null || !gVar.mo41711H()) {
            return null;
        }
        return gVar.mo41708A().get(0);
    }

    @Nullable
    /* renamed from: b */
    public C9493a mo32080b(@Nullable C7931g gVar, @NonNull C4635b bVar) {
        return mo32079a(gVar, bVar.mo32072F());
    }
}
