package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.q5 */
public final class C3587q5 {

    /* renamed from: a */
    private static final String f2423a = C8266c.f11641a.mo42215o("SharedPrefUtils");

    /* renamed from: bo.app.q5$a */
    static final class C3588a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2424b;

        /* renamed from: c */
        final /* synthetic */ String f2425c;

        /* renamed from: d */
        final /* synthetic */ String f2426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3588a(String str, String str2, String str3) {
            super(0);
            this.f2424b = str;
            this.f2425c = str2;
            this.f2426d = str3;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Detected SDK update from '" + this.f2424b + "' -> '" + this.f2425c + "'. Clearing " + this.f2426d + " storage.";
        }
    }

    /* renamed from: a */
    public static /* synthetic */ SharedPreferences m3685a(Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = Constants.APPBOY_SDK_VERSION;
        }
        return m3684a(context, str, str2);
    }

    /* renamed from: a */
    public static final SharedPreferences m3684a(Context context, String str, String str2) {
        C12775o.m28639i(context, "<this>");
        C12775o.m28639i(str, "prefsFilename");
        C12775o.m28639i(str2, "currentSdkVersion");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!C12775o.m28634d(str2, string)) {
            C8266c.m16397f(C8266c.f11641a, f2423a, C8266c.C8267a.f11650f, (Throwable) null, false, new C3588a(string, str2, str), 12, (Object) null);
            edit.clear().apply();
        }
        edit.putString("last_accessed_sdk_version", str2).apply();
        C12775o.m28638h(sharedPreferences, "prefs");
        return sharedPreferences;
    }
}
