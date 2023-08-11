package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public abstract class C6026x {

    /* renamed from: a */
    final List<C5867n0> f7464a = new ArrayList();

    protected C6026x() {
    }

    /* renamed from: a */
    public abstract C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5914q mo34597b(String str) {
        String str2;
        if (this.f7464a.contains(C6032x5.m10244e(str))) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Command not implemented: ".concat(valueOf);
            } else {
                str2 = new String("Command not implemented: ");
            }
            throw new UnsupportedOperationException(str2);
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
