package com.google.android.gms.internal.gtm;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.y9 */
public final class C5629y9 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        byte[] bArr;
        String str2;
        String str3;
        C5618xc xcVar;
        C5618xc xcVar2;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5618xc xcVar3 = rcVarArr[0];
        C5618xc xcVar4 = C5618xc.f6732h;
        if (xcVar3 == xcVar4) {
            return xcVar4;
        }
        String g = C5506q5.m8420g(xcVar3);
        int length = rcVarArr.length;
        String str4 = Constants.MD5;
        if (length > 1 && (xcVar2 = rcVarArr[1]) != xcVar4) {
            str4 = C5506q5.m8420g(xcVar2);
        }
        if (rcVarArr.length <= 2 || (xcVar = rcVarArr[2]) == xcVar4) {
            str = "text";
        } else {
            str = C5506q5.m8420g(xcVar);
        }
        if ("text".equals(str)) {
            bArr = g.getBytes();
        } else if ("base16".equals(str)) {
            bArr = C5334f2.m7926a(g);
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Hash: Unknown input format: ".concat(valueOf);
            } else {
                str3 = new String("Hash: Unknown input format: ");
            }
            throw new RuntimeException(str3);
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str4);
            instance.update(bArr);
            return new C5315dd(C5334f2.m7927b(instance.digest()));
        } catch (NoSuchAlgorithmException e) {
            String valueOf2 = String.valueOf(str4);
            if (valueOf2.length() != 0) {
                str2 = "Hash: Unknown algorithm: ".concat(valueOf2);
            } else {
                str2 = new String("Hash: Unknown algorithm: ");
            }
            throw new RuntimeException(str2, e);
        }
    }
}
