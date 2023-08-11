package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.c1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C4848c1 implements Map, Serializable {

    /* renamed from: b */
    private transient C4866d1 f5176b;

    /* renamed from: c */
    private transient C4866d1 f5177c;

    /* renamed from: d */
    private transient C5172v0 f5178d;

    C4848c1() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.cast.C4848c1 m6832c(java.lang.Iterable r2) {
        /*
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0009
            int r0 = r2.size()
            goto L_0x000a
        L_0x0009:
            r0 = 4
        L_0x000a:
            com.google.android.gms.internal.cast.b1 r1 = new com.google.android.gms.internal.cast.b1
            r1.<init>(r0)
            r1.mo32637a(r2)
            com.google.android.gms.internal.cast.a1 r2 = r1.f5153c
            if (r2 != 0) goto L_0x0028
            int r2 = r1.f5152b
            java.lang.Object[] r0 = r1.f5151a
            com.google.android.gms.internal.cast.m1 r2 = com.google.android.gms.internal.cast.C5020m1.m7181i(r2, r0, r1)
            com.google.android.gms.internal.cast.a1 r0 = r1.f5153c
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            java.lang.IllegalArgumentException r2 = r0.mo32612a()
            throw r2
        L_0x0028:
            java.lang.IllegalArgumentException r2 = r2.mo32612a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C4848c1.m6832c(java.lang.Iterable):com.google.android.gms.internal.cast.c1");
    }

    /* renamed from: e */
    public static C4848c1 m6833e() {
        return C5020m1.f5355h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C5172v0 mo32660a();

    /* renamed from: b */
    public final C5172v0 values() {
        C5172v0 v0Var = this.f5178d;
        if (v0Var != null) {
            return v0Var;
        }
        C5172v0 a = mo32660a();
        this.f5178d = a;
        return a;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C4866d1 mo32667f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C4866d1 mo32668g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    /* renamed from: h */
    public final C4866d1 entrySet() {
        C4866d1 d1Var = this.f5176b;
        if (d1Var != null) {
            return d1Var;
        }
        C4866d1 f = mo32667f();
        this.f5176b = f;
        return f;
    }

    public final int hashCode() {
        return C5054o1.m7298a(entrySet());
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C4866d1 d1Var = this.f5177c;
        if (d1Var != null) {
            return d1Var;
        }
        C4866d1 g = mo32668g();
        this.f5177c = g;
        return g;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
