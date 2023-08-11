package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5930r implements C5914q {

    /* renamed from: b */
    private final String f7312b;

    /* renamed from: c */
    private final ArrayList<C5914q> f7313c;

    public C5930r(String str, List<C5914q> list) {
        this.f7312b = str;
        ArrayList<C5914q> arrayList = new ArrayList<>();
        this.f7313c = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo34308a() {
        return this.f7312b;
    }

    /* renamed from: b */
    public final String mo33956b() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: e */
    public final ArrayList<C5914q> mo34309e() {
        return this.f7313c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5930r)) {
            return false;
        }
        C5930r rVar = (C5930r) obj;
        String str = this.f7312b;
        if (str == null ? rVar.f7312b == null : str.equals(rVar.f7312b)) {
            return this.f7313c.equals(rVar.f7313c);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f7312b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f7313c.hashCode();
    }

    /* renamed from: r */
    public final C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    /* renamed from: y */
    public final Double mo33971y() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return null;
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        return this;
    }
}
