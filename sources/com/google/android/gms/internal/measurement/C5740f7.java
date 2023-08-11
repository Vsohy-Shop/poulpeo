package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5740f7;
import com.google.android.gms.internal.measurement.C5757g7;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public abstract class C5740f7<MessageType extends C5757g7<MessageType, BuilderType>, BuilderType extends C5740f7<MessageType, BuilderType>> implements C6036x9 {
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ C6036x9 mo33995G(C6052y9 y9Var) {
        if (mo34353e().getClass().isInstance(y9Var)) {
            return mo33998g((C5757g7) y9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: R */
    public final /* synthetic */ C6036x9 mo33996R(byte[] bArr) {
        return mo33999h(bArr, 0, bArr.length);
    }

    /* renamed from: V */
    public final /* synthetic */ C6036x9 mo33997V(byte[] bArr, C5792i8 i8Var) {
        return mo34000i(bArr, 0, bArr.length, i8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract BuilderType mo33998g(MessageType messagetype);

    /* renamed from: h */
    public abstract BuilderType mo33999h(byte[] bArr, int i, int i2);

    /* renamed from: i */
    public abstract BuilderType mo34000i(byte[] bArr, int i, int i2, C5792i8 i8Var);
}
