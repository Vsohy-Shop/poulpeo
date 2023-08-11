package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p231t4.C9713p;
import p286y4.C10677k;

/* renamed from: com.google.android.gms.internal.gtm.q1 */
public final class C5502q1 {

    /* renamed from: a */
    private static final char[] f6252a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static double m8394a(String str, double d) {
        if (str == null) {
            return 100.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return 100.0d;
        }
    }

    /* renamed from: b */
    public static C5466nd m8395b(C5348g1 g1Var, String str) {
        String str2;
        C9713p.m20275j(g1Var);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "?".concat(valueOf);
            } else {
                str2 = new String("?");
            }
            Map<String, String> a = C10677k.m22691a(new URI(str2), Constants.ENCODING);
            C5466nd ndVar = new C5466nd();
            ndVar.mo33408s(a.get("utm_content"));
            ndVar.mo33406q(a.get("utm_medium"));
            ndVar.mo33397h(a.get("utm_campaign"));
            ndVar.mo33405p(a.get("utm_source"));
            ndVar.mo33407r(a.get("utm_term"));
            ndVar.mo33409t(a.get("utm_id"));
            ndVar.mo33411u(a.get("anid"));
            ndVar.mo33412v(a.get("gclid"));
            ndVar.mo33413w(a.get("dclid"));
            ndVar.mo33414x(a.get("aclid"));
            return ndVar;
        } catch (URISyntaxException e) {
            g1Var.mo33262E0("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m8396c(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m8397d(Map<String, String> map, String str, Map<String, String> map2) {
        m8403j(map, str, map2.get(str));
    }

    /* renamed from: e */
    public static boolean m8398e(double d, String str) {
        int i;
        if (d > 0.0d && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 65535) + charAt + (charAt << 14);
                    int i2 = 266338304 & i;
                    if (i2 != 0) {
                        i ^= i2 >> 21;
                    }
                }
            } else {
                i = 1;
            }
            if (((double) (i % 10000)) >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m8399f(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo == null || !receiverInfo.enabled || (z && !receiverInfo.exported)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: g */
    public static long m8400g(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: h */
    public static MessageDigest m8401h(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m8402i(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("http:")) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static void m8403j(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: k */
    public static void m8404k(Map<String, String> map, String str, boolean z) {
        String str2;
        if (!map.containsKey(str)) {
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            map.put(str, str2);
        }
    }

    /* renamed from: l */
    public static boolean m8405l(String str, boolean z) {
        if (str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1") || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0"))) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static void m8406m(Map<String, String> map, String str, String str2) {
        if (str2 != null && TextUtils.isEmpty(map.get(str))) {
            map.put(str, str2);
        }
    }

    /* renamed from: n */
    public static boolean m8407n(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
