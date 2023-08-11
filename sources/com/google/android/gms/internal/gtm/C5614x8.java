package com.google.android.gms.internal.gtm;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.x8 */
public final class C5614x8 extends C5521r5 {
    /* renamed from: c */
    static String m8658c(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        Charset forName = Charset.forName(Constants.ENCODING);
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (str2.indexOf(charAt) != -1) {
                sb.append((char) charAt);
                i2++;
            } else {
                if (Character.isHighSurrogate((char) charAt)) {
                    int i3 = i2 + 1;
                    if (i3 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    } else if (Character.isLowSurrogate(str.charAt(i3))) {
                        i = 2;
                    } else {
                        throw new UnsupportedEncodingException();
                    }
                } else {
                    i = 1;
                }
                int i4 = i + i2;
                byte[] bytes = str.substring(i2, i4).getBytes(forName);
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    sb.append("%");
                    sb.append(Character.toUpperCase(Character.forDigit((bytes[i5] >> 4) & 15, 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i5] & 15, 16)));
                }
                i2 = i4;
            }
        }
        return sb.toString().replaceAll(" ", "%20");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C5528rc rcVar;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            rcVar = (C5528rc) C9713p.m20275j(rcVarArr[0]);
        } else {
            rcVar = C5618xc.f6732h;
        }
        try {
            return new C5315dd(m8658c(C5506q5.m8420g(rcVar), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException unused) {
            return C5618xc.f6732h;
        }
    }
}
