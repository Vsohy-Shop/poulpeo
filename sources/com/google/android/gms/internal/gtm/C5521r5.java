package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.r5 */
public abstract class C5521r5 implements C5491p5 {
    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (b4Var != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        C5528rc<?>[] rcVarArr2 = new C5528rc[rcVarArr.length];
        for (int i = 0; i < rcVarArr.length; i++) {
            if (rcVarArr[i] != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C9713p.m20266a(z3);
            C5618xc xcVar = rcVarArr[i];
            C5618xc xcVar2 = C5618xc.f6729e;
            if (xcVar != xcVar2) {
                z4 = true;
            } else {
                z4 = false;
            }
            C9713p.m20266a(z4);
            C5618xc xcVar3 = rcVarArr[i];
            C5618xc xcVar4 = C5618xc.f6730f;
            if (xcVar3 != xcVar4) {
                z5 = true;
            } else {
                z5 = false;
            }
            C9713p.m20266a(z5);
            C5528rc<?> a = C5345fd.m7937a(b4Var, rcVarArr[i]);
            rcVarArr2[i] = a;
            if (a != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            C9713p.m20266a(z6);
            if (rcVarArr2[i] != xcVar2) {
                z7 = true;
            } else {
                z7 = false;
            }
            C9713p.m20266a(z7);
            if (rcVarArr2[i] != xcVar4) {
                z8 = true;
            } else {
                z8 = false;
            }
            C9713p.m20266a(z8);
        }
        C5528rc<?> b = mo33099b(b4Var, rcVarArr2);
        if (b == null) {
            z9 = false;
        }
        C9713p.m20278m(z9);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr);
}
