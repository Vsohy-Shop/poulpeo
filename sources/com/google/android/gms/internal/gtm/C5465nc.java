package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.nc */
public final class C5465nc {

    /* renamed from: e */
    private static final String f6151e = new String("");

    /* renamed from: f */
    private static final Integer f6152f = 0;

    /* renamed from: a */
    private final int f6153a;

    /* renamed from: b */
    private final Object f6154b;

    /* renamed from: c */
    private final List<Integer> f6155c;

    /* renamed from: d */
    private final boolean f6156d;

    private C5465nc(Integer num, Object obj, List<Integer> list, boolean z) {
        this.f6153a = num.intValue();
        this.f6154b = obj;
        this.f6155c = Collections.unmodifiableList(list);
        this.f6156d = z;
    }

    /* renamed from: a */
    public final int mo33388a() {
        return this.f6153a;
    }

    /* renamed from: b */
    public final Object mo33389b() {
        return this.f6154b;
    }

    /* renamed from: c */
    public final List<Integer> mo33390c() {
        return this.f6155c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5465nc) || !((C5465nc) obj).f6154b.equals(this.f6154b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6154b.hashCode();
    }

    public final String toString() {
        Object obj = this.f6154b;
        if (obj != null) {
            return obj.toString();
        }
        C5426l3.m8135e("Fail to convert a null object to string");
        return f6151e;
    }
}
