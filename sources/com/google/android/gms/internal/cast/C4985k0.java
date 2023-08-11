package com.google.android.gms.internal.cast;

import java.io.IOException;
import p119i3.C8112e;

/* renamed from: com.google.android.gms.internal.cast.k0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C4985k0 implements C8112e {

    /* renamed from: a */
    public static final /* synthetic */ C4985k0 f5273a = new C4985k0();

    private /* synthetic */ C4985k0() {
    }

    public final Object apply(Object obj) {
        C5095q8 q8Var = (C5095q8) obj;
        try {
            byte[] bArr = new byte[q8Var.mo32737l()];
            C5099qc c = C5099qc.m7395c(bArr);
            q8Var.mo32739n(c);
            c.mo32973d();
            return bArr;
        } catch (IOException e) {
            String name = q8Var.getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
