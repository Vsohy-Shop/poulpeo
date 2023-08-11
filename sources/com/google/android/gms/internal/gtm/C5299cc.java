package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.cc */
public final class C5299cc {

    /* renamed from: a */
    private final List<C5375hc> f5908a;

    /* renamed from: b */
    private final Map<String, C5329ec> f5909b;

    /* renamed from: c */
    private String f5910c;

    /* renamed from: d */
    private int f5911d = 0;

    public C5299cc(List<C5375hc> list, Map<String, C5329ec> map, String str, int i) {
        this.f5908a = Collections.unmodifiableList(list);
        this.f5909b = Collections.unmodifiableMap(map);
        this.f5910c = str;
    }

    /* renamed from: a */
    public final String mo33159a() {
        return this.f5910c;
    }

    /* renamed from: b */
    public final C5329ec mo33160b(String str) {
        return this.f5909b.get(str);
    }

    /* renamed from: c */
    public final List<C5375hc> mo33161c() {
        return this.f5908a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5908a);
        String valueOf2 = String.valueOf(this.f5909b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
        sb.append("Rules: ");
        sb.append(valueOf);
        sb.append("\n  Macros: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
