package p021a3;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* renamed from: a3.b */
/* compiled from: CustomTabPrefetchHelper */
public class C2139b extends CustomTabsServiceConnection {

    /* renamed from: b */
    private static CustomTabsClient f822b;

    /* renamed from: c */
    private static CustomTabsSession f823c;

    /* renamed from: a */
    public static CustomTabsSession m1512a() {
        CustomTabsSession customTabsSession = f823c;
        f823c = null;
        return customTabsSession;
    }

    /* renamed from: b */
    public static void m1513b(Uri uri) {
        if (f823c == null) {
            m1514c();
        }
        CustomTabsSession customTabsSession = f823c;
        if (customTabsSession != null) {
            customTabsSession.mayLaunchUrl(uri, (Bundle) null, (List<Bundle>) null);
        }
    }

    /* renamed from: c */
    private static void m1514c() {
        CustomTabsClient customTabsClient;
        if (f823c == null && (customTabsClient = f822b) != null) {
            f823c = customTabsClient.newSession((CustomTabsCallback) null);
        }
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        f822b = customTabsClient;
        customTabsClient.warmup(0);
        m1514c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
