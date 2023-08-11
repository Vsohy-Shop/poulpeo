package com.rmn.utils;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.rmn.utils_common.IListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p446vd.C13633n;

public class AndroidUtil {
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";

    public static Bitmap applyGradient(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, (float) ((height - i) - i2), 0.0f, (float) (height - i2), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, 0.0f, (float) width, (float) height, paint);
        return createBitmap;
    }

    public static String ellipsizeText(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        if (i <= 3) {
            return "...";
        }
        return str.substring(0, i - 3) + "...";
    }

    @Nullable
    private static ComponentName getDefaultBrowserComponent(@NonNull Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTP).authority("x.y.z").appendQueryParameter("q", "x").build());
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ResolveInfo resolveInfo = null;
        for (ResolveInfo next : queryIntentActivities) {
            String resolveInfoPackageName = getResolveInfoPackageName(next);
            String resolveInfoName = getResolveInfoName(next);
            String resolveInfoPackageName2 = getResolveInfoPackageName(resolveActivity);
            String resolveInfoName2 = getResolveInfoName(resolveActivity);
            if (!TextUtils.isEmpty(resolveInfoPackageName) && resolveInfoPackageName.equals(resolveInfoPackageName2) && !TextUtils.isEmpty(resolveInfoName) && resolveInfoName.equals(resolveInfoName2)) {
                return ri2cn(resolveActivity);
            }
            if ("com.android.browser".equals(resolveInfoPackageName)) {
                resolveInfo = next;
            }
        }
        if (resolveInfo != null) {
            return ri2cn(resolveInfo);
        }
        if (queryIntentActivities.size() > 0) {
            return ri2cn(queryIntentActivities.get(0));
        }
        if (resolveActivity != null) {
            return ri2cn(resolveActivity);
        }
        return null;
    }

    @NonNull
    public static String getDefaultBrowserPackage(@NonNull Context context) {
        try {
            return context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 65536).activityInfo.packageName;
        } catch (Exception e) {
            C13633n.m31165u(AndroidUtil.class, e);
            return "";
        }
    }

    public static JSONObject getJSONObjectFromExternalStorage(Context context, String str) {
        String path = Environment.getExternalStorageDirectory().getPath();
        try {
            return getJSONObjectFromInputStream(context, new FileInputStream(new File(path + str)));
        } catch (IOException e) {
            C13633n.m31147c(context, e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[Catch:{ IOException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f A[Catch:{ IOException -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject getJSONObjectFromInputStream(android.content.Context r6, java.io.InputStream r7) {
        /*
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0030, all -> 0x002e }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0030, all -> 0x002e }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r7, r5)     // Catch:{ IOException -> 0x0030, all -> 0x002e }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0030, all -> 0x002e }
        L_0x0016:
            int r4 = r3.read(r1)     // Catch:{ IOException -> 0x002c }
            r5 = -1
            if (r4 == r5) goto L_0x0022
            r5 = 0
            r0.write(r1, r5, r4)     // Catch:{ IOException -> 0x002c }
            goto L_0x0016
        L_0x0022:
            r7.close()     // Catch:{ IOException -> 0x0041 }
            r0.close()     // Catch:{ IOException -> 0x0041 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0045
        L_0x002c:
            r1 = move-exception
            goto L_0x0032
        L_0x002e:
            r1 = move-exception
            goto L_0x0057
        L_0x0030:
            r1 = move-exception
            r3 = r2
        L_0x0032:
            p446vd.C13633n.m31147c(r6, r1)     // Catch:{ all -> 0x0055 }
            r7.close()     // Catch:{ IOException -> 0x0041 }
            r0.close()     // Catch:{ IOException -> 0x0041 }
            if (r3 == 0) goto L_0x0045
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r7 = move-exception
            p446vd.C13633n.m31147c(r6, r7)
        L_0x0045:
            java.lang.String r7 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0050 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0050 }
            r2 = r0
            goto L_0x0054
        L_0x0050:
            r7 = move-exception
            p446vd.C13633n.m31147c(r6, r7)
        L_0x0054:
            return r2
        L_0x0055:
            r1 = move-exception
            r2 = r3
        L_0x0057:
            r7.close()     // Catch:{ IOException -> 0x0063 }
            r0.close()     // Catch:{ IOException -> 0x0063 }
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r7 = move-exception
            p446vd.C13633n.m31147c(r6, r7)
        L_0x0067:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.utils.AndroidUtil.getJSONObjectFromInputStream(android.content.Context, java.io.InputStream):org.json.JSONObject");
    }

    public static JSONObject getJSONObjectFromRawResource(Context context, int i) {
        return getJSONObjectFromInputStream(context, context.getResources().openRawResource(i));
    }

    @NonNull
    private static String getResolveInfoName(@Nullable ResolveInfo resolveInfo) {
        ActivityInfo activityInfo;
        if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
            return "";
        }
        return activityInfo.name;
    }

    @NonNull
    private static String getResolveInfoPackageName(@Nullable ResolveInfo resolveInfo) {
        ActivityInfo activityInfo;
        if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
            return "";
        }
        return activityInfo.packageName;
    }

    public static void hideSoftKeyboard(Activity activity, boolean z) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && (currentFocus instanceof EditText)) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            if (z) {
                currentFocus.clearFocus();
            }
        }
    }

    public static boolean isBrowserInstalledAndEnabled(@NonNull Context context, @NonNull String str) {
        if (str.isEmpty()) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.applicationInfo.enabled;
            }
        } catch (Exception e) {
            C13633n.m31165u(AndroidUtil.class, e);
        }
        return false;
    }

    public static boolean isNotificationEnabled(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        Class<AppOpsManager> cls = AppOpsManager.class;
        try {
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod(CHECK_OP_NO_THROW, new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isTextTruncated(TextView textView) {
        Layout layout;
        int maxLines;
        if (textView == null || (layout = textView.getLayout()) == null || (maxLines = textView.getMaxLines()) > layout.getLineCount() || layout.getEllipsisCount(maxLines - 1) <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$retrieveAdvertisingIdAsync$2(IListener iListener, AdvertisingIdClient.Info info) {
        if (info == null) {
            iListener.mo40744J0(null);
        } else if (info.isLimitAdTrackingEnabled()) {
            iListener.mo40744J0(null);
        } else {
            iListener.mo40744J0(info.getId());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$retrieveAdvertisingInfoAsync$1(Context context, IListener iListener) {
        AdvertisingIdClient.Info info;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Exception e) {
            C13633n.m31165u(AndroidUtil.class, e);
            info = null;
        }
        new Handler(Looper.getMainLooper()).post(new C11667c(iListener, info));
    }

    public static void openDefaultBrowser(@NonNull Activity activity, @Nullable String str) {
        Uri uri;
        Class<AndroidUtil> cls = AndroidUtil.class;
        String str2 = null;
        try {
            uri = Uri.parse(str);
        } catch (Exception e) {
            C13633n.m31165u(cls, e);
            uri = null;
        }
        if (uri == null) {
            uri = Uri.parse("https://www.google.com");
        }
        try {
            ComponentName defaultBrowserComponent = getDefaultBrowserComponent(activity);
            if (defaultBrowserComponent != null) {
                str2 = defaultBrowserComponent.getPackageName();
            }
            if (str2 == null) {
                str2 = "";
            }
            Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(str2);
            launchIntentForPackage.setData(uri);
            launchIntentForPackage.addFlags(268435456);
            activity.startActivity(launchIntentForPackage);
        } catch (Exception e2) {
            C13633n.m31165u(cls, e2);
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            activity.startActivity(intent);
        }
    }

    public static void openNotificationsSettings(Context context) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addFlags(268435456).setData(Uri.fromParts("package", context.getPackageName(), (String) null));
        }
        context.startActivity(intent);
    }

    public static void openPhoneActivity(Context context, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:" + charSequence)));
        }
    }

    public static void retrieveAdvertisingIdAsync(@NonNull Context context, @NonNull IListener<String> iListener) {
        retrieveAdvertisingInfoAsync(context, new C11665a(iListener));
    }

    public static void retrieveAdvertisingInfoAsync(@NonNull Context context, @NonNull IListener<AdvertisingIdClient.Info> iListener) {
        Executors.newSingleThreadExecutor().execute(new C11666b(context, iListener));
    }

    @Nullable
    private static ComponentName ri2cn(@Nullable ResolveInfo resolveInfo) {
        String resolveInfoPackageName = getResolveInfoPackageName(resolveInfo);
        String resolveInfoName = getResolveInfoName(resolveInfo);
        if (TextUtils.isEmpty(resolveInfoPackageName) || TextUtils.isEmpty(resolveInfoName)) {
            return null;
        }
        return new ComponentName(getResolveInfoPackageName(resolveInfo), getResolveInfoName(resolveInfo));
    }

    public static void showSoftKeyboard(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && (currentFocus instanceof EditText)) {
            ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(currentFocus, 1);
        }
    }
}
