package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.m0 */
public final class C3423m0 implements C3162g2 {

    /* renamed from: b */
    public static final C3424a f2157b = new C3424a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final SharedPreferences f2158a;

    /* renamed from: bo.app.m0$a */
    public static final class C3424a {
        public /* synthetic */ C3424a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo29342a() {
            return String.valueOf(722989291);
        }

        private C3424a() {
        }
    }

    public C3423m0(Context context) {
        C12775o.m28639i(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.device", 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f2158a = sharedPreferences;
    }

    /* renamed from: a */
    private final void m3397a(String str) {
        this.f2158a.edit().putString("device_id", str).putString("persistent_device_id", f2157b.mo29342a()).apply();
    }

    public String getDeviceId() {
        String str = null;
        String string = this.f2158a.getString("device_id", (String) null);
        if (!m3398a()) {
            str = string;
        }
        if (str == null) {
            String uuid = UUID.randomUUID().toString();
            C12775o.m28638h(uuid, "randomUUID().toString()");
            m3397a(uuid);
            return uuid;
        } else if (this.f2158a.contains("persistent_device_id")) {
            return str;
        } else {
            m3397a(str);
            return str;
        }
    }

    /* renamed from: a */
    private final boolean m3398a() {
        if (this.f2158a.contains("persistent_device_id")) {
            if (!C12775o.m28634d(f2157b.mo29342a(), this.f2158a.getString("persistent_device_id", ""))) {
                return true;
            }
        }
        return false;
    }
}
