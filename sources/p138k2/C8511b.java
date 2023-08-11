package p138k2;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import p033b2.C2834c;
import p083f2.C7568a;
import p138k2.C8512c;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

/* renamed from: k2.b */
/* compiled from: RemoteServiceParametersHelper.kt */
public final class C8511b {

    /* renamed from: a */
    private static final String f12121a;

    /* renamed from: b */
    public static final C8511b f12122b = new C8511b();

    static {
        String simpleName = C8512c.class.getSimpleName();
        C12775o.m28638h(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        f12121a = simpleName;
    }

    private C8511b() {
    }

    /* renamed from: a */
    public static final Bundle m17057a(C8512c.C8513a aVar, String str, List<C2834c> list) {
        Class<C8511b> cls = C8511b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "eventType");
            C12775o.m28639i(str, "applicationId");
            C12775o.m28639i(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, aVar.toString());
            bundle.putString("app_id", str);
            if (C8512c.C8513a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b = f12122b.m17058b(list, str);
                if (b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private final JSONArray m17058b(List<C2834c> list, String str) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<C2834c> D0 = C12686e0.m28207D0(list);
            C7568a.m14893d(D0);
            boolean c = m17059c(str);
            for (C2834c cVar : D0) {
                if (!cVar.mo28334g()) {
                    String str2 = f12121a;
                    C9138d0.m18626a0(str2, "Event with invalid checksum: " + cVar);
                } else if ((!cVar.mo28335h()) || (cVar.mo28335h() && c)) {
                    jSONArray.put(cVar.mo28332e());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    private final boolean m17059c(String str) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            C9177p o = C9181q.m18810o(str, false);
            if (o != null) {
                return o.mo43464l();
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }
}
