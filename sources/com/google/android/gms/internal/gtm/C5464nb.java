package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import p190p4.C9056e;

/* renamed from: com.google.android.gms.internal.gtm.nb */
public final class C5464nb implements C9056e {

    /* renamed from: b */
    private final Status f6147b;

    /* renamed from: c */
    private final int f6148c;

    /* renamed from: d */
    private final C5482ob f6149d;

    /* renamed from: e */
    private final C5420kc f6150e;

    public C5464nb(Status status, int i) {
        this(status, i, (C5482ob) null, (C5420kc) null);
    }

    /* renamed from: a */
    public final int mo33384a() {
        return this.f6148c;
    }

    /* renamed from: c */
    public final C5482ob mo33385c() {
        return this.f6149d;
    }

    /* renamed from: e */
    public final C5420kc mo33386e() {
        return this.f6150e;
    }

    /* renamed from: f */
    public final String mo33387f() {
        int i = this.f6148c;
        if (i == 0) {
            return "Network";
        }
        if (i == 1) {
            return "Saved file on disk";
        }
        if (i == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }

    public final Status getStatus() {
        return this.f6147b;
    }

    public C5464nb(Status status, int i, C5482ob obVar, C5420kc kcVar) {
        this.f6147b = status;
        this.f6148c = i;
        this.f6149d = obVar;
        this.f6150e = kcVar;
    }
}
