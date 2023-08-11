package p198q2;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import p251v2.C9925a;

/* renamed from: q2.r */
/* compiled from: InstagramCustomTab */
public class C9187r extends C9143e {
    public C9187r(String str, Bundle bundle) {
        super(str, bundle);
        this.f13346a = m18814a(str, bundle == null ? new Bundle() : bundle);
    }

    /* renamed from: a */
    public static Uri m18814a(String str, Bundle bundle) {
        Class<C9187r> cls = C9187r.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (str.equals("oauth")) {
                return C9138d0.m18631d(C9212z.m18917j(), "oauth/authorize", bundle);
            }
            String j = C9212z.m18917j();
            return C9138d0.m18631d(j, FacebookSdk.getGraphApiVersion() + "/" + "dialog/" + str, bundle);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
