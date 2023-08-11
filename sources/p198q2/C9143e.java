package p198q2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.facebook.FacebookSdk;
import p021a3.C2139b;
import p251v2.C9925a;

/* renamed from: q2.e */
/* compiled from: CustomTab */
public class C9143e {

    /* renamed from: a */
    protected Uri f13346a;

    public C9143e(String str, Bundle bundle) {
        this.f13346a = m18680a(str, bundle == null ? new Bundle() : bundle);
    }

    /* renamed from: a */
    public static Uri m18680a(String str, Bundle bundle) {
        Class<C9143e> cls = C9143e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            String b = C9212z.m18909b();
            return C9138d0.m18631d(b, FacebookSdk.getGraphApiVersion() + "/" + "dialog/" + str, bundle);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo43400b(Activity activity, String str) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder(C2139b.m1512a()).build();
            build.intent.setPackage(str);
            try {
                build.launchUrl(activity, this.f13346a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }
}
