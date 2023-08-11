package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import p023a5.C2207e;
import p180o4.C8976e;
import p231t4.C9713p;
import p286y4.C10675i;
import p286y4.C10680n;
import p286y4.C10683q;

/* renamed from: com.google.android.gms.common.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C4785c {
    @Deprecated

    /* renamed from: a */
    public static final int f5063a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f5064b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f5065c = false;

    /* renamed from: d */
    static boolean f5066d = false;

    /* renamed from: e */
    private static final AtomicBoolean f5067e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m6694a(@NonNull Context context, int i) {
        int h = C4718a.m6394f().mo32347h(context, i);
        if (h != 0) {
            Intent b = C4718a.m6394f().mo32343b(context, h, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(h);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (b == null) {
                throw new GooglePlayServicesNotAvailableException(h);
            }
            throw new GooglePlayServicesRepairableException(h, "Google Play Services not available", b);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m6695b(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static String m6696c(int i) {
        return ConnectionResult.m6369J(i);
    }

    @Nullable
    /* renamed from: d */
    public static Context m6697d(@NonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public static Resources m6698e(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m6699f(@NonNull Context context) {
        if (!f5066d) {
            try {
                PackageInfo e = C2207e.m1805a(context).mo23530e("com.google.android.gms", 64);
                C8976e.m18220a(context);
                if (e == null || C8976e.m18222e(e, false) || !C8976e.m18222e(e, true)) {
                    f5065c = false;
                } else {
                    f5065c = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } finally {
                f5066d = true;
            }
        }
        if (f5065c || !C10675i.m22684b()) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public static int m6700g(@NonNull Context context) {
        return m6701h(context, f5063a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    @java.lang.Deprecated
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6701h(@androidx.annotation.NonNull android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = p180o4.C8977f.f13065a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f5067e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = p231t4.C9739x0.m20333a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f5063a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = p286y4.C10675i.m22686d(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = p286y4.C10675i.m22688f(r10)
            if (r1 != 0) goto L_0x004d
            r1 = r3
            goto L_0x004e
        L_0x004d:
            r1 = r4
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            p231t4.C9713p.m20266a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007b
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007c
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = r7
            goto L_0x013c
        L_0x007b:
            r8 = 0
        L_0x007c:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x012f }
            p180o4.C8976e.m18220a(r10)
            boolean r10 = p180o4.C8976e.m18222e(r9, r3)
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x0099:
            if (r1 == 0) goto L_0x00b2
            p231t4.C9713p.m20275j(r8)
            boolean r10 = p180o4.C8976e.m18222e(r8, r3)
            if (r10 != 0) goto L_0x00b2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b2:
            if (r1 == 0) goto L_0x00d2
            if (r8 == 0) goto L_0x00d2
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d2:
            int r10 = r9.versionCode
            int r10 = p286y4.C10685s.m22715a(r10)
            int r1 = p286y4.C10685s.m22715a(r11)
            if (r10 >= r1) goto L_0x0110
            int r10 = r9.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 82
            r2.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ".  Requires "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = " but found "
            r2.append(r11)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x013c
        L_0x0110:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x0128
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0119 }
            goto L_0x0128
        L_0x0119:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x013c
        L_0x0128:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x012e
            r3 = 3
            goto L_0x013c
        L_0x012e:
            return r4
        L_0x012f:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x013c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C4785c.m6701h(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m6702i(@NonNull Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m6706m(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m6703j(@NonNull Context context) {
        if (!C10680n.m22699c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C9713p.m20275j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m6704k(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 9) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: l */
    public static boolean m6705l(@NonNull Context context, int i, @NonNull String str) {
        return C10683q.m22711b(context, i, str);
    }

    /* renamed from: m */
    static boolean m6706m(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C10680n.m22702f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled || m6703j(context)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
