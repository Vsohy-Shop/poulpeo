package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5792i8 {

    /* renamed from: b */
    private static volatile C5792i8 f7006b;

    /* renamed from: c */
    private static volatile C5792i8 f7007c;

    /* renamed from: d */
    static final C5792i8 f7008d = new C5792i8(true);

    /* renamed from: a */
    private final Map<C5775h8, C5987u8<?, ?>> f7009a;

    C5792i8() {
        this.f7009a = new HashMap();
    }

    /* renamed from: a */
    public static C5792i8 m9400a() {
        C5792i8 i8Var = f7006b;
        if (i8Var == null) {
            synchronized (C5792i8.class) {
                i8Var = f7006b;
                if (i8Var == null) {
                    i8Var = f7008d;
                    f7006b = i8Var;
                }
            }
        }
        return i8Var;
    }

    /* renamed from: b */
    public static C5792i8 m9401b() {
        C5792i8 i8Var = f7007c;
        if (i8Var != null) {
            return i8Var;
        }
        synchronized (C5792i8.class) {
            C5792i8 i8Var2 = f7007c;
            if (i8Var2 != null) {
                return i8Var2;
            }
            C5792i8 b = C5923q8.m9799b(C5792i8.class);
            f7007c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends C6052y9> C5987u8<ContainingType, ?> mo34091c(ContainingType containingtype, int i) {
        return this.f7009a.get(new C5775h8(containingtype, i));
    }

    C5792i8(boolean z) {
        this.f7009a = Collections.emptyMap();
    }
}
