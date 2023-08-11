package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.hc */
public final class C5375hc {

    /* renamed from: a */
    private final List<C5329ec> f6036a;

    /* renamed from: b */
    private final List<C5329ec> f6037b;

    /* renamed from: c */
    private final List<C5329ec> f6038c;

    /* renamed from: d */
    private final List<C5329ec> f6039d;

    private C5375hc(List<C5329ec> list, List<C5329ec> list2, List<C5329ec> list3, List<C5329ec> list4) {
        this.f6036a = Collections.unmodifiableList(list);
        this.f6037b = Collections.unmodifiableList(list2);
        this.f6038c = Collections.unmodifiableList(list3);
        this.f6039d = Collections.unmodifiableList(list4);
    }

    /* renamed from: a */
    public final List<C5329ec> mo33240a() {
        return this.f6036a;
    }

    /* renamed from: b */
    public final List<C5329ec> mo33241b() {
        return this.f6037b;
    }

    /* renamed from: c */
    public final List<C5329ec> mo33242c() {
        return this.f6038c;
    }

    /* renamed from: d */
    public final List<C5329ec> mo33243d() {
        return this.f6039d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6036a);
        String valueOf2 = String.valueOf(this.f6037b);
        String valueOf3 = String.valueOf(this.f6038c);
        String valueOf4 = String.valueOf(this.f6039d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Positive predicates: ");
        sb.append(valueOf);
        sb.append("  Negative predicates: ");
        sb.append(valueOf2);
        sb.append("  Add tags: ");
        sb.append(valueOf3);
        sb.append("  Remove tags: ");
        sb.append(valueOf4);
        return sb.toString();
    }
}
