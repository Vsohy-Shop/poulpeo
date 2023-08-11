package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.ae */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4825ae implements C4948he {

    /* renamed from: a */
    private final C4948he[] f5121a;

    C4825ae(C4948he... heVarArr) {
        this.f5121a = heVarArr;
    }

    /* renamed from: a */
    public final C4931ge mo32616a(Class cls) {
        C4948he[] heVarArr = this.f5121a;
        for (int i = 0; i < 2; i++) {
            C4948he heVar = heVarArr[i];
            if (heVar.mo32617b(cls)) {
                return heVar.mo32616a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo32617b(Class cls) {
        C4948he[] heVarArr = this.f5121a;
        for (int i = 0; i < 2; i++) {
            if (heVarArr[i].mo32617b(cls)) {
                return true;
            }
        }
        return false;
    }
}
