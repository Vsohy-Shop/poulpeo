package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5749g implements C5914q {

    /* renamed from: b */
    private final boolean f6951b;

    public C5749g(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f6951b = booleanValue;
    }

    /* renamed from: b */
    public final String mo33956b() {
        return Boolean.toString(this.f6951b);
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        return new C5749g(Boolean.valueOf(this.f6951b));
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        return Boolean.valueOf(this.f6951b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5749g) && this.f6951b == ((C5749g) obj).f6951b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6951b).hashCode();
    }

    /* renamed from: r */
    public final C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        if ("toString".equals(str)) {
            return new C5978u(Boolean.toString(this.f6951b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f6951b), str}));
    }

    public final String toString() {
        return String.valueOf(this.f6951b);
    }

    /* renamed from: y */
    public final Double mo33971y() {
        double d;
        if (true != this.f6951b) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return null;
    }
}
