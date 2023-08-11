package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.qa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5925qa implements Map.Entry, Comparable<C5925qa> {

    /* renamed from: b */
    private final Comparable f7306b;

    /* renamed from: c */
    private Object f7307c;

    /* renamed from: d */
    final /* synthetic */ C5973ta f7308d;

    C5925qa(C5973ta taVar, Comparable comparable, Object obj) {
        this.f7308d = taVar;
        this.f7306b = comparable;
        this.f7307c = obj;
    }

    /* renamed from: b */
    private static final boolean m9801b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Comparable mo34292a() {
        return this.f7306b;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7306b.compareTo(((C5925qa) obj).f7306b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m9801b(this.f7306b, entry.getKey()) || !m9801b(this.f7307c, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.f7306b;
    }

    public final Object getValue() {
        return this.f7307c;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f7306b;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f7307c;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f7308d.m9978o();
        Object obj2 = this.f7307c;
        this.f7307c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7306b);
        String valueOf2 = String.valueOf(this.f7307c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
