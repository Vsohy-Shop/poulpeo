package p118i2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: i2.j */
/* compiled from: SourceApplicationInfo.kt */
public final class C8106j {

    /* renamed from: c */
    public static final C8107a f11408c = new C8107a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f11409a;

    /* renamed from: b */
    private final boolean f11410b;

    /* renamed from: i2.j$a */
    /* compiled from: SourceApplicationInfo.kt */
    public static final class C8107a {
        private C8107a() {
        }

        public /* synthetic */ C8107a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo41955a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        /* renamed from: b */
        public final C8106j mo41956b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new C8106j(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C8106j(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    /* renamed from: a */
    public final void mo41953a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f11409a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f11410b);
        edit.apply();
    }

    public String toString() {
        String str;
        if (this.f11410b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f11409a == null) {
            return str;
        }
        return str + '(' + this.f11409a + ')';
    }

    private C8106j(String str, boolean z) {
        this.f11409a = str;
        this.f11410b = z;
    }
}
