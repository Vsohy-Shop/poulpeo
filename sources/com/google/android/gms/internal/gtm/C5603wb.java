package com.google.android.gms.internal.gtm;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.google.android.gms.internal.gtm.wb */
public final class C5603wb {

    /* renamed from: a */
    private String f6449a = "https://www.google-analytics.com";

    /* renamed from: b */
    private static String m8632b(String str) {
        String str2;
        try {
            return URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Cannot encode the string: ".concat(valueOf);
            } else {
                str2 = new String("Cannot encode the string: ");
            }
            C5426l3.m8135e(str2);
            return "";
        }
    }

    /* renamed from: a */
    public final String mo33603a(C5283bb bbVar) {
        String str;
        String str2;
        String str3 = this.f6449a;
        if (bbVar.mo33138e()) {
            str = bbVar.mo33139f();
        } else {
            if (!bbVar.mo33140g().trim().equals("")) {
                str2 = bbVar.mo33140g().trim();
            } else {
                str2 = "-1";
            }
            StringBuilder sb = new StringBuilder();
            if (bbVar.mo33136c() != null) {
                sb.append(bbVar.mo33136c());
            } else {
                sb.append("id");
            }
            sb.append("=");
            sb.append(m8632b(bbVar.mo33134a()));
            sb.append("&pv=");
            sb.append(m8632b(str2));
            sb.append("&rv=5.0");
            if (bbVar.mo33138e()) {
                sb.append("&gtm_debug=x");
            }
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 13 + String.valueOf(str).length());
        sb2.append(str3);
        sb2.append("/gtm/android?");
        sb2.append(str);
        return sb2.toString();
    }
}
