package com.google.android.gms.internal.gtm;

import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.v9 */
public final class C5586v9 extends C5521r5 {

    /* renamed from: a */
    private static final Pattern f6388a = Pattern.compile("(.+)/(.+)/(.+)");

    /* renamed from: c */
    private static String m8599c(Cipher cipher, String str, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        String str2;
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Encrypt: empty input string");
        }
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return C5334f2.m7927b(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Encrypt: ".concat(valueOf);
            } else {
                str2 = new String("Encrypt: ");
            }
            throw new RuntimeException(str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        String str2;
        String str3;
        C9713p.m20266a(true);
        if (rcVarArr.length >= 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        String g = C5506q5.m8420g(rcVarArr[0]);
        String g2 = C5506q5.m8420g(rcVarArr[1]);
        String g3 = C5506q5.m8420g(rcVarArr[2]);
        if (rcVarArr.length < 4) {
            str = "AES/CBC/NoPadding";
        } else {
            str = C5506q5.m8420g(rcVarArr[3]);
        }
        Matcher matcher = f6388a.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Encrypt: invalid transformation:".concat(valueOf);
            } else {
                str3 = new String("Encrypt: invalid transformation:");
            }
            throw new RuntimeException(str3);
        }
        try {
            return new C5315dd(m8599c(Cipher.getInstance(str), g, new SecretKeySpec(g2.getBytes(), matcher.group(1)), new IvParameterSpec(g3.getBytes())));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "Encrypt: invalid transformation:".concat(valueOf2);
            } else {
                str2 = new String("Encrypt: invalid transformation:");
            }
            throw new RuntimeException(str2);
        }
    }
}
