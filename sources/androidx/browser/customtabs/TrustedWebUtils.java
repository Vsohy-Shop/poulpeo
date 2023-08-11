package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.app.BundleCompat;
import androidx.core.content.FileProvider;
import java.io.File;

public class TrustedWebUtils {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";
    public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private TrustedWebUtils() {
    }

    public static boolean areSplashScreensSupported(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent().setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage(str), 64);
        if (resolveService == null || (intentFilter = resolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void launchAsTrustedWebActivity(@NonNull Context context, @NonNull CustomTabsIntent customTabsIntent, @NonNull Uri uri) {
        if (BundleCompat.getBinder(customTabsIntent.intent.getExtras(), CustomTabsIntent.EXTRA_SESSION) != null) {
            customTabsIntent.intent.putExtra(EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY, true);
            customTabsIntent.launchUrl(context, uri);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void launchBrowserSiteSettings(@NonNull Context context, @NonNull CustomTabsSession customTabsSession, @NonNull Uri uri) {
        Intent intent = new Intent(ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA);
        intent.setPackage(customTabsSession.getComponentName().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, CustomTabsIntent.EXTRA_SESSION, customTabsSession.getBinder());
        intent.putExtras(bundle);
        PendingIntent id = customTabsSession.getId();
        if (id != null) {
            intent.putExtra(CustomTabsIntent.EXTRA_SESSION_ID, id);
        }
        context.startActivity(intent);
    }

    @WorkerThread
    public static boolean transferSplashImage(@NonNull Context context, @NonNull File file, @NonNull String str, @NonNull String str2, @NonNull CustomTabsSession customTabsSession) {
        Uri uriForFile = FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        return customTabsSession.receiveFile(uriForFile, 1, (Bundle) null);
    }
}
