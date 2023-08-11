package com.google.android.gms.internal.gtm;

import android.util.Base64;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.u9 */
public final class C5571u9 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        String str4;
        String str5;
        String str6;
        boolean z2 = true;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        String g = C5506q5.m8420g(rcVarArr[0]);
        if (rcVarArr.length > 1) {
            str = C5506q5.m8420g(rcVarArr[1]);
        } else {
            str = "text";
        }
        int i = 2;
        if (rcVarArr.length > 2) {
            str2 = C5506q5.m8420g(rcVarArr[2]);
        } else {
            str2 = "base16";
        }
        if (rcVarArr.length <= 3 || !C5506q5.m8415b(rcVarArr[3])) {
            z2 = false;
        }
        if (z2) {
            i = 3;
        }
        try {
            if ("text".equals(str)) {
                bArr = g.getBytes();
            } else if ("base16".equals(str)) {
                bArr = C5334f2.m7926a(g);
            } else if ("base64".equals(str)) {
                bArr = Base64.decode(g, i);
            } else if ("base64url".equals(str)) {
                bArr = Base64.decode(g, i | 8);
            } else {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str6 = "Encode: unknown input format: ".concat(valueOf);
                } else {
                    str6 = new String("Encode: unknown input format: ");
                }
                throw new UnsupportedOperationException(str6);
            }
            if ("base16".equals(str2)) {
                str4 = C5334f2.m7927b(bArr);
            } else if ("base64".equals(str2)) {
                str4 = Base64.encodeToString(bArr, i);
            } else if ("base64url".equals(str2)) {
                str4 = Base64.encodeToString(bArr, i | 8);
            } else {
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    str5 = "Encode: unknown output format: ".concat(valueOf2);
                } else {
                    str5 = new String("Encode: unknown output format: ");
                }
                throw new RuntimeException(str5);
            }
            return new C5315dd(str4);
        } catch (IllegalArgumentException unused) {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str3 = "Encode: invalid input:".concat(valueOf3);
            } else {
                str3 = new String("Encode: invalid input:");
            }
            throw new RuntimeException(str3);
        }
    }
}
