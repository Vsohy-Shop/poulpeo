package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.k3 */
public class C5411k3 {

    /* renamed from: a */
    private static String f6083a;

    /* renamed from: b */
    private static Map<String, String> f6084b = new HashMap();

    /* renamed from: a */
    public static String m8117a(Context context, String str) {
        if (f6083a == null) {
            synchronized (C5411k3.class) {
                if (f6083a == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        f6083a = sharedPreferences.getString(Constants.REFERRER, "");
                    } else {
                        f6083a = "";
                    }
                }
            }
        }
        return m8118b(f6083a, str);
    }

    /* renamed from: b */
    public static String m8118b(String str, String str2) {
        String str3;
        if (str2 != null) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "http://hostname/?".concat(valueOf);
            } else {
                str3 = new String("http://hostname/?");
            }
            return Uri.parse(str3).getQueryParameter(str2);
        } else if (str.length() > 0) {
            return str;
        } else {
            return null;
        }
    }
}
