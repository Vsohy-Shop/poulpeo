package p446vd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.rmn.iosadapters.android.content.ContextContainer;
import p440ud.C13566l;

/* renamed from: vd.b */
/* compiled from: AppUtil */
public class C13621b {
    /* renamed from: a */
    private static int m31087a(ContextContainer contextContainer) {
        if (contextContainer == null) {
            return 0;
        }
        Context a = contextContainer.mo47843a();
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static String m31088b(ContextContainer contextContainer) {
        return String.valueOf(m31087a(contextContainer));
    }

    /* renamed from: c */
    public static String m31089c(ContextContainer contextContainer) {
        if (contextContainer == null) {
            return null;
        }
        Context a = contextContainer.mo47843a();
        ApplicationInfo applicationInfo = a.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i <= 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        return a.getString(i);
    }

    /* renamed from: d */
    public static String m31090d(ContextContainer contextContainer) {
        if (contextContainer == null) {
            return "";
        }
        Context a = contextContainer.mo47843a();
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static String m31091e(ContextContainer contextContainer) {
        if (contextContainer == null) {
            return "";
        }
        return m31089c(contextContainer) + " " + m31090d(contextContainer) + " (build:" + m31088b(contextContainer) + ") / " + C13623d.m31104d() + " " + C13623d.m31105e();
    }

    /* renamed from: f */
    public static boolean m31092f(ContextContainer contextContainer, String str) {
        Integer num;
        try {
            num = Integer.valueOf(str);
        } catch (Exception e) {
            C13633n.m31165u(C13621b.class, e);
            num = null;
        }
        if (num != null && m31087a(contextContainer) > num.intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m31093g(ContextContainer contextContainer, String str) {
        return m31096j(m31090d(contextContainer), str);
    }

    /* renamed from: h */
    public static boolean m31094h(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Integer.parseInt(str) <= Build.VERSION.SDK_INT) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            C13633n.m31145a(C13621b.class, "minSdkVersion must be an INT");
            return true;
        }
    }

    /* renamed from: i */
    public static boolean m31095i() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0043 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m31096j(java.lang.String r7, java.lang.String r8) {
        /*
            if (r7 == 0) goto L_0x0058
            java.lang.String r0 = ""
            boolean r1 = r7.equals(r0)
            if (r1 != 0) goto L_0x0058
            if (r8 == 0) goto L_0x0052
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r7.equals(r8)
            r1 = 0
            if (r0 == 0) goto L_0x001a
            return r1
        L_0x001a:
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            r2 = r1
            r3 = r2
        L_0x0027:
            r4 = 1
            if (r2 >= r0) goto L_0x004c
            r5 = r8[r2]
            if (r5 == 0) goto L_0x0033
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r5 = r1
        L_0x0034:
            int r6 = r7.length
            if (r3 >= r6) goto L_0x0040
            r6 = r7[r3]
            if (r6 == 0) goto L_0x0040
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r6 = r1
        L_0x0041:
            if (r6 >= r5) goto L_0x0044
            return r1
        L_0x0044:
            if (r6 <= r5) goto L_0x0047
            return r4
        L_0x0047:
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x0027
        L_0x004c:
            int r7 = r7.length
            int r8 = r8.length
            if (r7 <= r8) goto L_0x0051
            return r4
        L_0x0051:
            return r1
        L_0x0052:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0058:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p446vd.C13621b.m31096j(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: k */
    private static boolean m31097k(C13566l lVar, String str) {
        Activity a = lVar.mo53218a();
        if (a == null) {
            return false;
        }
        a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }

    /* renamed from: l */
    public static boolean m31098l(C13566l lVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m31097k(lVar, str);
    }
}
