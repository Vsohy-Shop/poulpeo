package p118i2;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.facebook.C4579r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p033b2.C2849g;
import p198q2.C9114a;
import p198q2.C9138d0;
import p198q2.C9194v;
import p336ef.C11915r;

/* renamed from: i2.c */
/* compiled from: AppEventsLoggerUtility.kt */
public final class C8094c {

    /* renamed from: a */
    private static final Map<C8095a, String> f11376a = C12716r0.m28418i(C11915r.m25707a(C8095a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C11915r.m25707a(C8095a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* renamed from: b */
    public static final C8094c f11377b = new C8094c();

    /* renamed from: i2.c$a */
    /* compiled from: AppEventsLoggerUtility.kt */
    public enum C8095a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private C8094c() {
    }

    /* renamed from: a */
    public static final JSONObject m15926a(C8095a aVar, C9114a aVar2, String str, boolean z, Context context) {
        C12775o.m28639i(aVar, "activityType");
        C12775o.m28639i(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, f11376a.get(aVar));
        String d = C2849g.f1214c.mo28353d();
        if (d != null) {
            jSONObject.put("app_user_id", d);
        }
        C9138d0.m18662s0(jSONObject, aVar2, str, z);
        try {
            C9138d0.m18664t0(jSONObject, context);
        } catch (Exception e) {
            C9194v.f13504f.mo43483d(C4579r.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject x = C9138d0.m18671x();
        if (x != null) {
            Iterator<String> keys = x.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, x.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
