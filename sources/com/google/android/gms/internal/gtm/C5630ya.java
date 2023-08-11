package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import p231t4.C9713p;
import p254v5.C9951l;

/* renamed from: com.google.android.gms.internal.gtm.ya */
public final class C5630ya extends C5521r5 {

    /* renamed from: a */
    private final C9951l f6739a;

    /* renamed from: b */
    private final C5637z3 f6740b;

    public C5630ya(C9951l lVar, C5637z3 z3Var) {
        this.f6739a = lVar;
        this.f6740b = z3Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        Bundle bundle;
        String str;
        boolean z2 = true;
        C9713p.m20266a(true);
        if (rcVarArr.length == 1 || rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        if (rcVarArr.length > 1) {
            xcVar = rcVarArr[1];
        } else {
            xcVar = C5618xc.f6732h;
        }
        C5618xc xcVar2 = C5618xc.f6732h;
        if (xcVar != xcVar2 && !(xcVar instanceof C5285bd)) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        C5564u2 a = this.f6740b.mo33601a();
        String str2 = (String) rcVarArr[0].mo33142a();
        if (xcVar != xcVar2) {
            bundle = C5345fd.m7943g((Map) ((C5285bd) xcVar).mo33142a());
        } else {
            bundle = null;
        }
        try {
            this.f6739a.mo35447z0(a.mo33553g(), str2, bundle, a.mo33547a());
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Error calling measurement proxy:".concat(valueOf);
            } else {
                str = new String("Error calling measurement proxy:");
            }
            C5426l3.m8135e(str);
        }
        return C5618xc.f6732h;
    }
}
