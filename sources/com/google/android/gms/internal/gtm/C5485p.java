package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.p */
public final class C5485p {

    /* renamed from: a */
    private final long f6222a = 0;

    /* renamed from: b */
    private final String f6223b;

    /* renamed from: c */
    private final String f6224c;

    /* renamed from: d */
    private final boolean f6225d;

    /* renamed from: e */
    private long f6226e;

    /* renamed from: f */
    private final Map<String, String> f6227f;

    public C5485p(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C9713p.m20271f(str);
        C9713p.m20271f(str2);
        this.f6223b = str;
        this.f6224c = str2;
        this.f6225d = z;
        this.f6226e = j2;
        if (map != null) {
            this.f6227f = new HashMap(map);
        } else {
            this.f6227f = Collections.emptyMap();
        }
    }

    /* renamed from: a */
    public final void mo33435a(long j) {
        this.f6226e = j;
    }

    /* renamed from: b */
    public final String mo33436b() {
        return this.f6223b;
    }

    /* renamed from: c */
    public final long mo33437c() {
        return this.f6222a;
    }

    /* renamed from: d */
    public final String mo33438d() {
        return this.f6224c;
    }

    /* renamed from: e */
    public final boolean mo33439e() {
        return this.f6225d;
    }

    /* renamed from: f */
    public final long mo33440f() {
        return this.f6226e;
    }

    /* renamed from: g */
    public final Map<String, String> mo33441g() {
        return this.f6227f;
    }
}
