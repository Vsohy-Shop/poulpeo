package com.google.android.gms.internal.gtm;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.aa */
public final class C5267aa extends C5521r5 {
    /* renamed from: c */
    private static void m7745c(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    /* renamed from: d */
    private static String m7746d(String str, int i, Set<Character> set) {
        String str2;
        if (i == 1) {
            try {
                return URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        } else if (i != 2) {
            return str;
        } else {
            String replace = str.replace("\\", "\\\\");
            for (Character ch : set) {
                String ch2 = ch.toString();
                String valueOf = String.valueOf(ch2);
                if (valueOf.length() != 0) {
                    str2 = "\\".concat(valueOf);
                } else {
                    str2 = new String("\\");
                }
                replace = replace.replace(ch2, str2);
            }
            return replace;
        }
    }

    /* renamed from: e */
    private static void m7747e(StringBuilder sb, String str, int i, Set<Character> set) {
        sb.append(m7746d(str, i, set));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        String str;
        C5618xc xcVar2;
        C5618xc xcVar3;
        boolean z2 = true;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5632yc ycVar = rcVarArr[0];
        if (rcVarArr.length > 1) {
            xcVar = rcVarArr[1];
        } else {
            xcVar = C5618xc.f6732h;
        }
        int i = 2;
        if (rcVarArr.length <= 2 || (xcVar3 = rcVarArr[2]) == C5618xc.f6732h) {
            str = "";
        } else {
            str = C5506q5.m8420g(xcVar3);
        }
        String str2 = "=";
        if (rcVarArr.length > 3 && (xcVar2 = rcVarArr[3]) != C5618xc.f6732h) {
            str2 = C5506q5.m8420g(xcVar2);
        }
        HashSet hashSet = null;
        if (xcVar != C5618xc.f6732h) {
            C9713p.m20266a(xcVar instanceof C5315dd);
            if ("url".equals(xcVar.mo33142a())) {
                i = 1;
            } else if (!"backslash".equals(xcVar.mo33142a())) {
                return new C5315dd("");
            } else {
                hashSet = new HashSet();
                m7745c(hashSet, str);
                m7745c(hashSet, str2);
                hashSet.remove('\\');
            }
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (ycVar instanceof C5632yc) {
            for (C5528rc rcVar : (List) ycVar.mo33142a()) {
                if (!z2) {
                    sb.append(str);
                }
                m7747e(sb, C5506q5.m8420g(rcVar), i, hashSet);
                z2 = false;
            }
        } else if (ycVar instanceof C5285bd) {
            Map map = (Map) ((C5285bd) ycVar).mo33142a();
            for (String str3 : map.keySet()) {
                if (!z2) {
                    sb.append(str);
                }
                String g = C5506q5.m8420g((C5528rc) map.get(str3));
                m7747e(sb, str3, i, hashSet);
                sb.append(str2);
                m7747e(sb, g, i, hashSet);
                z2 = false;
            }
        } else {
            m7747e(sb, C5506q5.m8420g(ycVar), i, hashSet);
        }
        return new C5315dd(sb.toString());
    }
}
