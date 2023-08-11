package com.appboy.support;

import android.content.Context;
import p126j0.C8266c;
import p126j0.C8300j;

public class PackageUtils {
    private static final String TAG = C8266c.m16405n(PackageUtils.class);
    private static String sPackageName;

    public static String getResourcePackageName(Context context) {
        String str = sPackageName;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        sPackageName = packageName;
        return packageName;
    }

    public static void setResourcePackageName(String str) {
        if (!C8300j.m16493g(str)) {
            sPackageName = str;
        } else {
            C8266c.m16416z(TAG, "Package name may not be null or blank");
        }
    }
}
