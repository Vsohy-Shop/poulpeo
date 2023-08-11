package com.rmn.api.p322v2.cloud.general;

/* renamed from: com.rmn.api.v2.cloud.general.CloudUtil */
public abstract class CloudUtil {
    public static final String CLOUD_ALIAS_BDR_ANDROID_CLIENT_ID = "als4fe1816f016ac0.80218052";
    public static final String CLOUD_ALIAS_BDR_IOS_CLIENT_ID = "als4fe17c20301a91.03532159";
    public static final String CLOUD_ALIAS_MAREDUC_ANDROID_CLIENT_ID = "als53f46a02bac491.71965900";
    public static final String CLOUD_ALIAS_MAREDUC_IOS_CLIENT_ID = "als53f469fa444459.49296693";
    public static final String CLOUD_ALIAS_POULPEO_ANDROID_CLIENT_ID = "als52f2049fa46975.80832286";
    public static final String CLOUD_ALIAS_POULPEO_IOS_CLIENT_ID = "als52f20495d05ac2.56394549";
    public static final String CLOUD_CLIENT_ID = "olm4f59e747e0b5a0.21781003";
    public static String URL_CLOUD = "https://mobile.retailmenot.fr/";
    public static final String URL_CLOUD_API = (URL_CLOUD + "api/1.0/");
    private static final String URL_CLOUD_LOCAL = "http://10.36.0.205/";
    private static final String URL_CLOUD_PROD = "https://mobile.retailmenot.fr/";

    public static String getAliasMRClientId() {
        return CLOUD_ALIAS_MAREDUC_ANDROID_CLIENT_ID;
    }

    public static String getAliasPLPClientId() {
        return CLOUD_ALIAS_POULPEO_ANDROID_CLIENT_ID;
    }

    public static String getFullUrl(String str) {
        return getFullUrl((String) null, str);
    }

    public static String getFullUrl(String str, String str2) {
        if (str2 == null || str2.equals("") || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (str != null) {
            str2 = str + str2;
        }
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        return URL_CLOUD + str2;
    }
}
