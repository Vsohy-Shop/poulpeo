package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.l4 */
public final class C3395l4 implements C3429m2 {

    /* renamed from: c */
    public static final C3396a f2105c = new C3396a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C4218b f2106a;

    /* renamed from: b */
    public final SharedPreferences f2107b;

    /* renamed from: bo.app.l4$a */
    public static final class C3396a {
        public /* synthetic */ C3396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3396a() {
        }
    }

    /* renamed from: bo.app.l4$b */
    static final class C3397b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2108b;

        /* renamed from: c */
        final /* synthetic */ int f2109c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3397b(int i, int i2) {
            super(0);
            this.f2108b = i;
            this.f2109c = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Stored push registration ID version code " + this.f2108b + " does not match live version code " + this.f2109c + ". Not returning saved registration ID.";
        }
    }

    /* renamed from: bo.app.l4$c */
    static final class C3398c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3398c f2110b = new C3398c();

        C3398c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Device identifier differs from saved device identifier. Returning null token.";
        }
    }

    public C3395l4(Context context, C4218b bVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bVar, "configurationProvider");
        this.f2106a = bVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f2107b = sharedPreferences;
    }

    /* renamed from: b */
    private final boolean m3361b() {
        if (this.f2106a.isFirebaseCloudMessagingRegistrationEnabled() || this.f2106a.isAdmMessagingRegistrationEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized String mo29312a() {
        int versionCode;
        int i;
        if (!m3361b() || !this.f2107b.contains("version_code") || (versionCode = this.f2106a.getVersionCode()) == (i = this.f2107b.getInt("version_code", Integer.MIN_VALUE))) {
            if (this.f2107b.contains("device_identifier")) {
                if (!C12775o.m28634d(C3423m0.f2157b.mo29342a(), this.f2107b.getString("device_identifier", ""))) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3398c.f2110b, 6, (Object) null);
                    return null;
                }
            }
            return this.f2107b.getString("registration_id", (String) null);
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3397b(i, versionCode), 6, (Object) null);
        return null;
    }

    /* renamed from: a */
    public synchronized void mo29313a(String str) {
        if (str != null) {
            this.f2107b.edit().putString("registration_id", str).putInt("version_code", this.f2106a.getVersionCode()).putString("device_identifier", C3423m0.f2157b.mo29342a()).apply();
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
