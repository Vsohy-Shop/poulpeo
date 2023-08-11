package com.google.android.gms.internal.gtm;

import androidx.annotation.Nullable;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.bb */
public final class C5283bb {

    /* renamed from: a */
    private final String f5878a;
    @Nullable

    /* renamed from: b */
    private final String f5879b;
    @Nullable

    /* renamed from: c */
    private final String f5880c;

    /* renamed from: d */
    private final boolean f5881d;
    @Nullable

    /* renamed from: e */
    private final String f5882e;
    @Nullable

    /* renamed from: f */
    private final String f5883f;

    public C5283bb(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        this(str, str2, str3, z, str4, "");
    }

    /* renamed from: a */
    public final String mo33134a() {
        return this.f5878a;
    }

    /* renamed from: b */
    public final String mo33135b() {
        return this.f5879b;
    }

    /* renamed from: c */
    public final String mo33136c() {
        return this.f5880c;
    }

    /* renamed from: d */
    public final String mo33137d() {
        String str = this.f5880c;
        if (str == null) {
            return this.f5878a;
        }
        String str2 = this.f5878a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    public final boolean mo33138e() {
        return this.f5881d;
    }

    /* renamed from: f */
    public final String mo33139f() {
        return this.f5882e;
    }

    /* renamed from: g */
    public final String mo33140g() {
        return this.f5883f;
    }

    private C5283bb(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4, String str5) {
        C9713p.m20275j(str);
        C9713p.m20275j(str5);
        this.f5878a = str;
        this.f5879b = str2;
        this.f5880c = str3;
        this.f5881d = z;
        this.f5882e = str4;
        this.f5883f = str5;
    }
}
