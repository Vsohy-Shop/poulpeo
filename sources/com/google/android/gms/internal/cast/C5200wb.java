package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C5183vb;
import com.google.android.gms.internal.cast.C5200wb;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.cast.wb */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C5200wb<MessageType extends C5200wb<MessageType, BuilderType>, BuilderType extends C5183vb<MessageType, BuilderType>> implements C4982je {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32732b(C5169ue ueVar) {
        throw null;
    }

    /* renamed from: j */
    public final C4980jc mo32850j() {
        try {
            int l = mo32737l();
            C4980jc jcVar = C4980jc.f5269c;
            byte[] bArr = new byte[l];
            C5099qc c = C5099qc.m7395c(bArr);
            mo32739n(c);
            c.mo32973d();
            return new C4929gc(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
