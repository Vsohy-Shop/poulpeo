package com.google.android.gms.internal.gtm;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.v8 */
public final class C5585v8 extends C5521r5 {
    /* renamed from: c */
    static String m8596c(String str, String str2) {
        Charset forName = Charset.forName(Constants.ENCODING);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                sb.append((char) charAt);
                i++;
            } else {
                byte d = m8597d(str, i);
                int i2 = i + 3;
                if ((d & 128) != 0) {
                    int i3 = 0;
                    while (((d << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = d;
                    int i4 = 1;
                    while (i4 < i3) {
                        byte d2 = m8597d(str, i2);
                        i2 += 3;
                        if ((d2 & 192) == 128) {
                            bArr[i4] = d2;
                            i4++;
                        } else {
                            throw new UnsupportedEncodingException();
                        }
                    }
                    CharBuffer decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        sb.append(decode);
                    } else {
                        sb.append(str.substring(i, i2));
                    }
                } else if (str2.indexOf(d) == -1) {
                    sb.append((char) d);
                } else {
                    sb.append(str.substring(i2 - 3, i2));
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static byte m8597d(String str, int i) {
        int i2 = i + 3;
        if (i2 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i + 1, i2);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
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
            return new C5315dd(m8596c(C5506q5.m8420g(rcVar), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException unused) {
            return C5618xc.f6732h;
        }
    }
}
