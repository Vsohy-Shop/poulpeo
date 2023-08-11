package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.xc */
public final class C5618xc extends C5528rc<C5528rc<?>> {

    /* renamed from: e */
    public static final C5618xc f6729e = new C5618xc("BREAK");

    /* renamed from: f */
    public static final C5618xc f6730f = new C5618xc("CONTINUE");

    /* renamed from: g */
    public static final C5618xc f6731g = new C5618xc("NULL");

    /* renamed from: h */
    public static final C5618xc f6732h = new C5618xc("UNDEFINED");

    /* renamed from: b */
    private final String f6733b;

    /* renamed from: c */
    private final boolean f6734c;

    /* renamed from: d */
    private final C5528rc<?> f6735d;

    private C5618xc(String str) {
        this.f6733b = str;
        this.f6734c = false;
        this.f6735d = null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo33142a() {
        return this.f6735d;
    }

    /* renamed from: i */
    public final boolean mo33621i() {
        return this.f6734c;
    }

    public final String toString() {
        return this.f6733b;
    }

    public C5618xc(C5528rc<?> rcVar) {
        C9713p.m20275j(rcVar);
        this.f6733b = "RETURN";
        this.f6734c = true;
        this.f6735d = rcVar;
    }
}
