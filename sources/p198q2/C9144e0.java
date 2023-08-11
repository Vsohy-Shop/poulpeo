package p198q2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: q2.e0 */
/* compiled from: Validate.kt */
public final class C9144e0 {

    /* renamed from: a */
    private static final String f13347a;

    /* renamed from: b */
    public static final C9144e0 f13348b = new C9144e0();

    static {
        String name = C9144e0.class.getName();
        C12775o.m28638h(name, "Validate::class.java.name");
        f13347a = name;
    }

    private C9144e0() {
    }

    /* renamed from: a */
    public static final <T> void m18682a(Collection<? extends T> collection, String str) {
        C12775o.m28639i(collection, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        m18691j(collection, str);
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* renamed from: b */
    public static final String m18683b() {
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    /* renamed from: c */
    public static final String m18684c() {
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.".toString());
    }

    /* renamed from: d */
    public static final boolean m18685d(Context context, String str) {
        List<ResolveInfo> list;
        C12775o.m28639i(context, "context");
        m18691j(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!C12775o.m28634d(activityInfo.name, "com.facebook.CustomTabActivity") || !C12775o.m28634d(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m18686e(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            m18691j(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L_0x001b
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x0034
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = f13347a
            android.util.Log.w(r4, r5)
            goto L_0x0034
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p198q2.C9144e0.m18686e(android.content.Context, boolean):void");
    }

    /* renamed from: f */
    public static final void m18687f(Context context, boolean z) {
        C12775o.m28639i(context, "context");
        m18691j(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (!z) {
            Log.w(f13347a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
    }

    /* renamed from: g */
    public static final void m18688g(String str, String str2) {
        boolean z;
        C12775o.m28639i(str, "arg");
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
        }
    }

    /* renamed from: h */
    public static final <T> void m18689h(Collection<? extends T> collection, String str) {
        C12775o.m28639i(collection, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
        }
    }

    /* renamed from: i */
    public static final <T> void m18690i(Collection<? extends T> collection, String str) {
        C12775o.m28639i(collection, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        m18682a(collection, str);
        m18689h(collection, str);
    }

    /* renamed from: j */
    public static final void m18691j(Object obj, String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    /* renamed from: k */
    public static final void m18692k(String str, String str2) {
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
        if (!(!C9138d0.m18618T(str))) {
            throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
        }
    }

    /* renamed from: l */
    public static final void m18693l() {
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
