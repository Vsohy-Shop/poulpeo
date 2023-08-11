package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5892o9 implements C6020w9 {

    /* renamed from: a */
    private final C6020w9[] f7246a;

    C5892o9(C6020w9... w9VarArr) {
        this.f7246a = w9VarArr;
    }

    /* renamed from: a */
    public final C5988u9 mo34224a(Class<?> cls) {
        String str;
        C6020w9[] w9VarArr = this.f7246a;
        for (int i = 0; i < 2; i++) {
            C6020w9 w9Var = w9VarArr[i];
            if (w9Var.mo34225b(cls)) {
                return w9Var.mo34224a(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: b */
    public final boolean mo34225b(Class<?> cls) {
        C6020w9[] w9VarArr = this.f7246a;
        for (int i = 0; i < 2; i++) {
            if (w9VarArr[i].mo34225b(cls)) {
                return true;
            }
        }
        return false;
    }
}
