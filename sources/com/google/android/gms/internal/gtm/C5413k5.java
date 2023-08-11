package com.google.android.gms.internal.gtm;

import android.content.Context;
import p296z3.C10797b;
import p296z3.C10801f;

/* renamed from: com.google.android.gms.internal.gtm.k5 */
public final class C5413k5 {

    /* renamed from: a */
    private C10797b f6089a;

    /* renamed from: b */
    private Context f6090b;

    /* renamed from: c */
    private C10801f f6091c;

    public C5413k5(Context context) {
        this.f6090b = context;
    }

    /* renamed from: b */
    private final synchronized void m8122b(String str) {
        if (this.f6089a == null) {
            C10797b i = C10797b.m22974i(this.f6090b);
            this.f6089a = i;
            i.mo45718n(new C5428l5());
            this.f6091c = this.f6089a.mo45716l(str);
        }
    }

    /* renamed from: a */
    public final C10801f mo33320a(String str) {
        m8122b(str);
        return this.f6091c;
    }
}
