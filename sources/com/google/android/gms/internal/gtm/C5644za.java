package com.google.android.gms.internal.gtm;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.za */
public final class C5644za extends C5521r5 {

    /* renamed from: a */
    private final C5622y2 f6761a;

    public C5644za(C5622y2 y2Var) {
        this.f6761a = y2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        boolean z2;
        C5618xc xcVar2;
        String str;
        boolean z3 = true;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5528rc<?> rcVar = rcVarArr[0];
        C9713p.m20266a(!(rcVar instanceof C5618xc));
        if (rcVarArr.length > 1) {
            xcVar = rcVarArr[1];
        } else {
            xcVar = C5618xc.f6732h;
        }
        C5618xc xcVar3 = C5618xc.f6732h;
        if (xcVar == xcVar3 || (xcVar instanceof C5632yc)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        if (rcVarArr.length > 2) {
            xcVar2 = rcVarArr[2];
        } else {
            xcVar2 = xcVar3;
        }
        if (xcVar2 != xcVar3 && (xcVar2 instanceof C5618xc)) {
            z3 = false;
        }
        C9713p.m20266a(z3);
        Uri.Builder buildUpon = Uri.parse(C5506q5.m8420g(rcVar)).buildUpon();
        if (xcVar != xcVar3) {
            for (C5528rc rcVar2 : (List) ((C5632yc) xcVar).mo33142a()) {
                C9713p.m20266a(rcVar2 instanceof C5285bd);
                for (Map.Entry entry : ((Map) ((C5285bd) rcVar2).mo33142a()).entrySet()) {
                    buildUpon.appendQueryParameter(((String) entry.getKey()).toString(), C5506q5.m8420g(C5345fd.m7937a(b4Var, (C5528rc) entry.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        C5618xc xcVar4 = C5618xc.f6732h;
        if (xcVar2 == xcVar4) {
            this.f6761a.mo33512m(uri);
            String valueOf = String.valueOf(uri);
            if (valueOf.length() != 0) {
                str = "SendPixel: url = ".concat(valueOf);
            } else {
                str = new String("SendPixel: url = ");
            }
            C5426l3.m8133c(str);
        } else {
            String g = C5506q5.m8420g(xcVar2);
            this.f6761a.mo33511l(uri, g);
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 30 + String.valueOf(g).length());
            sb.append("SendPixel: url = ");
            sb.append(uri);
            sb.append(", uniqueId = ");
            sb.append(g);
            C5426l3.m8133c(sb.toString());
        }
        return xcVar4;
    }
}
