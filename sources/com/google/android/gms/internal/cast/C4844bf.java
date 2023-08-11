package com.google.android.gms.internal.cast;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.bf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4844bf implements Map.Entry, Comparable {

    /* renamed from: b */
    private final Comparable f5161b;

    /* renamed from: c */
    private Object f5162c;

    /* renamed from: d */
    final /* synthetic */ C4949hf f5163d;

    C4844bf(C4949hf hfVar, Comparable comparable, Object obj) {
        this.f5163d = hfVar;
        this.f5161b = comparable;
        this.f5162c = obj;
    }

    /* renamed from: b */
    private static final boolean m6830b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Comparable mo32649a() {
        return this.f5161b;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5161b.compareTo(((C4844bf) obj).f5161b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m6830b(this.f5161b, entry.getKey()) || !m6830b(this.f5162c, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.f5161b;
    }

    public final Object getValue() {
        return this.f5162c;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f5161b;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f5162c;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f5163d.m7052o();
        Object obj2 = this.f5162c;
        this.f5162c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5161b);
        String valueOf2 = String.valueOf(this.f5162c);
        return valueOf + "=" + valueOf2;
    }
}
