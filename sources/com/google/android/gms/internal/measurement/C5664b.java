package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5664b {

    /* renamed from: a */
    private String f6777a;

    /* renamed from: b */
    private final long f6778b;

    /* renamed from: c */
    private final Map<String, Object> f6779c;

    public C5664b(String str, long j, Map<String, Object> map) {
        this.f6777a = str;
        this.f6778b = j;
        HashMap hashMap = new HashMap();
        this.f6779c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo33677a() {
        return this.f6778b;
    }

    /* renamed from: b */
    public final C5664b clone() {
        return new C5664b(this.f6777a, this.f6778b, new HashMap(this.f6779c));
    }

    /* renamed from: c */
    public final Object mo33679c(String str) {
        if (this.f6779c.containsKey(str)) {
            return this.f6779c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo33681d() {
        return this.f6777a;
    }

    /* renamed from: e */
    public final Map<String, Object> mo33682e() {
        return this.f6779c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5664b)) {
            return false;
        }
        C5664b bVar = (C5664b) obj;
        if (this.f6778b == bVar.f6778b && this.f6777a.equals(bVar.f6777a)) {
            return this.f6779c.equals(bVar.f6779c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo33684f(String str) {
        this.f6777a = str;
    }

    /* renamed from: g */
    public final void mo33685g(String str, Object obj) {
        if (obj == null) {
            this.f6779c.remove(str);
        } else {
            this.f6779c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6777a.hashCode();
        long j = this.f6778b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f6779c.hashCode();
    }

    public final String toString() {
        String str = this.f6777a;
        long j = this.f6778b;
        String obj = this.f6779c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
