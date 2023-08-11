package p198q2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p251v2.C9925a;

/* renamed from: q2.f */
/* compiled from: CustomTabUtils */
public class C9145f {

    /* renamed from: a */
    private static final String[] f13349a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: a */
    public static String m18694a() {
        Class<C9145f> cls = C9145f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices != null) {
                HashSet hashSet = new HashSet(Arrays.asList(f13349a));
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static String m18695b() {
        Class<C9145f> cls = C9145f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return "fbconnect://cct." + FacebookSdk.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static String m18696c(String str) {
        Class<C9145f> cls = C9145f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (C9144e0.m18685d(FacebookSdk.getApplicationContext(), str)) {
                return str;
            }
            if (C9144e0.m18685d(FacebookSdk.getApplicationContext(), m18695b())) {
                return m18695b();
            }
            return "";
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
